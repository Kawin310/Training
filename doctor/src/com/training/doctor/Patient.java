package com.training.doctor;

public class Patient {

	
	private int patientId;
	private String patientName;
	private String location;
	private double mobileNumber;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, String patientName, String location, double mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.location = location;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", location=" + location
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mobileNumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + patientId;
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Double.doubleToLongBits(mobileNumber) != Double.doubleToLongBits(other.mobileNumber))
			return false;
		if (patientId != other.patientId)
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}
	
	
}
