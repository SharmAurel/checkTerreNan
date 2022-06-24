package com.example.demo.rest;

import com.example.demo.model.Promotion;
import com.example.demo.service.PromotionService;
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
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;


    @PostMapping(value = "/add", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Promotion> addPromotions(@RequestBody Promotion promotion) {
        Promotion newPromotion = promotionService.createPromotion(promotion);
        return new ResponseEntity<>(newPromotion, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Promotion>> getAllPromotion() {
        List<Promotion> promotion = promotionService.findAllPromotion();
        return new ResponseEntity<>(promotion, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Promotion> getPromotionById(@PathVariable("id") int id) {
        Promotion promotion = promotionService.findPromotionById(id);
        return new ResponseEntity<>(promotion, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Promotion> updatePromotion(@RequestBody Promotion promotions) {
        Promotion updatePromotion = promotionService.updatePromotion(promotions);
        return new ResponseEntity<>(updatePromotion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Promotion> deletePromotion(@PathVariable("id") int id) {
        promotionService.deletePromotionById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
