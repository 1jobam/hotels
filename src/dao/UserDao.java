package dao;

import java.util.HashMap;

import vo.UserAdminLoginVO;
import vo.UserVO;

public interface UserDao {

	UserVO selectUser(String key, String value);

	void insertUser(UserVO user);

	UserVO selectUser(HashMap<String, String> param);
	
	UserAdminLoginVO selectAdminUser(HashMap<String, String> param);
	
}
