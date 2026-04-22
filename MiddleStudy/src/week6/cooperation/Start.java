package week6.cooperation;

public class Start {
    public static void main(String[] args){
         Student s1 = new Student("김미영", 5000);
         Student s2 = new Student("김인하" , 10000);

         Bus bus1 = new Bus("10우 1111");

         s1.takeBus(bus1);
         s2.takeBus(bus1);

         Subway subway1 = new Subway("1호선");

         s2.takeSubway(subway1);

         s1.showInfo();
         s2.showInfo();
         bus1.showInfo();
         subway1.showInfo();
    }

}
