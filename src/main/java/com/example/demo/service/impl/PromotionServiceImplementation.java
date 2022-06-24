package com.example.demo.service.impl;

import com.example.demo.model.Promotion;
import com.example.demo.model.Promotion;
import com.example.demo.repository.PromotionRepository;
import com.example.demo.service.PromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PromotionServiceImplementation implements PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;

    public PromotionServiceImplementation(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    @Override
    public Promotion createPromotion(Promotion promotion){
        return promotionRepository.save(promotion);
    }
    @Override
    public List<Promotion> findAllPromotion(){
        return promotionRepository.findAll();
    }
    @Override
    public Promotion updatePromotion(Promotion promotions){
        return promotionRepository.save(promotions);

    }
    @Override
    public Promotion findPromotionById(int id){
        return promotionRepository.findPromotionById(id);
    }

    @Override
    public void deletePromotionById(int id){
        promotionRepository.deletePromotionById(id);
    }


}
