package week7.models;

import week6.cooperation.Subway;

public class Subject {
    private String name;
    private int score;

    public String getName(){
        return name;
    }
    public int getScore(){
        return  score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setScore(int score){
        this.score = score;
    }

    public String getInfo(){
        String str = "과목명 : "+name + "점수 :" + score;
        return str;
    }

    public Subject(String name, int score){
        this.name = name;
        this.score = score;
    }


}
