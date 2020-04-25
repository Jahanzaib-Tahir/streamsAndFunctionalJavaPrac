package streams;

import data.Student;
import data.StudentData;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsMapsExample {


    public static List<String> nameList()
    {
       return StudentData.getAllStudents().stream()
               //Get All Students as Input and give Student Names as Output
               .map(Student::getName)
               .map(String::toUpperCase)
               .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        Predicate<String> studentPredicate =  (student -> student.equals("Osama") || student.equals("OSAMA"));

        System.out.println(nameList());

        // after applying filer

        System.out.println(nameList().stream().filter(studentPredicate).findFirst().orElse(null));

    }

}
