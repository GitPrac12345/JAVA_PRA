package loops;

import java.util.Scanner;

public class Loops_Assignments {
    public static void main(String[] args) {
       // revNumber(54321);
       // divisorsOfNumber(36);
       // pattern1(5);
        //pattern2();
        pattern3();
    }
   public static void revNumber(int N) {

       int rev = 0, rem = 0;
       while (N != 0) {
           rem = N % 10;
           rev = rev * 10 + rem;
           N = N / 10;
       }
       System.out.println(rev);
   }
    public static void divisorsOfNumber(int N){
        for(int i=1;i<=N;i++){
            int M=N%i;
            if(M==0){
                System.out.print(i+" ");
            }
        }
    }
    /*
     *
     ***
     *****
     *******
     */
    public static void pattern1(int N) {

        for (int i = 1; i <=N; i++) {
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2() {
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 4; k >= 1; k--) {
            for (int m = 1; m <= k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        int n=7;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                int val=4-Math.min(Math.min(i,j),Math.min(n-i-1,n-j-1));
                System.out.print(val);
            }
            System.out.println();
        }
    }

    }








