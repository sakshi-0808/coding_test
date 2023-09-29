//WAP to find sum of 10 integers and print the sum with a proper SOP statement using for loop.


import java.util.Scanner;

public class SumOfTenNumbers {

public static void main(String[] args) {
//scanner object to take input from user
Scanner sc = new Scanner(System.in);
		
System.out.println("Enter 10 integer numbers:");
int sum = 0;
		
//for loop to take 10 inputs from the user and add the number
//in the variable sum
for(int i=1;i<=10;i++)
{
int num = sc.nextInt();
sum += num;
}
		
//printing the sum of all ten numbers
System.out.println("Sum of ten numbers: "+sum);
		
//closing the scanner
sc.close();

}

}