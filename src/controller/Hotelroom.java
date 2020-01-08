package controller;

import java.util.Scanner;

import service.HotelServiceImpl;
import service.ReservationService;
import service.ReservationServiceImpl;
import service.RoomService;
import service.RoomServiceImpl;


public class Hotelroom {
	
	private Scanner sc = new Scanner(System.in);

	public void moongu1(){ // 내용선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
	}
	
	public void moongu2(){ // 구분선
		for(int i = 0; i < 100; i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
HotelServiceImpl roomService = HotelServiceImpl.getInstance();
	
	public void roomMain(int a, String id){	//호텔 id를 받아야 함
		
		RoomService roomService = RoomServiceImpl.getInstance();//룸서비스 클래스를 불러온다
		//Reservation service 예약서비스 클래스를 불러온다
		//Review service 리뷰서비스 클래스를 불러온다
		int roomId;
		String userInput;
		ReservationService reservationService = ReservationServiceImpl.getInstance();
		
		do{
			System.out.println("\t\t\t\t☆ 객실목록 페이지 입니다 ☆");
			moongu1();

			roomService.getRoom(a);//객실을 보여준다
			
			moongu1();
			System.out.println("\t머물고 싶은 객실[번호]를 입력해주세요 \n\tex)객실번호:[1]호실 \n\t예제를 참고하여 대괄호 안의 숫자만 입력하여주세요.");
			moongu1();
			System.out.println("\t지역 선택 화면으로 돌아가시려면 0을 눌러주세요.");
			moongu2();
			
			roomId = Integer.parseInt(sc.nextLine());
			
			if(roomId==0){
				System.out.println("\t이전 화면으로 돌아갑니다"); break;
			}
			
			moongu2();
			System.out.println("\t\t\t\t ☆ 선택하신 객실은 "+roomId+"호실 입니다 ☆");
			moongu1();
			System.out.println("\t예약하시려면 '예약',해당 객실의 리뷰를 보시려면 '리뷰'를 입력 해주세요.");
			moongu1();
			System.out.println("\t지역 선택 화면으로 돌아가시려면 0을 눌러주세요.");
			moongu2();
			
			userInput = sc.nextLine();
			
			if(userInput.equals("0")){
				break;
			}
			else if(userInput.equals("예약")){/*reservation service를 roomId을 담아서 보내준다*/
				reservationService.roomCheckIn(roomId, id);
				break;
			}else if(userInput.equals("리뷰")){
				new ReviewController().getReviews(roomId);
			/*review service를 roomId를 담아서 보내준다*/
			}else{
			 System.out.println("\t잘못된 입력입니다.");
			}
		}while(roomId != 0 && !userInput.equals("이전"));
		
	}
	
}