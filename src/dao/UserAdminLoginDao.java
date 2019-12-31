package dao;

import java.util.ArrayList;

import vo.UserVO;

public interface UserAdminLoginDao {
	
	ArrayList<UserVO> selectUserList();

}
