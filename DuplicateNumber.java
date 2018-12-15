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
public class DuplicateNumber {
    
    public static void main(String[] arg){
        int[] a = {2,5,62,3,2,5,4};
        
        for (int i = 0; i <a.length; i++){
            for (int j = i + 1; j <a.length; j++){
                if (a[i]== a[j]){
                    System.out.printf("Duplicate numbers are : %d ", a[i]);
                    System.out.println("");
                }
            }
        }
    }   
}
