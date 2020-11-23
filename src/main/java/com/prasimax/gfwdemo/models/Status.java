package com.prasimax.gfwdemo.models;

public class Status {
    private final long kode;
    private final String status;

    public Status (){
	this.kode=1;
	this.status="OK";

    }

    public long getKode(){
	return kode;
    }

    public String getStatus(){
	return status;

    }

}
