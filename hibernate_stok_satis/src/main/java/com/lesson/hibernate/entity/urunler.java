/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lesson.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "urunler")
public class urunler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private int u_id;
    
    @Column(name = "u_barkodno")
    private int u_barkodno;
    
    @Column(name = "u_kategori")
    private String u_kategori;
    
    @Column(name = "u_adi")
    private String u_adi; 
    
    @Column(name = "u_alisfiyati")
    private double u_alisfiyati;
    
    @Column(name = "u_satisfiyati")
    private double u_satisfiyati;
    
    @Column(name = "u_kdv")
    private int u_kdv;
    
    @Column(name = "u_miktar")
    private int u_miktar;

    public urunler() {
    }

    public urunler(int u_barkodno, String u_kategori, String u_adi, double u_alisfiyati, double u_satisfiyati, int u_kdv, int u_miktar) {
        this.u_barkodno = u_barkodno;
        this.u_kategori = u_kategori;
        this.u_adi = u_adi;
        this.u_alisfiyati = u_alisfiyati;
        this.u_satisfiyati = u_satisfiyati;
        this.u_kdv = u_kdv;
        this.u_miktar = u_miktar;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getU_barkodno() {
        return u_barkodno;
    }

    public void setU_barkodno(int u_barkodno) {
        this.u_barkodno = u_barkodno;
    }

    public String getU_kategori() {
        return u_kategori;
    }

    public void setU_kategori(String u_kategori) {
        this.u_kategori = u_kategori;
    }

    public String getU_adi() {
        return u_adi;
    }

    public void setU_adi(String u_adi) {
        this.u_adi = u_adi;
    }

    public double getU_alisfiyati() {
        return u_alisfiyati;
    }

    public void setU_alisfiyati(double u_alisfiyati) {
        this.u_alisfiyati = u_alisfiyati;
    }

    public double getU_satisfiyati() {
        return u_satisfiyati;
    }

    public void setU_satisfiyati(double u_satisfiyati) {
        this.u_satisfiyati = u_satisfiyati;
    }

    public int getU_kdv() {
        return u_kdv;
    }

    public void setU_kdv(int u_kdv) {
        this.u_kdv = u_kdv;
    }

    public int getU_miktar() {
        return u_miktar;
    }

    public void setU_miktar(int u_miktar) {
        this.u_miktar = u_miktar;
    }

    
}
