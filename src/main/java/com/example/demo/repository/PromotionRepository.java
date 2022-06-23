package com.example.demo.repository;

import com.example.demo.model.Promotion;
import com.example.demo.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {

    Seance findPromotionById(int id);
    void deletePromotionById(int id);

}
