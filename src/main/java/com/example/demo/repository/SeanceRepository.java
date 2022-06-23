package com.example.demo.repository;

import com.example.demo.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Long> {

    Seance findSeanceById(int id);
    void deleteSeanceById(int id);

}
