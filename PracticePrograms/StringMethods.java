import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java Programming ";
        System.out.println("Original:"+str);
        System.out.println("Length:"+str.length());
        System.out.println("Character at index 2:"+str.charAt(2));
        System.out.println("UpperCase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("check string with equals:"+str.equals("JAVA PROGRAMMING"));
        System.out.println("check string with equalsIgnorecase:"+str.equalsIgnoreCase("java programming"));
        System.out.println("conatins java:"+str.contains("Java"));
        System.out.println("Starts with J:"+str.startsWith("J"));
        System.out.println("Ends with ing:"+str.endsWith("ing"));
        System.out.println("Substring:"+str.substring(5,10));
        System.out.println("Index of Pro:"+str.indexOf("Pro"));
        System.out.println("Last index of a:"+str.lastIndexOf("a"));
        System.out.println("replace programming:"+str.replace("Programming","Full Stack Development"));
        System.out.println("trim string:"+str.trim());
        System.out.println("split string:"+Arrays.toString(str.split(",", 1)));

    }
}
