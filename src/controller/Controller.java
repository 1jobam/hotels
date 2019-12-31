package controller;

import java.util.Scanner;

import service.HotelService;
import service.HotelServiceImpl;
import service.ReservationService;
import service.ReservationServiceImpl;
import service.UserAdminLoginService;
import service.UserAdminLoginServiceImpl;
import service.UserLoginService;
import service.UserLoginServiceImpl;
import service.UserService;
import service.UserServiceImpl;
import data.Session;

public class Controller {
	
	UserService userService = UserServiceImpl.getInstance();
	UserLoginService user = UserLoginServiceImpl.getInstance();
	UserAdminLoginService Admin = UserAdminLoginServiceImpl.getInstance();
	HotelService hotel = HotelServiceImpl.getInstance();
	ReservationService reservationService =ReservationServiceImpl.getInstance();
	ReviewController review = new ReviewController();
	
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		new Controller().start();
		
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
	
	private void start(){ //시작 화면
//		int menu2;
		String menu;
		
		do{
			arrow();
			moongu2();
			System.out.println("\t\t\t\t☆ 호텔 예약 시스템에 오신것을 환영합니다 ☆");
			moongu1();
			System.out.println("\t1).\t 호텔예약 시스템 시작");
			System.out.println("\t0).\t 프로그램 종료");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			
			menu = s.nextLine();
			switch(menu){
			case "시작" :
				begin();
				break;
			case "1" :
				begin();
				break;
			case "종료" :
				moongu2();
				moongu1();
				System.out.println("\t\t\t\t☆ 호텔 예약시스템을 이용해주셔서 감사합니다. ☆");
				moongu1();
				moongu2();
				System.exit(0);
				break;
			case "0" :
				moongu2();
				moongu1();
				System.out.println("\t\t\t\t☆ 호텔 예약시스템을 이용해주셔서 감사합니다. ☆");
				moongu1();
				moongu2();
				System.exit(0);
				break;
			}
		}while(menu != "종료");
	}
	
	public void di(){
		System.out.println(":--------------------------------------------------------------------------------------------------:");
		System.out.print("|");
		for(int i =0; i<8; i++){
			System.out.print(" ");
		}
		System.out.print("서울");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("인천");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("대전");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("광주");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("대구");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("울산");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("부산");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("제주 ");
		for(int i= 0; i<9; i++){
			System.out.print(" ");
		}
		System.out.println("          |");
		System.out.println(":--------------------------------------------------------------------------------------------------:");
	}
	
	public void arrow(){	
		System.out.println("\t\t\t\t\t\t▦▦");
			System.out.println("\t\t\t\t\t\t▦▦");
			System.out.println("\t\t\t\t\t\t▦▦");
			System.out.println("\t\t\t\t\t\t▦▦");
			System.out.print("\t\t\t\t\t▦▦\t▦▦ ");
			for(int i =0; i<16; i++){
				System.out.print(" ");
			}
			System.out.println("▦▦");
			for(int i =0; i<123; i++){
				System.out.print(" ");
			}
			System.out.print("▦▦");
			System.out.print("\t");
			System.out.print("▦▦");
			for(int i =0; i<14; i++){
				System.out.print(" ");
			}
			System.out.print("▦▦");
			System.out.println();
			for(int i =0; i<126; i++){
				System.out.print(" ");
			}
			System.out.print("▦▦");
			System.out.print("\t");
			System.out.print("▦▦");
			for(int i =0; i<11; i++){
				System.out.print(" ");
			}
			System.out.println("▦▦");
			for(int i =0; i<129; i++){
				System.out.print(" ");
			}
			System.out.print("▦▦");
			System.out.print("\t");
			System.out.print("▦▦");
			for(int i =0; i<8; i++){
				System.out.print(" ");
			}
			System.out.println("▦▦");
			for(int i =0; i<133; i++){
				System.out.print(" ");
			}
			System.out.print("▦▦");
			System.out.print("\t");
			System.out.print("▦▦");
			for(int i =0; i<5; i++){
				System.out.print(" ");
			}
			System.out.println("▦▦");
			for(int i =0; i<139; i++){
				System.out.print(" ");
			}
			System.out.println("▦▦▦▦▦");
			for(int i =0; i<143; i++){
				System.out.print(" ");
			}
			System.out.println("▦▦▦");
			for(int i =0; i<147; i++){
				System.out.print(" ");
			}
			System.out.println("▦");
			for(int i = 0; i < 100; i++){
				System.out.print("-");
			}	
			System.out.println();
		}


	public void begin() { //메인화면
		int menu;
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 로그인 및 회원 가입을 진행 하실수 있습니다 ☆");
			moongu1();
			System.out.println("\t1). \t회원가입");
			System.out.println("\t2). \t로그인");
			System.out.println("\t0). \t프로그램종료");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
			case 1: //회원가입
				beginregister();
				break;
			case 2 : //로그인
				beginLogin();
				break;
			case 0 : //프로그램 종료
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			}
		}while(menu != 0);
	}
	
	
	private void beginregister(){ //회원가입 화면
		int menu;
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 회원가입을 원하시면 등록으로 이동해주세요 ☆");
			moongu1();
			System.out.println("\t1). \t등록");
			System.out.println("\t2). \t이전화면");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			case 1 : //등록이동
				userService.join();
				break;
			case 2 : //이전화면
				begin();
				break;
			}	
		}while(menu != 0);
	}
	
	private void beginLogin(){ //로그인 분활 화면
		int menu;
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 사용자 로그인, 관리자 로그인 판단하여 로그인 부탁드립니다. ☆");
			moongu1();
			System.out.println("\t1). \t사용자 로그인");
			System.out.println("\t2). \t관리자 로그인");
			System.out.println("\t3). \t이전화면");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			case 1 : //사용자로그인
				userService.login();
				break;
			case 2 : //관리자로그인
				userService.loginAdmin();
				break;
			case 3 : //이전화면
				begin();
				break;
			}
		}while(menu != 0);
	}
	

	public void userLogin(String userid) { //사용자 로그인화면으로 이동
		int menu;
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 사용자 로그인 페이지 입니다. ☆");
			moongu1();
			System.out.println("\t\t현재 접속 아이디 : " + Session.getLoginUser().getId() + "\t\t\t" + "[" + Session.getLoginUser().getName() + "]" + "님 환영 합니다.");
			moongu1();
			System.out.println("\t1). \t호텔예약하러 가기");
			System.out.println("\t2). \t마이페이지");
			System.out.println("\t0). \t로그아웃");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			
			case 1 : //지역선택하러 가기
				localMove(userid);
				break;
			case 2 : //마이페이지
				userMypage();
				break;
			case 0 : //로그아웃
				begin();
				break;
			}
		}while(menu != 0);
	}
	
	public void userMypage(){ //유저 내정보
		int menu;
		String userid = Session.getLoginUser().getId();
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 마이 페이지 입니다 ☆");
			moongu1();
			System.out.println("\t1). \t내 정보 확인 및 수정");
			System.out.println("\t2). \t예약 조회하기");
			System.out.println("\t3). \t내가 작성한 리뷰 확인하기");
			System.out.println("\t4). \t이전화면");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			case 1 : //내 정보 확인 및 수정하기
				user.userMypage();
				break;
			case 2 : //예약 조회하기
				reservationService.searchReserv(userid);
				break;
			case 3 : //리뷰 확인하기
				review.userReviews(userid);
				break;
			case 4 : //이전화면
				userLogin(userid);
				break;
			}
			
		}while(menu != 0);
		
	}
	
	public void localMove(String id){
//		Hotel hotel = new Hotel();
		int menu;

		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 지역 선택 이동 페이지 입니다 ☆");
			moongu1();
			System.out.println("\t1). \t지역선택 하기");
			System.out.println("\t2). \t이전화면");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			menu = Integer.parseInt(s.nextLine());		
			
			switch(menu){
			case 1 :
				hotel.Search(id);
				break;
			case 2 :
				userLogin(id);
				break;
			}
			break;
		}while(menu != 0);
		
	}
	
	public void userAdminLogin() { //관리자 로그인화면으로 이동
		int menu;
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 관리자 페이지 입니다 ☆");
			moongu1();
			System.out.println("\t1). \t호텔등록 하기");
			System.out.println("\t2). \t호텔 예약자 확인");
			System.out.println("\t3). \t회원목록 확인");
			System.out.println("\t4). \t각 지역 등록된 호텔 조회하기");
			System.out.println("\t5). \t로그아웃");
			moongu1();
			System.out.println("\t메뉴에 해당하는 번호 입력>");
			moongu2();
			
			menu = Integer.parseInt(s.nextLine());
			switch(menu){
			case 1 :
				hoteladd();
				break;
			case 2 :
				reservationService.selectReservation();
				break;
			case 3 :
				Admin.userList();
				break;
			case 4 :
				hotellist();
				break;
			case 5 :
				begin();
				break;
			}
		}while(menu != 0);
	}
	
	public void hoteladd() { //호텔등록하기 1번
		String menu;
	
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 등록하시고 싶은 지역을 선택하여주세요 ☆");
			moongu1();
			di();
			System.out.println("\t이전화면으로 가시려면 '이전'을 입력해 주세요");
			moongu1();
			System.out.println("\t메뉴에 해당하는 값을 입력>");
			moongu2();
			
			menu = s.nextLine();
			
			switch(menu){
			case "대전" :
				hoteladd2(menu);
				break;
			case "서울" :
				hoteladd2(menu);
				break;
			case "광주" :
				hoteladd2(menu);
				break;
			case "부산" :
				hoteladd2(menu);
				break;
			case "제주" :
				hoteladd2(menu);
				break;
			case "울산" :
				hoteladd2(menu);
				break;
			case "인천" :
				hoteladd2(menu);
				break;
			case "이전" :
				userAdminLogin();
				break;
			}
		}while(menu != "0");
	}
	
	public void hoteladd2(String menu) { // 호텔등록하기 2번
		String array = menu;
		String array2;
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 등록 하고 싶으신 호텔 등급을 선택하여주세요 ☆");
			moongu1();
			System.out.println("\t입력하신 지역은 ☆" + array + "☆ 입니다." + "");
			moongu1();
			System.out.println("\tex) 1성급, 2성급, 3성급, 4성급, 5성급");
			System.out.println("\t이전화면으로 가시려면 '이전'을 입력해 주세요");
			moongu1();
			System.out.println("\t메뉴에 해당하는 값을 입력>");
			moongu2();
			
			
			array2 = s.nextLine();
			
			switch(array2){
			case "1성급" :
				hoteladd3(array, array2);
				break;
			case "2성급" :
				hoteladd3(array, array2);
				break;
			case "3성급" :
				hoteladd3(array, array2);
				break;
			case "4성급" :
				hoteladd3(array, array2);
				break;
			case "5성급" :
				hoteladd3(array, array2);
				break;
			case "이전" :
				hoteladd();
				break;
			}
		}while(array2 != "0");
	}
	
	public void hoteladd3(String array, String array2) { // 호텔등록하기 2번
		String inarray1 = array;
		String inarray2;
		String inarray3 = array2;
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 등록하실 호텔의 이름을 입력해주세요 ☆");
			moongu1();
			System.out.println("\t입력하신 지역은 ☆" + inarray1 + "☆ 입니다." + "\n\t입력하신 호텔 등급은 " + inarray3 + " 입니다.");
			moongu1();
			System.out.println("\tex) 유성호텔");
			System.out.println("\t이전화면으로 가시려면 '이전'을 입력해 주세요");
			System.out.println("\t메인화면으로 가시려면 '취소'을 입력해 주세요");
			moongu1();
			System.out.println("\t메뉴에 해당하는 값을 입력>");
			moongu2();
	
			inarray2 = s.nextLine();
			
			switch(inarray2){
			case "이전" :
				hoteladd2(array);
				break;
			case "취소" :
				userAdminLogin();
				break;
			default :
				hotel.localadd(inarray1, inarray2, inarray3);
				break;
			}
			
		}while(inarray2 != "0");
		
	}
	
	public void hotellist() { //호텔조회하기 1번
		String menu;
		
		moongu2();
		System.out.println("\t\t\t\t ☆ 등록하신 호텔의 지역을 입력 해주세요 ☆");
		moongu1();
		di();
		moongu1();
		System.out.println("\t이전화면으로 가시려면 '이전'을 입력해 주세요");
		moongu1();
		moongu2();
		
		
		do{
			menu = s.nextLine();
			
			switch(menu){
			case "대전" :
				hotel.localSearch(menu);
				break;
			case "서울" :
				hotel.localSearch(menu);
				break;
			case "광주" :
				hotel.localSearch(menu);
				break;
			case "부산" :
				hotel.localSearch(menu);
				break;
			case "제주" :
				hotel.localSearch(menu);
				break;
			case "울산" :
				hotel.localSearch(menu);
				break;
			case "인천" :
				hotel.localSearch(menu);
				break;
			case "이전" :
				userAdminLogin();
				break;
			}
		}while(menu != "0");
	}
	
	
}
