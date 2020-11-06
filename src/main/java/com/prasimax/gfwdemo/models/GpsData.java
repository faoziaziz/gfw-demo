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
    private double online;
    private double status;
    private double sateliteUsed;
    private double mode;
    private double time;
    private double Latitude;
    private double Longitude;
    private double altitude;
    private double speed;
    private double track;
    private double pdop;

    public GpsData(
        String id, 
        String Device, 
        String DateStamp,
        double online,
        double status,
        double sateliteUsed,
        double mode,
        double time,
        double Latitude, 
        double Longitude,
        double altitude,
        double speed,
        double track,
	double pdop){
            this.id=id;
            this.Device=Device;
            this.DateStamp=DateStamp;
            this.online=online;
            this.status=status;
            this.sateliteUsed=sateliteUsed;
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
    public double getOnline(){
        return online;
    }
    public void setOnline(double online){
        this.online=online;
    }

    /* setter end getter status */
    public double getStatus(){
        return status;
    }
    public void setStatus(double status){
        this.status=status;
    }

    /* setter end getter satelites_used */
    public double getSateliteUsed(){
        return sateliteUsed;
    }
    public void setSateliteUsed(double sateliteUsed){
        this.sateliteUsed=sateliteUsed;
    }

    /*
        Float mode,
        
        
    */

    public double getMode(){
        return mode;
    }

    public void setMode(double mode){
        this.mode=mode;
    }

    /* time */
    public double getTime(){
        return time;
    }

    public void setTime(double time){
        this.time=time;
    }
    /*
    
        Float altitude,
        
     
    */
    public double getAltitude(){
        return altitude;
    }
    public void setAltitude(double altitude){
        this.altitude=altitude;

    }
    /*
       Float track, Float pdop
    */
    public double getTrack(){
        return track;
    }
    public void setTrack(double track){
        this.track=track;
    }

    /* pdop */
    public double getPdop(){
        return pdop;
    }
    public void setPdop(double pdop){
        this.pdop=pdop;
    }
    public double getSpeed(){
        return speed;

    }
    public void setSpeed(double speed)
    {
        this.speed=speed;

    }

    /* longitude setter and getter */
    public double getLongitude(){
	return Longitude;
    }
    public void setLongitude(double Longitude){
	this.Longitude=Longitude;
    }
    
    /* lattitude setter and getter */
    public double getLatitude(){
	return Latitude;
    }
    public void setLatitude(double Latitude){
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
