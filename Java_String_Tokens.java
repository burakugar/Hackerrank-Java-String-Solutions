
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       if(s.trim().isEmpty()){
   System.out.println("0");
   System.out.println(s);
} else {
   String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
   System.out.println(splitString.length);
   for(String str: splitString) {
        System.out.println(str);
   }
}
}
}
