package com.lecture.pq;

public class Patient {

  private int id;

  private String name;

  private boolean emergencyCase;

  public Patient(int id, String name, boolean emergencyCase) {
    this.id = id;
    this.name = name;
    this.emergencyCase = emergencyCase;
  }

	public int getId() {
	    return id;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public String getName() {
	   return name;
	}
	
	public void setName(String name) {
	   this.name = name;
	}
	
	public boolean isEmergencyCase() {
	   return emergencyCase;
	}
	
	public void setEmergencyCase(boolean emergencyCase) {
	   this.emergencyCase = emergencyCase;
	}
} 