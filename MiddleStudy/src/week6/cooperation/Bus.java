package week6.cooperation;

public class Bus {
    private String number; // 버스 번호
    private int passengerCount;// 승객 수
    private int money; // 수입

    public void take(int payed){
        this.money += payed;
        this.passengerCount ++;

    }

    public void showInfo(){
        System.out.println("버스 번호: "+ number +"\n" +"승객 수: " + passengerCount + "\n" + "수입" + money + '\n');
    }

    public Bus(String number){
        this.number = number;
    }
}
