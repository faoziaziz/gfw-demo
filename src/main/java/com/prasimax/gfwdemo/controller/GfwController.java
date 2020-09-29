/*
  author : Aziz Amerul Faozi
  description : This code for api testing gfw
*/

package com.prasimax.gfwdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GfwController {
    @PostMapping("/gfw-data")
    public String gfwdata(){
	return "rasanya strawbery";
    }
    
}
