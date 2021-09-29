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
@Table(name = "satis")
public class satis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "u_barkodno")
    private int u_barkodno;
    
    @Column(name = "u_kategori")
    private String u_kategori;
    
    @Column(name = "u_adi")
    private String u_adi; 
    
    @Column(name = "birim_fiyat")
    private double birim_fiyat;
    
    @Column(name = "toplam_fiyat")
    private double toplam_fiyat;
    
    @Column(name = "u_kdv")
    private double u_kdv;
    
    @Column(name = "miktar")
    private int miktar;
    
    @Column(name = "tarihsaat")
    private LocalDateTime tarihsaat;

    public satis() {
    }

    public satis(int u_barkodno, String u_kategori, String u_adi, double birim_fiyat, double toplam_fiyat, double u_kdv, int miktar, LocalDateTime tarihsaat) {
        this.u_barkodno = u_barkodno;
        this.u_kategori = u_kategori;
        this.u_adi = u_adi;
        this.birim_fiyat = birim_fiyat;
        this.toplam_fiyat = toplam_fiyat;
        this.u_kdv = u_kdv;
        this.miktar = miktar;
        this.tarihsaat = tarihsaat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getBirim_fiyat() {
        return birim_fiyat;
    }

    public void setBirim_fiyat(double birim_fiyat) {
        this.birim_fiyat = birim_fiyat;
    }

    public double getToplam_fiyat() {
        return toplam_fiyat;
    }

    public void setToplam_fiyat(double toplam_fiyat) {
        this.toplam_fiyat = toplam_fiyat;
    }

    public double getU_kdv() {
        return u_kdv;
    }

    public void setU_kdv(double u_kdv) {
        this.u_kdv = u_kdv;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public LocalDateTime getTarihsaat() {
        return tarihsaat;
    }

    public void setTarihsaat(LocalDateTime tarihsaat) {
        this.tarihsaat = tarihsaat;
    }
}

