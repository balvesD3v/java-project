package exepctions;

import people.People;

public class Exepctions {
    public static void main(String[] args) throws Exception {

        // try {
        // validateNumber();

        // } catch (Exception e) {
        // System.out.println("Deu maike");
        // e.printStackTrace();
        // }

        People p = null;
        p.getAge();
    }

    public static void validateNumber() throws Exception {
        int number = 10;

        if (number < 100) {
            throw new Exception("Number must be greater than");
        }
    }
}
