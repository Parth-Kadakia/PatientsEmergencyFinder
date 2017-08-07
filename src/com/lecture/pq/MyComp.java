package com.lecture.pq;

import java.util.Comparator;
// patient priority
// 1. Emergence case has higher priority
// 2. if both emergence cases or both are not
//    2.1 smaller ID has higher priority

public class MyComp implements Comparator<Patient> {
      public int compare(Patient patient1, Patient patient2) {
    	  if (patient1.isEmergencyCase() && !patient2.isEmergencyCase()) 
    		  return -1;
    	  else if (!patient1.isEmergencyCase() && patient2.isEmergencyCase()) 
    		  return 1;
    	  else {
    		  if (patient1.getId() < patient2.getId())
    			  return -1;
    		  else 
    			  return 1;
    	  }
	  }
}
