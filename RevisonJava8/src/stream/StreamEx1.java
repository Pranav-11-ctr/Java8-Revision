package stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.stream.Stream;

class Person
{
    String name;
    double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return "Person{name='" + name + "', salary=" + salary + "}";
    }
}
public class StreamEx1 {

    public static void main(String[] args) {
         //1.Creating a stream
        //2.intermediate operation filter
        Stream<Person> listOfPerson=Stream.of(new Person("Pranav",10000),new Person("Prabhat",11000),new Person("Kishan",11100),new Person("Murari",100)).filter(person-> person.salary>10000);
        listOfPerson.forEach(person -> System.out.println(person.name));

        //Creating a stream
        //intermediate operation map
        Stream<String> personNameWithUpperLetter=Stream.of(new Person("Keshav",200),new Person("Subham",1200),new Person("Rohit",600),new Person("Rahul",500)).filter(person-> person.salary>500).map(person-> person.name.toUpperCase());
        personNameWithUpperLetter.forEach(System.out::println);

        Stream<Person> personNameWithUpperLetter1=Stream.of(new Person("Keshav",200),new Person("Subham",1200),new Person("Rohit",600),new Person("Rahul",500)).filter(person-> person.salary>500).map(person-> new Person(person.name.toUpperCase(),person.salary) );
        personNameWithUpperLetter1.forEach(person-> System.out.println(person.name));

    }


}
