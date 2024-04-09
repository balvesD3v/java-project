package people;

public class PeopleTest {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setCpf("334.134.145-34");
        instructor.setName("John");
        instructor.printPersonData();
        instructor.setAge(33);
        System.out.println(instructor.printPersonData());

        Student student = new Student();
        student.setCpf("109.634.855-64");
        student.setName("Pedro");
        student.setAge(14);
        System.out.println(student.printPersonData());

    }
}
