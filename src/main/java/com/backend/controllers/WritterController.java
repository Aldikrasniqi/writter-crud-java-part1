package com.backend.controllers;

import com.backend.dtos.WritterDto;
import com.backend.mappers.WritterMapper;
import com.backend.models.Writter;
import com.backend.services.WritterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class WritterController {
    private final WritterMapper writterMapper;
    private final WritterService writterService;

    public WritterController(WritterMapper writterMapper, WritterService writterService) {
        this.writterMapper = writterMapper;
        this.writterService = writterService;
    }

    @GetMapping("/writter")
    public ResponseEntity<List<WritterDto>> getWritter() {
        List<WritterDto> writterDtos = writterService.getAllWritters()
                .stream()
                .map(writterMapper::toDto)  // Use instance method
                .collect(Collectors.toList());

        return ResponseEntity.ok(writterDtos);
    }
    @PostMapping("/writter")
    public ResponseEntity<WritterDto> createRecipe(@RequestBody WritterDto dto){
        return ResponseEntity.ok(writterMapper.toDto(writterService.createWritter(writterMapper.toEntity(dto))));
    }

    @GetMapping("/writter/{id}")
    public ResponseEntity<List<WritterDto>> getWritterById(@PathVariable Long id){
//        System.out.println("Id id: " + id);
        return ResponseEntity.ok(List.of(writterMapper.toDto(writterService.getWritterById(id))));
    }
    @PutMapping("/writter/{id}")
    public ResponseEntity<WritterDto> updateWritter(@PathVariable Long id,@RequestBody WritterDto writterDto){
        return ResponseEntity.ok(writterMapper.toDto(writterService.updateWritter(id,writterMapper.toEntity(writterDto))));
    }
    @DeleteMapping("/writter/{id}")
    public ResponseEntity deleteWritter(@PathVariable long id){
        writterService.deleteWritter(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
