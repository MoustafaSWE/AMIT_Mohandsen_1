package firstDay.javaBasics;

public class ClassA {


    public static void main(String[] args) {
        ClassA.run();
        ClassA hassan = new ClassA();
        hassan.eat();

    }


    protected static void run () {
        System.out.println("Hello");
    }
    protected void eat (){
        System.out.println("World");
    }

}
