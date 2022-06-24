package com.example.demo.repository;

import com.example.demo.model.RetardAbsence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetardAbsenceRepository extends JpaRepository<RetardAbsence, Long> {

    RetardAbsence findRetardAbsenceById(int id);
    void deleteRetardAbsenceById(int id);
}
