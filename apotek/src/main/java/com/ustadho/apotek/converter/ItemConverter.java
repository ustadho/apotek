/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.converter;

import com.ustadho.apotek.domain.Item;
import com.ustadho.apotek.domain.Kategori;
import com.ustadho.apotek.services.MasterServices;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author cak-ust
 */
public class ItemConverter extends PropertyEditorSupport {

    private MasterServices service;

    public ItemConverter(MasterServices service) {
        this.service = service;
    }
    
    @Override
    public void setAsText(String idKategori) throws IllegalArgumentException {
        Integer idKategoriInt = Integer.valueOf(idKategori);
        Kategori p = service.cariKategoriById(idKategoriInt);
        setValue(p);
    }
    
}
