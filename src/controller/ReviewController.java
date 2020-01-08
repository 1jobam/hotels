package controller;

import java.util.Scanner;

import service.ReviewService;
import service.ReviewServiceImpl;

public class ReviewController {
	
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
	
	
	//유저아이디와 객실아이디를 받으면 리뷰를 작성하는 메소드
	public void before(String userid, int roomid) {
		
		ReviewService reviewserviceimpl = ReviewServiceImpl.getInstance();
		int menu;

		while (true) {
			
			boolean checknull = reviewserviceimpl.checkReviewNull(userid, roomid);
			if(!checknull){
				System.out.println("\t해당 객실에 관해 이미 작성하신 리뷰가 있습니다.");
				System.out.println("\t리뷰보기 페이지에서 리뷰를 관리하실 수 있습니다.");
				System.out.println("\t이전 화면으로 돌아갑니다.");
				break;
			}	
			
			moongu2();
			System.out.println("\t\t\t\t☆ 리뷰 작성 페이지 입니다 ☆");
			moongu1();
			System.out.println("\t원하시는 번호를 입력해주세요.");
			moongu1();
			System.out.println("\t1. 리뷰 작성하기");
			System.out.println("\t2. 이전화면");
			moongu1();
			System.out.println("\t>");
			moongu2();
			
			Scanner s = new Scanner(System.in);
			menu = Integer.parseInt(s.nextLine());

			if (menu == 1) {
				boolean write = reviewserviceimpl.write(roomid, userid);
				if(write){
					moongu1();
					System.out.println("\t\t\t\t리뷰를 작성해주셔서 감사합니다");
					moongu1();
					break;
				}
			} else if (menu == 2) {
				break;
			}
		}
	}
	
	
	//객실에서 해당 객실의 리뷰를 보고 싶을 때 불러올 메소드
	public void getReviews(int roomid){
		moongu1();
		ReviewService reviewserviceimpl = ReviewServiceImpl.getInstance();
		reviewserviceimpl.getReviews(roomid);
		moongu1();
		System.out.println("\t이전 화면으로 돌아가시려면 아무키나 누르세요");
		moongu1();
		
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
	}
	
	//유저가 자기가 쓴 리뷰를 보고 싶을 때 불러올 메소드
	public void userReviews(String userid){
		ReviewService reviewserviceimpl = ReviewServiceImpl.getInstance();
		
		reviewserviceimpl.userReviews(userid);
	}
	

}

