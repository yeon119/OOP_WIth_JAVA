package week5.buyPhone;

public class PhoneStoreTest {
    public static void main(String[] args){
        Phone phone = new Phone("galaxy",100000);
        Store store = new Store(phone);
        Customer customer = new Customer("김미영", 200000);
        customer.buyPhone(store);
    }
}
