package service;

public interface ReviewService {
	
	boolean write(int roomId, String userId);

	void getReviews(int roomid);

	void userReviews(String userid);
	
	boolean checkReviewNull(String userid, int roomid);
	
}
