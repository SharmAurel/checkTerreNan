package com.example.demo.service;

import com.example.demo.model.Seance;
import com.example.demo.model.User;

import java.util.List;

public interface SeanceService {

    Seance createSeance(Seance seance);
    List<Seance> findAllSeance();
    Seance updateSeance(Seance seances);
    Seance findSeanceById(int id);
    void deleteSeanceById(int id);

}
