/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author cak-ust
 */
@Entity
public class Item {
    @NotEmpty
    @Id
    @Column(name="kode_item")
    private String kodeItem;
    
    @NotNull
    @NotEmpty
    @Column(name="nama_item")
    private String namaItem;
    
    @NotNull
    @Past
    @Column(name="tgl_awal_trx")
    @Temporal(TemporalType.TIMESTAMP) // khusus tipe data Date, harus dijelaskan apakah di database DATE, TIME, atau DATETIME
    private Date tglAwalTrx;

    public Date getTglAwalTrx() {
        return tglAwalTrx;
    }

    public void setTglAwalTrx(Date tglAwalTrx) {
        this.tglAwalTrx = tglAwalTrx;
    }
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_kategori", nullable=true)
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
