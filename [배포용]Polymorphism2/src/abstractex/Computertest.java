package abstractex;

import java.lang.classfile.constantpool.ConstantPoolException;

abstract class Computer{
    public abstract void display();
    public abstract void typing();
    public void turnOn(){

    };
    public void turnOff(){

    };
}

class DeskTop extends Computer{

    @Override
    public void display() {

    }

    @Override
    public void typing() {

    }
}
// 추상클래스를 추상클래스가 상속할수있다
 abstract class NoteBook extends Computer{
    @Override
    public void typing() {

    }
}

class GameNOteBook extends NoteBook{
    @Override
    public void display() {

    }
}

public class Computertest {
    static void main() {
        Computer c;
         // c = new Computer();

        c = new DeskTop();
//        c = new NOteBook();
        // 위 두개는 추상클래스라 호출할수없음
        c = new GameNOteBook();
    }
}
