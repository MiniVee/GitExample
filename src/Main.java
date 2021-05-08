import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	    ClientList clientList = new ClientListImpl();
	    Scanner sc = new Scanner(System.in);
	    Client client = new Client();
	    //Client.getM_MedicalHistory().setFamilyCancerCareer(null);
	    String clientID = null;
	    
		while(true) {
			System.out.println("\n---Menu---");
			System.out.println("1.관리자");
			System.out.println("2.회원");
			System.out.println("3.보험");
			int fx = sc.nextInt();

		switch(fx) {
			case 1:
				
			break;
			
			case 2: System.out.println("\n메뉴를 선택해주세요.");
				    System.out.println("1.회원 가입");
					System.out.println("2.회원 로그인");
					System.out.println("3.회원 탈퇴");
				switch(sc.nextInt()) {
					case 1: clientList.add(client);
					break;
					case 2: client.Login();
					break;
					case 3: clientList.delete(clientID);
					break;
				}
			break;
			
			case 3:
				clientList.search(clientID);
			break;
			default: 
				System.out.println("잘못 입력했습니다. 다시 선택해주세요.");
				
				sc.close();
		}
		//보험생성
		//set
		//보험 test
		//보험요율계싼
		
		}
	}



}
