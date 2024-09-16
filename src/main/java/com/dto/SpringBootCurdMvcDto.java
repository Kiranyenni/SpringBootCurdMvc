package com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "emp99")
public class SpringBootCurdMvcDto {
	@Id
	int id;
	String name;
	Integer salary;
	String designation;

}
