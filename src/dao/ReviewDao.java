package dao;

import java.util.ArrayList;

import vo.ReviewVO;

public interface ReviewDao {
	
	int makeReviewId();
	
	void addReview(ReviewVO review);

	ArrayList<ReviewVO> getReviews(int roomid);

	ArrayList<ReviewVO> userReviews(String userid);

	void reviewDelete(int reviewId);

	void reviewModify(int reviewId, String modify); 
}
