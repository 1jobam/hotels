package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.HotelVO;
import controller.Controller;
import controller.Hotelroom;
import dao.HotelDAO;
import dao.HotelDAOImpl;
import data.Database;

public class HotelServiceImpl implements HotelService {

	private static HotelServiceImpl instance;
	
	private HotelServiceImpl(){}
	
	public static HotelServiceImpl getInstance(){
		if(instance == null){
			instance = new HotelServiceImpl();
		}
		return instance;
	}
	
	HotelDAO hotelDao = HotelDAOImpl.getInstance();
	
	Scanner s = new Scanner(System.in);

	
	void HotelName(HotelVO hotelVO) { //지역아이디를 바탕으로 지역 호텔 목록 조회
		System.out.println();
		System.out.println("\t\t\t\t ☆ 호텔 리스트 입니다 ☆");
		moongu1();
		System.out.printf("\t호텔 이름  : " + hotelVO.getHotelName() + " || ");
		System.out.printf("\t호텔 등급 : " + hotelVO.getHotelGrade());
		System.out.println();
		moongu1();
		
	}
	
	void HotelInfo(HotelVO hotelVO) { // 지역 아이디와 호텔 아이디를 바탕으로 세부정보 조회
		System.out.println("\t\t\t\t ☆ 호텔 상세 페이지 입니다 ☆");
		moongu1();
		System.out.println("\t호텔 소개 :" + hotelVO.getHotelInfo());
		moongu1();
		System.out.println("\t호텔 주소 :" + hotelVO.getHotelAdress());
		System.out.println("\t호텔 연락처 :" + hotelVO.getHotelHp());
		System.out.println();
		moongu1();
	}
	
	public void di(){
		System.out.println(":--------------------------------------------------------------------------------------------------:");
		System.out.print("|");
		for(int i =0; i<8; i++){
			System.out.print(" ");
		}
		System.out.print("서울");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("인천");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("대전");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("광주");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("대구");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("울산");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("부산");
		for(int i =0; i<12; i++){
			System.out.print(" ");
			if(i==7){
				System.out.print("|");
			}
		}
		System.out.print("제주 ");
		for(int i= 0; i<9; i++){
			System.out.print(" ");
		}
		System.out.println("          |");
		System.out.println(":--------------------------------------------------------------------------------------------------:");
	}
	
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
	public void Search(String id) { //지역 아이디 바탕

		Scanner s = new Scanner(System.in);
		String input;

		do{
		moongu2();
		System.out.println("\t\t\t\t☆ 지역 입력 페이지 입니다 ☆");
		moongu1();
		di();
		moongu1();
		System.out.println("\t원하시는 지역을 입력하여 조회 하여주세요.");
		System.out.println("\t이전화면으로 가시려면 '이전화면'을 입력해 주세요");
		moongu2();

		input = s.nextLine();

		if(input.equals("대전")){
			int localId = 0;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		if(input.equals("서울")){
			int localId = 1;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		if(input.equals("인천")){
			int localId = 2;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		if(input.equals("광주")){
			int localId = 3;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		if(input.equals("대구")){
			int localId = 4;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		if(input.equals("울산")){
			int localId = 5;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		if(input.equals("부산")){
			int localId = 6;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		if(input.equals("제주")){
			int localId = 7;
			ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
			for(HotelVO i : localList) {
				
				 HotelName(i);
			}
		}
		
		if(input.equals("이전화면")){
			break;
		} else {
			getInfo(id);
		}
		}while(true);
	}
	@Override
	public void getInfo(String id) { //지역 아이디 및 호텔 아이디 바탕
		String input;
		
		do{
		Scanner s = new Scanner(System.in);
		
		moongu2();
		System.out.println("\t세부 정보를 보시려면");
		System.out.println("\t호텔 이름을 입력해 주세요");
		moongu1();
		System.out.println("\t이전화면으로 가시려면");
		System.out.println("\t'이전화면'을 입력해 주세요");
		moongu1();
		moongu2();
		
		input = s.nextLine();
		
		Hotelroom room = new Hotelroom();
		
		
		if(input.equals("롯데시티호텔대전")){
			int hotelId = 1;
			int localId = 0;
			ArrayList <HotelVO> hotelInfo = hotelDao.selecthotel (localId, hotelId);
			
			for(HotelVO i : hotelInfo) {
				
				HotelInfo(i);
				
			}
			room.roomMain(hotelId, id);
			break;
		}		
		if (input.equals("유성호텔")) {
			int hotelId = 2;
			int localId = 0;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);

		}
		if (input.equals("호텔그레이톤둔산")) {
			int hotelId = 3;
			int localId = 0;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}

		if (input.equals("롯데호텔월드")) {
			int hotelId = 11;
			int localId = 1;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("서울신라호텔")) {
			int hotelId = 12;
			int localId = 1;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("그랜드하얏트서울")) {
			int hotelId = 13;
			int localId = 1;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		
		if (input.equals("네스트호텔")) {
			int hotelId = 21;
			int localId = 2;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("송도센트럴파크호텔")) {
			int hotelId = 22;
			int localId = 2;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("파라다이스시티")) {
			int hotelId = 23;
			int localId = 2;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		
		if (input.equals("홀리데이인광주호텔")) {
			int hotelId = 31;
			int localId = 3;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("라마다프라자광주호텔")) {
			int hotelId = 32;
			int localId = 3;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("마드리드비지니스호텔")) {
			int hotelId = 33;
			int localId = 3;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		
		if (input.equals("호텔인터불고엑스코")) {
			int hotelId = 41;
			int localId = 4;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("리버틴호텔")) {
			int hotelId = 42;
			int localId = 4;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("엘디스리젠트호텔")) {
			int hotelId = 43;
			int localId = 4;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		
		if (input.equals("롯데호텔울산")) {
			int hotelId = 51;
			int localId = 5;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("호텔현대바이라한울산")) {
			int hotelId = 52;
			int localId = 5;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("머큐어앰배서더울산")) {
			int hotelId = 53;
			int localId = 5;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		
		if (input.equals("신라스테이해운대")) {
			int hotelId = 61;
			int localId = 6;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("센텀프리미어호텔")) {
			int hotelId = 62;
			int localId = 6;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("파라다이스호텔부산")) {
			int hotelId = 63;
			int localId = 6;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		
		if (input.equals("라마다앙코르서귀포호텔")) {
			int hotelId = 71;
			int localId = 7;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("유탑유블레스호텔")) {
			int hotelId = 72;
			int localId = 7;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		if (input.equals("제주신라호텔")) {
			int hotelId = 73;
			int localId = 7;
			ArrayList<HotelVO> hotelInfo = hotelDao.selecthotel(localId,hotelId);

			for (HotelVO i : hotelInfo) {

				HotelInfo(i);
			}
			room.roomMain(hotelId, id);
		}
		
		if(input.equals("이전화면")){
			break;
		}
		}while(true);
		
	}

	@Override
	public void localadd(String inarray, String inarray2, String inarray3) { // 호텔 등록
		Controller as = new Controller();
		String inputarray = inarray;
		String inputarray2 = inarray2;
		String inputarray3 = inarray3;
		String cho;
		int localId = 0;
		
		moongu2();
		moongu1();
		System.out.println("\t입력하신 지역은 ☆" + inputarray + "☆ 입니다." + "\n\t입력하신 호텔이름은 " + inputarray2 + " 입니다." + "\n\t입력하신 호텔 등급은 " + inputarray3 + " 입니다.");
		moongu1();
		System.out.println("\t등록을 하시려면 '등록' 을 입력해 주세요.");
		System.out.println("\t이전화면으로 가시려면 '이전'을 입력해 주세요.");
		System.out.println("\t취소를 하시려면 '취소'를 입력해 주세요.");
		moongu1();
		moongu2();
		
		cho = s.nextLine();
		
		if(cho.equals("이전")){
			as.hoteladd3(inputarray, inputarray3);
		}else if(cho.equals("취소")){
			as.userAdminLogin();
		}else{
		if(inputarray.equals("대전")){
			localId = 0;
		}else if(inputarray.equals("서울")){
			localId = 1;
		}else if(inputarray.equals("광주")){
			localId = 2;
		}else if(inputarray.equals("부산")){
			localId = 3;
		}else if(inputarray.equals("제주")){
			localId = 4;
		}else if(inputarray.equals("울산")){
			localId = 5;
		}else if(inputarray.equals("인천")){
			localId = 6;
		}
		
		HotelVO local = new HotelVO();
		
		local.setLocalId(localId);
		local.setHotelName(inputarray2);
		local.setHotelGrade(inputarray3);
		
		hotelDao.insertlocal(local);
		hoteladd(inarray, inarray2);
		}
	}		

		@Override
		public void localSearch(String menu) { //등록된 지역의 호텔 조회하기.
			String input;
			String result = menu;
			
			moongu2();
			System.out.println("\t\t\t\t" + result + "지역의 호텔 목록 입니다.");
			moongu1();
			if(result.equals("대전")){
				int localId = 0;
				ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
				for(HotelVO i : localList) {
					
					 HotelName(i);
				}
			}else if(result.equals("서울")) {
				int localId = 1;
				ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
				for(HotelVO i : localList) {
					
					 HotelName(i);
				}
			}else if(result.equals("광주")) {
				int localId = 2;
				ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
				for(HotelVO i : localList) {
					
					 HotelName(i);
				}
			}else if(result.equals("부산")) {
				int localId = 3;
				ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
				for(HotelVO i : localList) {
					
					 HotelName(i);
				}
			}else if(result.equals("제주")) {
				int localId = 4;
				ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
				for(HotelVO i : localList) {
					
					 HotelName(i);
				}
			}else if(result.equals("울산")) {
				int localId = 5;
				ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
				for(HotelVO i : localList) {
					
					 HotelName(i);
				}
			}else if(result.equals("인천")) {
				int localId = 6;
				ArrayList <HotelVO> localList = hotelDao.selectlocal (localId);			
				for(HotelVO i : localList) {
					
					 HotelName(i);
				}
				
			}
			moongu1();
			System.out.println("\t이전화면으로 가시려면\n\t'이전'을 입력해 주세요");
			moongu2();
			input = s.nextLine();
			if(input.equals("이전"))
				new Controller().hotellist();

	}
		
		@Override
		public void hoteladd(String inarray, String inarray2) {
			String cho;
			int localId = 0;
			Controller as = new Controller();
			String inputarray = inarray;
			String hotelname = inarray2;
			int hotelId = Database.getInstance().tb_hotel.size() + 1;
			
			String hp;
			String adrees;
			String info;

			moongu2();
			moongu1();
			System.out.println("\t\t\t\t호텔 상세정보 등록 페이지입니다.");
			moongu1();
			System.out.println("\t입력을 원하시면 '입력'을 입력해 주세요. \n\t호텔 상세 정보를 입력하실수 있습니다.");
			System.out.println("\t취소를 원하시면 '취소'를 입력해 주세요.");
			moongu1();
			moongu2();
			cho = s.nextLine();
			if(cho.equals("취소")){
				as.userAdminLogin();
			}else{
			if(inputarray.equals("대전")){
				localId = 0;
			}else if(inputarray.equals("서울")){
				localId = 1;
			}else if(inputarray.equals("광주")){
				localId = 2;
			}else if(inputarray.equals("부산")){
				localId = 3;
			}else if(inputarray.equals("제주")){
				localId = 4;
			}else if(inputarray.equals("울산")){
				localId = 5;
			}else if(inputarray.equals("인천")){
				localId = 6;
			}
			
			moongu2();
			System.out.println("\t\t\t\t ☆ 호텔 등록 상세 정보 입력페이지 1) ☆");
			moongu1();
			System.out.println("\t호텔의 연락처를 입력해주세요 >");
			hp = s.nextLine();
			moongu2();
			System.out.println("\t\t\t\t ☆ 호텔 등록 상세 정보 입력페이지 2) ☆");
			moongu1();
			System.out.println("\t호텔의 주소를 입력해주세요 >");
			adrees = s.nextLine();
			moongu2();
			System.out.println("\t\t\t\t ☆ 호텔 등록 상세 정보 입력페이지 3) ☆");
			moongu1();
			System.out.println("\t호텔의 상세한 정보를 입력하여 주세요 > ");
			info = s.nextLine();
			moongu2();
			
			HotelVO hotel = new HotelVO();
			
			
			hotel.setHotelId(hotelId);
			hotel.setLocalId(localId);
			hotel.setHotelName(hotelname);
			hotel.setHotelInfo(info);
			hotel.setHotelAdress(adrees);
			hotel.setHotelHp(hp);
			
			
			
			hotelDao.inserthotel(hotel);
			
			as.userAdminLogin();
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}		 
  