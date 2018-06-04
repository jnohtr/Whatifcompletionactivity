package com.company;

import java.util.Scanner;
import java.util.Scanner;
public class Whatifcompletionactivity {

    public static void main(String[] args) {
	// write your code here

        /*// TODO code application logic here
        double num1, num2, sum, pro; //int
        double  avg;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        pro = num1 * num2;
        sum = num1 + num2;
        avg = (num1+num2)/2;

        if( sum < 1000)
            System.out.println("sum: " + sum + "~");
        if( sum > 200 )
            //sum = 1 + sum;
            System.out.println("sum: " + sum + "*");

        System.out.print( "sum: " + sum + " product: " + pro + " average: " + avg);*/

        // TODO code application logic here
        double num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        double sum = num1 + num2;
        double avg = (num1 + num2)/2;
        double pro = num1 * num2;

        if (num1 + num2 > 300)// && num1 + num2 < 1000
            System.out.println("sum: "+sum + "*");
        else if (num1 + num2 < 1000)
            System.out.println("sum: "+sum + "~");
        else
            System.out.println("sum: "+sum);

        System.out.println("average: "+avg);
        System.out.println("product: "+pro);
    }
}
