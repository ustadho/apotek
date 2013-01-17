/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Columns;

/**
 *
 * @author cak-ust
 */
@Entity
public class Pasien {
    @Id
    @Column(name="no_pasien")
    private String noPasien;
    
    @Column(name="nama_pasien")
    private String namaPasien;
    
    @Column(name="alamat")
    private String alamatPasien;

    public String getNoPasien() {
        return noPasien;
    }

    public void setNoPasien(String noPasien) {
        this.noPasien = noPasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    public void setAlamatPasien(String alamatPasien) {
        this.alamatPasien = alamatPasien;
    }
    
}
