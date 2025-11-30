import java.util.Scanner;

public class JumpGameCheck {
static boolean JumpGamePossible(int[] arr) {
    int maxReach = 0;
    for (int i = 0; i < arr.length; i++) {
        if (i > maxReach) return false; 
        // can't reach this index
        maxReach = Math.max(maxReach, i + arr[i]); // update farthest reach
    }
    return maxReach >= arr.length - 1;
}
    public static void main(String[] args) {
        System.out.print("Enter the size of an array :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of an array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Jumps upto end is possible :"+ JumpGamePossible(arr));
        sc.close();
    }
}
