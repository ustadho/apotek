/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cak-ust
 */
@Entity
@Table(name="penjualan_detail")
public class PenjualanDetail {
    @Id
    private int id;
    
    @ManyToOne
    @JoinColumn(name="no_nota", nullable=false)
    Penjualan penjualan;
    
    @ManyToOne
    @JoinColumn(name="kode_item", nullable=false)
    Item item;
    
    private int qty;
    private double harga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
}
