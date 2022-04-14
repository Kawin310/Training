package com.training.doctor;

import java.util.HashSet;
import java.util.Set;

public class Doctor {

	private int doctorId;
	private String doctorName;
	private String department;
	
	private Set<Patient> list=new HashSet<>();
	
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department + ", list="
				+ list + "]";
	}

	public Doctor(int doctorId, String doctorName, String department, Set<Patient> list) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.list = list;
	}

	//private Patient patient;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Patient> getList() {
		return list;
	}

	public void setList(Set<Patient> list) {
		this.list = list;
	}
	
	
}
