/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author cak-ust
 */
@Entity
public class Kategori {
    @Id
    @GeneratedValue
    private int id;
    
    @Column(name="nama_kategori")
    private String namaKategori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_kategori() {
        return namaKategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.namaKategori = nama_kategori;
    }
    
}
