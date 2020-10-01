package com.prasimax.gfwdemo.repository;

import com.prasimax.gfwdemo.models.GpsData;

import java.util.List;
import java.util.Map;

public interface GpsDataRepo {
    void save(GpsData gpsData);

    Map<String, GpsData> findAll();
    GpsData findById(String id);
    void update(GpsData gpsData);
    void delete(String id);

}
