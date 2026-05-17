package Inheritance;

public class VIPCustomer extends Customer {
//    private int id;
//    private String name;
//    private String grade;
//    int bonusPoint;
//    double bonusRatio;
    int agentId;
    double saleRatio;

    public VIPCustomer(int id , String name, int agentId) {
        super(id,name);
        this.agentId = agentId;
        super.grade ="VIP";// private라 접근이 제한되기떄문에 protected로 해야함
        this.bonusRatio = 0.05;
        System.out.println("VIP()");

    }
//this() -> 나의 생성자 super=> 부모의 생성자
    public int getAgenId(){
        return agentId;
    }

//(TBD)    public int calcPrice(int price){
//(TBD)       bonusPoint += price * (int)bonusRatio;
//(TBD)       return price = (int)(price * (1.0 - saleRatio));
//(TBD)
//(TBD)    }

//(TBD)    public String getInfo(){
//(TBD)       return "이름 :" + name + "등급" + grade + "적립금" + bonusPoint;
//(TBD)    }
    
}
