package abstractex;

// public 클래스는 파일당 하나만 허용

import java.util.ArrayList;

abstract class Animal {
    public void move() {
        System.out.println("동물이동");
    }

}

class Human extends Animal {
    // 상위클래스 메소드 오버라이딩
    // 접근제한자는 동일 또는 더 넓은 범위 사용
    // private -> default -> protected -> public
    //   private void move(){
    public void move() {
        System.out.println("사람이동");

    }

    public void readBook() {
        System.out.println("책을 읽자!");
    }
}

// Tiger => Animal (tiger의super은 animal) -> Object(상속관계)
//Object : 최상위 클래스 (모든 자료형의 시조)/
// extends 키워드를 사용하여 상속을 구현
// 자바는 단일 상속 지원
//extends를 통해 상속할수있는 클래스는 오직 하나
// 자바에서 상속은 확장이랑 같은 의미
class Tiger extends Animal {
    //어노테이션: 컴파일러에게 알려주는 주석
    // @Override 생략이 가능함 (넣는 것을 권고)
    @Override
    public void move() {
        super.move(); // super => Animal
        System.out.println("그런데 호랑이.....");

    }

    public void hunting() {
        System.out.println("사냥하다");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리 이동");
    }

    public void flying() {
        System.out.println("날다");
    }
}
// 자바는 단일 상속만 지원

/// /extends 뒤에는 '클래스'를 나열할 수 없음
//class TigerEagle extends Tiger, Egale{
//
//}


// 동일 클래스 내의 메소드는 서로 호출이 가능함
// 클래스 메소드-다른 모든 메소드에서 호출 가능
// 인스턴스 메소드-는 다른 인스턴스 메소드에서만 호출이 가능
//클래스 메소드는 인스턴스 메소드를 호출 가능한가? ->
//공부할떄 -> 추가적인 생각을 해야함

public class AnimalTest {
    // 클래스(static, 정적)메소드
    static void moveAni1(Animal ani) { //에러가 나지 않는 이유 : 동물이 존재는 함 => 변수 선언시엔 아무런 문제가 생기지 않음
        ani.move();
//        moveAni2(ani); // 인스턴스메소드는 클래스 메소드가 호출 x
    }

    //인스턴스 메소드 => 교재 안에 있는 테스트 코드랑 차이점 확인하기
    void moveAni2(Animal ani) {
        ani.move();
        moveAni1(ani); // 클래스 메소드는 인스턴스 메소드가 후출해도 아무문제 x
    }


    // 클래스 메소드
    static void main() {
        ArrayList<Animal> aniList = new ArrayList<Animal>();
        // boxing
//        Animal a = new Human;
//        aniList.add(new Animal()); // 실제론 존재하면 안됨 => 타입으로써만 존재해야함
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for (var ani : aniList) {
            ani.move();
            //unBOxing
            if (ani instanceof Human) {
                ((Human) ani).readBook();
            } else if (ani instanceof Tiger) {
                ((Tiger) ani).hunting();

            } else if (ani instanceof Eagle) {
                ((Eagle) ani).flying();
                
            }
        }
        System.out.println("--------------------------------------------------------------------");

        AnimalTest t = new AnimalTest();
  //      t.moveAni2(new Animal());
        t.moveAni2(new Human());
        t.moveAni2(new Tiger());
        t.moveAni2(new Eagle());


    //    moveAni1(new Animal());
        moveAni1(new Human());
        moveAni1(new Tiger());
        moveAni1(new Eagle());
    }

}

