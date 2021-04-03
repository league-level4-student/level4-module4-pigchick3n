package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> DocSize = new ArrayList<Doctor>();
	ArrayList<Patient> PatSize = new ArrayList<Patient>();
	int currentDoc = 0;
	public void addDoctor(GeneralPractitioner generalPractitioner) {
		new GeneralPractitioner();
		DocSize.add(generalPractitioner);
	}
	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		new Surgeon();
		DocSize.add(surgeon);
	}
	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		ArrayList<Doctor> ans = DocSize;
		return ans;
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		ArrayList <Patient> ans  = PatSize;
		return ans;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub

	}
}
