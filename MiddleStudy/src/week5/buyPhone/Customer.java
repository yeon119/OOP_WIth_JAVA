package week5.buyPhone;

public class Customer {
    private String name;
    private int budget;

    public Customer(String name, int budget){
        this.name = name;
        this.budget = budget;
    }

    public int getBudget(){
        return budget;
    }

    public void buyPhone(Store store){
//        Phone phone = new Phone("iphone", 100000);
        String model = "galaxy";
        Phone result = store.sellPhone(model, this.budget);

        if(result != null){
            System.out.println("구입완료");
        }
        else {
            System.out.println("구입 실패!");

        }
    }
}
