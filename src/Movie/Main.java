package Movie;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>(); //Movie클래스의 객체를 List타입으로 설정
        movies.add(new Movie("해적: 도꺠비 깃발", 5.5, "22.01.26"));
        movies.add(new Movie("스파이더맨:노 웨이 홈", 7.3, "21.12.15"));
        movies.add(new Movie("킹메이커", 8.3, "22.01.26"));
        movies.add(new Movie("씽2게더", 9.0, "22.01.05"));
        movies.add(new Movie("특송", 7.9, "22.01.12"));
        movies.add(new Movie("레지던트 이블: 라쿤시티", 5.4, "22.01.09"));
        movies.add(new Movie("웨스트 사이드 스토라", 7.9, "22.01.12"));
        movies.add(new Movie("어나더 라운드", 9.0, "22.01.10"));
        movies.add(new Movie("장민호 드라마 최종회", 10.0, "22.01.24"));
        movies.add(new Movie("경관의 피", 7.5, "22.01.05"));


        Collections.sort(movies, Collections.reverseOrder());

        for (Movie m : movies) {
            System.out.println(m.toString());
        }
    }
}