import java.util.Scanner;
public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int[] arr = new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter num"+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        for(int t:arr){
            System.out.print(t+", ");
        }
        System.out.println("\n\n--------------------\n");
        //sort array
        //Ex. int[] ex = {1,2,3,4,5};
        //result ex = {2,3,4,5,1};
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        //result below
        for(int t:arr){
            System.out.print(t+", ");
        }


    }
}
