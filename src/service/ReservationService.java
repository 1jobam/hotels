package service;


public interface ReservationService {

	
	void roomCheckIn(int roomId, String userid); 		//예약 날짜 조회 및 예약 (
	
	void selectReservation();	//예약가능조회
	
	public void searchReserv(String userid);

	String makePayment(int roomid, int staydate);
	

}