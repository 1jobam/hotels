package service;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import controller.Controller;
import vo.ReservationVO;
import vo.UserAdminLoginVO;
import vo.UserVO;
import dao.ReservationDAO;
import dao.ReservationDAOImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import dao.UserLoginDao;
import dao.UserLoginDaoImpl;
import data.Session;

public class UserServiceImpl implements UserService { //클래스를 생성할때 인터페이스를 추가하여 생성 가능

	private static UserServiceImpl instance;
	
	private UserServiceImpl(){}
	
	public static UserServiceImpl getInstance(){
		if(instance == null){
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	UserLoginDao userLoginDao = UserLoginDaoImpl.getInstence();
	Scanner s = new Scanner(System.in);
	
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
	
	@Override
	public void join() {
		//메인화면 이동
		Controller as = new Controller();
		//회원가입
		
		moongu2();
		System.out.println("\t\t\t\t☆ 회원가입 진행 페이지 1) ☆");
		moongu1();
		System.out.println("\t이름 : ");
		System.out.println("\tex) 홍길동");
		moongu1();
		moongu2();
		
		String name = s.nextLine();
		
		String regName = "^[가-힣]{2,4}$";
		Pattern regexName = Pattern.compile(regName);
		Matcher matcherName = regexName.matcher(name);
		
		if(matcherName.find()){
		}else{
			moongu1();
			System.out.println("이름이 유효 하지 않습니다. \n ※ 한글로 입력하여주세요.");
			moongu1();
			join();
		}
		
		moongu2();
		System.out.println("\t\t\t\t☆ 회원가입 진행 페이지 2) ☆");
		moongu1();
		System.out.println("\t아이디 : ");
		System.out.println("\tex) test1234");
		moongu1();
		moongu2();
		
		String id = s.nextLine();
		
		String regId = "[a-z0-9_-]{5,20}";
		Pattern regexId = Pattern.compile(regId);
		Matcher matcherId = regexId.matcher(id);
		
		if(matcherId.find()){
		}else{
			moongu1();
			System.out.println("아이디가 유효 하지 않습니다.\n ※ 영어와 숫자를 사용하여주세요. \n 틀렸습니다 처음부터 다시 시작해주세요.");
			moongu1();
			join();
		}
		
		moongu2();
		System.out.println("\t\t\t\t☆ 회원가입 진행 페이지 3) ☆");
		moongu1();
		System.out.println("\t비밀번호 : ");
		System.out.println("\tex) test123!@#");
		moongu1();
		moongu2();
		
		String password = s.nextLine();
		
		String regPassword = "([a-z].*[A-Z])|([A-Z].*[a-z])\"|([0-9].*[!,@,#,^,&,*,(,),/])|([!,@,#,^,&,*,(,),/].*[0-9])";
		
		Pattern regexPassword = Pattern.compile(regPassword);
		Matcher matcherPassword = regexPassword.matcher(password);
		Matcher matcherPassword2 = regexPassword.matcher(password);  
		
		if(matcherPassword.find() && matcherPassword2.find()){
		}else{
			moongu1();
			System.out.println("비밀번호가 유효 하지 않습니다. \n ※ 영어와 숫자, 특수문자가 포함되어야 됩니다. \n 틀렸습니다 처음부터 다시 시작해주세요.");
			moongu1();
			join();
		}
		
		moongu2();
		System.out.println("\t\t\t\t☆ 회원가입 진행 페이지 4) ☆");
		moongu1();
		System.out.println("\t전화번호 : ");
		System.out.println("\tex) 01012341234");
		moongu1();
		moongu2();
		
		String phone = s.nextLine();
		
		String regPhone = "^01(?:0|1|[6-9])?(\\d{3}|\\d{4})?(\\d{4})$";
		Pattern regexPhone = Pattern.compile(regPhone);
		Matcher matcherPhone = regexPhone.matcher(phone);
		
		if(matcherPhone.find()){
		}else{
			moongu1();
			System.out.println("핸드폰 번호가 유효 하지 않습니다. \n ※ 예제에 따라주세요 \n 틀렸습니다 처음부터 다시 시작해주세요.");
			moongu1();
			join();
		}
		
		moongu2();
		System.out.println("\t\t\t\t☆ 회원가입 진행 페이지 5) ☆");
		moongu1();
		System.out.println("\t이메일 : ");
		System.out.println("\tex) test123@naver.com");
		moongu1();
		moongu2();
		
		String email = s.nextLine();
		
		String regEmail = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		Pattern regexEmail = Pattern.compile(regEmail);
		Matcher matcherEmail = regexEmail.matcher(email);
		
		if(matcherEmail.find()){
		}else{
			moongu1();
			System.out.println("이메일이 유효 하지 않습니다. \n ※ 예제에 따라주세요 \n 틀렸습니다 처음부터 다시 시작해주세요.");
			moongu1();
			join();
		}
		 
		UserVO user = new UserVO();
		
		user.setName(name);
		user.setId(id);
		user.setPassword(password);
		user.setPhone(phone);
		user.setEmail(email);
		user.setGrade("일반등급");
		
		UserVO userCheck = userDao.selectUser("ID", user.getId());
		
		if(userCheck == null){
			userDao.insertUser(user);
			moongu2();
			moongu1();
			System.out.println("\t\t\t\t " + "[" + name + "]" + " 님 ☆ 회원가입을 진행해 주셔서 감사합니다 ☆");
			moongu1();
			moongu2();
			as.begin();
		}else{
			moongu1();
			System.out.println("입력하신 " + id + " 이 중복 되었습니다.");
			moongu1();
			join();
		}
		

	}

	@Override
	public void login() {
		Controller as = new Controller();
		//로그인
		
		moongu2();
		moongu1();
		System.out.println("\t아이디 : ");

		moongu1();
		String id = s.nextLine();
		
		moongu1();
		System.out.println("\t비밀번호 : ");
		moongu1();
		moongu2();
		String password = s.nextLine();
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);

		
		UserVO user = userDao.selectUser(param);
		
		if(user == null){
			moongu1();
			System.out.println("\t\t\t\t아이디 혹은 비밀번호를 잘못 입력 하셨습니다.");
			moongu1();
		}else{
			Session.setLoginUser(user);
			
			as.userLogin(id);
		}
	}
	
//	String passUserid(String userid){
//		return userid;
//	}
	
	
	@Override
	public void loginAdmin() {
		Controller as = new Controller();
		//로그인
		
		moongu2();
		System.out.println("\t\t\t\t ☆ 관리자 로그인 페이지 입니다 ☆");
		moongu1();
		System.out.println("\t아이디 : ");
		moongu1();
		
		String id = s.nextLine();
		

		moongu1();
		System.out.println("\t비밀번호 : ");
		moongu1();
		moongu2();
		
		String password = s.nextLine();
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);
		
		UserAdminLoginVO user = userDao.selectAdminUser(param);
		
		if(user == null){
			System.out.println("\t\t\t\t아이디 혹은 비밀번호를 잘못 입력 하셨습니다.");
		}else{
			Session.setAdminLoginUser(user);
			System.out.println(user.getAdminname() + "님 환영합니다.");
			as.userAdminLogin();
		}
		
	}
	
	ReservationDAO reservDao = ReservationDAOImpl.getInstance();

	@Override
	public void selectres() {
		String input;
		
		Controller as = new Controller();
		
		do{
			moongu2();
			System.out.println("\t\t\t\t ☆ 비회원 예약조회 페이지 입니다 ☆");
			moongu1();
			System.out.println("\t예약 번호를 입력하여 주세요.");
			moongu1();
			System.out.println("\t이전화면으로 돌아가시려면 '이전'");
			moongu1();
			moongu2();
			input = s.nextLine();

			if(input.equals("이전")){
				as.begin();
				break;
			}else if(!input.equals("이전")){
				selectreserv(input);
			}
		}while(input != "0");
	}

	@Override
	public void selectreserv(String input) {
		Scanner s = new Scanner(System.in);
		String menu;
		String status;
		
		String trace = input;
		int number = Integer.parseInt(input);
		
		moongu2();
		System.out.println("\t\t\t\t ☆ 비회원 예약조회 페이지☆");
		moongu1();
		System.out.println("   아이디\t\t예약번호\t\t\t객실아이디\t\t  예약기간\t\t  예약상태");
		moongu1();
			for(int i =reservDao.selectReserv().size() -1; 0<= i; i--){
				ReservationVO reList =reservDao.selectReserv().get(i);
				
				if(reList.getStatus() == 1){
					status = "예약대기";
				}else if(reList.getStatus() == 2){
					status = "예약취소";
				}else if(reList.getStatus() == 3){
					status = "리뷰작성대기";
				}else{
					status = "리뷰작성완료";
				}
				
				if(number == reList.getReservationId()){
				System.out.println(" "+ reList.getUserId() + "\t\t" + reList.getReservationId() + "\t\t\t" + reList.getRoomId() + "호실" + "\t\t" +"(" + (reList.getCount()-1) +"박" + reList.getCount() +"일" +")" + "\t\t  "+ status );
				}
									 	
			}
			moongu1();
			System.out.println("\t이전화면으로 돌아가시려면 '이전'을 입력해주세요.");
			moongu2();
			menu = s.nextLine();
			do{
				
				switch(menu){
				case "이전" :
					new Controller().begin();
					break;
				}
				break;
			}while(menu != "0");
	}

}
