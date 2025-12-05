import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1)
            return "1";

        String prev = countAndSay(n - 1);
        int len = prev.length();
        StringBuilder ans = new StringBuilder(); // use StringBuilder
        int count = 1;

        for (int i = 1; i < len; i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                ans.append(count);              // add frequency
                ans.append(prev.charAt(i - 1)); // add digitgit 
                count = 1;
            }
        }

        // handle the last group
        ans.append(count);
        ans.append(prev.charAt(len - 1));

        return ans.toString();
    }
public static void main(String[] args) {
            System.out.print("Enter Input Number :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(countAndSay(input));
 
}
}
