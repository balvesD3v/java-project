package people;

public class People {
    private String name;
    private int age;
    private String cpf;

    public int getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    String printPersonData() {
        return "I'M A PERSON";
    }
}
