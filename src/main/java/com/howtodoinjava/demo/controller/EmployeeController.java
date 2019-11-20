package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Input;



@RestController
public class EmployeeController {
	
	@PostMapping(path = "/hello")
    public Integer getResult(@RequestBody Input in) 
    {
		return in.getNum1()+in.getNum2();
    }

}
