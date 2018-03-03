import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sherlockAndAnagrams(String s){
        int totalAnagrams = 0;
        for(int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++){
                for(int k = i + 1; k + (j - i) < s.length(); k++){
                    int l = k + (j - i);
                    if(areAnagrams(s.substring(i, j + 1), s.substring(k, l + 1))) 
                        totalAnagrams++;
                }
            }
        }
        return totalAnagrams;
    }

    static boolean areAnagrams(String s1, String s2){
        int[] occurrence = new int[26];
        if (s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            occurrence[s1.charAt(i) - 'a']++;
            occurrence[s2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < occurrence.length; i++){
            if(occurrence[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
    }
}
