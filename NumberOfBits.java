package interviewexample;

//@author SKB

import java.util.Scanner;

public class NumberOfBits{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your number : ");
    int a = sc.nextInt();
    int s = a;
    int b = 0;
    while (a > 0) {
      b++;
      a = a >> 1;
	}
    System.out.printf("bit needed to represent %d is %d %n",s,b);
  }
}

