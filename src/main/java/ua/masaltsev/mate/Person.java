package ua.masaltsev.mate;

public abstract class Person {
    private String name = "no name";
    private String address = "no address";

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return "address is " + address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
