package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.ReviewVO;
import dao.ReviewDao;
import dao.ReviewDaoImpl;

public class ReviewServiceImpl implements ReviewService {
	
	private static ReviewServiceImpl instance;
	
	private ReviewServiceImpl(){}
	
	public static ReviewServiceImpl getInstance(){
		if(instance == null){
			instance = new ReviewServiceImpl();
		}
		return instance;
	}
	
	private String rev="";
	
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
	
	ReviewDao reviewDao = ReviewDaoImpl.getInstance();

	@Override
	public boolean write(int roomId, String userId) {
		Scanner s = new Scanner(System.in);
		moongu2();
		System.out.println("\t\t\t\t ☆ 리뷰작성 페이지 입니다 ☆");
		moongu1();
		System.out.println("\t리뷰를 작성해주세요~ 이전화면으로 돌아가시려면 '이전' 또는 '이전화면'을 입력해주세요.");
		moongu1();
		System.out.println("\t >");
		moongu2();
		this.rev = s.nextLine();
		if("이전".equals(rev)||"이전화면".equals(rev)){
			return false;
			//ct.before();
		}else{
			int score;
			do{
				moongu1();
				System.out.println("\t평점을 0~5점까지 입력해 주세요.");
				moongu1();
				score = Integer.parseInt(s.nextLine());
				
				if(score == 0 || score == 1 || score == 2 || score == 3 || score == 4 || score == 5)
				{break;}
				
				else{moongu1();System.out.println("\t평점을 인식할 수 없습니다.");moongu1();}
				
			}while(true);
			
			ReviewVO rvo = new ReviewVO();
			
			if(rev != null){
				rvo.setContent(rev);
				Date date = new Date();
				rvo.setDate(date);
				rvo.setReviewId(reviewDao.makeReviewId());
				rvo.setRoomId(roomId);
				rvo.setUserId(userId);
				rvo.setScore(score);
				
				reviewDao.addReview(rvo);
			}
			return true;
		}
		
	}

	@Override
	public void getReviews(int roomid) {
		
		ArrayList<ReviewVO> reviewlist = reviewDao.getReviews(roomid);
		
		if(reviewlist.size()==0){moongu1();System.out.println("해당 객실은 작성된 리뷰가 없습니다.");moongu1();}
		else{
		for(int i = 0; i < reviewlist.size(); i++){
			System.out.println();
			System.out.print("리뷰"+i+1+"번");
			System.out.println();
			printReviewVO(reviewlist.get(i));
		}}
	}
	
	
	public void printReviewVO(ReviewVO reviewvo){
		
		moongu1();
		System.out.print("\t유저명 : "+reviewvo.getUserId()+"\t");
		System.out.println("점수 : "+reviewvo.getScore());
		System.out.println("\t내용 : "+reviewvo.getContent());
		moongu1();
	}

	@Override
	public void userReviews(String userid) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ReviewVO> reviewlist = reviewDao.userReviews(userid);
		
		if(reviewlist.size()==0){moongu1();System.out.println("\t본인이 작성한 리뷰가 없습니다.");moongu1();}
		else{
			moongu2();
			System.out.println("\t\t\t\t ☆ 내가 작성한 리뷰 수정 / 삭제 선택 페이지 입니다 ☆");
			moongu1();
			
			for(int i = 0; i < reviewlist.size(); i++){
				System.out.print("리뷰"+(i+1)+"번");
				printReviewVO(reviewlist.get(i));
			}
			moongu1();
			System.out.println("\t1. 리뷰삭제");
			System.out.println("\t2. 리뷰수정");
			System.out.println("\t3. 이전화면");
			moongu2();
			
			int ans = Integer.parseInt(sc.nextLine());
			
			if(ans == 1){
				moongu1();
				System.out.println("\t삭제하실 리뷰의 번호를 선택해주세요.");
				moongu1();
				ans = Integer.parseInt(sc.nextLine());
				if(ans <= reviewlist.size()||ans>0){reviewDelete(reviewlist.get(ans-1).getReviewId());
				moongu1();
				System.out.println("\t리뷰가 삭제되었습니다.");moongu1();}
				else{moongu1();System.out.println("\t번호에 해당하는 리뷰가 없습니다");moongu1();}
			}
			else if(ans == 2){
				moongu1();
				System.out.println("\t수정하실 리뷰의 번호를 선택해주세요.");
				moongu1();
				ans = Integer.parseInt(sc.nextLine());
				if(ans <= reviewlist.size()||ans>0){reviewModify(reviewlist.get(ans-1).getReviewId());}
				else{moongu1();System.out.println("\t번호에 해당하는 리뷰가 없습니다");moongu1();}
			}
			else if(ans == 3){}
		}
	}

	private void reviewDelete(int reviewId) {
		reviewDao.reviewDelete(reviewId);
	}
	
	private void reviewModify(int reviewId) {
		
		String modify = "";
		moongu1();
		System.out.println("리뷰의 내용을 수정해서 다시 작성해주세요");
		System.out.println("로그인 화면으로 돌아가시려면 '이전'을 작성해주세요");
		moongu1();
		Scanner sc = new Scanner(System.in);
		modify = sc.nextLine();
		
		if(modify.equals("이전")){}
		else if(!modify.equals("이전") || modify.equals("")){ reviewDao.reviewModify(reviewId, modify);}
		
	}

	public void printUserReview(ReviewVO reviewvo){
		
		moongu1();
		System.out.print("\t객실ID : "+reviewvo.getRoomId()+"\t");
		System.out.println("점수 : "+reviewvo.getScore());
		System.out.println("\t내용 : "+reviewvo.getContent());
		moongu1();
	}
	
	@Override
	public boolean checkReviewNull(String userid, int roomid) {
		
		ArrayList<ReviewVO> userReview = reviewDao.userReviews(userid);
		
		if(userReview.size()==0){return true;}
		else {
			for(int i = 0; i < userReview.size(); i++){
				if(userReview.get(i).getRoomId() == roomid){
					return false;
				}
			}
		}
		return true;
	}
	
}






