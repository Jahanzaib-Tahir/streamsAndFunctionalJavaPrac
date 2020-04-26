package streams;

import data.Student;
import data.StudentData;

import java.util.Optional;

public class StreamsFindAnyAndFindFirstExample {

    public static Optional<Student> findAny()
    {
        return StudentData.getAllStudents().stream().filter(student
                                                            -> student.getGpa()>=3.7).findAny();
    }


    public static Optional<Student> findFirst()
    {
        return StudentData.getAllStudents().stream().filter(student
                -> student.getGpa()>=3.7).findFirst();
    }


    /**
     * filter with false condition*/
    public static Optional<Student> find()
    {
        return StudentData.getAllStudents().stream().filter(student
                -> student.getGpa()>=4.1).findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> student = findAny();
        Optional<Student> studentFindFirst = findFirst();
        Optional<Student> studentFind = find();

        if(student.isPresent())
        {
            System.out.println("Student : "+student.get().getName()+" "+student.get().getGpa()+" "+ student.get().getActivities()+" "+student.get().getNoOfNoteBooks());
        }
        else {
            System.out.println("Student Not Found. ");
        }


        if(studentFindFirst.isPresent())
        {
            System.out.println("Student : "+studentFindFirst.get().getName()+" "+studentFindFirst.get().getGpa()+" "+ studentFindFirst.get().getActivities()+" "+studentFindFirst.get().getNoOfNoteBooks());
        }
        else {
            System.out.println("Student Not Found. ");
        }


        if(studentFind.isPresent())
        {
            System.out.println("Student : "+studentFind.get().getName()+" "+studentFind.get().getGpa()+" "+ studentFind.get().getActivities()+" "+studentFind.get().getNoOfNoteBooks());
        }
        else {
            System.out.println("Student Not Found. ");
        }




    }

}
