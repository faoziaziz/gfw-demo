package com.prasimax.gfwdemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
	return "Odading Mang Soleh";
    }

    @RequestMapping("/v1/api")
    public String mantan(){
	return "rasanya strawbery";
    }
  

    

}
