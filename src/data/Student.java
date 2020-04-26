package data;


import java.util.List;

public class Student {

    private int id;
    private String name;
    private double gpa;
    List<String> activities;
    private int noOfNoteBooks;

    public Student(int id, String name, double gpa, List<String> activities) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.activities = activities;
    }

    public Student(int id, String name, double gpa, List<String> activities, int noOfNoteBooks) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.activities = activities;
        this.noOfNoteBooks = noOfNoteBooks;
    }

    public int getNoOfNoteBooks() {
        return noOfNoteBooks;
    }

    public void setNoOfNoteBooks(int noOfNoteBooks) {
        this.noOfNoteBooks = noOfNoteBooks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
}
