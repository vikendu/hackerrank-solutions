// You are given an integer I in the following format : 
// You are given two integers P and Q. 
// Integer I can be obtained by appending Q instances of P together. 
// For example, if P = 619 and Q = 4, then I = 619619619619.

// Your task is, given P and Q find the sum of all the digits of I.
// That sounds too simple, so lets take it up a notch.
// Lets say the sum of all digits is S, then run the following pseudocode : 

// int SumOfDigits(S) :
// 	K <- Sum of Digits of S
//     if K is a single digit number, return K
//     else return SumOfDigits(K)
// INPUT
// Input consist of two numbers P and Q separated by a space.

// OUTPUT
// Print a single digit, the final digit when the numbers of I are continuously added.

// CONSTRAINTS
// 1 ≤ P ≤ 10100000 
// **1 ≤ Q ≤ **105 

// Sample Input 0

// 148 3
// Sample Output 0

// 3
import java.io.*;
import java.util.*;
import java.math.*;

class Solution {

    public static void main(String[] args)throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String in[] = input.readLine().split(" ");
        
        BigInteger pop = new BigInteger(in[0]);
        long q = Long.parseLong(in[1]);
        
        long sum = bigSum(pop) * q;
        
        System.out.println(sumOfDigits(sum));    
    }
    static long sumOfDigits(long n)
    {
        long k = n;
        //String digits = big.toString();
        long sum = 0;
        if(k < 10 && k >= 0)
        {
            return k;
        }
        else
        {   
        	while (n != 0) 
        	{ 
            	sum = sum + n % 10; 
            	n = n/10; 
       		}	
            
        
        return sumOfDigits(sum);
        }
    }
    static int bigSum(BigInteger bg)
    {
        BigInteger big = bg;
    	String digits = big.toString();
    	int sum = 0;

    for(int i = 0; i < digits.length(); i++) 
    {
   		int digit = (int) (digits.charAt(i) - '0');
    	sum = sum + digit;
	}

        return (sum);
}}
