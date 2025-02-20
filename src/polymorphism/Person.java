package polymorphism;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showData() {
        System.out.println("Name: " + name + " - Age:" + age);
    }

    public void showData(String lastName) {
        System.out.println("First Name: " + lastName);
    }
}
