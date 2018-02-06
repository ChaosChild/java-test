package fides;

import java.text.DecimalFormat;
import java.util.Comparator;


public class Department implements Comparable<Department>{


    private String name;
    private double amount;
    private String newLine = System.getProperty("line.separator");
    private String delimiter = ",";

    public Department() {
        this("", 0.0);
    }

    public Department(String name) {
        this(name, 0.0);
    }

    public Department(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public Department SetName(String name) {
        this.name = name;
        return this;
    }

    public Department SetAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return name +delimiter +  df.format( amount)+ newLine;
    }

    @Override
    public int compareTo(Department o) {
        Double amount = o.getAmount();
        return Double.compare(this.amount,amount);
    }
    public static Comparator<Department> departmentComparator = new Comparator<Department>() {

        public int compare(Department department1, Department department2) {
            String departmentName1 = department1.getName().toLowerCase();
            String departmentName2 = department2.getName().toLowerCase();

            return departmentName1.compareTo(departmentName2);

        }};

}

