// There are 2 positive integers a and b such that they have a sum of s and the bitwise XOR of the numbers is x. How many possible values exist for the ordered pair (a, b)?

// Input Format

// The first line of the input contains s and x, the sum and bitwise xor of the pair of positive integers, respectively.

// Constraints

// (2 ≤ s ≤ 1e12) where 1eN stands for Nth power of 10

// (0 ≤ x ≤ 1e12) where 1eN stands for Nth power of 10

// Output Format

// Print a single integer, the number of solutions under the given conditions. If no solutions exist, then print 0.

// Sample Input 0

// 3 3
// 2

// Sample Input 1

// 9 5
// 4


import java.io.*;
import java.util.*;

public class Solution {
    
    public List<Pair<Long>> pairs(long s, long x) {
    List<Pair<Long>> pairs = new ArrayList<Pair<Long>>();
    for (long i = 0; i <= s / 2; i++) {
        long calc = (s - i) ^ i;
        if (calc == x) {
            pairs.add(new Pair<Long>(i, s - i));
            pairs.add(new Pair<Long>(s - i, i));
        }
    }
    return pairs;
}
    public static void main(String[] args)throws IOException {
        long count = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String in[] = input.readLine().split(" ");
        long a = Long.parseLong(in[0]);
        long b = Long.parseLong(in[1]);
        
    List<Pair<Long>> pairs = new Solution().pairs(a,b);
        count = 0;
    for (Pair<Long> p : pairs) {
        count++;
        //System.out.println(p);
    }
        if(a == b)
        {
            count /= 2;
        }
        System.out.println(count);
}
    }
class Pair<T> {
    T a;
    T b;

    public String toString() {
        return a.toString() + "," + b.toString();
    }

    public Pair(T a, T b) {
        this.a = a;
        this.b = b;
    }
}