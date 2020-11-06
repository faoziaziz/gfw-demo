/*
  @author : Aziz Amerul Faozi
  @Deskription : ini unutuk model data GPS
*/

package com.prasimax.gfwdemo.models;

import java.io.Serializable;
import org.springframework.data.annotation.Id;

public class GpsData implements Serializable {

    @Id
    private String id;
    private String Device;
    private String DateStamp;

    /* oke saya ganteng */
    private Float online;
    private Float status;
    private Float satelites_used;
    private Float mode;
    private Float time;
    private Float Latitude;
    private Float Longitude;
    private Float altitude;
    private Float speed;
    private Float track;
    private Float pdop;

    public GpsData(
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
        Float track,
	Float pdop){
            this.id=id;
            this.Device=Device;
            this.DateStamp=DateStamp;
            this.online=online;
            this.status=status;
            this.satelites_used=satelites_used;
            this.mode=mode;
            this.time=time;
            this.Latitude=Latitude;
            this.Longitude=Longitude;
            this.altitude=altitude;
            this.speed=speed;
            this.track=track;
            this.pdop=pdop;
    }

    public String getId(){
	return id;
    }
    
    public void setId(String id){
	this.id=id;
    }

    /* setter and getter */
    public String getDevice(){
	return Device;
    }
    public void setDevice(String Device){
	this.Device = Device;
    }

    /* setter end getter online */
    public Float getOnline(){
        return online;
    }
    public void setOnline(Float online){
        this.online=online;
    }

    /* setter end getter status */
    public Float getStatus(){
        return status;
    }
    public void setStatus(Float status){
        this.status=status;
    }

    /* setter end getter satelites_used */
    public Float getSateliteUsed(){
        return status;
    }
    public void setSateliteUsed(Float status){
        this.satelites_used=satelites_used;
    }

    /*
        Float mode,
        
        
    */

    public Float getMode(){
        return mode;
    }

    public void setMode(Float mode){
        this.mode=mode;
    }

    /* time */
    public Float getTime(){
        return time;
    }

    public void setTime(Float time){
        this.time=time;
    }
    /*
    
        Float altitude,
        
     
    */
    public Float getAltitude(){
        return altitude;
    }
    public void setAltitude(Float altitude){
        this.altitude=altitude;

    }
    /*
       Float track, Float pdop
    */
    public Float getTrack(){
        return track;
    }
    public void setTrack(Float track){
        this.track=track;
    }

    /* pdop */
    public Float getPdop(){
        return pdop;
    }
    public void setPdop(Float pdop){
        this.pdop=pdop;
    }
    public Float getSpeed(){
        return speed;

    }
    public void setSpeed(Float speed)
    {
        this.speed=speed;

    }

    /* longitude setter and getter */
    public Float getLongitude(){
	return Longitude;
    }
    public void setLongitude(Float Longitude){
	this.Longitude=Longitude;
    }
    
    /* lattitude setter and getter */
    public Float getLatitude(){
	return Latitude;
    }
    public void setLatitude(Float Latitude){
	this.Latitude=Latitude;
    }

    /* DateStamp getter and setter */
    public String getDateStamp(){
	return DateStamp;

    }

    public void setDateStamp(String DateStamp){
	this.DateStamp=DateStamp;
    }
    

}
