package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.SpringBootCurdMvcDto;


public interface SpringBootMvcRepo extends JpaRepository<SpringBootCurdMvcDto, Integer>{

}
