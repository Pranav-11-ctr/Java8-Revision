package java8IntermediateOperationsExample;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {

    public static void main(String[] args) {

        //filter(Predicate<? super T> predicate)
        //Description: Filters the elements of the stream that match the given predicate.

        Stream<Integer> oddNum= Stream.of(1,2,3,4,5,6,7,8,9).filter(i-> i%2!=0);
        oddNum.forEach(System.out::println);

//        map(Function<? super T, ? extends R> mapper)
//        Description: Transforms each element of the stream by applying a function to it, resulting in a stream of the new type.
        Stream<String> nameInUpperCase=Stream.of("Pranav","Prabhat").map(name-> name.toUpperCase());
        nameInUpperCase.forEach(System.out::println);

//        distinct()
//        Description: Removes duplicate elements from the stream.
        Stream<Integer> uniqueNum=Stream.of(1,2,1,4,5,5,7,8,1).distinct();
        uniqueNum.forEach(System.out::println);

//        sorted()
//        Description: Sorts the elements of the stream in natural order or according to a custom comparator.

        Stream<String> namesInSortedOrder=Stream.of("John", "Jane", "Jack").sorted();
        namesInSortedOrder.forEach(System.out::println);

        System.out.println("With Comparator");

        //With Comparator
        Stream<String> sortedNameInRevOrder=Stream.of("John", "Jane", "Jack").sorted(Comparator.reverseOrder());
        sortedNameInRevOrder.forEach(System.out::println);

        //Peek()
        //This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline“
        Stream.of("One","Two","Three","Four").filter(st->st.length()>3).peek(s-> System.out.println("After Filter "+s)).map(st-> st.toUpperCase()).peek(s-> System.out.println("After UpperCase "+s)).collect(Collectors.toList());


//        limit(long maxSize)
//        Description: Truncates the stream to be no longer than the given number of elements.
        Stream.of(1,2,3,4,5,6,7,78,67).limit(3).forEach(System.out::println);

//        skip(long n)
//        Description: Skips the first n elements of the stream.
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> skippedNumbers = numbers.skip(2);
        skippedNumbers.forEach(System.out::println);// Skips the first 2 elements







    }
}
