package AnonymousVsLambdaExpression;

public class ExecutableClassForAnonymousClass {
    public static void main(String[] args) {
        int firstInt=10;
        int secondInt=20;

        ArithmeticOperation op1=new ArithmeticOperation() {
            @Override
            public int performOperationAdd(int a, int b) {
                return a+b;
            }

            @Override
            public int performOperationMultiply(int a, int b) {
                return a*b;
            }
        };
        System.out.println("Perform AnonymousClass implementation via add method "+op1.performOperationAdd(firstInt,secondInt));
        System.out.println("Perform AnonymousClass implementation via multiply method "+op1.performOperationMultiply(firstInt,secondInt));




        //Lambda Class Implementation
        FunctionalInterfaceExample ex1=(a,b)->{
            return a+b;
        };

        System.out.println(ex1.performOperationADD(10,20));
    }
}
