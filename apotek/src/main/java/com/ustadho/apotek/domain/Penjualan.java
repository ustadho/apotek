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

/**
 *
 * @author cak-ust
 */
@Entity
public class Penjualan {
    @Id
    @Column(name="no_nota")
    private String noNota;
    
    @Temporal(TemporalType.TIMESTAMP) // khusus tipe data Date, harus dijelaskan apakah di database DATE, TIME, atau DATETIME
    private Date tanggal;
    
    @ManyToOne
    @JoinColumn(name="no_pasien", nullable=false)
    private Pasien pasien;

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
    

    public String getNoNota() {
        return noNota;
    }

    public void setNoNota(String noNota) {
        this.noNota = noNota;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
}
