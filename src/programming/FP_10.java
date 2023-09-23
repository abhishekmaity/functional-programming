package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(Integer reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore='" + reviewScore + '\'' +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}

public class FP_10 {
    public static void main(String[] args){
        List<Course> courses =
            List.of(
                    new Course("Spring", "Framework", 98, 20000),
                    new Course("Spring Boot", "Framework", 95, 18000),
                    new Course("API", "Microservices", 97, 22000),
                    new Course("Microservices", "Microservices", 96, 25000),
                    new Course("FullStack", "FullStack", 91, 14000),
                    new Course("AWS", "Cloud", 92, 21000),
                    new Course("Azure", "Cloud", 99, 21000),
                    new Course("Docker", "Cloud", 92, 20000),
                    new Course("Kubernetes", "Cloud", 91, 20000)
            );

        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));

        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        System.out.println(courses.stream().noneMatch(reviewScoreGreaterThan90Predicate));

        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
        System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
        System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));

        Comparator<Course> noOfStudentsByCoursesIncreasing =
                Comparator.comparingInt(Course::getNoOfStudents);

        List<Course> displayNoOfStudentsByCoursesIncreasing = courses.stream()
                .sorted(noOfStudentsByCoursesIncreasing)
                .collect(Collectors.toList());
        System.out.println(displayNoOfStudentsByCoursesIncreasing);

        Comparator<Course> noOfStudentsByCoursesDecreasing =
                Comparator.comparingInt(Course::getNoOfStudents).reversed();

        List<Course> displayNoOfStudentsByCoursesDecreasing = courses.stream()
                .sorted(noOfStudentsByCoursesDecreasing)
                .collect(Collectors.toList());
        System.out.println(displayNoOfStudentsByCoursesDecreasing);

        Comparator<Course> noOfStudentsByCoursesAndByReviews =
                Comparator.comparingInt(Course::getNoOfStudents).
                        thenComparingInt(Course::getReviewScore)
                        .reversed();

        List<Course> displayNoOfStudentsByCoursesAndReviews = courses.stream()
                .sorted(noOfStudentsByCoursesAndByReviews)
                .skip(3)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(displayNoOfStudentsByCoursesAndReviews);

        System.out.println(
        courses.stream()
                .takeWhile(course->course.getReviewScore()>=95)
                .collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .dropWhile(course->course.getReviewScore()>=95)
                        .collect(Collectors.toList()));
    }
}
