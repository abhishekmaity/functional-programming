package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP_e_11 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> courseLength = evenNumbers(courses);
        System.out.println(courseLength);

    }

    private static List<Integer> evenNumbers(List<String> courses) {
        return courses.stream()
                .map(x->x.length())
                .collect(Collectors.toList());
    }
}
