package week5.reference;

public class Student5 {
    public String id;
    public String name;
    public Subject2 subject1;
    public Subject2 subject2;

    public Student5(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setSubject1(String name, int score) {
        subject1 = new Subject2();
        subject1.setName(name);
        subject1.setScore(score);
    }

    public void setSubject2(String name, int score){
        subject2 = new Subject2();
        subject2.setName(name);
        subject2.setScore(score);
    }

    public void showInfo(){
//        System.out.println(id + "," + name + ":" +subject1.getScore() + subject2.getScore() );
        System.out.println(id);
        System.out.println(name);
        System.out.println(subject1.getName());
        System.out.println(subject2.getName());
    }
}
