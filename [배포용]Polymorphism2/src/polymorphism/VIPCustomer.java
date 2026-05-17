package polymorphism;

public class VIPCustomer extends Customer {
    private int agentId;
    private double saleRatio;

    public VIPCustomer(int id, String name, int agentId) {
        super(id, name);

        this.agentId = agentId;
        super.grade = "VIP";
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;

        System.out.println("VIP()");
    }

    public int getAgentId() {
        return agentId;
    }

    //public String getVIPInfo(){
    //       return super.getInfo() + " 상담원:" + agentId;
    //}

    @Override
    public int calcPrice(int price){
        //return super.calcPrice(price) - (int)(price * saleRatio);
        bonusPoint += (int)(bonusRatio * price);
        return (int)(price * (1.0 - saleRatio));
    }

    @Override
    public String toString(){
        return super.toString() + " 상담원:" + agentId;
    }
}