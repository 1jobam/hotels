package dao;

import java.util.ArrayList;

import vo.UserVO;
import data.Database;

public class UserAdminLoginDaoImpl implements UserAdminLoginDao {
	
	private static UserAdminLoginDaoImpl Instance;
	
	private UserAdminLoginDaoImpl() {}
	
	public static UserAdminLoginDaoImpl getInstance() {
		if(Instance == null) {
			Instance = new UserAdminLoginDaoImpl();
		}
		return Instance;
	}
	
	Database database = Database.getInstance();
	

	@Override
	public ArrayList<UserVO> selectUserList() {
		return database.tb_user;
	}

}
