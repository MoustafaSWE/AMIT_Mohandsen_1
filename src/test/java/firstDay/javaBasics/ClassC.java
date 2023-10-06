package firstDay.javaBasics;

public class ClassC {

    public static void main(String[] args) {
        ClassC h = new ClassC();
        h.dell();

        ClassC.dell2();

    }
    public void dell (){
        System.out.println("Hello World");
    }

    public static void dell2 (){
        System.out.println("No World");
    }

    public static int x (){
        return 1;
    }

}
