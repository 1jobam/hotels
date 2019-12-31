package data;

import java.util.ArrayList;
import java.util.Date;

import vo.ReviewVO;




public class ReviewDatabase {
	
private static ReviewDatabase instance;
	
	private ReviewDatabase(){}
	
	public static ReviewDatabase getInstance(){
		if(instance == null){
			instance = new ReviewDatabase();
		}
		return instance;
	}
	
	public ArrayList<ReviewVO> tb_review = new ArrayList<>();
	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO();
//		review.setReservationId(1);
		review.setReviewId(1);
		review.setUserId("회원1");
		review.setRoomId(1);
		review.setDate(date);
		review.setContent("회원1 리뷰1번");
		review.setScore(0);
		tb_review.add(review);
	}
	
	{	
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
//		review.setReservationId(2);
		review.setReviewId(2);
		review.setUserId("회원1");
		review.setRoomId(2);
		review.setDate(date);
		review.setContent("회원1 리뷰2번");
		review.setScore(0);
		
		tb_review.add(review);
		
	}
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO();
		review.setReviewId(3);
		review.setUserId("회원1");
		review.setRoomId(3);
		review.setDate(date);
		review.setContent("회원1 리뷰3번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(4);
		review.setUserId("회원1");
		review.setRoomId(4);
		review.setDate(date);
		review.setContent("회원1 리뷰4번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(5);
		review.setUserId("회원1");
		review.setRoomId(5);
		review.setDate(date);
		review.setContent("회원1 리뷰5번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(6);
		review.setUserId("회원1");
		review.setRoomId(6);
		review.setDate(date);
		review.setContent("회원1 리뷰6번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(7);
		review.setUserId("회원1");
		review.setRoomId(7);
		review.setDate(date);
		review.setContent("회원 리뷰7번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(8);
		review.setUserId("회원1");
		review.setRoomId(8);
		review.setDate(date);
		review.setContent("회원1 리뷰8번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(9);
		review.setUserId("회원1");
		review.setRoomId(9);
		review.setDate(date);
		review.setContent("회원1 리뷰9번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(10);
		review.setUserId("회원1");
		review.setRoomId(10);
		review.setDate(date);
		review.setContent("회원1 리뷰10번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(11);
		review.setUserId("회원1");
		review.setRoomId(11);
		review.setDate(date);
		review.setContent("회원1 리뷰11번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(12);
		review.setUserId("회원1");
		review.setRoomId(12);
		review.setDate(date);
		review.setContent("회원1 리뷰12번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(13);
		review.setUserId("회원2");
		review.setRoomId(1);
		review.setDate(date);
		review.setContent("회원2 리뷰1번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(14);
		review.setUserId("회원2");
		review.setRoomId(2);
		review.setDate(date);
		review.setContent("회원2 리뷰2번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(15);
		review.setUserId("회원2");
		review.setRoomId(3);
		review.setDate(date);
		review.setContent("회원2 리뷰3번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(16);
		review.setUserId("회원2");
		review.setRoomId(4);
		review.setDate(date);
		review.setContent("회원2 리뷰4번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(17);
		review.setUserId("회원2");
		review.setRoomId(5);
		review.setDate(date);
		review.setContent("회원2 리뷰5번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(18);
		review.setUserId("회원2");
		review.setRoomId(6);
		review.setDate(date);
		review.setContent("회원2 리뷰6번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(19);
		review.setUserId("회원2");
		review.setRoomId(7);
		review.setDate(date);
		review.setContent("회원2 리뷰7번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(20);
		review.setUserId("회원2");
		review.setRoomId(8);
		review.setDate(date);
		review.setContent("회원2 리뷰8번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(21);
		review.setUserId("회원2");
		review.setRoomId(9);
		review.setDate(date);
		review.setContent("회원2 리뷰9번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(22);
		review.setUserId("회원2");
		review.setRoomId(10);
		review.setDate(date);
		review.setContent("회원2 리뷰10번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(23);
		review.setUserId("회원2");
		review.setRoomId(11);
		review.setDate(date);
		review.setContent("회원2 리뷰11번");
		review.setScore(0);
		tb_review.add(review);
	}	
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(24);
		review.setUserId("회원2");
		review.setRoomId(12);
		review.setDate(date);
		review.setContent("회원2 리뷰12번");
		review.setScore(0);		
		
		tb_review.add(review);
	}
	{
		Date date = new Date();
		ReviewVO review = new ReviewVO(); 
		review.setReviewId(25);
		review.setUserId("1jobam");
		review.setRoomId(5);
		review.setDate(date);
		review.setContent("테스트 입니다.");
		review.setScore(0);		
		
		tb_review.add(review);
	}
}
