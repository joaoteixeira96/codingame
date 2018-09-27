import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of teratures to analyse
        if(n>0){
            int result = getNearestTemp(in,n);
            System.out.println(result);
        } else 
            System.out.println(0);
    }
    
    public static int getNearestTemp(Scanner in, int n){
        int t= 0;
        int nearest = Integer.MAX_VALUE;
         for (int i = 0; i < n ; i++) {
                t= in.nextInt(); // a terature expressed as an integer ranging from -273 to 5526
                nearest = (Math.abs(t) < Math.abs(nearest) || t == Math.abs(nearest)) ? t : nearest;
        }
        return nearest;
    }
}
