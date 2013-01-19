/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.controller;

import com.ustadho.apotek.converter.ItemConverter;
import com.ustadho.apotek.domain.Item;
import com.ustadho.apotek.domain.Kategori;
import com.ustadho.apotek.services.MasterServices;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author cak-ust
 */
@Controller
public class ItemController {
    @Autowired
    MasterServices masterServices;
    
    @InitBinder
    public void initBinder(WebDataBinder binder){
        
        // converter untuk tipe data tanggal (Date)
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(formatter, true));
        
        // konverter untuk tipe data Item
        ItemConverter px = new ItemConverter(masterServices);
        binder.registerCustomEditor(Kategori.class, px);
    }
    
    @RequestMapping("/item/list")
    public ModelMap daftarKehadiran(){
        ModelMap mm = new ModelMap();
        
        List<Item> data = masterServices.tampilkanSemuaItem();
        mm.addAttribute("daftarItem", data);
        System.out.println("Jumlah data : "+data.size());
        
        return mm;
    }
    
    @RequestMapping(value="/item/form", method= RequestMethod.GET)
    public ModelMap tampilkanForm(@RequestParam(required=false) String kode){
        System.out.println("Tampilkan Form");
        ModelMap mm=new ModelMap();
        Item i = masterServices.cariItemByKode(kode);
        System.out.println("Kode Item "+kode);
 	 if(i == null){
 	     i = new Item();
 	 }
        mm.addAttribute("item", i);
        return mm;
    }
    
    @RequestMapping(value="/item/form", method= RequestMethod.POST)
    public String prosesForm(@ModelAttribute @Valid Item i, BindingResult errors){
        System.out.println("Memproses semua kehadiran");
        
        if(errors.hasErrors()){
            return "/item/form";
        }
        masterServices.simpan(i);
        return "redirect:list";
    }
    
    @ModelAttribute("daftarKategori")
    public List<Kategori> daftarItem(){
        return masterServices.tampilkanSemuaKateori();
    }
    @RequestMapping("/item/laporan-item")
    public ModelMap laporanKehadiran(HttpServletRequest request) {
        ModelMap mm = new ModelMap();
        Date mulai = new Date();
        Date sampai = new Date();
        String uri = request.getRequestURI();
        String format = uri.substring(uri.lastIndexOf(".") + 1);
        mm.addAttribute("mulai", mulai);
        mm.addAttribute("sampai", sampai);
        mm.addAttribute("format", format);
        return mm;
    }
}
