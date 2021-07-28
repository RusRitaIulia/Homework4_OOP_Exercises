package exercise5;

import java.util.Collections;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Pop", 31, new Address("Constantin Brancusi", 27));
        Person person2 = new Person("Iliescu", 28, new Address("Mircea Eliade", 49));

        HashMap<Person, Integer> myHashMap = new HashMap<Person, Integer>();
        myHashMap.put(person1, 32);
        myHashMap.put(person2, 29);
        System.out.println("PERSON 1: ");
        System.out.println(myHashMap.get(person1));
        System.out.println("PERSON 2: ");
        System.out.println(myHashMap.get(person2));

    }
}
