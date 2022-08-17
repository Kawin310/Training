package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "emp_desigination_2022")
public class EmployeeDesigination {

	@Id
	@Column(name = "emp_desigination_id")
	int empDesiginationId;
	
	@Column(name = "emp_desigination")
	String empDesigination;
}
