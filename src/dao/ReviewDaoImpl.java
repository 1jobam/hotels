package dao;

import java.util.ArrayList;

import vo.ReviewVO;
import data.ReviewDatabase;

public class ReviewDaoImpl implements ReviewDao {
	
	private static ReviewDaoImpl instance;
	
	private ReviewDaoImpl(){}
	
	public static ReviewDaoImpl getInstance(){
		if(instance == null){
			instance = new ReviewDaoImpl();
		}
		return instance;
	}
	

	@Override
	public int makeReviewId() {
		int x = 0;
			
		for(int i = 0; i < database.tb_review.size(); i++){
			if(database.tb_review.get(i).getReviewId() > x){
				x = database.tb_review.get(i).getReviewId();
			}
		}
		return x+1;
	}
	
	ReviewDatabase database = ReviewDatabase.getInstance();
	@Override
	public void addReview(ReviewVO review) {
		
		database.tb_review.add(review);
		
	}
	
	@Override
	public ArrayList<ReviewVO> getReviews(int roomid) {
		ArrayList<ReviewVO> tmp =  new ArrayList<>();
			
		for(int i = 0; i < database.tb_review.size(); i++){
			if(database.tb_review.get(i).getRoomId() == roomid){
				tmp.add(database.tb_review.get(i));
			}
		}
		return tmp;
	}

	@Override
	public ArrayList<ReviewVO> userReviews(String userid) {
		ArrayList<ReviewVO> tmp =  new ArrayList<>();
		
		for(int i = 0; i < database.tb_review.size(); i++){
			if(database.tb_review.get(i).getUserId() == userid){
				tmp.add(database.tb_review.get(i));
			}
		}
		return tmp;
	}

	@Override
	public void reviewDelete(int reviewId) {
		for(int i = 0; i < database.tb_review.size(); i++){
			if(database.tb_review.get(i).getReviewId() == reviewId){
				database.tb_review.remove(i);
			}
		}
	}

	@Override
	public void reviewModify(int reviewId, String modify) {
		for(int i = 0; i < database.tb_review.size(); i++){
			if(database.tb_review.get(i).getReviewId() == reviewId){
				database.tb_review.get(i).setContent(modify);
			}
		}
	}
	
}
