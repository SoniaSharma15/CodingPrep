import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Element of array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> leader = new ArrayList<>();
        int max=arr[n-1];
        leader.add(max);
        for(int i=n-2;i>=0;i--){
              if(arr[i]>max){
                leader.add(arr[i]);
                max=Math.max(arr[i],max);
              }
        }
        //print arraylist elements
         Collections.reverse(leader);

        System.out.print("Leader Array : ");
        for (Integer e :leader) {
            System.out.print(e+" ");
        }
        sc.close();
    }
}