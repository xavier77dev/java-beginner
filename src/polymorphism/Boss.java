package polymorphism;

public class Boss extends Person {
    private String cargo;


    public Boss(String name, int age, String cargo) {
        super(name, age);
        this.cargo = cargo;
    }
}
