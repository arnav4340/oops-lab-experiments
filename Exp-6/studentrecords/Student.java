package studentrecords;

public class Student{
    private String studentID;
    private String name;
    private String grade;
    
    public Student(String studentID, String name, String grade){
        this.studentID=studentID;
        this.name=name;
        this.grade=grade;
    }

    public void displayStudentInfo(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+name);
        System.out.println("Grade: "+grade);
    }

};