package com.training.doctor;
import java.util.*;
public class Appointment {

	
	private Map<Doctor,Set<Patient>>map;

	public Appointment(Map<Doctor, Set<Patient>> map) {
		super();
		this.map = map;
	}

	public Map<Doctor, Set<Patient>> getMap() {
		return map;
	}

	public void setMap(Map<Doctor, Set<Patient>> map) {
		this.map = map;
	}
	
}
