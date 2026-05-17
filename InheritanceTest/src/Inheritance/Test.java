package Inheritance;

public class Test {
    public static void main(String[] args){
        VIPCustomer v = new VIPCustomer(1000,"김인하",5000); // Customer 먼저 생성되고 VIP로 넘어와서 값이 수정되면서 확장되서 넘어오는거임
        System.out.println("-------------");//그래서 위의 출력값을 보면 커스터머 후에 브이아이피임




        VIPCustomer kim = new VIPCustomer(10010,"이순신",5555);
        kim.setId(10010);
        kim.setName("이순신");
        kim.bonusPoint = 1000;
        System.out.println(kim.getInfo());



        Customer c1 = new Customer(0,"");
        VIPCustomer v1 = new VIPCustomer(0,"0",0);
      ; //가족관계를 맺으면 형변환에 문제가 생기지 않음

    }


}
