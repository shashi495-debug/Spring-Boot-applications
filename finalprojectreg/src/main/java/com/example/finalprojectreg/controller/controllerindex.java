package com.example.finalprojectreg.controller;

import com.example.finalprojectreg.controller.userentity.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller

public class controllerindex {
    @GetMapping("/examp")
    public String usen(){
        String welcome="welcome";
        return welcome;
    }


    @GetMapping("/regi")
    public String userreg(){
        return "registration";
    }
@GetMapping("/regi2")
    public String nxtuser(){
return "registor";
    }
    @GetMapping("/calcul")
    public String calciu(){ return "calci";}
    @PostMapping("/if")
    public String userref(@ModelAttribute user useri, Model modeli){

        modeli.addAttribute("firstname",useri.getFname());
        modeli.addAttribute("passsword",useri.getPwd());
        modeli.addAttribute("Unamer",useri.getUname());
        modeli.addAttribute("lastname",useri.getLname());
        modeli.addAttribute("gender",useri.getGender());
        modeli.addAttribute("fathername",useri.getFatname());
        modeli.addAttribute("number",useri.getNum());
       modeli.addAttribute("adminuser",useri.getAd_uname());
       modeli.addAttribute("adminpwd",useri.getAd_pwd());
       modeli.addAttribute("clientuser",useri.getCli_uname());
       modeli.addAttribute("clientpwd",useri.getCli_pwd());
       modeli.addAttribute("emplid",useri.getEmp_unmae());
       modeli.addAttribute("emppwd",useri.getEmp_pwd());
       modeli.addAttribute("state1",useri.getState());
       modeli.addAttribute("address",useri.getAddr());
       modeli.addAttribute("dateofbirth",useri.getDob());
       modeli.addAttribute("ID",useri.getId());

       return "output";
    }

}
