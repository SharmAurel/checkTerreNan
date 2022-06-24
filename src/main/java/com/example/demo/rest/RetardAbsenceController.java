package com.example.demo.rest;


import com.example.demo.model.RetardAbsence;
import com.example.demo.service.RetardAbsenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
@RequestMapping("/retardAbsence")
public class RetardAbsenceController {

    @Autowired
    private RetardAbsenceService retardAbsenceService;


    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<RetardAbsence> addRetardAbsences(@RequestBody RetardAbsence retardAbsence) {
        RetardAbsence newRetardAbsence = retardAbsenceService.createRetardAbsence(retardAbsence);
        return new ResponseEntity<>(newRetardAbsence, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<RetardAbsence>> getAllRetardAbsence() {
        List<RetardAbsence> retardAbsence = retardAbsenceService.findAllRetardAbsence();
        return new ResponseEntity<>(retardAbsence, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<RetardAbsence> getRetardAbsenceById(@PathVariable("id") int id) {
        RetardAbsence retardAbsence = retardAbsenceService.findRetardAbsenceById(id);
        return new ResponseEntity<>(retardAbsence, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<RetardAbsence> updateRetardAbsence(@RequestBody RetardAbsence retardAbsences) {
        RetardAbsence updateRetardAbsence = retardAbsenceService.updateRetardAbsence(retardAbsences);
        return new ResponseEntity<>(updateRetardAbsence, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<RetardAbsence> deleteRetardAbsence(@PathVariable("id") int id) {
        retardAbsenceService.deleteRetardAbsenceById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}