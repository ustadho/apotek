/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.dao;

import com.ustadho.apotek.domain.Item;
import com.ustadho.apotek.domain.Kategori;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cak-ust
 */
@Repository
public class ItemDao {
    @Autowired
    SessionFactory sessionFactory;
    
    public void simpan(Item item){
        sessionFactory.getCurrentSession().saveOrUpdate(item);
    }
    
    public List<Item> cariSemua(){
        return 
                sessionFactory
                .getCurrentSession()
                .createQuery("from Item i").list();
    }

    public Item cariByKode(String kode) {
        return (Item) sessionFactory.getCurrentSession()
                .createQuery("select f from Item f where f.kodeItem=:x")
                .setParameter("x", kode)
                .uniqueResult();
        
    }
}
