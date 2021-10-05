package com.alinina.test.controllers;

import com.alinina.test.Attr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
           private Attr attr;

    //Attr attr;
    @GetMapping("/h1")
    public String greeting(Model model){
        //attr = new Attr();
        model.addAttribute("title", attr.getH1());
        return "home";
    }

    @GetMapping("/h2")
    public String greeting2(Model model){
        //attr = new Attr();
        model.addAttribute("title2", attr.getH2());
        return "page";
    }
}
