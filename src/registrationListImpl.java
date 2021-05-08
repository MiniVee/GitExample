import java.util.ArrayList;

public class registrationListImpl implements registrationList {

	private ArrayList<registration> registrationList;
	
	@Override
	public boolean add(registration registration) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(String registrationId) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<registration> getRegistrationList() {
		return registrationList;
	}
	public void setRegistrationList(ArrayList<registration> registrationList) {
		this.registrationList = registrationList;
	}

}
