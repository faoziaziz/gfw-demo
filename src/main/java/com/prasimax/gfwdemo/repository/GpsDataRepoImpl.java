package com.prasimax.gfwdemo.repository;

import com.prasimax.gfwdemo.models.GpsData;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class GpsDataRepoImpl implements GpsDataRepo {
    private RedisTemplate<String, GpsData> redisTemplate;
    private HashOperations hashOperations;

    public UserRepositoryImpl(RedisTemplate<String, GpsData> redisTemplate){
	this.redisTemplate=redisTemplate;
	hashOperations=redisTemplate.opsForHash();
	
    }
    @Override
    public void save(GpsData gpsData){
	hashOperation.put("GPSDATA", gpsData.getId(), gpsData);
    }
    @Override
    public Map<String, User> findAll(){
	return hashOperation.entries("GPSDATA");

    }

    @Override
    pubilc GpsData findById(String id){
	return (GpsData)hashOperation.get("GPSDATA", id);
    }

    @Override
    public void update(GpsData gpsData){
	save(gpsData);
    }

    @Override
    public void delete(String id){
	hashOperation.delete("GPSDATA", id);
    }

    

}
