package com.backend.models;

import com.backend.enums.Geners;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "writters")
public class Writter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Number age;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ElementCollection
    @CollectionTable(name = "writter_genres", joinColumns = @JoinColumn(name = "writter_id"))
    @Column(name = "genres")
    private List<Geners> geners;

    @Column(name = "is_published")
    private boolean isPublished;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public List<Geners> getGeners() {
        return geners;
    }

    public void setGeners(List<Geners> geners) {
        this.geners = geners;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}
