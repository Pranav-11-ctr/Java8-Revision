package methodReference;

import java.util.ArrayList;
import java.util.List;

public class ImplementationClass {

    public static void main(String[] args) {

        ProductInterface productInterface=Product::new;
        Product prod=productInterface.getProduct("Apple",10000);
        System.out.println(prod.name);
        System.out.println(prod.price);



        ArithmeticOperation add=(a,b)->a+b;
        System.out.println(add.operation(10,20));

        //Static Method Reference
        //Class::staticMethod()
        ArithmeticOperation methodRef=ImplementationClass::addOperatin;
        System.out.println(methodRef.operation(10,20));

        //Reference to instance method from Instance
        ImplementationClass ex1=new ImplementationClass();
        ArithmeticOperation methodRef2=ex1::multiplyOperation;
        System.out.println(methodRef2.operation(10,20));

        List<String> departments=new ArrayList<>();
        departments.add("HR");
        departments.add("HR1");
        departments.add("HR2");
        departments.add("HR3");

        //Class::instanceMethod
//        departments.forEach(System.out::println);
        departments.forEach(s-> System.out.println(s));

    }

    public static int addOperatin(int a,int b)
    {
        return a+b;
    }

    public int multiplyOperation(int firstNum,int secondNum)
    {
        return firstNum*secondNum;
    }

}
