package com.backend.repository;

import com.backend.models.Writter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WritterRepository extends JpaRepository<Writter, Long> {
}
