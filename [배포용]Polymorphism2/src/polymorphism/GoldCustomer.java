package polymorphism;

public class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(int id, String name){
        super(id, name);
//        super.id = id;
//        this.name = name;
        grade = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.1;

    }

    @Override
    public int calcPrice(int price) {
        super.calcPrice(price);
        return (int)(price * (1.0 - saleRatio));
    }

}
