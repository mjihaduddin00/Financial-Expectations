import java.io.*;

/* 
Financial expectations

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        int n = Integer.parseInt(number);

        System.out.println("I will earn $" + n + " per hour");
    }
}
