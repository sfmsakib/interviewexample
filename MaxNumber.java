/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewexample;

/**
 *
 * @author SKB
 */
public class MaxNumber {
     public static void main(String[] args){
    int[] a = { 7, 24, 62, 4, 16, 309, 50};
    int n = a.length;
    int max= 0;
    max = maxNumber(a,n);    
    printArray(max);
   }
     
     
         private static void printArray(int n) {
            System.out.printf("Max number : %d %n",n); 
            
    }


    private static int maxNumber(int[] a, int n) {
        int m = 0;
        for(int i = 0; i < n; i++){
            if(a[i]>m){
                m = a[i]; 
            }
        }
        return m;
    }
}
