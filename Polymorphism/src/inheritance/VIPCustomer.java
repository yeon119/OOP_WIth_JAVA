package inheritance;

public class VIPCustomer extends Customer {
    private int agentId;
    private double saleRatio;

    public VIPCustomer() {

        //super();
        //super(0, "");
    }

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

    //customer에도 calprice가 있음
    //매개변수, 반환타입 , 이름 모두 동일
    // 즉, 아래 메소드는 메소드 오버라이딩으로 구현
    @Override
    public int calcPrice(int price) {
        //부모의 calcPricr() 와 동일한 로직이 필요할때
        //super를 이용해 부모의 메소드를 호출할 수 있음
        super.calcPrice(price);
        // bonusPoint += (int) (bonusRatio * price);
        return (int) (price * (1.0 - saleRatio));
    }

    //(TBD) public String getInfo(){
    //(TBD)     return "이름: " + name
    //(TBD)             + " 등급:" + grade
    //(TBD)             + " 적립금:" + bonusPoint;
    //(TBD) }

    public String getVIPInfo() {
//        return  super.getInfo() + " 상담원 : " + agentId;
//        return  this.getInfo() + " 상담원 : " + agentId;
        return getInfo() + " 상담원 : " + agentId;


    }
    // ctrl + o -> 어떤것을 보러라이딩 할지 오버라이딩 가능한 메소드들을 보여주고 기본 형식을 만들어줌
    @Override
    public String getInfo() {
        return super.getInfo() + " 상담원: " + agentId;

    }

    @Override
    public String toString() {
        return "고급회원: " + super.toString();
    }
}