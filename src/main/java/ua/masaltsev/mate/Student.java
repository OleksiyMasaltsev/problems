package ua.masaltsev.mate;

public class Student extends Person {

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String getAddress() {
        return "student " + super.getAddress() + ": " + this.getName();
    }
}
