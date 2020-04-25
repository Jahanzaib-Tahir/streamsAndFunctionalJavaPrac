package streams;

import data.Student;
import data.StudentData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceOperations {

    public static int performMultiplicationWithReduceOperation(List<Integer> integers)
    {
      return integers.stream().reduce(1,(a,b)->a*b);
    }

    /**
     * perform multiplication without identity in reduce operation
     *
     * @return*/
    public static Optional<Integer> performMultiplicationWithReduceOperationWithOutIdentity(List<Integer> integers)
    {
        return integers.stream().reduce((a,b)->a*b);
    }


    /**Get Student With Highest Gpa With Reduce Operation*/
    public static Optional<Student> getStudentWithHighestGpa()
    {
        return StudentData.getAllStudents().stream().reduce((student1,student2)-> (student1.getGpa() > student2.getGpa()) ? student1:student2);
    }






    public static void main(String[] args) {

        List<Integer> integerList  = Arrays.asList(1,3,5,7);
        List<Integer> integerList1  = new ArrayList<>();

        System.out.println(performMultiplicationWithReduceOperation(integerList));

        Optional<Integer> result = performMultiplicationWithReduceOperationWithOutIdentity(integerList);

        /**Optional with empty list*/
        Optional<Integer> result1 = performMultiplicationWithReduceOperationWithOutIdentity(integerList1);

        System.out.println(result.isPresent());
        System.out.println(result.isEmpty());
        System.out.println(result.get());

        if(result1.isPresent()) {
            System.out.println(result1.get());
        }
        else{
            System.out.println("List is Empty");
        }

        Optional<Student> studentWithHighestGpa =  getStudentWithHighestGpa();
        if(studentWithHighestGpa.isPresent())
        {
            System.out.println("Student with highest Gpa is " + studentWithHighestGpa.get().getName() + " " +studentWithHighestGpa.get().getGpa() +" "+ studentWithHighestGpa.get().getActivities());
        }


    }
}
