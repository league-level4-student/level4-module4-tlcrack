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
	void assignPatientsToDoctors() throws DoctorFullException {
		for(int i = 0; i < Patients.size(); i++) {
			boolean isPatientAssigned = false;
			for(int j = 0; j < Doctors.size(); j++) {
				if(Doctors.get(j).Patients.size()<3) {
					Doctors.get(j).assignPatient(Patients.get(i));
					isPatientAssigned=true;
					break;
				}
			}
			if(!isPatientAssigned) {
				System.out.println("We are experiencing an unusually high call frequency right now. Please assign this patient later.");
			}
		}
	}
}
