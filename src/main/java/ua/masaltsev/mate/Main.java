package ua.masaltsev.mate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Oleksii", "Kyiv");
        System.out.println(student.getAddress());
        Gender.displayAll();
    }
}
