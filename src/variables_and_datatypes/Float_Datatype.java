package variables_and_datatypes;

import java.util.Scanner;

public class Float_Datatype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item 1:");
        float pencil=sc.nextFloat();
        System.out.println("Enter the item 2:");
        float pen=sc.nextFloat();
        System.out.println("Enter the item 3:");
        float Eraser=sc.nextFloat();
        float sum=pencil+pen+Eraser;
        System.out.println("sum of the items without gst:"+ sum);
        float gst=0.18f*100;
        float output=sum+gst;
        System.out.println("sum of the items with gst:"+output);

    }
}
