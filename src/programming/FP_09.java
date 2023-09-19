package programming;

import java.util.List;

public class FP_09 {
    @SuppressWarnings("unused")
    private static void print(String str){
        System.out.println(str);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot",
                "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .map(String::toUpperCase)
                .forEach(FP_09::print);
    }
}
