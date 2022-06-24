package com.example.demo.service.impl;

import com.example.demo.model.Seance;
import com.example.demo.repository.SeanceRepository;
import com.example.demo.service.SeanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SeanceServiceImplementation implements SeanceService {

    @Autowired
    private SeanceRepository seanceRepository;

    public SeanceServiceImplementation(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    @Override
    public Seance createSeance(Seance seance){
        return seanceRepository.save(seance);
    }
    @Override
    public List<Seance> findAllSeance(){
        return seanceRepository.findAll();
    }
    @Override
    public Seance updateSeance(Seance seances){
        return seanceRepository.save(seances);

    }
     @Override
    public Seance findSeanceById(int id){
        return seanceRepository.findSeanceById(id);
    }

    @Override
    public void deleteSeanceById(int id){
        seanceRepository.deleteSeanceById(id);
    }



}
