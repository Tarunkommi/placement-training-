import java.util.*;
class ValidateMarks{
    String performance(int marks){
        if (marks>90){
            return "5star";
        }
        else if (marks>80){
            return "4star";
        }
        else if (marks>70){
            return "3star";
        }
        else if (marks>50){
            return "Average";
        }
        return "fail";
    }
}
public class Marks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); 

        int marks = s.nextInt();

        ValidateMarks ob = new ValidateMarks();
        System.out.println("Student performance: " + ob.performance(marks));

        s.close();
    }
}
