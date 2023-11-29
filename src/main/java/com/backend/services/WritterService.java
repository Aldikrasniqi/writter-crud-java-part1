package com.backend.services;

import com.backend.models.Writter;
import com.backend.repository.WritterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WritterService {
    private final WritterRepository writterRepository;

    public WritterService(WritterRepository writterRepository) {
        this.writterRepository = writterRepository;
    }

    public Writter createWritter(Writter writter){
        return writterRepository.save(writter);
    }

    public List<Writter> getAllWritters(){
        return writterRepository.findAll();
    }

    public Writter getWritterById(Long id) {
        return writterRepository.findById(id).orElse(null);
    }

    public Writter updateWritter(Long id, Writter writter){
        Writter writerToBeUpdated = getWritterById(id);
        if (writerToBeUpdated != null){
            writerToBeUpdated.setName(writter.getName());
            writerToBeUpdated.setSurname(writter.getSurname());
            writerToBeUpdated.setDescription(writter.getDescription());
            writerToBeUpdated.setAge(writter.getAge());
            writerToBeUpdated.setPublished(writter.isPublished());
            writerToBeUpdated.setGeners(writter.getGeners());
            return writterRepository.save(writerToBeUpdated);
        }
        return null;
    }


    public void deleteWritter(long id) {
        Writter writter= getWritterById(id);
        if (writter != null){
            writterRepository.delete(writter);
        }
    }
}
