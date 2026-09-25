public class Array{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum = 0;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // manipulate elements in array
        arr[1]=3;
        arr[2]=9;
        System.out.println("\nAfter updating array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum += arr[i];   //Running Sum
        }
        System.out.println("Sum of array elements"+sum);

        for(int i=0;i<arr.length;i++){
            if (max < arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if (min > arr[i]){
                min=arr[i];
            }
        }
        System.out.println("minimum element in array is:"+min);
        System.out.println("maximum element in array is:"+max);
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[arr.length-i-1];
        }
        System.out.println(" Resverse of array");
        for(int i=0;i<arr.length;i++){
            System.out.print(+temp[i]+" ");
        }


    }
    

}