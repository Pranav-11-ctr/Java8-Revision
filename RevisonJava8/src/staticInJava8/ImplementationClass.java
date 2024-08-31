package staticInJava8;

public class ImplementationClass implements StaticMethodInsideInterface{

    public static void sayHello()//static method can't override
    {
        System.out.println("Inside Class");
    }
    public static void main(String[] args) {
        ImplementationClass ic=new ImplementationClass();
        sayHello();
        ic.sayHello();
        ImplementationClass.sayHello();
        StaticMethodInsideInterface.sayHello();

    }
}
