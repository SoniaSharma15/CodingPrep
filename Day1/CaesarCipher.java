 import java.util.*;

class CaesarCipher{
    public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
//         // output string variable
        StringBuilder res = new StringBuilder();
//         // Enter Input
        System.out.print("Enter Input String:");
        String s = sc.nextLine();
//         // Enter Key
        System.out.print("Enter Key:");
        int key = sc.nextInt();

//         // if key is INvalid
        if (key < 0 || key > 25) {
            System.out.print("Invalid Key");
            sc.close();
            return;
        }
          for (char c : s.toCharArray()) {
            if(c>='0' && c<='9'){
             char newChar = (char) ('0' + (c - '0' + key) % 10);
                                        res.append(newChar);

            }
            else if(c>='a' && c<='z'){
             char newChar = (char) ('a' + (c - 'a' + key) % 26);
                                        res.append(newChar);

            }
            else if(c>='A' && c<='Z'){
             char newChar = (char) ('A' + (c - 'A' + key) % 26);
                           res.append(newChar);

            }
            else{
              res.append(c);
        }
}
System.out.println(res);
        sc.close();
    }
}


// ch-'0' ==> converted char to int
// ch+'0' ==> converted int to char



// class CaesarCipher {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // output string variable
//         StringBuilder res = new StringBuilder();
//         // Enter Input
//         System.out.print("Enter Input String:");
//         String s = sc.nextLine();
//         // Enter Key
//         System.out.print("Enter Key:");
//         int key = sc.nextInt();

//         // if key is INvalid
//         if (key < 0 || key > 25) {
//             System.out.print("Invalid Key");
//             sc.close();
//             return;
//         }
//         for (char c : s.toCharArray()) {
//             // finding ascii value
//             int ascii = (int) c;
//             // checking for the character is digit
//             int shifted = ascii + key;

//             if (Character.isDigit(c)) {
//                 key %= 9;
//                 char result = (char) (shifted);
//                 if (key + ascii > (int) '9') {
//                     result = (char) (key + ascii - 10);
//                 }
//                 res.append(result);

//             } else if (Character.isLetter(c)) {
//                 char result = (char) (shifted);
//                 if (Character.isUpperCase(c)) {
//                     if (shifted > 'Z')
//                         shifted -= 26;
//                     result = (char) shifted;
//                 } else if (Character.isLowerCase(c)) {
//                     if (shifted > 'z')
//                         shifted -= 26;
//                     result = (char) shifted;
//                 }
//                 res.append(result);
//             } else {

//                 res.append(c);
//             }
//         }
//         System.out.println("Result is :" + res);
//         sc.close();
//     }
// }