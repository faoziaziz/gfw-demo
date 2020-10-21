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
    public Map<String, GpsData> GetAll(){
	return _gpsDataRepo.findAll();
    }

    @GetMapping("/all/{id}")
    public GpsData GpsAll(@PathVariable("id") final String id){
	return _gpsDataRepo.findById(id);
    }

    /*
    GpsData(
        String id, 
        String Device, 
        String DateStamp,
        Float online,
        Float status,
        Float satelites_used,
        Float mode,
        Float time,
        Float Latitude, 
        Float Longitude,
        Float altitude,
        Float speed,
        Float track, Float pdop)
    */
    @PostMapping("/add")
    public GpsData add(@RequestBody GpsData gpsData){
	_gpsDataRepo.save(new GpsData(
				      gpsData.getId(),
                      gpsData.getDevice(),
                      gpsData.getDateStamp(),
                      gpsData.getOnline(),
                      gpsData.getStatus(),
                      gpsData.getSateliteUsed(),
                      gpsData.getMode(),
                      gpsData.getTime(),
                      gpsData.getLatitude(),
				      gpsData.getLongitude(),
                     gpsData.getSpeed(),
                     gpsData.getTrack(),
                     gpsData.getPdop()
				      ));
	return _gpsDataRepo.findById(gpsData.getId());
    }


    @PostMapping("/update")
    public GpsData update(@RequestBody GpsData gpsData){
	_gpsDataRepo.update(new GpsData(
        gpsData.getId(),
        gpsData.getDevice(),
        gpsData.getDateStamp(),
        gpsData.getOnline(),
        gpsData.getStatus(),
        gpsData.getSateliteUsed(),
        gpsData.getMode(),
        gpsData.getTime(),
        gpsData.getLatitude(),
        gpsData.getLongitude(),
       gpsData.getSpeed(),
       gpsData.getTrack(),
       gpsData.getPdop()));
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
