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
public class BubbleSort {
    
   public static void main(String[] args){
    int[] a = { 7, 24, 62, 4, 16, 3, 50};
    int n = a.length;

    bubbleSort(a,n);    
    printArray(a,n);
   }

    private static void bubbleSort(int[] a, int n) {

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }   
            }
        }
    }

    private static void printArray(int[] a, int n) {
         for (int i=0; i<n; ++i) 
            System.out.print(a[i]+" "); 
            System.out.println(); 
    }
}
