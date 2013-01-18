/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.services.impl;

import com.ustadho.apotek.dao.ItemDao;
import com.ustadho.apotek.dao.KategoriDao;
import com.ustadho.apotek.domain.Item;
import com.ustadho.apotek.domain.Kategori;
import com.ustadho.apotek.services.MasterServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author cak-ust
 */
@Service
public class MasterServicesImpl implements MasterServices{
    @Autowired
    private ItemDao itemDao;
    
    @Autowired
    private KategoriDao kategoriDao;
    
    @Transactional
    public void simpan(Item item) {
        itemDao.simpan(item);
    }

    @Transactional(readOnly=true)
    public List<Item> tampilkanSemuaItem() {
        return itemDao.cariSemua();
    }

    
    @Transactional
    public void simpan(Kategori kategori) {
        kategoriDao.simpan(kategori);
    }

    @Transactional(readOnly=true)
    public List<Kategori> tampilkanSemuaKateori() {
        return kategoriDao.tampilkanSemua();
    }

    
}
