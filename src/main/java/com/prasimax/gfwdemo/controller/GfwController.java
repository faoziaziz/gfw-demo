/*
  author : Aziz Amerul Faozi
  description : This code for api testing gfw
*/

package com.prasimax.gfwdemo.controller;



import org.springframework.web.bind.annotation.*;


import java.util.Map;
import java.util.List;
@RestController
@RequestMapping("/api-gfw/v1")
class GfwController {

   

   
    @PostMapping("/gfw-data")
    public String postdata(){
	return "rasanya strawbery";
    }
    
    @GetMapping("/gfw-data")
    public String getdata(){
	return "seperti Ironman";
    }
    
}
