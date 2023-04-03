package com.example.date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
@RestController
public class MyController {
    @GetMapping("/")
    public String getDate(){
       LocalDate date = LocalDate.now(); 
	   
	    int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

	    
		return "0"+day+"-0"+month+"-"+year;
    }

	}