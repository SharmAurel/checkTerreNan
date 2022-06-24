package com.example.demo.service;

import com.example.demo.model.RetardAbsence;

import java.util.List;

public interface RetardAbsenceService {
    RetardAbsence createRetardAbsence(RetardAbsence retardAbsence);
    List<RetardAbsence> findAllRetardAbsence();
    RetardAbsence updateRetardAbsence(RetardAbsence retardAbsences);
    RetardAbsence findRetardAbsenceById(int id);
    void deleteRetardAbsenceById(int id);
}
