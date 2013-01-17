/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author cak-ust
 */
@Entity
public class Item {
    @Id
    @Column(name="kode_item")
    private String kodeItem;
    
    @Column(name="nama_item")
    private String namaItem;
    
    @ManyToOne
    @JoinColumn(name="id_kategori", nullable=false)
    Kategori kategoriItem;

    public Kategori getKategoriItem() {
        return kategoriItem;
    }

    public void setKategoriItem(Kategori kategoriItem) {
        this.kategoriItem = kategoriItem;
    }
    
    
    public String getKodeItem() {
        return kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }
    
}
