import java.util.HashMap;
import java.util.Map;


public class Collections {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Dani", 10);
        studentGrades.put("Vini", 7);
        studentGrades.put("Pedro", 5);

        var grade = studentGrades.get("Vini");
        System.out.println(grade);

        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " " + value);
        }
     }
}
