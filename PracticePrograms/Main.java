class StudentDetails{
    String name;
    int age;
    String department;
    int energy;
    String mood;
    StudentDetails(String name, int age, String department, int energy, String mood){
        this.name = name;
        this.age = age;
        this.department = department;
        this.energy = energy; 
        this.mood=mood;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Energy: " + energy);
        if (energy < 3){
            System.out.println("Skip class today");
        }
        else{
            System.out.println("Attend class today");
        }
    }
    void study(){
        if (mood == "Tired"){
            System.out.println(name + "  tired to study.");
        }
        else if (mood == "ambiguous"){
            System.out.println(name + " take a break.");
        }
        else{
            System.out.println(name + " is studying.");
        }
    }
}
class SuperStudent extends StudentDetails{

    String superpower;
    String hobies;
    SuperStudent(String superpower, String hobies, String name, int age, String department, int energy, String mood){
        super(name, age, department, energy, mood);
        this.superpower = superpower;
        this.hobies = hobies;

    }
    void displayDetails(){
        System.out.println(name+ " Super Power: " + superpower + ", Hobbies: " + hobies);
    }
}
public class Main {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Surya", 20, "Computer Science",2, "Tired");
        StudentDetails student2 = new StudentDetails("Akash", 22, "Mechanical Engineering",8, "Energetic");
        SuperStudent student3 = new SuperStudent("NCC Cadet", "Reading", "tarun", 20, "Computer Science andEngineering", 5, "Ambiguous");
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        student1.study();
        student2.study();
        student3.study();
        student3.displayDetails();
    }
}
