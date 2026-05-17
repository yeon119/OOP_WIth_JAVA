package polymorphism;

public class Customer {
    private int id;
    protected String name;
    //선언과 동시에 초기화 가능
    protected String grade = "SILVER";
    int bonusPoint;
    double bonusRatio = 0.01;

    public Customer() {
        grade = "SILVER";
        bonusRatio = 0.01;
//        initCustomer();

    }

    public Customer(int id, String name) {
        this();
        this.id = id;
        this.name = name;
//        initCustomer();
    }

//    private void initCustomer(){
//        grade = "SILVER";
//        bonusRatio = 0.01;
//    }

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

    @Override
    public String toString() {
        return "이름: " + name + " 등급:"
                + grade + " 적립금:" + bonusPoint;
    }
}






