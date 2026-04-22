package week5.buyPhone;

public class Store {
    private Phone phone;

    public Store(Phone phone){
        this.phone = phone;
    }

    public Phone sellPhone(String model, int price){
        if(this.phone.getModel().equals(model) && this.phone.getPrice() <= price){
            registerPayment();
            discountPromotion();
            saveData();
            return this.phone;
        }
        else {
            return null;
        }
    }

    private void registerPayment(){
        System.out.println("요금제를 등록합니다");
    }

    private void discountPromotion(){
        System.out.println("프로모션 할인을 진행합니다");
    }

    private void saveData(){
        System.out.println("데이터를 저장합니다");
    }


}
