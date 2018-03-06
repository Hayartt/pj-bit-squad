
package javaapplication103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication103 {

    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      int t = in.nextInt();
      for(;t>0;t--){
      int n = in.nextInt();
      if (n==0) {System.out.println("0");
      continue;
      }
      if (n==1) {System.out.println("1");
      in.nextInt();
      continue;
      }
      
      //System.out.println("here");
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
      arr[i]= in.nextInt();
      }
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      int answer =0;
      int possibleAnswer=0;
      List<Integer> list = new ArrayList<>();
      for(int i=0 ;i <n-1;i++){
      if((arr[i+1]-arr[i])!=1){
         System.out.println(i+1);
         list.add(i+1);
      }
      }
      if (list.size()==0){
           System.out.println(n);
           continue;
      } 
      answer = list.get(0)-0;
      possibleAnswer = n-list.get(list.size()-1);
      if (possibleAnswer<answer)answer=possibleAnswer;
      for(int i=0;i<list.size()-1;i++){
      possibleAnswer = list.get(i+1)-list.get(i);
      if (possibleAnswer<answer)answer=possibleAnswer;
      }
         
          System.out.println(answer);
      }
    }
    
}
