package com.example.demo.service;

import com.example.demo.model.Promotion;

import java.util.List;

public interface PromotionService {

    Promotion createPromotion(Promotion promotion);
    List<Promotion> findAllPromotion();
    Promotion updatePromotion(Promotion promotions);
    Promotion findPromotionById(int id);
    void deletePromotionById(int id);
}
