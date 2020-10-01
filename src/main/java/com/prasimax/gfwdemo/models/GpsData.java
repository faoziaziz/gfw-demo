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
    private Float Longitude;
    private Float Latitude;
    private String DateStamp;

    

    public GpsData(String id, String Device, Float Longitude, Float Latitude, String DateStamp){
	this.id=id;
	this.Device=Device;
	this.Longitude=Longitude;
	this.Latitude=Latitude;
	this.DateStamp=DateStamp;
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
