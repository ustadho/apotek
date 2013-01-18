/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.services;

import com.ustadho.apotek.domain.Item;
import com.ustadho.apotek.domain.Kategori;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *
 * @author cak-ust
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/ustadho/**/applicationContext.xml")

public class ItemServicesTest {
    @Autowired
    MasterServices itemServices;
    
    
    
    @Test
    public void cariSemuaItem(){
        Item item=new Item();
        item.setKodeItem("0002");
        item.setNamaItem("Bodrex");
        itemServices.simpan(item);
        
    }
    @Test
    public void tampilkanSemuaItem(){
        List<Item> hasilQuery=itemServices.tampilkanSemuaItem();
        System.out.println("Jumlah baris :"+hasilQuery.size());
        for(Item item: hasilQuery){
            System.out.println("Kode Barang : "+item.getKodeItem());
            System.out.println("Nama Barang : "+item.getNamaItem());
        }
    }
    
}
