
import java.util.*;
 
public class Bucket{
 
   public static void sort(int[] a, int maxVal) {
      int [] bucket=new int[maxVal+1];
 
      for (int i=0; i<bucket.length; i++) {
         bucket[i]=0;
      }
 
      for (int i=0; i<a.length; i++) {
         bucket[a[i]]++;
      }
 
      int outPos=0;
      for (int i=0; i<bucket.length; i++) {
         for (int j=0; j<bucket[i]; j++) {
            a[outPos++]=i;
         }
      }
   }
 
 
   public static void main(String[] args) {
      int maxVal=89;
      int [] data= {79,13,16,64,39,20,89,53,71,42}; 
 
      System.out.println("Before: " + Arrays.toString(data));
      sort(data,maxVal);
      System.out.println("After:  " + Arrays.toString(data));
   }
}