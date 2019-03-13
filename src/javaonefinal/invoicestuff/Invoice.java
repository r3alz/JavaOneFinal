package javaonefinal.invoicestuff;

import javaonefinal.people.CommissionEmployee;
import javaonefinal.people.Employee;
import javaonefinal.people.Person;

import java.util.ArrayList;

public class Invoice {
    Person customer;
    Employee employee;
    ArrayList<LineItem> lineitems;
    public static double TOTAL_COMMISSION_EARNED = 0;

    public Invoice() {
        this.customer = new Person();
        this.employee = new CommissionEmployee();
        this.lineitems = new ArrayList();
    }

    public Invoice(Person customer, Employee employee) {
        this();
        this.customer = customer;
        this.employee = employee;
    }

    public void addLineItem(LineItem object) {
        lineitems.add(object);
    }

    public void print() {
        double pretax = 0.0;
        double tax = 0.0825;
        double commission_earned = 0.0;
        System.out.println("Customer: " + customer.getName());
        System.out.println("Employee: " + employee.getName() + "    ID: " + employee.getId());
        System.out.println("");
        System.out.println("Line Items:");
        System.out.println("-----------");
        for (LineItem object: lineitems) {
            System.out.println(object.getId() + ": " + object.getDescription());
            System.out.println("Qty: " + object.getQty());
            System.out.println("Price Per: " + object.getPrice());
            System.out.println("");
            pretax += (object.getQty() * object.getPrice());
        }
        System.out.println("-----------");
        System.out.println("Pre-Tax: " + pretax);
        System.out.println("Tax: " + (tax * pretax));
        System.out.println("Total Due: " + pretax + (tax * pretax));
        System.out.println("");
        System.out.println("");
        if (employee instanceof CommissionEmployee) {
            commission_earned += (employee.getCommission() * pretax);
            TOTAL_COMMISSION_EARNED += commission_earned;
            System.out.println("Commission: " + commission_earned);
        }
    }

}
