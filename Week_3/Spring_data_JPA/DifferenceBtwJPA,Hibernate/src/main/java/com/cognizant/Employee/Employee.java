package com.cognizant.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
}
