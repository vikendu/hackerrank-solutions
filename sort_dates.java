import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(input.readLine());

        int day[] = new int[test];
        int mon[] = new int[test];
        int year[] = new int[test];

        for(int i = 0; i < test; i++)
        {
            String in[] = input.readLine().split(" ");

            day[i] = Integer.parseInt(in[0]);
            mon[i] = Integer.parseInt(in[1]);
            year[i] = Integer.parseInt(in[2]);

        } 

        int t1, t2, t3;
        int i = 0, j = 0;

        for(    ; i < test; i++)
        {
            for(j = 0; j < test; j++)
            {
                if(year[j] > year[i])
                {
                    t1 = year[j];
                    year[j] = year[i];
                    year[i] = t1;

                    t2 = mon[j];
                    mon[j] = mon[i];
                    mon[i] = t2;

                    t3 = day[j];
                    day[j] = day[i];
                    day[i] = t3;
                }

            }
        }
        for(i = 0; i < test; i++)
        {
            for(j = 0; j < test; j++)
            {
                if(mon[j] > mon[i] && year[i] == year[j])
                {
                    t1 = year[j];
                    year[j] = year[i];
                    year[i] = t1;

                    t2 = mon[j];
                    mon[j] = mon[i];
                    mon[i] = t2;

                    t3 = day[j];
                    day[j] = day[i];
                    day[i] = t3;
                }

            }
        }
        for (i = 0; i < test; i++)
         {
            for (j = 0; j < test; j++)
            {
                if (day[j] > day[i] && year[i] == year[j] && mon[i] == mon[j]) {
                    t1 = year[j];
                    year[j] = year[i];
                    year[i] = t1;

                    t2 = mon[j];
                    mon[j] = mon[i];
                    mon[i] = t2;

                    t3 = day[j];
                    day[j] = day[i];
                    day[i] = t3;
                }

            }
        }
        for(i = 0; i < test; i++)
        {
            System.out.println(day[i]+" "+mon[i]+" "+year[i]);
        }

    }
}

