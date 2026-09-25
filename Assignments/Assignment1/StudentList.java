// Concept: ArrayList 
// Create a program to manage students in a class. Each student has a name, age, branch, and marks.

// Operations to implement: 
// 1 Add 5 students 
// 2 Display all students 
// 3 Add a new student 
// 4 Remove a student by name 
// 5 Search for a student 
// 6 Update a student's marks 
// 7 Display the student with the highest marks

package Assignments.Assignment1;
import java.util.ArrayList;
class Student {
    String name;
    int age;
    String branch;
    int marks;
    Student(String name, int age, String branch, int marks){
        this.name=name;
        this.age=age;
        this.branch=branch;
        this.marks=marks;
    }
    void display(){
        System.out.println("[Name: "+name+" Age: "+age+" Branch:"+branch+" Marks: "+marks+"]");
    }
}
public class StudentList{
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        // Create a Student object for Tarun and add that object to the students ArrayList
        students.add(new Student("Tarun",20,"CSE-AI",80));
        students.add(new Student("Ramu",19,"CSE",93));
        students.add(new Student("Shiva",21,"CSE-DS",86));
        students.add(new Student("Saraswathi",20,"CSE-AI",96));
        students.add(new Student("Sita",19,"ECE",98));
        System.out.println("Student Details:");
        for (Student s : students){  // creating object for every student in ArrayList
            s.display();
        }
        students.add(new Student("Lakshmi",18,"CSE",99));
        System.out.println("After Adding new Student:");
        for (Student s : students){  // creating object for every student in ArrayList
            s.display();
        }
        students.remove(2);
         System.out.println("After removing a Student:");
        for (Student s : students){  // creating object for every student in ArrayList
            s.display();
        }
        System.out.println("Searching student Sita:");
        for (Student s : students){  // creating object for every student in ArrayList
            if(s.name.equalsIgnoreCase("Sita"))
                s.display();
        }

        // Updating Student marks for my name ----Tarun----
        String name="Tarun";
        int marks=82;
        for (Student s : students){  // creating object for every student in ArrayList
            if(s.name.equalsIgnoreCase(name))
                s.marks=marks;
        }
        //searching for higest marks student detais
        int max_marks=0;
        String max_student="";
        for (Student s : students){  
            if(s.marks > max_marks){
                max_marks=s.marks;
                max_student=s.name;
            }

        }
        System.out.println("Maximum marks got Student "+max_student);
    }
}