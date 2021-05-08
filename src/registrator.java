// Control Class
public class registrator {
	
	public boolean registrate(registration registration) {
		if(registrationList.add(registration)) return true;
		return false;
	}
}
