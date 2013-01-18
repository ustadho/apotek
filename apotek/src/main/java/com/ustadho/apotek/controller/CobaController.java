/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustadho.apotek.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author cak-ust
 */
@Controller
public class CobaController {
    @RequestMapping("/halo")
    @ResponseBody
    public String halo(@RequestParam(required=false) String nama){
        return "Halo "+nama;
    }
    @RequestMapping("/halohtml")
    public ModelMap haloHtml(@RequestParam(required=false) String nama){
        ModelMap mm = new ModelMap();
        
        mm.addAttribute("namaPengunjung", nama);
        mm.addAttribute("jamServer", new Date());
        
        return mm;
    }
}
