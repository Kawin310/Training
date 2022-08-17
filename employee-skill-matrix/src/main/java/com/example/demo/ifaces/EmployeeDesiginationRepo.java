package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeDesigination;

public interface EmployeeDesiginationRepo extends JpaRepository<EmployeeDesigination, Integer> {

}
