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
        String str = "학번 : " +this.id + "이름" + this.name;
        str += "[수강 과목 목록]";
        if(subjectList.isEmpty()){
            str += "수강중인 과목이 없습니다 \n";
        }
        else {
            for (Subject subject : subjectList){
                str += "-" + subject.getInfo() + "\n";
            }
        }
        return str;

    }

    public void addSubject(String name, int score){
        // Subject subject = new Subject(name, score);
        subjectList.add(new Subject(name, score));



    }

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }



}
