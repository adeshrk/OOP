import java.util.Arrays;

/**
 * Created by Adesh on 17-06-2019
 */

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= new int[]{0, 1, 2, 3, 4, 5};
        System.out.println("Array when not reverced "+ Arrays.toString(arr));
        reverse(arr);
    }

    private static void reverse(int[] arr){

        int[] tempr=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            tempr[j]=arr[i];
            j++;
        }
        System.out.println("Array when reverced "+Arrays.toString(tempr));
    }
}
