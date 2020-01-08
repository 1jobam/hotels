package data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import vo.HotelVO;
import vo.ReservationVO;
import vo.UserAdminLoginVO;
import vo.UserVO;

public class Database { //기본적은 데이터를 입력
	
	private static Database instance;
	
	private Database(){}
	
	public static Database getInstance(){
		if(instance == null){
			instance = new Database();
		}
		return instance;
	}
	
	//관리자 사용자목록 조회
	public ArrayList<UserVO> tb_user = new ArrayList<>();

	{
		UserVO user = new UserVO();
		user.setName("관리자");
		user.setId("admin");
		user.setPassword("admin");
		user.setPhone("01012341234");
		user.setEmail("admin@admin.com");
		user.setGrade("관리자");
		tb_user.add(user);
		user = new UserVO();
		user.setName("박종민");
		user.setId("1jobam");
		user.setPassword("whdals");
		user.setPhone("01012341234");
		user.setEmail("admin@admin.com");
		user.setGrade("일반등급");
		tb_user.add(user);
		user = new UserVO();
		user.setName("테스트");
		user.setId("test");
		user.setPassword("test");
		user.setPhone("01012345678");
		user.setEmail("test123@test.com");
		user.setGrade("일반등급");
		tb_user.add(user);
		user.setName("민태홍");
		user.setId("asd123");
		user.setPassword("asd123!@#");
		user.setPhone("01074786160");
		user.setEmail("co5o@naver.com");
		user.setGrade("일반등급");
		tb_user.add(user);
	}
	
	//관리자 로그인 정보
	public ArrayList<UserAdminLoginVO> tb_admin = new ArrayList<>();

	{
		UserAdminLoginVO user = new UserAdminLoginVO();
		user.setAdminname("관리자");
		user.setAdminid("admin");
		user.setAdminpassword("admin");
		user.setAdminphone("01012341234");
		user.setAdminemail("admin@admin.com");
		user.setAdmingrade("관리자");
		tb_admin.add(user);
	}
	
//	//사용자 지역선택
//	public ArrayList<UserLoginVO> tb_local = new ArrayList<>();
//	{
//		UserLoginVO local = new UserLoginVO();
//		local.setLocalCity("대전광역시");
//		tb_local.add(local);
//		local = new UserLoginVO();
//		local.setLocalCity("서울특별시");
//		tb_local.add(local);
//		local = new UserLoginVO();
//		local.setLocalCity("광주광역시");
//		tb_local.add(local);
//		local = new UserLoginVO();
//		local.setLocalCity("부산광역시");
//		tb_local.add(local);
//		local = new UserLoginVO();
//		local.setLocalCity("제주특별자치시");
//		tb_local.add(local);
//		local = new UserLoginVO();
//		local.setLocalCity("울산광역시");
//		tb_local.add(local);
//		local = new UserLoginVO();
//		local.setLocalCity("인천광역시");
//		tb_local.add(local);
//	}
	
public ArrayList <HotelVO> tb_local = new ArrayList<>();
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(0);		
			hotel.setHotelName("롯데시티호텔대전");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
		
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(0);
			hotel.setHotelName("유성호텔");
			hotel.setHotelGrade("3성급");
			tb_local.add(hotel);
		
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(0);
			hotel.setHotelName("호텔그레이톤둔산");
			hotel.setHotelGrade("3성급");
			tb_local.add(hotel);
	
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(1);
			hotel.setHotelName("롯데호텔월드");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);

	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(1);
			hotel.setHotelName("서울신라호텔");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(1);
			hotel.setHotelName("그랜드하얏트서울");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(2);
			hotel.setHotelName("네스트 호텔");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(2);
			hotel.setHotelName("송도센트럴파크호텔");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(2);
			hotel.setHotelName("파라다이스시티");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(3);
			hotel.setHotelName("홀리데이인광주호텔");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(3);
			hotel.setHotelName("라마다프라자광주호텔");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(3);
			hotel.setHotelName("마드리드비지니스호텔");
			hotel.setHotelGrade("3성급");
			tb_local.add(hotel);
	
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(4);
			hotel.setHotelName("호텔인터불고엑스코");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(4);
			hotel.setHotelName("리버틴호텔");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(4);
			hotel.setHotelName("엘디스리젠트호텔");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(5);
			hotel.setHotelName("롯데호텔울산");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(5);
			hotel.setHotelName("호텔현대바이라한울산");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(5);
			hotel.setHotelName("머큐어앰배서더울산");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(6);
			hotel.setHotelName("신라스테이해운대");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(6);
			hotel.setHotelName("센텀프리미어호텔");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(6);
			hotel.setHotelName("파라다이스호텔부산");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(7);
			hotel.setHotelName("라마다앙코르서귀포호텔");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(7);
			hotel.setHotelName("유탑유블레스호텔");
			hotel.setHotelGrade("4성급");
			tb_local.add(hotel);
	
	}
	{
			HotelVO hotel = new HotelVO();
			hotel.setLocalId(7);
			hotel.setHotelName("제주신라호텔");
			hotel.setHotelGrade("5성급");
			tb_local.add(hotel);
	
	}
	
	
	

	 public ArrayList <HotelVO> tb_hotel = new ArrayList<>();
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(1);
			hotel.setLocalId(0);
			hotel.setHotelName("롯데시티호텔대전");
			hotel.setHotelInfo("롯데시티호텔 대전 - <4성급:한국관광공사 인증> -\n "
					+ "대전컨벤션센터 바로 앞에 위치한 롯데시티호텔 대전은  엑스포과학공원 동문게이트에서 도보로 채 5분이 걸리지 않는 거리에 있습니다.\n"
					+ " 차로 5분이면 한밭 수목원까지, 10분이면 대전정부청사와 카이스트 등까지 가실 수 있습니다.\n "
					+ "대전에 자리한 이 호텔에는 공용 지역 무료 무선 인터넷 등이 완비되어 있습니다. \n"
					+ " 또한, 구내에 회의실, 24시간 리셉션 등이 갖춰져 있으며, \n"
					+ "금고, 세탁 서비스, 비즈니스 센터 시설과 서비스를 사용하실 수 있습니다. \n"
					+ "무료 구내 전용 주차장도 제공됩니다. \n"
					+ "총 304개의 객실에는 에어컨이 완비되어 있으며, 고급 세면 용품, 평면 TV 등의 최고급 시설을 제공하고 있습니다. \n "
					+ "모든 객실에 커피/차 메이커, 객실 내 금고, 냉장고 등이 구비되어 있습니다. \n "
					+ "편안한 숙면을 위해 침대 및 침구류는 해온(he:on) 베딩 시스템으로 구성되어 있습니다. \n"
					+ " 18층에 위치한 C’ cafe에서는 별도의 비용을 지불하면 조식, 중식, 석식 뷔페를 즐기실 수 있습니다.\n"
					+ "2층에 있는 C’lounge에는 카페와 바 공간으로, 별도의 비용을 지불하면 조식, 중식, 석식을 맛보실 수 있습니다.");
			hotel.setHotelAdress("엑스포로123번길 33, 유성구, 대전, 대한민국");
			hotel.setHotelHp("042-333-100");
			tb_hotel.add(hotel);
			
	 }
	 
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(2);
			hotel.setLocalId(0);
			hotel.setHotelName("유성호텔");
			hotel.setHotelInfo("대전 유성호텔 - <3성급:한국관관공사 인증> -\n"
					+ " 대전 유성호텔은 대전 1호선 유성온천역 5번 출구와 유성시외버스정류소에서 도보로 단 5분 거리에 있어 교통이 편리합니다.\n"
					+ " 조금만 걸어가시면 유성온천공원 족욕체험장까지 가실 수 있으며 \n"
					+ "차로 15분이면 한밭 수목원, 대전 예술의 전당, 대전정부청사까지 가실 수 있습니다.\n "
					+ "핀란드식 사우나, 수영장 등을 갖춘 이 호텔에 머무시면 대전에 계시는 동안 럭셔리한 휴가를 보내실 수 있습니다.\n"
					+ " 또한 카페, 24시간 리셉션, 회의실 등도 이용하실 수 있습니다.\n "
					+ "내부에는 수영장이 완비된 피트니스센터가 있습니다.\n"
					+ " 내부에 마련된 스파와 웰니스 센터에서 다양한 트리트먼트를 받으면서 휴식을 취하실 수 있습니다.\n "
					+ "각 객실에는 냉방 시설이 완비되어 있고 커피 메이커, 냉장고 및 커피/차 메이커도 제공하고 있습니다.\n"
					+ " 전 객실에 슬리퍼, 헤어드라이어, 샤워 시설 등이 구비된 개인 욕실이 있습니다. 내부에는 가드니아 뷔페 식당이 있습니다. ");
			hotel.setHotelAdress("온천로 9, 유성구, 대전, 대한민국");
			hotel.setHotelHp("042-820-0100");
			tb_hotel.add(hotel);
			
	 }
	 
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(3);
			hotel.setLocalId(0);
			hotel.setHotelName("호텔그레이톤둔산");
			hotel.setHotelInfo("호텔 그레이톤 둔산은 대전 1호선 시청역 5번 출구에서 도보로 \n"
					+ "단 3분 거리에 있으며 대전 KTX 역은 지하철로 7 정거장 떨어져 있습니다. \n "
					+ "차로 약 10분 거리에는 한밭 수목원이 있으며 지하철로 5 정거장이면 유성온천공원 족욕체험장까지 가실 수 있습니다. \n "
					+ "대전에 머무시는 동안 이 호텔에서 스타일리시한 객실 및 시설을 이용하실 수 있습니다. \n"
					+ "뿐만 아니라 무료 와이파이(Wi-Fi)가 완비되어 있습니다. \n "
					+ "이 호텔에서는 여행객들을 위해 회의실, 24시간 룸서비스, 카페 등을 포함한  다양한 시설과 서비스를 제공하고 있습니다.\n"
					+ " 프런트 데스크는 항시 운영되고 있으며 친절한 직원들이 관광 명소 추천이나 관광 정보를 제공해 드립니다. \n"
					+ " 호텔 내 211개의 아늑한 객실에는 편안한 숙박에 필요한 모든 시설이 갖춰져 있습니다. \n"
					+ "매일 아침 현지 관광을 시작하시기 전에 호텔에서 제공하는 조식을 드실 수 있습니다. \n"
					+ "내부에 레스토랑이 마련되어 있어 편리하게 이용하실 수 있습니다.");
			hotel.setHotelAdress("둔산중로 70, 서구, 대전, 대한민국");
			hotel.setHotelHp("042-482-1000");
			tb_hotel.add(hotel);
			
	 }

	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(11);
			hotel.setLocalId(1);
			hotel.setHotelName("롯데호텔 월드");
			hotel.setHotelInfo("롯데 호텔 월드 - <5성급:한국관광공사 인증> - \n"
					+ " 리조트형 비즈니스 호텔인 롯데 호텔 월드는 세계 최대 규모의 실내 놀이공원인 롯데월드 어드벤쳐와 롯데월드몰과 바로 연결되어 있습니다. \n"
					+ " 또한, 석촌호수가 도보로 5분 거리에 있으며 지하철 2, 8호선 잠실역까지는 지하통로를 통해 도보로 3분이 거리에 있습니다. \n"
					+ " 호텔 5층에는 핀란드식 사우나, 실내 수영장, 실내 골프 연습장, 석촌호수 전경의 피트니스 클럽 등이 있습니다. \n "
					+ "또한, 국제회의와 행사를 위한 다양한 연회장과 회의실을 구비되어 있으며 별도의 투어데스크를 운영하고 있습니다. \n"
					+ " 투숙객들은 내,외부 주차장을 무료로 이용하실 수 있습니다. \n"
					+ "전체 469개의 객실을 보유하고 있으며 롯데월드 어드벤처의 캐릭터인 로티와 로리를 테마로한 객실도 있습니다. \n "
					+ "아늑하고 세련된 유럽풍 인테리어가 돋보이는 모든 객실에서는 석촌호수의 아름다운 전경을 감상하실 수 있습니다.\n"
					+ " 호텔 2층에는 150개의 메뉴를 선보이는 뷔페식 레스토랑인 라세느가 있으며 \n"
					+ "32층에는 수려한 전망을 조망하며 정통 중식 메뉴를 선보이는 도림이 있습니다. \n"
					+ " 또한, 별도의 요금을 내시면 2층 라세느에서 컨티넨탈식 조식을 즐기실 수 있습니다. \n "
					+ "그 밖에도 1층에 라운지 앤 브라세리와 델리카한스 베이커리가 있습니다.");
			hotel.setHotelAdress("올림픽로 240, 송파구, 서울, 대한민국");
			hotel.setHotelHp("02-419-7000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(12);
			hotel.setLocalId(1);
			hotel.setHotelName("서울신라호텔");
			hotel.setHotelInfo("서울 신라 호텔 - <5성급:한국관광공사 인증> - \n"
					+ " 서울 중심에 자리한 럭셔리 호텔인 서울 신라 호텔은 3호선 동대입구역 5번 출구에서 도보로 5분 거리에 있으며\n"
					+ " 명동과 동대문 방면으로 무료 셔틀버스를 운행하고 있습니다. \n"
					+ " 호텔에서 번화한 명동 거리까지는 차로 15분, 시청까지는 차로 약 20분이 소요됩니다.\n "
					+ "호텔 내에 유명 작가들의 조각상이 모여있는 야외조각공원과 겔랑 스파가 있어 여유로운 휴식 시간을 보내실 수 있으며 \n"
					+ "피트니스 센터, 사우나, 수영장 등도 있어 다양한 운동을 즐기실 수 있습니다. \n"
					+ " 뿐만 아니라, 비즈니스 고객님들을 위한 미팅룸과 비즈니스 센터도 있으며\n"
					+ " 프런트데스크에서는 환전, 유료 세탁, 룸서비스 등을 이용하실 수 있습니다.\n "
					+ "또한, 투숙객에 한하여 무료 주차가 가능하며 유료로 발렛파킹을 이용하실 수 있습니다. \n"
					+ " 총 426개의 객실을 보유하고 있으며 객실에 따라 남산 또는 영빈관 전망을 감상하실 수 있습니다.\n "
					+ "럭셔리하고 모던한 인테리어가 돋보이는 모든 객실에는 TV,\n"
					+ " 미나바, 생수 등이 있으며 욕실에는 샤워부스, 욕조, 비데, 헤어드라이어 등이 완비되어 있습니다. \n "
					+ "또한, 이그제큐티브 이상 객실에서는 이규제큐티브 라운지를 이용하실 수 있습니다. \n"
					+ " 호텔 내에 중식, 일식, 한식, 프렌치, 뷔페 등 다양한 메뉴를 선보이는 5개의 레스토랑과 1개의 바가 있어 다이닝 선택의 폭이 넓습니다. \n 매일 아침 조식은 1층 파크뷰에서 즉석에서 조리한 뷔페를 즐기실 수 있으며 별도의 요금이 발생합니다.");
			hotel.setHotelAdress("동호로 249, 중구, 서울, 대한민국");
			hotel.setHotelHp("02-2233-3131");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(13);
			hotel.setLocalId(1);
			hotel.setHotelName("그랜드하얏트서울");
			hotel.setHotelInfo("그랜드 하얏트 서울 - <5성급:한국관광공사 인증> - \n "
					+ " 최고의 시설을 자랑하는 그랜드 하얏트 서울은 지하철 6호선 이태원역 2번 출구에서 도보로 15분 거리에 자리하고 있습니다. \n"
					+ "  주변의 관광 명소로는 다양한 문화가 어우러진 이태원과 \n"
					+ "문화 공연을 감상할 수 있는 블루스퀘어가 도보로 약 15분 거리에 있으며 명동이 차로 10분 거리에 자리하고 있습니다. \n"
					+ "  또한, 명동과 이태원으로 셔틀버스를 운행하고 있습니다. \n"
					+ "  호텔 내에는 24시간 피트니스 센터, GX 스튜디오, 실내,외 및 \n"
					+ "어린이 수영장, 사우나, 테니스/스쿼시 코트 등이 있는 클럽 올림푸스 피트니스 센터가 있어 다양한 운동을 즐기실 수 있습니다.\n"
					+ "  또한, 여러 트리트먼트 룸을 갖춘 더 스파 그랜드 하얏트 서울에서 마사지를 받으며 휴식을 취하실 수도 있습니다. \n  뿐만 아니라 비즈니스 고객님들을 위한 6개의 미팅룸과 10개의 보드룸도 있습니다. 스위트룸을 포함하여 전체 615개의 객실이 있습니다.\n  넓은 통유리창을 통해 남산 또는 도심 전망을 감상할 수 있으며 모든 객실 내에는 무선 인터넷을 무료로 사용하실 수 있습니다. \n 객실 내에는 DVD 플레이어, 미니바, 개인 금고 등이 있습니다. \n 모던 스시 바 카우리, 그릴요리 전문 스테이크 하우스, 이자카야 펍 텐카이, 유리피언 비스트로 제이제이 델리 등을 포함한 전체 12개의 레스토랑과 바가 갖춰져 있어 다이닝 선택의 폭이 다양합니다.");
			hotel.setHotelAdress("소월로 322, 용산구, 서울, 대한민국");
			hotel.setHotelHp("02-797-1234");
			tb_hotel.add(hotel);
			
	 }
	
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(21);
			hotel.setLocalId(2);
			hotel.setHotelName("네스트호텔");
			hotel.setHotelInfo("네스트호텔 - <5성급:한국관광공사 인증> - \n"
					+ "  365일 온수 인피니티 풀이 있는 네스트호텔은 인천공항자가부상철도 용유역 1번 출구에서 도보로 2분 거리에 있습니다. \n"
					+ "  또한, 인천국제공항 제 1 여객터미널과 제 2여객터미널에서 무료 셔틀버스를 운행하고 있습니다. \n  "
					+ "주변 관광지로는 무의도로 갈 수 있는 잠진도 선착장이 차로 5분 거리에 있으며 을왕리는 차로 20분 거리에 있습니다.\n  "
					+ " 이 호텔은 인피니티 풀, 코지 풀, 필란드 사우나, 키즈 풀, 파티 풀 등이 다양하게 갖춰진 스트란트 수영장을 4계절 내내 유료로 운영하고 있습니다.\n  "
					+ " 호텔 G층에는 나무숲이 울창한 봄꽃 동산과 반달 모양의 모래사장인 베이파크가 있는 네스트 파크가 있어 산책을 즐기기에 좋습니다.\n "
					+ "  또한, 다양한 유산소, 웨이트 설비를 갖춘 피트니스 센터와 빛과 공기를 느낄 수 있는 노천탕,\n "
					+ " 부모님의 온전한 휴식을 돕고자 네스트가 마련한 인도오 키즈존 '크림하우스'가 부대시설로 구비되어 있습니다.\n"
					+ "   전체 370개의 객실이 있으며 스탠다드, 디럭스, 스위트 등 10가지 유형의 객실이 있습니다.\n "
					+ "  객실에 따라 바다 또는 산 전망을 감상하실 수 있습니다. \n "
					+ " 모던한 인테리어가 돋보이는 객실 내에는 평면 LCD TV, 블루투스 스피커 등이 구비되어 있으며 \n "
					+ "욕실에는 헤어드라이어, 비데 등이 갖춰져 있습니다.\n "
					+ "  L층에는 서해를 마주한 계단식 좌석에서 다양한 뷔페를 즐길 수 있는 플라츠 레스토랑과 라이브러리,\n "
					+ "  미니시어터 등이 갖춰져 있으며 간단한 스낵을 즐길 수 있는 쿤스트 라운지가 있습니다.");
			hotel.setHotelAdress("영종해안남로 19-5, 중구, 인천, 대한민국");
			hotel.setHotelHp("032-743-9000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(22);
			hotel.setLocalId(2);
			hotel.setHotelName("송도센트럴파크호텔");
			hotel.setHotelInfo("송도 센트럴 파크 호텔은 인천1호선 센트럴파크역 4번 출구에서 도보 6분 거리에 있습니다.\n"
					+ "   한옥마을과 트라이볼이 있는 송도 센트럴파크가 바로 앞에 있으며 15분 정도 걸어가시면 커낼워크에서 쇼핑을 하실 수 있습니다.\n"
					+ "   또한 차로 25분 거리에는 소패포구와 소래포어시장이 있습니다. \n "
					+ " 이 호텔에서는 커피 메이커, 수중마사지 욕조 및 하이드로 마사지 샤워 시설 등이 갖춰진 객실과 사우나, 실외 풀 등을 제공합니다.\n"
					+ "   이 5성급 호텔에는 공용 지역 무료 무선 인터넷, 귀빈층, 대연회장 등이 갖춰져 있습니다. \n"
					+ "  차량을 가지고 오신 고객님들을 위해 무료 구내 전용 주차장을 제공하고 있습니다.\n  "
					+ " 객실에는 에어컨이 완비되어 있으며 고급 린넨, 고급 세면 용품, 미니 바 등의 최고급 시설을 제공하고 있습니다.\n "
					+ "  모든 전용 욕실에는 목욕 가운, 슬리퍼 등이 마련되어 있습니다.");
			hotel.setHotelAdress("테크노파크로 193, 연수구, 인천, 대한민국");
			hotel.setHotelHp("032-310-5000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(23);
			hotel.setLocalId(2);
			hotel.setHotelName("파라다이스시티");
			hotel.setHotelInfo("파라다이스시티 - <5성급:한국관광공사 인증> - \n"
					+ " 99,825평 규모의 부지에 위치한 복합 리조트인 파라다이스시티는 카지노윙, MICE윙, 패밀리윙으로 구성되어 있습니다.\n "
					+ " 파라다이스시티는 인천국제공항역에서 자가부상열차탑승 시 3분, 도보 10분 거리에 있습니다.\n "
					+ " 또한, 공항철도 또는 KTX 탑승 시 서울역 및 서울 중심부까지 40분이면 가실 수 있습니다. \n "
					+ "호텔 내에는 카바나와 바가 갖춰진 야외수영장 등이 있으며 영종도 전경을 감상할 수 있는 실내 수영장도 있습니다.\n "
					+ " 피트니스 센터, 자쿠지, 건/습식 사우나 등이 갖춰져 있어 편리하게 이용하실 수 있습니다. \n"
					+ " 또한, 3층에 키즈존과 볼링 시설과 플레이스테이션존이 갖춰진 사파리 파크가 있어 호텔 내에서도 다양한 엔터테인먼트를 즐기실 수 있습니다.\n "
					+ " 3층 더 스파 앳 파라다이스에는 다양한 마사지 프로그램이 갖춰져 있을 뿐만 아니라, \n"
					+ " 888개의 게임시설이 갖춰진 외국인 전용 카지노도 있습니다. \n"
					+ " 전체 711개의 객실을 갖추고 있으며 일반 객실, 스위트, 풀빌라 등 다양한 유형의 객실을 보유하고 있습니다.\n "
					+ " 모든 객실에서 무료로 와이파이를 사용하실 수 있으며 객실 내에는 HD TV, 개인 금고 등이 있습니다.\n "
					+ " 또한, 욕실 내에는 헤어드라이어, 어메니티, 가운 등이 있습니다. \n"
					+ " 1층 온더플레이트 뷔페 레스토랑에서는 세계 각국의 다양한 요리를 맛보실 수 있습니다.\n  "
					+ "그 밖에도, 라 칼라에서는 이탈리안 요리를, 라쿠에서는 일식을, 임페리얼 트레져에서는 광동식 요리를 선보이고 있습니다.\n "
					+ "1층 루빅에서는 라이브 뮤직을 감상할 수 있으며 로비 라운지, 가든 카페, 베이커리 등도 있습니다.");
			hotel.setHotelAdress("영종해안남로321번길 186, 중구, 인천, 대한민국");
			hotel.setHotelHp("1833-8855");
			tb_hotel.add(hotel);
			
	 }

	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(31);
			hotel.setLocalId(3);
			hotel.setHotelName("홀리데이인광주호텔");
			hotel.setHotelInfo("홀리데이 인 광주 호텔 - <4성급:한국관광공사 인증> - \n "
					+ "홀리데이 인 광주 호텔은 광주1호선 김대중컨벤션센터역 4번 출구에서 도보로 10분 이내의 편리한 위치를 자랑합니다. \n"
					+ " 주변의 관광 명소로는 다양한 전시회가 열리는 김대중컨벤션센터가 도보로 2분 거리에 있으며 \n "
					+ "광주의 대표적인 재래시장인 양동시장이 차로 15분 거리에 자리해 있습니다.\n "
					+ " 또한, 광주 예술의 거리까지 차로 25분이 소요됩니다. "
					+ "광주의 이 호텔에는 비즈니스 센터와 피트니스 센터는 물론 사우나와 실내수영장이 마련되어 있습니다.\n "
					+ " 투숙객분들을 위해 무료 와이파이, 무료주차, 비즈니스 서비스, 24시간 룸 서비스 등도 제공됩니다. \n "
					+ "다양한 규모의 행사와 가족 행사를 진행할 수 있는 컨벤션과 미팅룸도 이용하실 수 있습니다. \n"
					+ " 객실은 총 203개로 구성되어 있으며, 장애인 전용 객실도 따로 마련되어 있어 편리하게 머무실 수 있습니다.\n"
					+ "  호텔 내 모든 객실에는 LCD TV와 슬리퍼, 금고를 비롯해 각종 욕실용품과 비데, 목욕가운이 구비되어 있습니다.\n"
					+ "  한국 전통미를 현대적으로 재해석한 코리안 스위트룸에는 대형 편백나무 욕조가 마련되어 있습니다.\n "
					+ " 이 호텔의 모래시계 레스토랑에서는 로컬에서 공수한 재료로 만든 신선한 뷔페 및 단품요리를 즐기실 수 있습니다.\n "
					+ " 라 플레이스 레스토랑 & 바에서는 특별한 뷰를 감상하며 세트 코스메뉴와 스테이크, 와인 등을 맛보실 수 있습니다. \n"
					+ " 또한, 로비 라운지에서는 다양한 종류의 커피와 차, 칵테일 등의 음료와 스낵요리, 단품요리가 제공됩니다.");
			hotel.setHotelAdress("상무누리로 55, 서구, 광주, 대한민국");
			hotel.setHotelHp("062-610-7000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(32);
			hotel.setLocalId(3);
			hotel.setHotelName("라마다 프라자 광주 호텔");
			hotel.setHotelInfo("라마다 프라자 광주 호텔은 광주1호선 상무역 5번 출구에서 도보로 약 10분이면 도착하는 편리한 위치를 자랑합니다. \n "
					+ "주변의 관광 명소로는 518 기념공원이 도보로 20분 거리에 있으며 광주의 대표적인 재래시장인 양동시장이 차로 15분 거리에 자리해 있습니다. \n "
					+ " 또한, 광주 예술의 거리까지 차로 20분이면 도착합니다. \n "
					+ "이 호텔에는 피트니스 센터를 비롯해 스파 트리트먼트를 받을 수 있는 스파 시설과 타이 마사지 프로그램이 갖춰져 있습니다.  \n"
					+ " 15층에는 비즈니스 센터가 마련되어 있어 편리하게 이용하실 수 있습니다.\n "
					+ " 대형 회의나 세미나, 가족 모임 등 다양한 행사를 즐길 수 있는 연회장도 마련되어 있습니다. \n "
					+ " 이 호텔의 현대적인 모든 객실에는 인터넷과 냉난방 조절장치, 비데, 개인금고, 미니바, 냉장고 등이 마련되어 있으며,  \n "
					+ "욕실에는 샤워시설과 목욕가운, 각종 비품이 구비되어 있습니다.  \n"
					+ " 일일 세탁 서비스와 얼음 배달 서비스도 이용 가능합니다. \n "
					+ " 이 호텔의 3층에는 북경요리와 광동요리를 맛볼 수 있는 정통 중식 레스토랑 쉥카이만이 자리하고 있습니다. \n "
					+ " 호텔 1층에 있는 델리블러썸에서는 다양한 종류의 케이크와 타르트, 커피, 음료 등을 즐기실 수 있습니다. \n "
					+ " 17층 파라뷰 레스토랑에서는 조식 뷔페 및 일품요리와 이탈리안 스타일의 중식, 석식 요리가 제공됩니다.");
			hotel.setHotelAdress("상무자유로 149, 서구, 광주, 대한민국");
			hotel.setHotelHp("062-717-7000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(33);
			hotel.setLocalId(3);
			hotel.setHotelName("마드리드비지니스호텔");
			hotel.setHotelInfo("마드리드 비즈니스 호텔은 광주송정역 호남선 5번 출구에서 도보로 5분 거리에 위치해 있으며, \n "
					+ "광주공항에서 차로 10분이면 가실 수 있습니다. \n "
					+ "주변의 관광 명소로는 다양한 전시회가 열리는 김대중컨벤션센터와 광주의 대표적인 재래시장인 양동시장이 차로 15분 거리에 자리해 있습니다. \n"
					+ " 또한, 광주 예술의 거리까지 차로 35분이 소요됩니다. \n "
					+ "이 호텔은 광주에 자리해 있으며 무료 와이파이(Wi-Fi)를 제공합니다. \n"
					+ " 뿐만 아니라 24시간 비지니스 센터도 갖춰져 있습니다. \n "
					+ "이 호텔에는 59개의 객실이 있으며 모든 객실에는 편리한 숙박을 위한 모든 시설이 마련되어 있습니다.");
			hotel.setHotelAdress("광산로19번길 11, 광산구, 광주, 대한민국");
			hotel.setHotelHp("062-941-0500");
			tb_hotel.add(hotel);
			
	 }	 
	
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(41);
			hotel.setLocalId(4);
			hotel.setHotelName("호텔인터불고엑스코");
			hotel.setHotelInfo("호텔 인터불고 엑스코는 엑스코 바로 옆에 자리하고 있습니다. \n "
					+ " 또한, 차로 15분 거리에 KTX 동대구역과 대구 국제공항이 있어 교통 또한 편리합니다. \n  "
					+ "주변 관광지로는 김광석 다시그리기길이 차로 15분 거리에 있으며 \n  "
					+ "팔공산 도립공원과 83타워가 있는 이월드가 차로 40분 거리에 있습니다. \n "
					+ " 사우나 등을 갖춘 이 호텔에 머무시면 대구에 계시는 동안 럭셔리한 휴가를 즐기실 수 있습니다. \n  "
					+ "객실에는 에어컨, 평면 TV, 무료 무선 인터넷이 완비되어 있습니다. \n"
					+ "  현대적인 이 호텔에는 카페, 미용실, 피트니스 수업 등이 완비되어 있습니다. \n  "
					+ "차량을 가지고 오신 고객님들을 위해 무료 공용 주차장을 제공하고 있습니다. \n "
					+ " 각 객실에는 투숙객이 편안하게 머무실 수 있도록 각종 시설이 갖춰져 있으며  커피 메이커, 냉장고, 슬리퍼 등이 완비되어 있습니다. \n"
					+ "  모든 객실에 커피/차 메이커, 생수, 전용 욕실 등이 구비되어 있습니다.");
			hotel.setHotelAdress("유통단지로 80, 북구, 대구, 대한민국");
			hotel.setHotelHp("053-2223-7000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(42);
			hotel.setLocalId(4);
			hotel.setHotelName("리버틴호텔");
			hotel.setHotelInfo("리버틴호텔은 대구 번화가에 자리해 있어 대구의 인근 명소들을 편리하게 구경하실 수 있습니다. \n "
					+ "이 호텔에서 약 5분만 걸어가시면 동성로 로데오거리와 교동시장을 방문하실 수 있고, \n "
					+ "이 밖에도 서문시장과 김광석거리는 차로 약 10분 내로 가실 수 있습니다. \n"
					+ " 이 호텔은 대구 1호선 중앙로역 3번 출구에서 도보로 약 5분 거리에 있으며, \n"
					+ " 경부선 대구역은 걸어서 약 10분, 대구국제공항은 차로 약 30분 내로 가실 수 있습니다. \n "
					+ "이 호텔에서는 세탁 서비스, 짐 보관 서비스, 일일 청소 서비스 등을 이용하실 수 있으며 \n "
					+ "차량을 이용하는 투숙객들을 위한 구내 주차장과 간단한 간식 혹은 음료를 구매할 수 있는 자동판매기 또한 갖춰져 있습니다.\n "
					+ " 호텔에는 총 53개의 객실이 스탠다드, 트윈, 스위트, VIP, 이벤트룸 등으로 구성되어 있으며 \n "
					+ "장애인이 이용 가능한 객실도 별도로 마련되어 있습니다. \n"
					+ " 각 객실에는 스타일러, 에어컨, TV, 냉장고, 커피/차 메이커 등이 기본적으로 구비되어 있으며\n "
					+ " 객실 유형에 따라 주방 및 식사 공간, 세탁기, 전용 테라스도 있습니다. \n "
					+ "전용 욕실에는 샤워기와 욕조, 타월, 욕실용품이 마련되어 있습니다.\n "
					+ " 호텔의 레스토랑에서는 매일 아침 뷔페식 조식이 제공됩니다.\n"
					+ "  또한 2층에 위치한 카페에서 커피와 와인 등 다양한 음료를 드실 수 있습니다.");
			hotel.setHotelAdress("경상감영길 193, 중구, 대구, 대한민국");
			hotel.setHotelHp("053-455-5000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(43);
			hotel.setLocalId(4);
			hotel.setHotelName("엘디스리젠트호텔");
			hotel.setHotelInfo("엘디스 리젠트 호텔 - <4성급:한국관광공사 인증> - \n"
					+ "  엘디스 리젠트 호텔은 대구 2, 3호선 청라언덕역 9번 출구에서 도보 5분 거리에 있습니다. \n"
					+ "  지하철로 두 정거장이면 김광석 다시그리길 길까지 가실 수 있으며 이월드는 차로 20분 거리에 있습니다. \n"
					+ "  또한, 먹거리가 다양한 서문시장에서 도보로 15분 거리에 있습니다.\n  "
					+ " 대구에 자리한 이 호텔에는 공용 지역 무료 무선 인터넷 등이 완비되어 있습니다.\n "
					+ "  또한 주변 지역을 관광하시기에 좋은 위치를 자랑하고 있습니다. \n  "
					+ "현대적인 이 호텔에는 24시간 룸서비스, 발렛 파킹, 카페 등이 완비되어 있습니다.\n  "
					+ " 친절한 미소로 손님들을 지원해드릴 직원들이 항시 대기하고 있습니다. \n "
					+ " 모든 객실에는 에어컨이 완비되어 있고 냉장고, 미니 바 및 케이블/위성 채널도 갖추고 있습니다.\n "
					+ "  각 객실에 커피/차 메이커, 주문형 영화 서비스, 평면 TV 등이 구비되어 있습니다.\n"
					+ "   하루 일정을 끝낸 후 이 호텔의 레스토랑 또는 바에서 피로를 풀 수 있습니다. \n  "
					+ "밖에 나가서 식사하시고 싶은 분들은 다양한 요리를 선보이는 근처에 여러 바와 레스토랑을 이용해 보시기 바랍니다.");
			hotel.setHotelAdress("달구벌대로 2033, 중구, 대구, 대한민국");
			hotel.setHotelHp("053-743-9000");
			tb_hotel.add(hotel);
			
	 }

	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(51);
			hotel.setLocalId(5);
			hotel.setHotelName("롯데호텔울산");
			hotel.setHotelInfo("울산 롯데 호텔 - <5성급:한국관광공사 인증> - \n "
					+ " 울산 유일의 투숙객 전용 라운지가 있는 롯데호텔울산은 울산고속버스터미널, 롯데백화점 울산점 바로 옆에 자리하고 있습니다. \n"
					+ "  여러 공업단지와 인접해 있으며 울산공항까지 차로 15분이면 가실 수 있습니다.\n  "
					+ " 또한, 울산의 대표 관광지인 간절곶과 통도사가 차로 약 50분 거리에 있습니다.\n  "
					+ " 호텔 내에는 클럽플로어 객실 투숙 시 이용 가능한 클럽 라운지에서는 안마의자와 조식 뷔페 등 다양한 서비스를 제공하고 있습니다.\n  "
					+ " 그 밖의 부대 시설로는 4층에 피트니스 센터, 남성 사우나, 골프연습장이 있으며 5층에 여성 사우나와 수영장이 있습니다. \n "
					+ " 또한, 주차장을 무료로 이용하실 수 있습니다.\n  "
					+ " 전체 200개 객실을 보유하고 있으며 객실에서 울산 12경 중 하나인 온산공단 전경을 감상하실 수 있습니다. \n"
					+ "  모든 객실에는 Wi-Fi가 완비되어 있으며 렌탈용 휴대폰, LCD TV, 비데, 사무용품이 구비된 책상 등이 있습니다. \n"
					+ " 호텔 1층에는 다양한 크기의 별실이 마련된 이탈리안 레스토랑인 페닌슐라이 있으며 \n  "
					+ " 호텔 24층에는 정통 중국요리를 선보이는 도림이 있습니다.\n "
					+ "  또한, 1층에는 델리카한스 베이커리가 있습니다.");
			hotel.setHotelAdress("삼산로 282, 남구, 울산, 대한민국");
			hotel.setHotelHp("052-2223-7000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(52);
			hotel.setLocalId(5);
			hotel.setHotelName("호텔현대바이라한울산");
			hotel.setHotelInfo("호텔현대 바이 라한 울산 - <4성급:한국관광공사 인증> -\n  "
					+ " 호텔현대 바이 라한 울산은 태화강역에서 차로 20분, KTX 울산역에서 차로 50분 거리에 있습니다.\n  "
					+ " 또한, 출퇴근 시간에는 현대중공업까지 무료로 셔틀버스를 제공하고 있습니다. \n "
					+ " 주변 관광지로는 울산해수욕장이 차로 10분, 통도사와 간절곶이 차로 1시간 10분 거리에 있습니다.\n"
					+ "   호텔 내에는 피트니스 센터, 사우나, 수영장 등이 있어 다양한 운동을 즐기실 수 있습니다. \n "
					+ " 그 밖에도 3층에는 미팅룸, 지하 1층에는 미용실이 있어 편리하게 이용하실 수 있습니다. \n "
					+ " 또한, 무료 주차가 가능한 주차장도 마련되어 있습니다.\n  "
					+ " 총 258개의 객실을 보유하고 있으며 온돌 객실을 포함한 11가지 유형의 다양한 객실이 있습니다. \n"
					+ "  모든 객실에서는 LCD TV, 냉장고, 생수 등이 있으며 욕실에는 샤워가운, 비데 등이 구비되어 있습니다.\n "
					+ " 또한, 슈페리어 객실에는 신문투입 서비스도 제공됩니다. \n"
					+ "  1층에 자리한 토파즈에서 매일 아침 조식 뷔페를 맛보실 수 있으며 별도의 요금이 발생합니다. \n"
					+ "  2층 나미에서는 정갈한 일식 메뉴를 선보이고 있으며 그 밖에도 더샵 베이커리와 하바나 바 등이 있습니다.");
			hotel.setHotelAdress("방어진순환도로 875, 동구, 울산, 대한민국");
			hotel.setHotelHp("052-455-5000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(53);
			hotel.setLocalId(5);
			hotel.setHotelName("머큐어앰배서더울산");
			hotel.setHotelInfo("머큐어 앰배서더 울산 - <4성급:한국관광공사 인증> - \n "
					+ " 세계적 호텔 체인 ACCOR 그룹의 머큐어 앰배서더 울산은 울산공항에서 약 20분가량 떨어져 있습니다.  \n"
					+ " 또한 동해선 호계역이 차로 약 20분 거리에 있으며, 차로 30분이면 울산시외버스터미널까지 가실 수 있습니다.  \n "
					+ "주변 관광지로는 정자 해수욕장이 도보 약 2분, 강동화암 주상절리가 도보 약 15분, 태화강 국가정원이 차로 약 30분이 소요됩니다. \n "
					+ " 호텔은 최대 250명까지 수용 가능한 연회장 ‘마르세유’와 스파 시설, 피트니스 등 최고급 호텔에 걸맞은 다양한 부대시설을 갖추고 있습니다. \n"
					+ " 또한 주차시설과 와이파이, 룸서비스 등도 이용하실 수 있습니다. \n "
					+ " 지상 11층, 지하 4층 규모의 호텔은 스위트 및 프리빌리지 객실을 포함해 총 131실의 다양한 오션뷰 객실을 보유하고 있습니다. \n"
					+ "  객실마다 다른 느낌의 바다 전망을 만끽할 수 있으며, 각 객실에는 에어컨과 헤어드라이어,\n "
					+ " 생수 등 편안한 투숙에 필요한 시설과 서비스가 구비되어 있습니다.  \n"
					+ " 호텔 내에는 바다 전망을 감상하며 식사를 즐길 수 있는 레스토랑 ‘오퍼스’가 마련되어 있습니다.");
			hotel.setHotelAdress("강동산하2로 7, 북구, 울산, 대한민국");
			hotel.setHotelHp("052-743-9000");
			tb_hotel.add(hotel);
			
	 }

	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(61);
			hotel.setLocalId(6);
			hotel.setHotelName("신라스테이해운대");
			hotel.setHotelInfo("신라스테이 해운대 - <4성급:한국관광공사 인증> -  \n "
					+ "해운대 전망을 자랑하는 루프탑 바가 있는 신라 스테이 해운대는  \n "
					+ "부산 2호선 해운대역 5번 또는 7번에서 도보 6분 거리에 있으며 KTX 부산역까지는 차로 25분이 소요됩니다. \n "
					+ " 주변 관광지로는 해운대 해수욕장이 도보 5분, 해동 용궁사가 차로 25분, 누리마루와 광안대교가 차로 각 15분 거리에 있습니다 \n . "
					+ "또한, 신세계 백화점 센텀시티점과 롯데백화점이 차로 약 10분 거리에 있어 쇼핑을 즐기기에도 좋습니다. \n"
					+ "  24시간 이용 가능한 비즈니스 코너와 셀프 세탁이 가능한 세탁실이 마련되어 있어서 편리하게 이용하실 수 있습니다. \n"
					+ "  또한, 비즈니스 고객님을 위해 5층에는 3개의 회의실과 3층에는 1개의 보드룸이 마련되어 있습니다. \n"
					+ "  그 밖에도 다양한 유산소 운동 기구가 구비된 피트니스 센터도 무료로 이용하실 수 있습니다.  \n"
					+ " 전체 407개의 객실이 있으며 스탠다드, 디럭스, 프리미어 디럭스, 스위트 등 다양한 유형의 객실이 마련되어 있습니다. \n "
					+ " 객실에 따라 도시 또는 바다 전망을 감상하실 수 있습니다.  \n "
					+ "모던한 인테리어가 돋보이는 모든 객실 내에는 40인치 LED TV, 냉장고, 책상 등이 있으며 \n  "
					+ "욕실에는 고급 어메니티와 목욕가운이 구비되어 있습니다.  \n "
					+ "호텔 2층에 위한 레스토랑 카페에서는 조식, 브런치, 중식, 석식 뷔페를 운영하고 있으며  \n "
					+ "바에서는 와인, 위스키, 칵테일, 맥주 등 다양한 주류를 판매하고 있습니다. \n "
					+ " 또한, 18층에는 위치한 루프탑 바에서는 해운대 전망을 감상하며 미니풀에서 맥주와 와인 등을 즐기실 수 있습니다.");
			hotel.setHotelAdress("해운대로570번길 46, 해운대구, 부산, 대한민국");
			hotel.setHotelHp("051-2223-7000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(62);
			hotel.setLocalId(6);
			hotel.setHotelName("센텀프리미어호텔");
			hotel.setHotelInfo("해운대구에 위치한 센텀프리미어호텔은 스파랜드 센텀시티, 신세계백화점 센텀시티점 ,\n "
					+ " 신세계 센텀시티 스파랜드에서 걸어서 5분 거리에 있습니다.  \n "
					+ " 무료 무선 인터넷 및 피트니스센터를 이용하실 수 있습니다.   \n"
					+ " 또한 도보로 10분이면 부산 전시컨벤션센터까지 가실 수 있습니다.   \n"
					+ " 이 호텔에서는 리셉션을 24시간 운영하고 있고 회의실, 환전, 컨시어지 서비스도 마련되어 있습니다.   \n"
					+ " 차량을 가지고 오신 고객님들을 위해 무료 구내 전용 주차장도 제공하고 있습니다.  \n "
					+ " 객실에는 에어컨이 완비되어 있으며 대리석 욕실, 평면 TV, 슬리퍼 등의 프리미엄 시설이 갖춰져 있습니다.   \n"
					+ " 전 객실에서는 냉장고, 커피/차 메이커 등을 사용하실 수 있으며 전용 욕실에는 목욕 가운도 구비되어 있습니다.   \n "
					+ "호텔의 고객님들은 내부에 있는 레스토랑에서 식사를 드실 수 있습니다.   \n"
					+ " 이 호텔에서 김해 국제공항까지 차로 35분이면 도착하실 수 있으며  \n "
					+ " 부산 2호선 시립미술관역까지 도보로 가실 수 있습니다.   \n "
					+ "차로 조금만 운전하면 해운대해수욕장까지 가실 수 있습니다.");
			hotel.setHotelAdress("센텀1로 17, 해운대구, 부산, 대한민국");
			hotel.setHotelHp("051-455-5000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(63);
			hotel.setLocalId(6);
			hotel.setHotelName("파라다이스호텔부산");
			hotel.setHotelInfo("파라다이스 호텔 부산 - <5성급:한국관광공사 인증> -  \n"
					+ "  해운대 조망의 야외 스파 시설을 갖춘 파라다이스 호텔 부산은 해운대 해수욕장 바로 앞에 있습니다. \n"
					+ "   부산 2호선 해운대역 3번 출구에서 700m 거리에 있습니다. \n "
					+ "  해동 용궁사까지는 차로 약 20분이 소요되며 누리마루 APEC하우스도 차로 가까운 거리에 있습니다. \n "
					+ "  해운대 바다를 내려다보며 수영을 즐길 수 있는 야외 오션 풀이 마련되어 있으며 \n"
					+ "   해운대 온천수를 이용한 바다 전경의 사우나를 이용하실 수 있습니다. \n  "
					+ " 호텔 주차장을 무료로 이용하실 수 있습니다. 신관 지하 1~3층에는 면세점이 있으며 본관 1층에는 카지노가 있습니다.  \n "
					+ " 실내 골프 연습장과 피트니스 센터도 마련되어 있어 운동을 하실 수 있습니다.  \n "
					+ " 다크 브라운과 흰색의 조화로 차분하고 모던한 느낌을 주는 객실이 총 532개 마련되어 있습니다. \n  "
					+ " 넓은 창을 들어오는 자연 채광을 즐기실 수 있으며 객실 타입에 따라 탁 트인 바다 또는 아름다운 도시 전경을 감상하실 수 있습니다.  \n"
					+ "  객실에는 에어컨, TV, 미니바 등이 구비되어 있습니다. 호텔 내에는 5개의 레스토랑, 2개의 펍, 1개의 베이커리가 있습니다.  \n "
					+ " 조식 뷔페를 제공하는 에스카피에, 해운대 바다 전경의 그릴과 와인 전문점인 닉스 그릴 등이 있습니다. \n  "
					+ " 통유리 창을 통해 탁 트인 전경을 감상하며 다양한 음료 또는 칵테일을 즐기실 수 있는 크리스탈 가든이 있습니다.");
			hotel.setHotelAdress("해운대해변로 296, 해운대구, 부산, 대한민국");
			hotel.setHotelHp("051-310-5000");
			tb_hotel.add(hotel);
			
	 }
	
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(71);
			hotel.setLocalId(7);
			hotel.setHotelName("라마다앙코르서귀포호텔");
			hotel.setHotelInfo("2015년 4월 오픈한 라마다 앙코르 서귀포에서 차로 20분이면 먹거리와 볼거리가 가득한 이중섭 거리와  \n "
					+ "서귀포 매일올레시장 뿐만 아니라 천지연 폭포까지 둘러보실 수 있습니다.  \n "
					+ "또한, 차로 40분이면 한라산까지, 차로 1시간 20분이면 제주국제공항까지 가실 수 있습니다.  \n "
					+ "호텔에서는 아기 욕조, 아기 침대, 유모차 대여 서비스와  \n "
					+ "피트니스 센터 내 젖병 소독기 및 전자레인지 비치 등 아이를 동반하신 고객님을 위한 다양한 서비스를 제공하고 있습니다.  \n"
					+ " 뿐만 아니라 호텔 내 피트니스 센터, 편의점, 미팅룸 등이 있어 편리하게 이용하실 수 있으며 무료로 자전거를 대여하실 수 있습니다.  \n "
					+ "또한, 일반 및 장애인 주차 시설이 완비되어 있습니다.  \n "
					+ "총 243개의 객실을 보유하고 있으며 객실에 따라 바다, 한라산, 도시 전망을 감상하실 수 있습니다. \n "
					+ " 또한, 스탠다드부터 패밀리까지 9가지 타입의 다양한 객실이 마련되어 있습니다.  \n "
					+ "모든 객실에서는 욕실용품, 고급 샤워가운, 헤어드라이어, 전기 포트 등이 구비되어 있습니다.  \n"
					+ " 호텔 내 레스토랑 ACOS에서는 조식 메뉴로 한식 및 양식 뷔페를 선보이고 있으며 중식과 석식 때는 단품 메뉴를 제공하고 있습니다.");
			hotel.setHotelAdress("서호중로 55, 서귀포, 제주도, 대한민국");
			hotel.setHotelHp("064-2223-7000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(72);
			hotel.setLocalId(7);
			hotel.setHotelName("유탑유블레스호텔");
			hotel.setHotelInfo("유탑 유블레스호텔은 함덕서우봉해변에서 차로 5분 이내 거리에 있으며 \n  "
					+ "반짝이는 검은 모래를 자랑하는 삼양 검은모래해변까지 차로 20분이면 도착합니다. \n "
					+ " 또한, 만장굴과 당처물동굴에서 차로 25분 거리에 있습니다.  \n"
					+ " 제주시외버스터미널까지는 차로 40분, 제주국제공항은 차로 약 45분이 소요됩니다.  \n"
					+ " 제주에 머무시는 동안 이 호텔에서 아늑한 객실 및 시설을 이용하실 수 있습니다.  \n "
					+ "무료 와이파이(Wi-Fi), 루프탑 테라스 및 거품 욕조도 제공하고 있습니다.  \n"
					+ " 이 호텔에서는 유아용 의자, 카페, 미팅 시설 등을 포함한 다양한 시설과 서비스를 제공하고 있습니다. \n"
					+ "  무료 구내 전용 주차장도 이용하실 수 있습니다.  \n"
					+ " 호텔 내 객실에는 에어컨이 완비되어 있고 암전 커튼, 슬리퍼 등이 구비되어 있습니다. \n"
					+ "  각 객실에 객실 내 금고, 생수, 냉장고 등이 마련되어 있습니다.");
			hotel.setHotelAdress("조천읍 조함해안로 502, 제주, 제주도, 대한민국");
			hotel.setHotelHp("064-455-5000");
			tb_hotel.add(hotel);
			
	 }
	 {
			HotelVO hotel = new HotelVO();
			hotel.setHotelId(73);
			hotel.setLocalId(7);
			hotel.setHotelName("제주신라호텔");
			hotel.setHotelInfo("제주 신라 호텔 - <5성급> -  \n  "
					+ "해변가가 내려다보이는 쉬리의 언덕이 유명한 제주 신라 호텔은 중문관광단지 내 자리하고 있어 \n "
					+ "  여미지식물원, 천제연폭포, 별내린 전망대 등이 아주 가까운 거리에 있습니다. \n"
					+ "   또한, 제주국제공항은 차로 1시간 5분 거리에 있으며 1일 3회 호텔-공항 간 무료 셔틀을 운영하고 있습니다. \n"
					+ "   호텔 내에 여유롭게 산책을 즐기기에 좋은 숨비정원이 있으며  \n "
					+ " 사전 예약을 하시면 캠핑과 글램핑도 즐기실 수 있습니다.  \n  "
					+ "또한, 짐보리클럽, 키즈아일랜드 등 아이들을 위한 다양한 시설이 완비되어 있으며 \n  "
					+ " 플레이스테이션 전 기종을 체험해볼 수 있는 플레이스테이션 존도 있습니다.  \n"
					+ "  그 외에도 피트니스센터, 스파, 사우나, 미팅룸 등을 이용하실 수 있으며  \n  "
					+ "기념품샵과 특산물 매장에서 쇼핑을 즐기실 수도 있습니다.  \n "
					+ " 38개의 스위트 객실을 포함한 429개 객실을 보유하고 있으며  \n "
					+ " 객실에 따라 한라산 또는 바다를 감상하실 수 있습니다. \n  "
					+ " 또한, 모든 객실에 TV, 냉장고, 에어컨, 금고 등이 완비되어 있으며  \n "
					+ " 욕실에는 욕실용품, 비데, 헤어드라이어 등이 있습니다. \n   "
					+ "호텔 내에 있는 한식, 일식, 뷔페 레스토랑이 있으며  \n  "
					+ "조식은 뷔페 레스토랑 파크뷰와 한식당인 천지에서 제공하고 있으며 별도의 요금이 발생합니다. \n  "
					+ " 그 밖에도 로비 라운지와 풀사이드바를 운영하고 있습니다.");
			hotel.setHotelAdress("중문관광로72번길 75, 서귀포, 제주도, 대한민국");
			hotel.setHotelHp("064-310-5000");
			tb_hotel.add(hotel);
			
	 }
	

	 
	public ArrayList<ReservationVO> tb_reservation =new ArrayList<>();
	{
		ReservationVO tb_reservation =new ReservationVO();
		tb_reservation.setReservationId(1234);				//예약아아디 호출
		tb_reservation.setRoomId(5);						//룸아이디 호출
	}
	
	
	public ArrayList<ReservationVO> userReservationlist = new ArrayList<>();
	{
		ReservationVO userReservList = new ReservationVO();
		userReservList.setUserId("asd123");
		userReservList.setCheckin(conv(20191223));
		userReservList.setCheckout(conv(20200102));
		userReservList.setPaymethod("현금");
		userReservList.setRequest("조용한방으로 부탁해요");
		userReservList.setReservationId(1);
		userReservList.setReservationPrice(2530000);
		userReservList.setRoomId(3);
		userReservList.setCount(8);
		userReservList.setStatus(1);
		userReservationlist.add(userReservList);
	}
	
	{
		ReservationVO userReservList = new ReservationVO();
		userReservList.setUserId("asd123");
		userReservList.setCheckin(conv(20191225));
		userReservList.setCheckout(conv(20191226));
		userReservList.setPaymethod("현금");
		userReservList.setRequest("픽업 부탁드려요");
		userReservList.setReservationId(2);
		userReservList.setReservationPrice(150000);
		userReservList.setRoomId(4);
		userReservList.setCount(2);
		userReservList.setStatus(2);
		userReservationlist.add(userReservList);
	}
	
	{
		ReservationVO userReservList = new ReservationVO();
		userReservList.setUserId("asd123");
		userReservList.setCheckin(conv(20200101));
		userReservList.setCheckout(conv(20200106));
		userReservList.setPaymethod("현금");
		userReservList.setRequest("아침 조식 신청합니다.");
		userReservList.setReservationId(3);
		userReservList.setReservationPrice(1860000);
		userReservList.setRoomId(2);
		userReservList.setCount(6);
		userReservList.setStatus(3);
		userReservationlist.add(userReservList);
	}
	
	{
		ReservationVO userReservList = new ReservationVO();
		userReservList.setUserId("asd123");
		userReservList.setCheckin(conv(20191227));
		userReservList.setCheckout(conv(20191231));
		userReservList.setPaymethod("현금");
		userReservList.setRequest("깨끗한 방으로 주세요!");
		userReservList.setReservationId(4);
		userReservList.setReservationPrice(2200000);
		userReservList.setRoomId(2);
		userReservList.setCount(5);
		userReservList.setStatus(3);
		userReservationlist.add(userReservList);
	}

	{
		ReservationVO userReservList = new ReservationVO();
		userReservList.setUserId("test");
		userReservList.setCheckin(conv(20200103));
		userReservList.setCheckout(conv(20200105));
		userReservList.setPaymethod("현금");
		userReservList.setRequest("바다가 보이는 뷰로 예약합니다.");
		userReservList.setReservationId(5);
		userReservList.setReservationPrice(200000);
		userReservList.setRoomId(3);
		userReservList.setCount(3);
		userReservList.setStatus(3);
		userReservationlist.add(userReservList);
	}
	
	{
		ReservationVO userReservList = new ReservationVO();
		userReservList.setUserId("1jobam");
		userReservList.setCheckin(conv(20200103));
		userReservList.setCheckout(conv(20200105));
		userReservList.setPaymethod("현금");
		userReservList.setRequest("바다가 보이는 뷰로 예약합니다.");
		userReservList.setReservationId(6);
		userReservList.setReservationPrice(200000);
		userReservList.setRoomId(5);
		userReservList.setCount(3);
		userReservList.setStatus(3);
		userReservationlist.add(userReservList);
	}
	
	 
	public Date conv(int date){
		int a = date%100; //일
		date = date/100;
		int b = date%100; //월
		date = date/100;
		int c = date%10000; //년도
		date = date/10000;
		
		Calendar cal = Calendar.getInstance();
		cal.set(c, b-1, a);
		Date time = cal.getTime();
	return time;
	}
	
}














