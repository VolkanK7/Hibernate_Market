/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lesson.hibernate.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "toplamHasilat")
public class toplamHasilat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hasilat")
    private double hasilat;

    @Column(name = "tarihsaat")
    private LocalDateTime tarihsaat;

    public toplamHasilat() {
    }

    public toplamHasilat(double hasilat, LocalDateTime tarihsaat) {
        this.hasilat = hasilat;
        this.tarihsaat = tarihsaat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHasilat() {
        return hasilat;
    }

    public void setHasilat(double hasilat) {
        this.hasilat = hasilat;
    }

    public LocalDateTime getTarihsaat() {
        return tarihsaat;
    }

    public void setTarihsaat(LocalDateTime tarihsaat) {
        this.tarihsaat = tarihsaat;
    }
    
    
}
