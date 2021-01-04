import java.io.*;
import java.util.*;

class Solution{

    public static int fibonacci(int n){
        if (n==0) return 0;
        else if (n==1) return 1;
        
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        try {
        System.out.println("Please enter a number: ");
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
        } finally {
            sc.close();
        }
    }
}