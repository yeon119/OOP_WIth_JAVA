package week6.univ;

public class Student {
    private String id;
    private String name;
    private int grade;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (1 <= grade && grade < 5) {
            this.grade = grade;
        }
        else {
            return;
        }
    }

    public void showInfo(){
        System.out.println("이름 : " + getName()+"\n"+"학번 : "+getId()+"\n"+"학년 : "+getGrade());
    }

    public Student(String id){
        this.id = id;
    }
    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Student(String id, String name, int grade){
        this(id, name);
        setGrade(grade);
    }
}
