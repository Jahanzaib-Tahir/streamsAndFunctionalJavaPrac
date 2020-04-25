package streams;

import data.Student;
import data.StudentData;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {


    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGpa()>3.5);

     Map<String,List<String>> studentListMap =  StudentData.getAllStudents().stream().filter(studentPredicate)
             .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentListMap);


    }



}
