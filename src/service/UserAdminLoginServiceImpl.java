package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.UserVO;
import controller.Controller;
import dao.UserAdminLoginDaoImpl;
import dao.UserLoginDao;
import dao.UserLoginDaoImpl;

public class UserAdminLoginServiceImpl implements UserAdminLoginService {
	
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
	
	private static UserAdminLoginServiceImpl instance;

	public static UserAdminLoginService getInstance() {
		if(instance == null) {
			instance = new UserAdminLoginServiceImpl();
		}
		return instance;
	}
	
	UserLoginDao userLoginDao = UserLoginDaoImpl.getInstence();
	UserAdminLoginDaoImpl userAdminLoginDao = UserAdminLoginDaoImpl.getInstance();
	
	@Override
	public void userList() {
		ArrayList<UserVO> userList = userAdminLoginDao.selectUserList();
		String menu;
		moongu2();
		System.out.println("\t\t\t\t ☆ 사용자 목록 조회 페이지 입니다 ☆");
		moongu1();
		System.out.println("\t\t아이디\t   이름\t   비밀번호\t          핸드폰번호\t           이메일 \t\t  등급");
		moongu1();
		for(int i = userList.size() - 1; 0 <= i; i--){
			UserVO user = userList.get(i);
			System.out.println("\t\t" + user.getId() + "\t " + user.getName()+ "\t" + "*******" + "  " + user.getPhone().substring(0, 3) + "-" + user.getPhone().substring(3,  7) + "-" + user.getPhone().substring(7) + "   " + user.getEmail() + "\t" + user.getGrade());
		}
		moongu1();
		System.out.println("\t이전화면으로 돌아가시려면 '이전'을 입력해주세요.");
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
