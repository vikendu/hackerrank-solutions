import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int size = Integer.parseInt(input.readLine());
        
        String in_arr[] = input.readLine().split(" ");
        int arr[] = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            arr[i] = Integer.parseInt(in_arr[i]);
            
        }
        
        Arrays.sort(arr);
        
        long miles = 0;
        for (int i = 0; i < size; i++) 
        {
            miles += (int)Math.pow(2, i) * arr[size - i - 1];
        }
        System.out.println(""+miles);
        
    }
}
