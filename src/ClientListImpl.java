import java.util.ArrayList;
import java.util.Scanner;

public class ClientListImpl implements ClientList {
	Scanner sc = new Scanner(System.in);
	static ArrayList<Client> clientList = new ArrayList<Client>();
	
	
	
	public boolean add(Client client){
		Client newClient = new Client();
		
		System.out.println("ID를 입력하세요");
		newClient.setClientID(sc.next());
		System.out.println("비밀번호를 입력하세요");
		newClient.setPassword(sc.next());
		/*System.out.println("이름을 입력하세요");
		newClient.setName(sc.next());
		System.out.println("이메일을 입력하세요");
		newClient.setEmail(sc.next());
		System.out.println("성별을 입력하세요");
		System.out.println("1.남자 2.여자");
		switch(sc.nextInt()) {
		 	case 1: System.out.println("남자\n");
		 		break;
		 	case 2: System.out.println("여자\n");
		 		break;
		}
		System.out.println("주소를 입력하세요");
		newClient.setAddress(sc.next());
		System.out.println("나이를 입력하세요");
		newClient.setAge(sc.nextInt());
		System.out.println("핸드폰 번호를 입력하세요");
		newClient.setPhoneNumber(sc.next());
		System.out.println("주민등록번호를 입력하세요");
		newClient.setResidentRegistrationNumber(sc.next());
		System.out.println("계좌번호를 입력하세요");
		newClient.setBankAccountNumber(sc.next());*/
		System.out.println("회원가입이 완료되었습니다.");
		
		clientList.add(newClient);
		System.out.println(clientList.size());
		return false;

	}
	public boolean delete(String clientID){
		System.out.println("삭제할 고객 ID를 입력해주세요.");
		clientID = sc.next();
		System.out.println("삭제할 고객 PW를 입력해주세요.");
		clientID = sc.next();
		for(Client client : clientList) {
			if(client.getClientID().equals(clientID) && client.getPassword().equals(clientID)) {
			System.out.println("정말로 삭제하시겠습니까?");
			System.out.println("1.예 2.아니오");
			switch(sc.nextInt()) {
				case 1: 
					clientList.remove(client);
					System.out.println("성공적으로 삭제되었습니다.");
					break;
					
				case 2:
					return false;
			}
			break;
			}else if(client.getClientID() != clientID || client.getPassword() != clientID){
				System.out.println("올바르지 않은 고객정보입니다.");
			}
		}
		return false;
	}
	public Client search(String clientID) {
		System.out.println("Client 총 회원 수: " + clientList.size() + "명");
		System.out.println("찾으시는 고객의 ID를 입력해주세요.");
		String s = sc.next();
		for(Client client : clientList) {
			if(client.getClientID().equals(s)) {
				System.out.println("[ID: " + client.getClientID() + ", Name: " + client.getName() + ", Age: " + client.getAge() + "]");
				return client;
			}
		} System.out.println("잘못 입력하였습니다.");
		return null;
	}

	public ArrayList<Client> getClientList() {
		return clientList;
	}
	
	public void setClientlist(ArrayList<Client> clientlist) {
		clientList = clientlist;
	}
	
	}


