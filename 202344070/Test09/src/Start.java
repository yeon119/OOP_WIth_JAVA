import school.Person;
public class Start {
    public  static  void main(String[] args){
        Person p1 = new Person();
        p1.name = "이미영";
        p1.height = 160.0;
        p1.weight = 60.2;

        Person p2 = new Person("김미영");

        Person p3 = new Person("박미영", 160.0);
    }
}
