package people;

public class PeopleTest {
    public static void main(String[] args) {
        People people = new People();

        people.cpf = "334.134.145-34";
        people.name = "John";
        people.age = 33;
        

        System.out.println(people.printPersonData(17381));
    }
}
