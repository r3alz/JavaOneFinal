package javaonefinal.people;

public class HourlyEmployee extends Employee {
    int id;
    int storeid;
    String name;
    int age;

    public HourlyEmployee() {
        this.id = 001;
        this.storeid = 1;
        this.name = "Martha Santillan";
        this.age = 26;
    }

    public HourlyEmployee(int id, int storeid, String name, int age) {
        this.id = id;
        this.storeid = storeid;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public double getBaseRate() {
        return 0;
    }

    @Override
    public double getCommission() {
        return 0;
    }
}
