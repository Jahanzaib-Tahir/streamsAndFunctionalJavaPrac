package streams;

import data.Student;
import data.StudentData;

public class StreamsMapReduceFilterExample {

    public static int getNoOfNotebooks()
    {
      return  StudentData.getAllStudents().stream().map(Student::getNoOfNoteBooks).reduce(0,(student1NoteBooks, student2NoteBooks)->
                                                                                            student1NoteBooks+student2NoteBooks);
    }

    /**
     * Same Method as above but using Integer  instead of Lamda for Addition
     * */
    public static int getNoOfNotebooksByIntegerClass()
    {
        return  StudentData.getAllStudents().stream().map(Student::getNoOfNoteBooks).reduce(0,Integer::sum);
    }

    /**
     * Same Method as above but using Integer  instead of Lamda for Addition
     * */
    public static int getNoOfNotebooksByApplyingFilter()
    {
        return  StudentData.getAllStudents().stream().filter(student -> student.getGpa()>=3.7)
                .map(Student::getNoOfNoteBooks).reduce(0,Integer::sum);
    }


    public static void main(String[] args) {

        System.out.println("Total # of NoteBooks "+ getNoOfNotebooks());
        System.out.println("Total # of NoteBooks (Integer Class) " + getNoOfNotebooksByIntegerClass());
        System.out.println("Total # of NoteBooks (Filter Applied) " + getNoOfNotebooksByApplyingFilter());

    }
}
