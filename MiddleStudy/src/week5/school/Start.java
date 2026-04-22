package week5.school;

public class Start {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "이미영";
        person1.height = 160.0;
        person1.weight = 60.2;

        System.out.println(person1);
        Person person2 = new Person("김미영");
        Person person3 = new Person("박미영",160.0,60);

    }
}
