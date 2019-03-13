package javaonefinal.people;

public class Person {
    int age;
    String name;

    public Person() {
        this.age = 28;
        this.name = "Chris Ortiz";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
