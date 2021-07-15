package com.testjar.controller;

 


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testjar.entity.Reporte;
import com.testjar.repository.ReporteRepository;

 


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ReporteController {

  @Autowired
  private ReporteRepository reporter;
	//test
	@RequestMapping("get")
	public String  test(@RequestBody Map<String,String> mpentrada) {
		//
			
//		System.out.println(lr3);
		//return ResponseEntity.status(HttpStatus.OK).body(mpentrada);
		
		LocalDateTime d1= LocalDateTime.parse("2020-06-01T11:20:15");
		LocalDateTime d2 = LocalDateTime.parse("2021-06-01T11:20:15");
		
		
		Reporte r=new Reporte("1","1",d1,d2);
		reporter.save(r);
		
		System.out.println("hola mundo desde jar");
		return "hola mundo";
		
	}	


}
