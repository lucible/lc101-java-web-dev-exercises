package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // constructors
    public Student(String aName, int aStudentID, int aNumberOfCredits, double aGpa) {
        this.name = aName;
        this.studentId = aStudentID;
        this.numberOfCredits = aNumberOfCredits;
        this.gpa = aGpa;
    }

    public Student(String aName, int aStudentID) {
        this(aName, aStudentID, 0, 0);
    }

    // getter & setter for name
    public String getName() {
        return name;
    }

    private void setName(String aName) {
        name = aName;
    }

    // getter & setter for id
    public int getStudentId() {
        return studentId;
    }

    private void setStudentID(int aID) {
        studentId = aID;
    }

    // getter & setter for credits
    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    // getter & setter for gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}