package com.example.demo.rest;

import com.example.demo.model.Seance;
import com.example.demo.service.SeanceService;
import com.example.demo.service.SeanceService;
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
@RequestMapping("/seance")
public class SeanceController {

    @Autowired
    private SeanceService seanceService;


    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Seance> addSeances(@RequestBody Seance seance){
        Seance newSeance = seanceService.createSeance(seance);
        return new ResponseEntity<>(newSeance, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Seance>> getAllSeance(){
        List<Seance> seance = seanceService.findAllSeance();
        return new ResponseEntity<>(seance, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Seance> getSeanceById(@PathVariable("id") int id){
        Seance seance = seanceService.findSeanceById(id);
        return new ResponseEntity<>(seance, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Seance> updateSeance(@RequestBody Seance seances){
        Seance updateSeance = seanceService.updateSeance(seances);
        return new ResponseEntity<>(updateSeance, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Seance> deleteSeance(@PathVariable("id") int id){
        seanceService.deleteSeanceById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
