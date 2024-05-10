package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MoiveReview inception = new MoiveReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MoiveReview aboutTime = new MoiveReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        MoiveReview[] reviews = {inception, aboutTime};

        for (MoiveReview review : reviews) {
            System.out.println("영화 제목 : " + review.title + ", 리뷰 : " + review.review);
        }
    }
}
