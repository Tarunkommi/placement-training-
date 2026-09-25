public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("java");

        sb.append(" Full stact Development");
        System.out.println("After append: " + sb);

        sb.insert(6, "World ");
        System.out.println("After insert: " + sb);

        sb.replace(6, 12, "Programming");
        System.out.println("After replace: " + sb);

        sb.delete(6, 18);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());

        System.out.println("Capacity: " + sb.capacity());
    }
}