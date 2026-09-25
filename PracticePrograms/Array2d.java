public class Array2d {
    public static void main(String[] args) {
        int [][]nums={{1,2,3},{4,5,61}};
        for(int i=0;i<nums.length;i++){       //Normal for loop 
            for(int j : nums[i]){         // advanced for loop
                System.out.println(j);
            }
        }
    }
}
