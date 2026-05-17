package inheritance;

public class Customer {
    protected int id;
    protected String name;
    protected String grade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){

    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        grade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer()");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int calcPrice(int price) {
        bonusPoint += (int) (bonusRatio * price);
        return price;
    }

    public String getInfo() {
        return "이름: " + name
                + " 등급:" + grade
                + " 적립금:" + bonusPoint;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}






