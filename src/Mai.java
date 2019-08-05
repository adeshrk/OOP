import java.util.Arrays;
import java.util.Scanner;

public class Mai{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of elements ");
        int count = sc.nextInt();
        int[] inarr=readInteger(count);
        System.out.println("Entered array is -> "+ Arrays.toString(inarr));
        System.out.println("Smallest element in the Entered array is -> "+findMin(inarr));

    }

    private static int[] readInteger(int count){
        int[] arr=new int[count];
        System.out.println("Enter "+count+" Array elements\r");

        for(int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] inarr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<inarr.length;i++){
            if(min>inarr[i]){
                min=inarr[i];
            }
        }
        return min;

    }


}


