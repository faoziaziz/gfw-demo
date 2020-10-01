/*
  author : Aziz Amerul Faozi
  description : This code for api testing gfw
*/

package com.prasimax.gfwdemo.controller;

import com.prasimax.gfwdemo.models.GpsData;
import com.prasimax.gfwdemo.repository.GpsDataRepo;

import org.springframework.web.bind.annotation.*;


import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/api-gfw/v1")
class GfwController {

    private GpsDataRepo _gpsDataRepo;
    public GfwController(GpsDataRepo gpsDataRepo){
	_gpsDataRepo = gpsDataRepo;
    }
    @GetMapping("/all")
    public Map<String, User> GetAll(){
	return _gpsDataRepo.findAll();
    }

    @GetMapping("/all/{id}")
    public GpsData(@PathVariable("id") final String id){
	return _gpsDataRepo.findAll();
    }

    @PostMapping("/add")
    public GpsData add(@RequestBody GpsData gpsData){
	_gpsDataRepo.save(new GpsData(gpsData.getId(),
				      gpsData.getDevice(),
				      gpsData.getLongitude(),
				      gpsData.getLatitude(),
				      gpsData.getDateStamp()));
	return _gpsDataRepo.findById(gpsData.getId());
    }


    @PostMapping("/update")
    public GpsData update(@RequestBody GpsData gpsData){
	_gpsDataRepo.update(new GpsData(gpsData.getId(),
					gpsData.getDevice(),
					gpsData.getLongitude(),
					gpsData.getLatitude(),
					gpsData.getDateStamp()));
	return _gpsDataRepo.findById(gpsData.getId());
    }
    
    @PostMapping("/gfw-data")
    public String postdata(){
	return "rasanya strawbery";
    }
    
    @GetMapping("/gfw-data")
    public String getdata(){
	return "seperti Ironman";
    }
    
}
