package firstClasses;
import java.util.ArrayList;
import java.util.List;

public class DataStructure {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Luiz");
        nomes.add("Manu");

        // for (String nome : nomes) {
        // System.out.println(nome);
        // }
    
        nomes.forEach(nome -> System.out.println(nome));
    }
}
