package programming;

import java.util.List;

public class FP_e_06 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .map(course->course.length())
                .forEach(System.out::println);

    }
}
