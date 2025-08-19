package variables_and_datatypes;

import java.util.Scanner;

public class Conditions_Statement_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n");
        int n=sc.nextInt();
        int factorial=1;
        for(int i=n;i>=1;i--){

            factorial=factorial*i;
            System.out.println(factorial);
        }
        System.out.println(factorial);
    }
}
