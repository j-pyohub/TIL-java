package ex.class_ex;

import java.util.Scanner;

public class MovieReviewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //영화 리뷰 정보 선언
        MovieReview inception;
        inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime;
        aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[]{inception, aboutTime};

        //영화 리뷰 정보 출력
        for (MovieReview s : movieReviews) {
            System.out.println("영화 제목: "+s.title+", 리뷰: "+s.review);

        }

    }
}
