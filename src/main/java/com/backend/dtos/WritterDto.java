package com.backend.dtos;


import com.backend.enums.Geners;
import jakarta.persistence.Column;

import java.util.List;

public class WritterDto {
    private Long id;
    private String name;
    private String surname;
    private String description;
    private Number age;
    private List<Geners> geners;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
