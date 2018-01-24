public class Department {
    public String name;
    public double amount;

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
}
