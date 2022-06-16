package com.Challenge;

import java.util.Scanner;

/*
 * 2. write a program to sum the numerals in the given number - for e.g. 1278 is 
 * input then output is 18 which is the sum of digits.
 */
public class SumDigits {
	public static void main(String[] args) {

		int num=12345678;
		int sumOfDigits = 0;
		
		/*Scanner numDigits = new Scanner(System.in);
		System.out.println("enter the number :");
		num = numDigits.nextInt();
				
//using while loop		
		while (num != 0) {

			sumOfDigits = sumOfDigits + num % 10;
			num = num / 10;
		}*/		
		
//using for loop		
		/*for( num=num ;num>0;) {
			sumOfDigits=sumOfDigits+num%10;
			num=num/10;
		}*/	
		
//using do-while loop		
	do {
			sumOfDigits = sumOfDigits + num % 10;
			num = num / 10;
		} while (num > 0);

		System.out.println("sum of the digits :" + sumOfDigits);
	}

}






/*
 First iteration:
 num=1234
 sumOfDigit=sumOfDigits%10 //4
 num=num/10 //123
 
 Second iteraion
 num=123
  sumOfDigit=sumOfDigits%10 //4+3
   num=num/10 //12
   
  Thirditeraion
 num=12
  sumOfDigit=sumOfDigits%10 //4+3+2
   num=num/10 //1
   
    Fourth iteraion
 num=1
  sumOfDigit=sumOfDigits%10 //4+3+2+3
   num=num/10 //0
   
    Fifth iteraion
 num=0
  sumOfDigit=sumOfDigits%10 //4+3+2+1
   num=num/10
*/
