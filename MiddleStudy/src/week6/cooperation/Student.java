package week6.cooperation;

public class Student {
    private String name;
    private int money;

    public void takeBus(Bus bus) {
        bus.take(1000);
        money -= 1000;
    }

    public boolean takeSubway(Subway subway) {
        if (money < Subway.minMoney){
            return false;
        }
        subway.take(subway.minMoney);
        money -= 1500;
        return true;
    }

    public void showInfo() {
        System.out.println("이름 : " + name + "\n" + "남은 돈 : " + money);
    }

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }
}
