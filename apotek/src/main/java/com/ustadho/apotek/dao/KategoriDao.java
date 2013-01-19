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
public class KategoriDao {
    @Autowired
    SessionFactory sessionFactory;
    
    public void simpan(Kategori kategori){
        sessionFactory.getCurrentSession().saveOrUpdate(kategori);
    }
    
    public List<Kategori> tampilkanSemua(){
        return sessionFactory.getCurrentSession().createQuery("from Kategori k").list();
        
    }

    public Kategori cariById(Integer idKategoriInt) {
        return (Kategori) sessionFactory.getCurrentSession()
                .get(Kategori.class, idKategoriInt);
    }
    
}
