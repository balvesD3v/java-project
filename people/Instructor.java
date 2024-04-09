package people;

public class Instructor extends People {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String printPersonData() {
        System.out.println(super.printPersonData());
        return "You are Instructor your name is " + this.getName();
    }
}
