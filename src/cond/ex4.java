package cond;

public class ex4 {
    public static void main(String[] args) {

        double rating = 8;

        if (rating <= 9.0) {
            System.out.println("어바웃 타임을 추천합니다");
        }  if (rating <= 8.0) {
            System.out.println("토이 스토리를 추천합니다.");
        } if (rating <= 7.0){
            System.out.println("고질라를 추천합니다.");
        }
    }
}