public class MedicalHistory {

	private String clientCancerCareer;
	public String getClientCancerCareer() {
		return clientCancerCareer;
	}


	public void setClientCancerCareer(String clientCancerCareer) {
		this.clientCancerCareer = clientCancerCareer;
	}


	public String getFamilyCancerCareer() {
		return familyCancerCareer;
	}


	public void setFamilyCancerCareer(String familyCancerCareer) {
		this.familyCancerCareer = familyCancerCareer;
	}


	public int getNumberOfHospitalizations() {
		return numberOfHospitalizations;
	}


	public void setNumberOfHospitalizations(int numberOfHospitalizations) {
		this.numberOfHospitalizations = numberOfHospitalizations;
	}


	public int getNumberOfHospitalVisits() {
		return numberOfHospitalVisits;
	}


	public void setNumberOfHospitalVisits(int numberOfHospitalVisits) {
		this.numberOfHospitalVisits = numberOfHospitalVisits;
	}


	private String familyCancerCareer;
	private int numberOfHospitalizations;
	private int numberOfHospitalVisits;

	
	public MedicalHistory(){

	}

}