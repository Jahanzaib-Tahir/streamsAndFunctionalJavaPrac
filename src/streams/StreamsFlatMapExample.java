package streams;

import data.Student;
import data.StudentData;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    /**
     * This Method will return a list of list of string
     * e.g [[Bike,Riding],[Reading,Boxing]]  <-(List of List of Strings)
     * */
    public static List<List<String>> listOfActivities()
    {
     return StudentData.getAllStudents().stream().map(Student::getActivities).collect(Collectors.toList());
    }



    /**
     * This Method will return list of string As flat map is converting list of string to stream
     * e.g [Bike,Riding,Reading,Boxing]  <-(List of List of Strings)
     * */
    public static List<String> listOfActivitiesByUsingFlatMap()
    {
        return StudentData.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().collect(Collectors.toList());
    }


    /**
     * This Method will return Set of string "Distinguish Elements". As flat map is converting list of string to stream
     * e.g [Bike,Riding,Reading,Boxing]  <-(List of List of Strings)
     * */
    public static Set<String> SetsOfActivitiesByUsingFlatMap()
    {
        return StudentData.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toSet());
    }


    public static void main(String[] args) {
        System.out.printf("List of Activities : "+ listOfActivities());
        System.out.println();
        System.out.printf("List of Activities By Using FlatMap : "+ listOfActivitiesByUsingFlatMap());
        System.out.println();
        System.out.printf("Sets of Activities By Using FlatMap : "+ SetsOfActivitiesByUsingFlatMap());

    }

}
