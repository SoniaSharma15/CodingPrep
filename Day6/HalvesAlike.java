import java.util.Scanner;

class HalvesAlike {
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        }
        return false;
    }

    public static boolean halvesAreAlike(String s) {
        int len = s.length();
        int mid = len / 2;
        int count = 0;
        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i)))
                count++;
            if (isVowel(s.charAt(mid + i)))
                count--;
        }
        if (count == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter Input String :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input +" are halvesAlike :" +halvesAreAlike(input));
    }
}