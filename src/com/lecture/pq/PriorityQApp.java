package com.lecture.pq;

import java.util.PriorityQueue;
import java.util.Comparator;
	
public class PriorityQApp {
	public static void main(String[] args) {
		//create an instance of comparator
		Comparator<Patient> comparator = new MyComp();
		
		//create an instance of priority queue. 
		//two arguments for constructor: initial capacity and comparator
	    PriorityQueue<Patient> patientQueue = new PriorityQueue<Patient>(10, comparator);
	    
	    //populate the queue
	    patientQueue.add(new Patient(1, "Patient1", false));
	    patientQueue.add(new Patient(2, "Patient2", false));
	    patientQueue.add(new Patient(3, "Patient3", true));
	    patientQueue.add(new Patient(4, "Patient4", false));
	    patientQueue.add(new Patient(5, "Patient5", true));

	    //output the queue (in order of priorities)
	    System.out.print("Order to see doctor: ");
	    while(!patientQueue.isEmpty()) {
	        Patient currentPatient = patientQueue.remove();
	        System.out.print(currentPatient.getName() + ", ");
	    }
	}
}
