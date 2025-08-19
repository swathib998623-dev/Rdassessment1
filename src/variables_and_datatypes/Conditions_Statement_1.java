package variables_and_datatypes;

import java.util.Scanner;

public class Conditions_Statement_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Numbers1:");
        int num1=sc.nextInt();

        if(num1>=0)
        {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }
}
