package ru.gb.meshch.hw9;

import java.util.List;
import java.util.stream.Collectors;

public class HomeWork9 {

  public static void main(String[] args) {
    List<Student> students = Data.getStudentsList(); // допилить класс Data, который будет содержать тестовые данные
    Course randomCourse = Data.getRandomCourse();
    System.out.println(uniqCoursesNames(students));
    System.out.println(inquisitiveStudents(students));
    System.out.println(getStudentsFromCourse(students, randomCourse));

  }

  interface Student {
    String getName();
    List<Course> getAllCourses();

  }
  interface Course {
  }


  public static List<Course> uniqCoursesNames(List<Student> students) {

      return students.stream()
              .flatMap(student -> student.getAllCourses().stream())
              .distinct()
              .collect(Collectors.toList());
    }

  public static List<Student> inquisitiveStudents (List<Student> students) {
    return students.stream()
            .sorted((s1, s2) -> (s2.getAllCourses().size()) - (s1.getAllCourses().size()))
            .limit(3)
            .collect(Collectors.toList());
  }

  public static List<Student> getStudentsFromCourse(List<Student> students, Course course) {
    System.out.println("Список студентов проходящих курс " + course);
    return students.stream()
            .filter(student -> student.getAllCourses().contains(course))
            .collect(Collectors.toList());
  }


}
