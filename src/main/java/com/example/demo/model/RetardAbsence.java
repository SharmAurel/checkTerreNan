package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="RetardAbsence")
public class RetardAbsence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, name = "id")
    int id;
    @NotEmpty
    RetardOuAbsence type;
    @NotEmpty
    String eleveNom;
    @NotEmpty
    Seance cours;

    @DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss")
    Date Date;

    int dureeRetard;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RetardOuAbsence getType() {
        return type;
    }

    public void setType(RetardOuAbsence type) {
        this.type = type;
    }

    public String getEleveNom() {
        return eleveNom;
    }

    public void setEleveNom(String eleveNom) {
        this.eleveNom = eleveNom;
    }

    public Seance getCours() {
        return cours;
    }

    public void setCours(Seance cours) {
        this.cours = cours;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public int getDureeRetard() {
        return dureeRetard;
    }

    public void setDureeRetard(int dureeRetard) {
        this.dureeRetard = dureeRetard;
    }
}