/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.services;

import com.ustadho.apotek.domain.Item;
import com.ustadho.apotek.domain.Kategori;
import java.util.List;

/**
 *
 * @author cak-ust
 */
public interface MasterServices {
    void simpan(Item item);
    List<Item> tampilkanSemuaItem();
    
    void simpan(Kategori kategori);
    List<Kategori> tampilkanSemuaKateori();
    
}
