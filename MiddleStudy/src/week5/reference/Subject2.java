package week5.reference;

public class Subject2 {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setScore(int score) {
        if (0 <= score && score <= 100) {
            this.score = score;
        }
        else {
            System.out.println("점수가 범위를 벗어났습니다 다시 입력해주세요");
        }


    }
}
