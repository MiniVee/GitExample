//Entity Class(Value Object -> Data Transfer Object(DTO)
public class registration {
	private String customerID;
	private String registrationID;
	private String insuranceID;
	
	public boolean registrate(String customerID, String registrationID) {
		
	}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getRegistrationID() {
		return registrationID;
	}
	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}
	public String getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(String insuranceID) {
		this.insuranceID = insuranceID;
	}
	
	

}
