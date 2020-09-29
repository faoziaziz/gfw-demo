/*
  author : Aziz Amerul Faozi
  description : this code use for nothing
*/
package com.prasimax.gfwdemo.controller;

import com.prasimax.gfwdemo.models.User;
import com.prasimax.gfwdemo.repository.UserRepository;
/* this bellow default from generator */
import org.springframework.web.bind.annotation.*;

/* end default from generator */

import java.util.Map;

@RestController
/*you can add some @RequestMapping("/rest/user") in this line*/
public class HomeController {

    private UserRepository _userRepository;

    public HomeController(UserRepository userRepository){
	_userRepository=userRepository;
    }
    
    @GetMapping("/all")
    public Map<String, User> GetAll(){
	return _userRepository.findAll();
    }

    @GetMapping("/all/{id}")
    public User GetAll(@PathVariable("id") final String id){
        return _userRepository.findById(id);
    }

    @PostMapping("/add")
    public User add(@RequestBody User user){
        _userRepository.save(new User(user.getId(),user.getName(),user.getSalary()));
        return _userRepository.findById(user.getId());

    }


    @PostMapping("/update")
    public User update(@RequestBody User user){
        _userRepository.update(new User(user.getId(),user.getName(),user.getSalary()));
        return _userRepository.findById(user.getId());

    }
    
    @RequestMapping("/")
    public String index() {
	return "Odading Mang Soleh";
    }

    @RequestMapping("/v1/api")
    public String mantan(){
	return "rasanya strawbery";
    }
  

    

}
