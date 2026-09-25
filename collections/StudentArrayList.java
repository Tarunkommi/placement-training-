import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList  {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Tarun");
        students.add("Surya");
        students.add("romeo");
        students.add("alex");
        System.out.println("original list:"+ students);
        students.add(2, "micheal");
        System.out.println("After adding element: "+students);
        students.remove("surya");
        System.out.println("After removing element: "+students);
        System.out.println("searching an element: "+students.contains("Surya"));
        Collections.sort(students);
        System.out.println("After sorting list: "+ students);
        students.clear();
        System.out.println("After clear all elements in list: "+students);
    }
}
