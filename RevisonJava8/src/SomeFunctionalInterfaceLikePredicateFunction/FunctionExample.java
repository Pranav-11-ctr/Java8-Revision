package SomeFunctionalInterfaceLikePredicateFunction;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        //Accept two parameter
        //1st one input type
        //2nd one return type
        Function<String,String> upperCase=s->s.toUpperCase();
        System.out.println(upperCase.apply("pranav"));
    }
}
