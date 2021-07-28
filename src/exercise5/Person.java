package exercise5;

public class Person {
    private String name;
    private int age;
    private Address personAddress;

    public Person(String name, int age, Address personAddress) {
        this.name = name;
        this.age = age;
        this.personAddress = personAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return personAddress;
    }

    public void setAddress(Address personAddress) {
        this.personAddress = personAddress;
    }
}
