package variables_and_datatypes;

import java.util.Scanner;

public class Conditions_Statement_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<=n;i++) {
            if (i % 2 == 0) {
                evensum += i;

//System.out.println("even:" + evensum);
            } else {
                oddsum += i;

                // System.out.println("odd:" + oddsum);
            }
        }
            System.out.println("even:" + evensum);
            System.out.println("odd:" + oddsum);

    }
}
