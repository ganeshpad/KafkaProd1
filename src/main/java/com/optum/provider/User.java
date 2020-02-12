package com.optum.provider;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class User {
	
	private String name;
	private String dept;
	private int salary;
	
	User(String name, String dept, int salary)
	{
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

}
