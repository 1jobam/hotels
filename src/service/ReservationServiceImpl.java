package service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import vo.ReservationVO;
import vo.UserVO;
import controller.Controller;
import controller.ReviewController;
import dao.ReservationDAO;
import dao.ReservationDAOImpl;
import dao.UserDao;
import dao.UserDaoImpl;


public class ReservationServiceImpl implements ReservationService{
	//----------------------------------------------------//
	private static ReservationServiceImpl instance;
	
	private ReservationServiceImpl(){}												//싱글톤
	
	public static ReservationServiceImpl getInstance(){
		if(instance == null){
			instance =new ReservationServiceImpl();
		}
		return instance;
	}
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

	
	ReservationDAO reservDao = ReservationDAOImpl.getInstance();
	UserDao userDao =UserDaoImpl.getInstance();
	UserVO userVO = new UserVO();
	ArrayList<ReservationVO> reservtaionCheckList = reservDao.reservationList();
	//----------------------------------------------------//
	
	@Override
	public  void roomCheckIn(int roomId, String userid){
		int count=0;
		
//		//-------------------------------체크인 입력부---------------------------------------//	
			Scanner s = new Scanner(System.in);
			moongu2();
			System.out.println("\t체크인 날짜를\t(ex 20200701) 입력 해주세요 >");
			moongu1();
			String checkinday = s.nextLine();									//String 타입
			int checkindays1 =Integer.parseInt(checkinday);
			moongu1();
			
			System.out.println("\t체크아웃 날짜를\t(ex 20200701) 입력 해주세요 >");
			moongu2();
			int checkoutday =Integer.parseInt(s.nextLine());					//int 타입
		    
			 Date fristday =conv(checkindays1);
		     Date lastday =conv(checkoutday);
//		//-------------------------------체크인 날짜 계산---------------------------------------//
		     int startYear = Integer.parseInt(checkinday.substring(0,4));
		     int startMonth= Integer.parseInt(checkinday.substring(4,6));
		     int startDate = Integer.parseInt(checkinday.substring(6,8));
		     Calendar cal1 = Calendar.getInstance();
		     cal1.set(startYear, startMonth -1, startDate);
		     
		//--------------------------------날짜 출력-------------------------------------------//    
//		     userReservList.setUserId();
//		     for(int i = 0; i< alluserList.size(); i++){
//		    	 System.out.print("\t"+alluserList.get(i));
//		     }
		     while(true) {
		    	 count++;
		         cal1.add(Calendar.DATE, 1);
		         int checkdays =getDateByInteger(cal1.getTime());								//	Calendar의 날짜를 하루씩 증가한다.
		         if(getDateByInteger(cal1.getTime()) >= checkoutday) 							// 현재 날짜가 종료일자보다 크거나 같을때
		        	 break;
		     }
		     
		     SimpleDateFormat format_recentTime = new SimpleDateFormat("yyMMddmmss");				//현재 시간을 예약아이디로 입력부
		     Date recentTime = new Date();
		     int reservationId = Integer.parseInt(format_recentTime.format(recentTime));	
		     ReservationVO userReservList = new ReservationVO();
		     
		    //--------------------------------날짜 출력-------------------------------------------//
		     
		     boolean reservCheck = reservDao.reservCheck(roomId, fristday, lastday);				//예약체크
		     if(!reservCheck){
		    	 System.out.println("예약실패 다시");
		    	 }
		     else if(reservCheck == true){																//예약체크에 따른 예약성공실패
		    	 moongu1();
		    	 System.out.println("예약이 가능 하십니다.");
		    	 String requestText =request();														//요청사항
		    	 String paymethod = makePayment(roomId, count);
//		    	 System.out.println(count);
		    	 int dayPrice=reservDao.getRoomPrice(roomId);
		    	 int totalPrice = dayPrice*count;
		    	 
		    	 userReservList.setUserId(userid);														//현재 접속중인 유져아이디
		    	 userReservList.setReservationId(reservationId);
		    	 userReservList.setRoomId(roomId);													//선택한 룸아이디
		    	 userReservList.setCheckin(fristday);
		    	 userReservList.setCheckout(lastday);
		    	 userReservList.setCount(count);
		    	 userReservList.setPaymethod(paymethod);
		    	 userReservList.setReservationPrice(totalPrice);
		    	 userReservList.setRequest(requestText);
		    	 userReservList.setStatus(1);
		    	 
		    	 reservDao.insertUser(userReservList);
		     }
			
		}//The end roomCheckIn
	
	public String request() {																		//요청사항메소드
		moongu1();
		System.out.println("\t객실에 대한 추가 요구사항이 있을 경우 기재해주세요 (200자 이하)");
		moongu1();
		
		Scanner sc = new Scanner(System.in);
		String request = sc.nextLine();
		
		return request;
	}
	
	public static Date conv(int date){
		Calendar cal1 = Calendar.getInstance();
		int a = date%100; //일
		date = date/100;
		int b = date%100; //월
		date = date/100;
		int c = date%10000; //년도
		date = date/10000;
		
		cal1.set(c, b-1, a);
		Date time = cal1.getTime();
		
		return time;
	}
	
	public static int getDateByInteger(Date date) {										//날짜를 숫자로치환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return Integer.parseInt(sdf.format(date));
	}
	
	@Override
	public String makePayment(int roomid, int staydate) {

		String paymentMethod = "";
		int price = reservDao.getRoomPrice(roomid);
		double prices = (double)price*staydate;
		DecimalFormat form =new DecimalFormat("###,###");
		do{
		moongu2();
		System.out.println("\t\t\t\t ☆ 결제 진행 페이지 입니다 ☆");
		moongu1();
		System.out.println("\t결제하실 방의 가격은 "+form.format(prices)+"원"+"입니다.");
		moongu1();
		System.out.println("\t1. 결제하기");
		System.out.println("\t2. 결제취소");
		moongu1();
		System.out.println("\t >");
		moongu2();
		Scanner sc = new Scanner(System.in);
		int ans = Integer.parseInt(sc.nextLine());
		if(ans == 2){break;}
		if(ans == 1){
			moongu2();
			System.out.println("\t\t\t\t ☆ 결제 진행 페이지 입니다 ☆");
			moongu1();
			System.out.println("\t결제 방법을 선택해주세요");
			moongu1();
			System.out.println("\t1. 현금");
			System.out.println("\t2. 계좌이체");
			System.out.println("\t3. 카드");
			System.out.println("\t4. 결제취소");
			moongu1();
			System.out.println("\t >");
			moongu2();
			
			ans = Integer.parseInt(sc.nextLine());
			
			if(ans == 1){paymentMethod = "현금";
			moongu1();
			System.out.println("\t결제가 완료되었습니다. 감사합니다.");}
			moongu1();
			if(ans == 2){paymentMethod = "계좌이체";
			moongu1();
			System.out.println("\t결제가 완료되었습니다. 감사합니다.");}
			moongu1();
			if(ans == 3){paymentMethod = "카드";
			moongu1();
			System.out.println("\t결제가 완료되었습니다. 감사합니다.");}
			moongu1();
			if(ans == 4){break;}
			
		}return paymentMethod;
		
		}while(true);
		
		return paymentMethod;
	}

	@Override
	public void searchReserv(String userid) { //검색과 동시에 예약을 취소하거나 리뷰를 작성할 수 있다
		
		ArrayList<ReservationVO> reserv = reservDao.getUserReserv(userid);
		
		do{
			Scanner sc = new Scanner(System.in);
		moongu1();
		for(int i = 0; i < reserv.size(); i++){
			System.out.print("예약"+(i+1)+"번>");
			reservDao.resVOprint(reserv.get(i));
		}
		moongu2();
		System.out.println("\t\t\t\t ☆ 예약 취소 및 리뷰 작성 페이지 입니다 ☆");
		moongu1();
		System.out.println("\t1. 예약취소하기");
		System.out.println("\t2. 리뷰쓰기");
		System.out.println("\t3. 나가기");
		moongu1();
		System.out.println("\t >");
		moongu2();
		
		int ans = Integer.parseInt(sc.nextLine());
		if(ans == 1){
			moongu2();
			System.out.println("\t\t\t\t ☆ 예약 취소 선택 페이지 입니다 ☆ ");
			moongu1();
			System.out.println("\t예약리스트에서 취소하실 예약번호를 선택해주세요(ex.예약1번)");
			moongu1();
			System.out.println("\t유저 화면으로 돌아가시려면 0을 눌러주세요");
			moongu2();
			ans = Integer.parseInt(sc.nextLine());
			DecimalFormat form =new DecimalFormat("###,###");

			if(ans == 0){break;}
			if(reserv.get(ans-1).getStatus() == 1){
				moongu1();
				System.out.println("\t예약이 취소되었습니다.");
				System.out.println("\t결제금액 "+form.format(reserv.get(ans-1).getReservationPrice())+"원"+"을");
				System.out.println("\t결제하신 방법인 "+reserv.get(ans-1).getPaymethod()+"(으)로 돌려드립니다.");
				moongu1();
				reservDao.cancelReserv(reserv.get(ans-1).getReservationId()); 			//예약상태를 취소로 바꾸는 메소드
				break;
			}
			if(reserv.get(ans-1).getStatus() == 2 ||
					reserv.get(ans-1).getStatus() == 3 ||
						reserv.get(ans-1).getStatus() == 4){
				moongu1();
				System.out.println("\t선택하신 예약은 취소하실 수 없습니다.");
				moongu1();
				System.out.println();
			}
		}
		if(ans == 2){
			moongu2();
			System.out.println("\t\t\t\t ☆ 리뷰 작성 페이지 입니다 ☆");
			moongu1();
			System.out.println("\t리뷰를 작성하시려는 예약을 선택해주세요(ex.예약1번)");
			moongu1();
			System.out.println("\t유저 화면으로 돌아가시려면 0을 눌러주세요");
			moongu2();
			ans = Integer.parseInt(sc.nextLine());
			
			if(ans == 0){break;}
			if(reserv.get(ans-1).getStatus() == 1 ||
					reserv.get(ans-1).getStatus() == 2 ||
						reserv.get(ans-1).getStatus() == 4){
				moongu1();
				System.out.println("\t\t\t\t선택하신 예약은 리뷰를 작성하실 수 없습니다.");
				moongu1();
				System.out.println();
			}
			if(reserv.get(ans-1).getStatus() == 3){
				int reservid = reserv.get(ans-1).getReservationId();
				reserv.get(ans-1).setStatus(4);
				moongu1();
				System.out.println("\t\t\t\t리뷰를 작성하실수 없습니다.");
				moongu1();
				new ReviewController().before(userid, reservid);
				break;
			}
		}
		if(ans == 3){ break;}
		}while(true);
		
	}

	

	@Override
	public void selectReservation() {
		Scanner s = new Scanner(System.in);
		String menu;
		String status;
		
		moongu2();
		System.out.println("\t\t\t\t ☆ 호텔 예약자 목록 확인 페이지 ☆");
		moongu1();
		System.out.println(" 번호\t아이디\t예약번호\t객실아이디\t\t 예약기간\t\t\t예약상태");
		moongu1();
			for(int i =reservDao.reservationList().size() -1; 0<= i; i--){
				ReservationVO reList =reservDao.reservationList().get(i);
				
				if(reList.getStatus() == 1){
					status = "예약대기";
				}else if(reList.getStatus() == 2){
					status = "예약취소";
				}else if(reList.getStatus() == 3){
					status = "리뷰작성대기";
				}else{
					status = "리뷰작성완료";
				}
				
				System.out.println(i + 1 +"\t"+ reList.getUserId()
									 + "\t  "
									 + reList.getReservationId()
									 + "\t   "
									 + reList.getRoomId() + "호실"
									 + "\t "
									 + getDateByInteger(reList.getCheckin())
									 + " ~ " 
									 + getDateByInteger(reList.getCheckout())
									 +"("
									 + (reList.getCount()-1)
									 +"박"
									 + reList.getCount()
									 +"일"
									 +")"
									 + "    "
									 + status
//									 + reList.getStatus()
									 );
									 	
			}
			moongu1();
			System.out.println("이전화면으로 돌아가시려면 '이전'을 입력해주세요.");
			moongu2();
			menu = s.nextLine();
			Controller mov = new Controller();
			do{
				
				switch(menu){
				case "이전" :
					mov.userAdminLogin();
					break;
				}
				
			}while(menu != "0");
	
		
			
	}

}
