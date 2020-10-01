/*
  @author : Aziz Amerul Faozi
  @description : Kode ini hanya untuk mengetes redis ke server
*/

package com.prasimax.gfwdemo.models;

import java.io.Serializable;
//import org.springframework.data.annotation.Id;

public class User implements Serializable {
    
    //@Id
    private String id;
    private String name;
    private Long salary;

    public User(String id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
