class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}


class Staff extends Person {
    protected int staffId;
    protected String department;

    public Staff(String name, int age, String address, int staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}


class Professor extends Staff {
    private String specialization;

    public Professor(String name, int age, String address, int staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}


class Student extends Person {
    protected int studentId;
    protected String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}


class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, int studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    public void submitThesis() {
        System.out.println(name + " has submitted a thesis on " + researchTopic + ".");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        
        Professor prof = new Professor("Dr. John", 45, "123 University St", 1001, "Computer Science", "Artificial Intelligence");
        GraduateStudent gradStudent = new GraduateStudent("Alice", 25, "456 College Rd", 2001, "MSc Physics", "Quantum Mechanics");

        
        Person[] people = { prof, gradStudent };

        System.out.println("=== University Management System ===\n");

        
        for (Person person : people) {
            person.displayDetails(); 
            System.out.println();

            
            if (person instanceof Professor) {
                ((Professor) person).conductLecture();
            } else if (person instanceof GraduateStudent) {
                ((GraduateStudent) person).submitThesis();
            }
            System.out.println("------------------------------\n");
}
}
}

