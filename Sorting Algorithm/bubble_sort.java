import java.util.*;
public class bobble {
    public static void main(String[] args) {
        int []arr = {7,8,3,1,2};

        System.out.print("Original Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //bubble sort
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Original Array : ");
        for(int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
}
//O(n^2)