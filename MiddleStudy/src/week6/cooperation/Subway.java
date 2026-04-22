package week6.cooperation;

public class Subway {
    public static int minMoney = 1500;
    private String number; // 버스 번호
    private int passengerCount;// 승객 수
    private int money; // 수입

    public boolean take(int payed){
        if(money != minMoney){
            return false;
        }

        this.money += payed;
        this.passengerCount ++;
        return true;
    }

    public void showInfo(){
        System.out.println("지하철 호선: "+ number +"\n" +"승객 수: " + passengerCount + "\n" + "수입" + money + '\n');
    }

    public Subway(String number){
        this.number = number;
    }
}
