package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    int id;
//    @ElementCollection
//    @CollectionTable(name = "user")
//    List<String> nom = new ArrayList<>();
    @NotEmpty
    String nomPromotion;

    public String getNomPromotion() {
        return nomPromotion;
    }

    public void setNomPromotion(String nomPromotion) {
        this.nomPromotion = nomPromotion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public List<String> getNom() {
//        return nom;
//    }
//
//    public void setNom(List<String> nom) {
//        this.nom = nom;
//    }









}
