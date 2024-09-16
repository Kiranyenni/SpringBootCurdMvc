package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.SpringBootCurdMvcDto;
import com.repo.SpringBootMvcRepo;

@Service
public class SpringBootCurdMvcServiceImp implements SpringBootCurdService {
	@Autowired
	SpringBootMvcRepo repo;
	private SpringBootCurdMvcDto obj;

	public void save(SpringBootCurdMvcDto dto) {
		repo.save(dto);
	}

	public void update(SpringBootCurdMvcDto dtofinal, int id) {
		Optional<SpringBootCurdMvcDto> obj = repo.findById(id);
		SpringBootCurdMvcDto dto = obj.get();
		dto.setId(dtofinal.getId());
		dto.setName(dtofinal.getName());
		dto.setSalary(dtofinal.getSalary());
		dto.setDesignation(dtofinal.getDesignation());
		repo.save(dto);
	}

	public SpringBootCurdMvcDto get(Integer id) {

		SpringBootCurdMvcDto dto = new SpringBootCurdMvcDto();
		Optional<SpringBootCurdMvcDto> obj = repo.findById(id);
		if (obj.isPresent()) {
			dto = obj.get();
		}
		return dto;
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
