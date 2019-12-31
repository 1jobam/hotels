package data;

import vo.UserAdminLoginVO;
import vo.UserVO;

//세션 : 인터넷창이 열려있는 동안 유지되는 저장 공간
public class Session {
	//로그인 되어있는 유저의 정보를 저장
	private static UserVO LoginUser;

	public static UserVO getLoginUser() {
		return LoginUser;
	}

	public static void setLoginUser(UserVO loginUser) {
		LoginUser = loginUser;
	}

	public static void setAdminLoginUser(UserAdminLoginVO user) {
		// TODO 자동 생성된 메소드 스텁
		
	}

}
