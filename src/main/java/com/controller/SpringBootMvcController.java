package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.SpringBootCurdMvcDto;
import com.service.SpringBootCurdService;

@Controller
public class SpringBootMvcController {
	
	@Autowired
	SpringBootCurdService service;
	

	
	
	@PostMapping("/save")
	public void save(@RequestBody SpringBootCurdMvcDto dto) {
		service.save(dto);
		
	}
	@PutMapping("/update/{id}")
	public void update(@RequestBody SpringBootCurdMvcDto dto, @PathVariable("id") int id) {
		service.update(dto,id);
	}
	@GetMapping("/get")
	public SpringBootCurdMvcDto get(@RequestBody Integer id) {
		return service.get(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
	

}
