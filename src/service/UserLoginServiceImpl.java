package service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vo.UserVO;
import controller.Controller;
import dao.UserLoginDao;
import dao.UserLoginDaoImpl;
import data.Session;

public class UserLoginServiceImpl implements UserLoginService {

	private static UserLoginServiceImpl instance;
	
	private UserLoginServiceImpl() {};

	public static UserLoginService getInstance() {
		if(instance == null){
			instance = new UserLoginServiceImpl();
		}
		return instance;
	}
	
	UserLoginDao userLoginDao = UserLoginDaoImpl.getInstence();
	UserLoginDaoImpl userDao = UserLoginDaoImpl.getInstence();
	
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
	
	Scanner s = new Scanner(System.in);
	
	@Override
	public void userMypage() {
		moongu2();
		System.out.println("\t\t\t\t☆ 보안을 위한 마이페이지 접속 페이지 입니다 ☆");
		moongu1();
		System.out.println("\t안전한 조회를 위해 당신의 아이디, 비밀번호를 확인하겠습니다");
		moongu1();
		System.out.println("\t확인을 위해 아이디를 입력해주세요 >");
		moongu1();
		String idinput = s.nextLine();
		
		moongu1();
		System.out.println("\t확인을 위해 비밀번호를 입력해주세요 >");
		moongu2();
		
		String passinput = s.nextLine();
		
		
		ArrayList<UserVO> userList = userLoginDao.selectUserMypage();
		
		Controller usermy = new Controller();
		String menu;
		for(int i = userList.size() - 1; 0 <= i; i--){
			UserVO user = userList.get(i);
			if(!Session.getLoginUser().getId().equals(idinput) && !Session.getLoginUser().getId().equals(passinput)){
				moongu2();
				System.out.println("\t\t\t\t☆ 계정 정보 확인 및 변경 화면 입니다 ☆");
				moongu1();
				System.out.println("\t로그인 계정과 수정하시려는 계정정보가 일치하지 않습니다.");
				moongu1();
				System.out.println("이전화면으로 돌아기시려면 '이전'을 입력하세요.");
				moongu2();
				break;}
			if(user.getId().equals(idinput) && user.getPassword().equals(passinput)){
				moongu2();
				System.out.println("\t\t\t\t☆ 계정 정보 확인 및 변경 화면 입니다 ☆");
				moongu1();
				System.out.println("\t\t 아이디\t   이름\t   비밀번호\t          핸드폰번호\t           이메일 \t\t  등급");
				moongu1();
				System.out.println("\t\t" + user.getId() + "\t " + user.getName()+ "\t" + "*******" + "  " + user.getPhone().substring(0, 3) + "-" + user.getPhone().substring(3,  7) + "-" + user.getPhone().substring(7) + "   " + user.getEmail() + "\t" + user.getGrade());
				moongu1();
				System.out.println("\t1. 비밀번호 변경하러 가기");
				System.out.println("\t2. 핸드폰 번호 변경하러 가기");
				System.out.println("\t3. 이메일 변경하러 가기");
				moongu1();
				System.out.println("이전화면으로 돌아기시려면 '이전'을 입력하세요.");
				moongu2();
			} 
		}
		UserLoginServiceImpl usermove = new UserLoginServiceImpl();
		
		do{
			menu = s.nextLine();

			switch(menu){
			case "1" :
				usermove.userpassmodify(idinput, passinput);
				break;
			case "2" :
				usermove.userphonemodify(idinput, passinput);
				break;
			case "3" :
				usermove.useremailmodify(idinput, passinput);
				break;
			case "이전" :
				usermy.userMypage();
				break;
			}
		}while(menu != "0");
	}

	@Override
	public void userpassmodify(String id, String pass) {
		Controller usermy = new Controller();
		String idinput = id;
		String passinput = pass;
		
		ArrayList<UserVO> userList = userLoginDao.selectUserMypage();
		
		String input;
		
		moongu2();
		System.out.println("\t\t\t\t☆ 비밀번호 변경 페이지 ☆");
		moongu1();
		System.out.println("\t변경을 원하시는 비밀번호를 입력해주세요.");
		moongu1();
		System.out.println("\t>");
		moongu2();
		input = s.nextLine();
		
		String regPassword = "([a-z].*[A-Z])|([A-Z].*[a-z])\"|([0-9].*[!,@,#,^,&,*,(,),/])|([!,@,#,^,&,*,(,),/].*[0-9])";
		
		Pattern regexPassword = Pattern.compile(regPassword);
		Matcher matcherPassword = regexPassword.matcher(input);
		Matcher matcherPassword2 = regexPassword.matcher(input);
		
		if(matcherPassword.find() && matcherPassword2.find()){
			
			for(int i = userList.size() - 1; 0 <= i; i--){
				UserVO user = userList.get(i);
				if(user.getId().equals(idinput) && user.getPassword().equals(passinput)){
						user.setPassword(input);
						moongu1();
						System.out.println("변경이 완료되었습니다. \n재 로그인 부탁드립니다.");
						moongu1();
						usermy.begin();
						}
				}
			
		}else {
			System.out.println("유효한 비밀번호 형식이 아닙니다..");
			System.out.println("ex)test123!@#");
			userpassmodify(idinput, passinput);
		}
		
	}

	@Override
	public void userphonemodify(String id, String pass) {
		Controller usermy = new Controller();
		String idinput = id;
		String passinput = pass;
		
		ArrayList<UserVO> userList = userLoginDao.selectUserMypage();
		
		String input;
		
		moongu2();
		System.out.println("\t\t\t\t☆ 핸드폰 번호 변경 페이지 ☆");
		moongu1();
		System.out.println("\t변경을 원하시는 핸드폰 번호를 입력해주세요.");
		moongu1();
		System.out.println("\t>");
		moongu2();
		input = s.nextLine();
		
		String regPhone = "^01(?:0|1|[6-9])?(\\d{3}|\\d{4})?(\\d{4})$";
		Pattern regexPhone = Pattern.compile(regPhone);
		Matcher matcherPhone = regexPhone.matcher(input);
		
		if(matcherPhone.find()){
		
		for(int i = userList.size() - 1; 0 <= i; i--){
			UserVO user = userList.get(i);
			if(user.getId().equals(idinput) && user.getPassword().equals(passinput)){
				user.setPhone(input);
				System.out.println("변경이 완료되었습니다. \n재 로그인 부탁드립니다.");
				usermy.begin();
			}
		}
		
		}else {
			System.out.println("유효한 핸드폰 번호의 형식이 아닙니다..");
			System.out.println("ex) 01012341234");
			userphonemodify(idinput, passinput);
		}
		
	}

	@Override
	public void useremailmodify(String id, String pass) {
		Controller usermy = new Controller();
		String idinput = id;
		String passinput = pass;
		
		ArrayList<UserVO> userList = userLoginDao.selectUserMypage();
		
		String input;
		
		moongu2();
		System.out.println("\t\t\t\t☆ 이메일 변경 페이지 입니다 ☆ ");
		moongu1();
		System.out.println("\t변경을 원하시는 이메일을 입력해주세요.");
		moongu1();
		System.out.println("\t>");
		moongu2();
		input = s.nextLine();
		
		String regEmail = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		Pattern regexEmail = Pattern.compile(regEmail);
		Matcher matcherEmail = regexEmail.matcher(input);
		
		if(matcherEmail.find()){
		
		for(int i = userList.size() - 1; 0 <= i; i--){
			UserVO user = userList.get(i);
			if(user.getId().equals(idinput) && user.getPassword().equals(passinput)){
				user.setEmail(input);
				System.out.println("변경이 완료되었습니다. \n재 로그인 부탁드립니다.");
				usermy.begin();
			}
		}
		
		}else{
			System.out.println("유효한 이메일 형식이 아닙니다..");
			System.out.println("ex) test123@naver.com");
			useremailmodify(idinput, passinput);
		}
		
	}
	

}
