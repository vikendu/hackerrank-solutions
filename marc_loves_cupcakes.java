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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[1000];//999 index is calorie 1 and 0 index is calorie 1000
        int maxCalories = 0;
        
        //Sort the calories from largest to smallest
        for(int i=0; i < n; i++){
            calories[calories.length - in.nextInt()]++;
        }
        long miles = 0;
        long pow = 1;
        for(int i = 0; i < calories.length; i++)
        {
            for(int j = 0; j < calories[i]; j++)
            {
                miles += (calories.length - i) * pow;
                pow *= 2;
            }
        }
        
        System.out.println(miles);
    }
}
