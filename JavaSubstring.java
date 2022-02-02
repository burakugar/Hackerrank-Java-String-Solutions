import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String T = "";
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=start;i<S.length();i++){
            if (S.charAt(i)==S.charAt(start)){
                for(int j=start;j<end;j++){
                    T=T+S.charAt(j);
                }
                break;
            }
        }
        System.out.println(T);
    }
}
