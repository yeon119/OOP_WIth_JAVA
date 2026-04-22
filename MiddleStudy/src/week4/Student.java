package week4;

public class Student {
    String id;
    private String name;
    public int grade;
    public String address;

    public void showInfo(){
        System.out.println(getName() + ":" + address);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
