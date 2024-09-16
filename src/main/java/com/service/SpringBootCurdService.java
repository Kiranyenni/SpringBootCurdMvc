package com.service;



import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.dto.SpringBootCurdMvcDto;

@Component
public interface SpringBootCurdService {
	
	public void save( SpringBootCurdMvcDto dto);
	public void update( SpringBootCurdMvcDto dto, int id);
	public SpringBootCurdMvcDto get( Integer id);
	public void delete(Integer id); 


}
