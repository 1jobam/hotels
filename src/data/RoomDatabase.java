package data;

import java.util.ArrayList;

import vo.RoomVO;

public class RoomDatabase {
	
	//싱글톤으로 만든다
	private static RoomDatabase instance;
	
	private RoomDatabase(){}
	
	public static RoomDatabase getInstance(){
		if(instance == null){
			instance = new RoomDatabase();
		}
		return instance;
	}
	
	public ArrayList<RoomVO> tb_room = new ArrayList<>(); //객실이라는 객체를 저장해둘 테이블
	
	//기본 객체를 추가해둔다
	{
		RoomVO room = new RoomVO();
		room.setRoomId(1);
		room.setHotelId(1);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("일반적인 객실입니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(2);
		room.setHotelId(1);
		room.setRoomName("슈페리얼룸");
		room.setRoomInfo("부가 서비스와 조식을 이용할 수 있습니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(4);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(3);
		room.setHotelId(1);
		room.setRoomName("트윈룸");
		room.setRoomInfo("연인들을 위해 세팅된 방입니다");
		room.setRoomOption("오션뷰/조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(4);
		room.setHotelId(1);
		room.setRoomName("딜럭스룸");
		room.setRoomInfo("저희 호텔이 자랑하는 최고의 서비스를 누려보세요!");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스무제한");
		room.setRoomLimit(1);
		room.setRoomPrice(100000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(5);
		room.setHotelId(2);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("완전싸구려~~~");
		room.setRoomOption("조식없음/룸서비스없음/지붕에물샘");
		room.setRoomLimit(4);
		room.setRoomPrice(5000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(6);
		room.setHotelId(2);
		room.setRoomName("슈페리얼룸");
		room.setRoomInfo("부가 서비스와 조식을 이용할 수 있습니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(4);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(7);
		room.setHotelId(2);
		room.setRoomName("트윈룸");
		room.setRoomInfo("연인들을 위해 세팅된 방입니다");
		room.setRoomOption("오션뷰/조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(8);
		room.setHotelId(2);
		room.setRoomName("스위트룸");
		room.setRoomInfo("스위트달링 오오 스투이트훙ㄴㄹ니후");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스무제한");
		room.setRoomLimit(1);
		room.setRoomPrice(100000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(9);
		room.setHotelId(11);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("일반적인 객실입니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(10);
		room.setHotelId(11);
		room.setRoomName("싱글룸");
		room.setRoomInfo("커플주거라 죽창죽창! 헤어진 사람에게는 추가 서비스가 부여됩니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(4);
		room.setRoomPrice(2000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(11);
		room.setHotelId(11);
		room.setRoomName("트윈룸");
		room.setRoomInfo("싱글룸 아랫방입니다. 소음에 주의하세요.");
		room.setRoomOption("오션뷰/조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(22000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(12);
		room.setHotelId(11);
		room.setRoomName("딜럭스룸");
		room.setRoomInfo("ㄴㅁㅇㄻ 암튼 조흥 ㄴ객실");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스무제한");
		room.setRoomLimit(1);
		room.setRoomPrice(50000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(13);
		room.setHotelId(12);
		room.setRoomName("제1번방");
		room.setRoomInfo("오시려면 오든가~");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(14);
		room.setHotelId(12);
		room.setRoomName("제2번방");
		room.setRoomInfo("오시려면 오든가~");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(4);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(15);
		room.setHotelId(12);
		room.setRoomName("제3번방");
		room.setRoomInfo("오시려면 오든가~");
		room.setRoomOption("오션뷰/조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(16);
		room.setHotelId(12);
		room.setRoomName("제4번방");
		room.setRoomInfo("오시려면 오든가~");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스없음");
		room.setRoomLimit(1);
		room.setRoomPrice(50000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(17);
		room.setHotelId(31);
		room.setRoomName("감자룸");
		room.setRoomInfo("감자 냄새가 납니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(1);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(18);
		room.setHotelId(31);
		room.setRoomName("고구마룸");
		room.setRoomInfo("고구마 냄새가 납니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(1);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(19);
		room.setHotelId(31);
		room.setRoomName("옥수수룸");
		room.setRoomInfo("우리 아기 불고노는 하모니카는~");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(20);
		room.setHotelId(31);
		room.setRoomName("패션후르츠룸");
		room.setRoomInfo("이름에 걸맞는 화려한 인테리어를 자랑합니다.");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스무제한");
		room.setRoomLimit(1);
		room.setRoomPrice(100000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(21);
		room.setHotelId(32);
		room.setRoomName("불가마룸");
		room.setRoomInfo("따뜻합니다.");
		room.setRoomOption("식혜없음/양머리금지");
		room.setRoomLimit(2);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(22);
		room.setHotelId(32);
		room.setRoomName("소금룸");
		room.setRoomInfo("따뜻하고 소금냄새가 납니다. 먹으면 안됩니다.");
		room.setRoomOption("식혜제공/점심제공/담요제공/수건제공");
		room.setRoomLimit(4);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(23);
		room.setHotelId(32);
		room.setRoomName("아이스룸");
		room.setRoomInfo("레리꼬 부르시면 쫓겨납니다.");
		room.setRoomOption("모든 서비스 3시간 동안 무료");
		room.setRoomLimit(4);
		room.setRoomPrice(50000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(24);
		room.setHotelId(32);
		room.setRoomName("수퍼딜럭스불가마룸");
		room.setRoomInfo("이름 아이디어가 떨어졌습니다. 아무튼 지내보세요.");
		room.setRoomOption("모든 서비스 24시간 무료");
		room.setRoomLimit(2);
		room.setRoomPrice(1000000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(25);
		room.setHotelId(41);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("우리 호텔은 모든 객실 조건이 같습니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(30000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(26);
		room.setHotelId(41);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("우리 호텔은 모든 객실 조건이 같습니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(30000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(27);
		room.setHotelId(41);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("우리 호텔은 모든 객실 조건이 같습니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(30000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(28);
		room.setHotelId(41);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("우리 호텔은 모든 객실 조건이 같습니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(30000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(29);
		room.setHotelId(42);
		room.setRoomName("트윈룸");
		room.setRoomInfo("미안합니다 객실 추가하기도 지칩니다 그냥 예약해주세요");
		room.setRoomOption("오션뷰/조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(200000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(30);
		room.setHotelId(51);
		room.setRoomName("야구장룸");
		room.setRoomInfo("일반적인 객실입니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(31);
		room.setHotelId(51);
		room.setRoomName("농구장룸");
		room.setRoomInfo("부가 서비스와 조식을 이용할 수 있습니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(4);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(32);
		room.setHotelId(51);
		room.setRoomName("축구장룸");
		room.setRoomInfo("많은 사람들이 머물 수 있습니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(8);
		room.setRoomPrice(60000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(33);
		room.setHotelId(51);
		room.setRoomName("월드컵경기장룸");
		room.setRoomInfo("저희 호텔이 자랑하는 최고의 서비스를 누려보세요!");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스무제한");
		room.setRoomLimit(10);
		room.setRoomPrice(130000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(34);
		room.setHotelId(61);
		room.setRoomName("싼 스탠다드룸");
		room.setRoomInfo("일반적인 객실입니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(1000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(35);
		room.setHotelId(61);
		room.setRoomName("싼 슈페리얼룸");
		room.setRoomInfo("부가 서비스와 조식을 이용할 수 있습니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(4);
		room.setRoomPrice(2000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		
		room.setRoomId(36);
		room.setHotelId(61);
		room.setRoomName("싼 트윈룸");
		room.setRoomInfo("연인들을 위해 세팅된 방입니다");
		room.setRoomOption("오션뷰/조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(2000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(37);
		room.setHotelId(61);
		room.setRoomName("싼 딜럭스룸");
		room.setRoomInfo("저희 호텔이 자랑하는 최고의 서비스를 누려보세요!");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스무제한");
		room.setRoomLimit(3);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(38);
		room.setHotelId(71);
		room.setRoomName("스탠다드룸");
		room.setRoomInfo("일반적인 객실입니다");
		room.setRoomOption("조식없음/룸서비스없음");
		room.setRoomLimit(4);
		room.setRoomPrice(10000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(39);
		room.setHotelId(71);
		room.setRoomName("슈페리얼룸");
		room.setRoomInfo("부가 서비스와 조식을 이용할 수 있습니다");
		room.setRoomOption("조식가능/룸서비스가능");
		room.setRoomLimit(4);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(40);
		room.setHotelId(71);
		room.setRoomName("트윈룸");
		room.setRoomInfo("연인들을 위해 세팅된 방입니다");
		room.setRoomOption("오션뷰/조식가능/룸서비스가능");
		room.setRoomLimit(2);
		room.setRoomPrice(20000);
		tb_room.add(room);
	}
	
	{
		RoomVO room = new RoomVO();
		room.setRoomId(41);
		room.setHotelId(71);
		room.setRoomName("딜럭스룸");
		room.setRoomInfo("저희 호텔이 자랑하는 최고의 서비스를 누려보세요!");
		room.setRoomOption("오션뷰/카지노무제한/조식무제한/룸서비스무제한");
		room.setRoomLimit(1);
		room.setRoomPrice(100000);
		tb_room.add(room);
	}
	
	
	
	
}
