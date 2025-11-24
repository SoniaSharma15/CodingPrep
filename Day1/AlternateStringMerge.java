import java.util.*;
public class AlternateStringMerge {
	public static void main(String[] args) {
	//	 write your code here
		String word1= new String();
		String word2=new String();
		StringBuilder res=new StringBuilder();
	//	provide first word in input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First word:");
		word1=sc.next();
		System.out.print("Enter Second word:");
		word2=sc.next();

      int l1=word1.length();
	  int l2=word2.length();
	  int i=0,j=0;
	  while(l1>i && l2>j){
        if(l1>i){
         res.append(word1.charAt(i));
		 i++;
		}
		if(l2>j)
		{
         res.append(word2.charAt(j));
		 j++;
		}
	  }
		while(j<l2){
			res.append(word2.charAt(j));
			j++;
	  }
	  while(i<l1){
		res.append(word1.charAt(i));
		i++;
	  }
System.out.println(res);
	sc.close();
	}
}
