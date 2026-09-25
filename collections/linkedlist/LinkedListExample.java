import java.util.LinkedList;
public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<String> students=new LinkedList<>();

        students.add("Surya");
        students.add("Tarun");
        students.add("Micheal");
        students.add("Richard");
        System.out.println(students);

        students.addFirst("Marcus");
        students.addLast("Ruther");
        System.out.println(students);

        System.out.println("get First"+students.getFirst());
        System.out.println("get Last"+students.getLast());

        students.removeLast();
        System.out.println(students);
        students.removeFirst();
        System.out.println(students);

    }
}