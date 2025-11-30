import java.util.Scanner;

public class FurnishingCompany {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //enter input string
        System.out.print("Enter - Aqua(a) and black(b) :");
        String s=sc.next();
        //enter input value of l
        System.out.print("Enter Number of curtains in each box :");
        int l=sc.nextInt();
        //Final result
        int maxCount=0;
        //individual count for every set
        int count=0;
        //set managed
        int setCount=0;
        for(int right=0;right<s.length();right++){
          if(s.charAt(right)=='a'){
              count++;
            }
            setCount++;
            if(setCount==l){
                maxCount=Math.max(count,maxCount);
                setCount=0;
                count=0;
            }
        }

        System.out.println("Highest value of a :" + maxCount);
        sc.close();
    }
}
