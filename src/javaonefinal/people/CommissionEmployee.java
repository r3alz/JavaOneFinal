package javaonefinal.people;

public class CommissionEmployee extends Employee {
    public static final double STARTING_RATE = 2.5;
    public static final double STARTING_COMMISSION = 0.1;
    double baserate;
    double commission;
    int id;
    int storeid;
    String name;
    int age;

    public CommissionEmployee() {
        this.baserate = 2.5;
        this.commission = 0.1;
        this.id = 001;
        this.storeid = 1;
        this.name = "Ryan Vaz";
        this.age = 28;
    }

    public CommissionEmployee(double baserate, double commission, int id, int storeid, String name, int age) {
        this();
        this.baserate = baserate;
        this.commission = commission;
        this.id = id;
        this.storeid = storeid;
        this.name = name;
        this.age = age;
    }

    public CommissionEmployee(int id, int storeid, String name, int age) {
        this();
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
        return this.baserate;
    }

    @Override
    public double getCommission() {
        return this.commission;
    }

}
