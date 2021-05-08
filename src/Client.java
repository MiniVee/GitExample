import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Client> clientList = new ArrayList<Client>();
	
	//Attributes
	private String address;
	private int age;
	private String bankAccountNumber;
	private String email;
	private boolean gender;
	private String clientID;
	private String name;
	private String password;
	private String phoneNumber;
	private String residentRegistrationNumber;
	private MedicalHistory m_MedicalHistory;

	
	public Client() {
		setM_MedicalHistory(new MedicalHistory());
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}
	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}
	
	//Composition Class
	public void ApplyAccidentReception(){
	}

	public void Login(){
		String clientID;
		String password;
		Client loginClient = new Client();
		clientList.contains(loginClient);
		System.out.println("ID를 입력해주세요.");
		clientID = sc.next();
		System.out.println("PW를 입력해주세요.");
		password = sc.next();
		System.out.println(clientList.size());
		for (Client client : clientList) {
			if (client.getClientID().equals(clientID) && client.getPassword().equals(clientID)) {
				System.out.println("PW를 입력해주세요.");

			}
		}
	}
	public void Logout(){
	}

	public <InsuranceProducts> void PayInsurancePremium(InsuranceProducts InsuranceProducts){
	}

	public void SignUp(){
	}

	public MedicalHistory getM_MedicalHistory() {
		return m_MedicalHistory;
	}

	public void setM_MedicalHistory(MedicalHistory m_MedicalHistory) {
		this.m_MedicalHistory = m_MedicalHistory;
	}

}