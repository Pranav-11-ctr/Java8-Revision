package lambda;

public class LAmbdaExamples {

    public static void main(String[] args) {
        voidWithNoParams();
        withOneParams();
        withTwoArguments();
    }

    private static void voidWithNoParams() {

        VoidMethodWithNoParams method = () ->{
            System.out.println("Method with no Params");
        };
        method.printHello();

        VoidMethodWithNoParams method1= () ->{
            System.out.println("Extra method");
        };
        method1.printHello();
    }

    public static void withOneParams(){
        VoidWithOneParams method=(name) ->{
            System.out.println("This is argument value "+name);
        };

        method.printHelloString("Pranav Kumar");
    }

    public static void withTwoArguments()
    {
        DoubleWithTwoArgument addition=(a,b)->
        {
            return a+b;
        };

        System.out.println(addition.operation(23,56));

        DoubleWithTwoArgument multiplication=(a,b)->
        {
            return a*b;
        };
        System.out.println(multiplication.operation(123,56));

        DoubleWithTwoArgument division=(a,b)->{
            return a/b;
        };
        System.out.println(division.operation(230,10));

    }




}
