package data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentData {



    private static Supplier<Student> getOne = ()-> {
    return new Student(1,"Ahmed",3.4, Arrays.asList("Bike Riding","Swimming"));

    };

    public  static List<Student> getAllStudents()
    {
        Student student = new Student(1,"Ahmed",3.4, Arrays.asList("Bike Riding","Swimming"),15);
        Student student1 = new Student(2,"Bilal",3.0, Arrays.asList("Gaming","Pool","Reading"),5);
        Student student2 = new Student(3,"Osama",3.9, Arrays.asList("Boxing","Driving"),7);
        Student student3 = new Student(4,"John",3.5, Arrays.asList("Driving","Swimming","Badminton"),13);
        Student student4 = new Student(1,"Adams",3.95, Arrays.asList("Bike Riding","Swimming","Movies"),3);
        List<Student> studentList = Arrays.asList(student,student1,student2,student3,student4);

        return studentList;
    }



}
