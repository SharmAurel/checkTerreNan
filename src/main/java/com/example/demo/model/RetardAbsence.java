package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
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
    RetardOuAbsence type;
    @NotEmpty
    String eleveNom;
    @NotEmpty
    String cours;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime date;

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

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getDureeRetard() {
        return dureeRetard;
    }

    public void setDureeRetard(int dureeRetard) {
        this.dureeRetard = dureeRetard;
    }
}