package library;

public class Member {
    private String firstName;
    protected String password;
    private String lastName;
    private String dni;

    public Member() {
    }

    public Member(String firstName,String password, String lastName, String dni) {
        this.firstName = firstName;
        this.password = password;
        this.lastName = lastName;
        this.dni = dni;
    }

    public String getFirstName () {
       return this.firstName;
    }
    public String getSecondName () {
        return this.lastName;
    }
    public String getDni () {
        return this.dni;
    }

    public void setFirstName(String name) {
       this.firstName = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
