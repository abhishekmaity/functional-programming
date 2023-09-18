package programming;

import java.util.List;

public class FP_e_03 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .filter(course->course.contains("Spring"))
                .forEach(System.out::println);

    }
}
