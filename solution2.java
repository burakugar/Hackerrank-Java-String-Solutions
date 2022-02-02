import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        for(int i=0;i<A.length();i++){
            B= B+ A.charAt(i);
        }
        /* Enter your code here. Print output to STDOUT. */
        String nstr="";
        char ch;
       
      for (int i=0; i<B.length(); i++)
      {
        ch= B.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      
      if(nstr.compareTo(A)==0){
          System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
    }
