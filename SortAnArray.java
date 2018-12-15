/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewexample;

import java.util.Arrays;

/**
 *
 * @author SKB
 */
public class SortAnArray {
    public static void main (String[] args){ 
        int[] a = { 7, 24, 62, 4, 16, 3, 50};
        int n = a.length;
        
    //sortItForSerialArray(a,n);
    sortByJavaLibrary(a,n);
    
    }
    
    
    
    
    
    
    // function for sort array 
    static void sortItForSerialArray(int []a, int n) 
    { 
        for (int i = 0; i < n; i++)  
        { 
            a[i]=i+1;  
        } 
          for (int i = 0; i < n; i++) 
            System.out.print(a[i]+" "); 
            System.out.println(""); 
    }

    private static void sortByJavaLibrary(int[] a, int n) {
        
        Arrays.sort(a);
        for (int i = 0; i < n; i++) 
            System.out.print(a[i]+" "); 
            System.out.println(""); 
        
    }
}
