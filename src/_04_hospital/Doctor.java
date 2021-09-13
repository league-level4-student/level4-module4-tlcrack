package _04_hospital;

import java.util.ArrayList;

public class Doctor {

	ArrayList<Patient> Patients = new ArrayList<Patient>();
	
	boolean performsSurgery = false;
	boolean makesHouseCalls = false;
	
	
	boolean performsSurgery() {
		return performsSurgery;
	}
	
	boolean makesHouseCalls() {
		return makesHouseCalls;
	}
	
	void assignPatient(Patient p) throws DoctorFullException {
		if(Patients.size()<3) {
		Patients.add(p);
		}
		else {
			throw new DoctorFullException();
		}
	}
	
	ArrayList<Patient> getPatients() {
		return Patients;
	}
	
	void doMedicine() {
		for(int i = 0; i < Patients.size(); i++) {
			Patients.get(i).checkPulse();
		}
	}
}
