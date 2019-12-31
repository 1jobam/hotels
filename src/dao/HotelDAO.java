package dao;

import java.util.ArrayList;

import vo.HotelVO;

public interface HotelDAO {
	
	ArrayList<HotelVO> selectlocal(int localId);

	ArrayList<HotelVO> selecthotel(int localId ,int hotelId);

	void insertlocal(HotelVO local);
	
	void inserthotel(HotelVO hotel);
}
