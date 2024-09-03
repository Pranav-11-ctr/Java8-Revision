package SomeFunctionalInterfaceLikePredicateFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


//Predicate FunctionalInterface handles the scenarios where we accept a input parameter and return boolean parameter
public class PredicateInterfaceExample {
    public static void main(String[] args) {

        Predicate<Integer> isEven= (i) -> {return i%2==0;};

        Predicate<Integer> isEven1= (i) -> {return i%2==0;};

        System.out.println(isEven.test(30));


        List<Integer> list= Arrays.asList(10,20,31,78,79);

        List<Integer> collectOdd=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(collectOdd);

        List<Integer> collectEven1=list.stream().filter(isEven1).collect(Collectors.toList());
        System.out.println(collectEven1);



    }
}
