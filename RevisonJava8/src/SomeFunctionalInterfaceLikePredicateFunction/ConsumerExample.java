package SomeFunctionalInterfaceLikePredicateFunction;

import java.util.function.Consumer;

public class ConsumerExample {
    //take input but no return type
    public static void main(String[] args) {

        Consumer<String> ex1=s-> System.out.println(s.toUpperCase());

        ex1.accept("pranav");

    }
}
