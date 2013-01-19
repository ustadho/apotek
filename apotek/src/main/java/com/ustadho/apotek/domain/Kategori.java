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
    private Integer id;
    
    @Column(name="nama_kategori")
    private String namaKategori;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String nama_kategori) {
        this.namaKategori = nama_kategori;
    }
    
}
