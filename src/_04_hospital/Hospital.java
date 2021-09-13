package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> Doctors = new ArrayList<Doctor>();
	ArrayList<Patient> Patients = new ArrayList<Patient>();
	
	
	
	void addDoctor(Doctor d) {
		Doctors.add(d);
	}
	
	void addPatient(Patient p) {
		Patients.add(p);
	}

	ArrayList<Doctor> getDoctors() {
		return Doctors;
	}
	
	ArrayList<Patient> getPatients() {
		return Patients;
	}
	
}
