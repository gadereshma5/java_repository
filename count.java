package Package;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class count {
     String st;

 public static void main(String[] args) throws Exception    {
     
     File file = new File("E:\\Study Material\\numbers.txt");
        Scanner sc = new Scanner(file);
        String str = sc.nextLine();
        String[] str1 = str.split("");
        
        ArrayList <String> strlist1 = new ArrayList<String>();
        ArrayList <Integer> intlist2 = new ArrayList<Integer>();
         int count=0;
         
         for(int i=0; i< str.length(); i++)
         {
          
           if((i < str.length()-1) && str1[i].equals(str1[i+1]))
          {
           count++;
         
          }
           else
          {      
            if(count>0) {
            	strlist1.add(str1[i]);
            	intlist2.add(count);
           
            }
            count=0;
           }
           
         }
          
         //printing the  values
         for (int i=0; i < strlist1.size(); i++) 
         {
           System.out.println("Pair of "+strlist1.get(i) + " coming "+ intlist2.get(i) + " times");
         }
         
        
      }
      }

       