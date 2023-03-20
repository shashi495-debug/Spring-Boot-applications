package com.example.connectingsqlproj.controller;

import com.example.connectingsqlproj.entites.user;
import com.example.connectingsqlproj.repositories.registory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class indexcontroller {
    @GetMapping("/regn")
    public String regis(){

        return"registration";


    }
   @PostMapping("/if")
    public String userregus(@ModelAttribute user useri, Model modeli){
        modeli.addAttribute("firstname",useri.getFname());
        modeli.addAttribute("passsword",useri.getPwd());
        modeli.addAttribute("Unamer",useri.getUname());
        modeli.addAttribute("lastname",useri.getLname());
        modeli.addAttribute("gender",useri.getGender());
        modeli.addAttribute("fathername",useri.getFatname());
        modeli.addAttribute("number",useri.getNum());
       // modeli.addAttribute("adminuser",useri.getAd_uname());
       //modeli.addAttribute("emppwd",useri.getEmp_pwd());
        modeli.addAttribute("state1",useri.getState());
        modeli.addAttribute("address",useri.getAddr());
        modeli.addAttribute("dateofbirth",useri.getDob());
       // modeli.addAttribute("ID",useri.getId());

        return "output";

    }
    @Autowired
    registory regis;

    @PostMapping
    public user saveemp(@RequestBody user usen){
        return regis.save(usen);

    }
    @GetMapping
public List<user> getAllemps(){
        return regis.findAll();
}

}
