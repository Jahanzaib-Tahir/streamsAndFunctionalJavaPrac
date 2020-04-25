package streams;

import data.Student;
import data.StudentData;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sortedByName()
    {

        return  StudentData.getAllStudents()
                .stream().sorted(Comparator.comparing(Student::getName))
                .collect(toList());

    }
    public static void main(String[] args) {

        for (Student student:sortedByName()) {
            System.out.println("Student  : " + student.getName() +" "+ student.getGpa()+" "+student.getActivities());

        }
    }

}
