package week7.models;

import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private ArrayList<Subject> subjectList; //점수 목록

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        String str = "학번 : " + id + "이름" + name;

    }

    public void addSubject(String name, int score){
        // Subject subject = new Subject(name, score);
        subjectList.add(new Subject(name, score));



    }



}
