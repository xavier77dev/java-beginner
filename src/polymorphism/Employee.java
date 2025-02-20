package polymorphism;

public class Employee extends Person {
    public double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
}
