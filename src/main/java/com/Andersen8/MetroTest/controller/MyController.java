package com.Andersen8.MetroTest.controller;

import com.Andersen8.MetroTest.repository.entity.MyModel;
import com.Andersen8.MetroTest.service.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class MyController {
    public MService service;
    @Autowired
    public MyController(MService service) {
        this.service = service;
    }

    @PostMapping("/customer")
    public ModelAndView sendData(@RequestParam("name") String name,
                                 @RequestParam("age") int age,
                                 @RequestParam("mobile") int mobile) throws IOException {
        String s = service.saveData(name, age, mobile);
        System.out.println("В КОНТРОЛЛЕРЕ");
        ModelAndView mav = new ModelAndView("result", "number", s);
        return mav;
    }
    @GetMapping("/customer")
    public ModelAndView gettingData(@RequestParam("customer") int number) throws IOException {

        MyModel myModel = service.gettingData(number);
        ModelAndView mav = new ModelAndView("datalist", "model", myModel);
        return mav;
    }
    @GetMapping("/")
    public String toMainPage(){
        return "index";
    }
}
