package service;

public interface UserService {
	void join(); //회원가입
	
	void login(); //사용자로그인

	void loginAdmin(); //관리자로그인

	void selectres(); //비회원예약조회

	void selectreserv(String input); //비회원예약조회 총괄
	
}
