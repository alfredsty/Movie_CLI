package Movie;

public class Movie implements Comparable<Movie> {
    // 필드
    private String title;
    private double score;
    private String date;

    @Override
    public String toString() { //객체가 가진 정보를 문자열로 출력하는 tosString 메서드(title,score,date값을 받는다)
        return "Movie{" +
                "title='" + title + '\'' +
                ", score=" + score +
                ", date='" + date + '\'' +
                '}';
    }

    public Movie(String title, double score, String date) { //인스턴스 필드임을 명확하게 하기 위해 인스턴스 자기 자신을 생성
        this.title = title;
        this.score = score;
        this.date = date;
    }
    //Getter Setter
    public String getTitle() {  //필드의 title값을 리턴함.
        return title;
    }   //title값을 리턴

    public void setTitle(String title) {    //외부에서 받은 title값을 필드값으로 수정함
        this.title = title;
    } //외부에서 주어진 title값을 필드값으로 수정함

    public double getScore() {  //필드의 score값을 리턴함.
        return score;
    }   //score값을 리턴

    public void setScore(double score) {    //외부에서 받은 Score값을 필드값으로 수정함
        this.score = score;
    }   //외부에서 주어진 score값을 필드값으로 수정함

    public String getDate() {   //필드의 date값을 리턴함
        return date;
    }   //date값을 리턴

    public void setDate(String date) {  //외부에서 받은 date값을 필드값으로 수정함
        this.date = date;
    }   //외부에서 주어진 date값을 필드값으로 수정

    @Override
    public int compareTo(Movie m) {     // TODO주석 달아야함...
        Double dSCore1 = this.score;
        Double dScore2 = m.score;
        int result = dSCore1.compareTo(dSCore1);
        if(result < 0 ){
            return -1;
        }else if(result > 0) {
            return 1;
        }
        return 0;

    }
}
