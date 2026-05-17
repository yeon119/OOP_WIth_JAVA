import inheritance.Customer;
import inheritance.VIPCustomer;

public class Test {
    public static void main(String[] args) {
        Customer c4 = new Customer();
        VIPCustomer v4 = new VIPCustomer();
        System.out.println(c4);
        System.out.println(v4);
        System.out.println("---------");


        Customer c3 = new Customer(1001, "이순신");
        Customer v3 = new VIPCustomer(1000, "김인하", 5000);
        System.out.println(c3.calcPrice(1000));

        //v3는 Customer 타입을 참조하는 변수
        //실제 v3는 VIPCustomer 참조하고있다
        //(1) Customer의 calcPrice를 호출?
        //자바는 (1) 방식을 지원하지 않음
        //hiding 을 사용하지 않기떄문에
        //자바는 무조건 오버라이딩을 지원함0
        //(2) VIPCUstomer의 calcPrice를 호출
        // 실제로는 (2) 방식으로 동작.
        //overriding의로 구현되어있어서
        System.out.println(v3.calcPrice(1000));


        System.out.println(c3.getInfo());
        System.out.println(v3.getInfo());
        // System.out.println(v3.getVIPInfo());

        System.out.println("---------");
        Customer c = new Customer(1001, "이순신");
        VIPCustomer v = new VIPCustomer(1000, "김인하", 5000);
        System.out.println(c.calcPrice(1000));
        System.out.println(v.calcPrice(1000));
        System.out.println(c.getInfo());
        System.out.println(v.getInfo());
        System.out.println(v.getVIPInfo());

        System.out.println("---------");

        VIPCustomer kim = new VIPCustomer(10010, "이순신", 5555);
        kim.setId(10010);
        kim.setName("이순신");
        //kim.name = "이순신";
        //kim.bonusPoint = 1000;
        System.out.println(kim.getInfo());

        Customer c1 = new Customer(0, "");
        VIPCustomer v1 = new VIPCustomer(0, "", 0);
        Customer c2 = (Customer) v1;
       // VIPCustomer v2 = (VIPCustomer) c1;


    }
}
