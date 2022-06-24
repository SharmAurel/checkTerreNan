package com.example.demo.service.impl;

import com.example.demo.model.RetardAbsence;
import com.example.demo.repository.RetardAbsenceRepository;
import com.example.demo.service.RetardAbsenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RetardAbsenceServiceImplementation implements RetardAbsenceService {
    @Autowired
    private RetardAbsenceRepository retardAbsenceRepository;

    public RetardAbsenceServiceImplementation(RetardAbsenceRepository retardAbsenceRepository) {
        this.retardAbsenceRepository = retardAbsenceRepository;
    }

    @Override
    public RetardAbsence createRetardAbsence(RetardAbsence retardAbsence){
        return retardAbsenceRepository.save(retardAbsence);
    }
    @Override
    public List<RetardAbsence> findAllRetardAbsence(){
        return retardAbsenceRepository.findAll();
    }
    @Override
    public RetardAbsence updateRetardAbsence(RetardAbsence retardAbsences){
        return retardAbsenceRepository.save(retardAbsences);

    }
    @Override
    public RetardAbsence findRetardAbsenceById(int id){
        return retardAbsenceRepository.findRetardAbsenceById(id);
    }

    @Override
    public void deleteRetardAbsenceById(int id){
        retardAbsenceRepository.deleteRetardAbsenceById(id);
    }


}
