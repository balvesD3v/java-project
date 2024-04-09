package people;

public class Student extends People {
    private String registration;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    String printPersonData() {
        System.out.println(super.printPersonData());
        return "You are Student your name is " + this.getName();
    }
}
