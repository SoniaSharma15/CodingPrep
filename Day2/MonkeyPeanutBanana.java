import java.util.Scanner;
class MonkeyPeanutBanana{

  static int monkeyTree(int monkey,int ep,int eb,int b,int p){
      int bmonkey=b/eb;
      int pmonkey=p/ep;
  
      if(b%eb!=0 || p%ep!=0) {
          monkey-=1;
      }
      int leftMonkey=monkey-(bmonkey+pmonkey);
    return (leftMonkey<0?0:leftMonkey);
 }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Total Number of monkey :");
        int monkey=sc.nextInt();
        System.out.print("Total Number of Eatable bananas by single Monkey :");
        int eb=sc.nextInt();

        System.out.print("Total Number of Eatable Peanuts by single Monkey :");
        int ep=sc.nextInt();
        
        System.out.print("Total Number of  Banana :");
        int b=sc.nextInt();
        System.out.print("Total Number of  Peanuts :");
        int p=sc.nextInt();
        
       System.out.println("Monkey left are :" + monkeyTree(monkey,eb,ep,b,p));

       sc.close();
    }
}