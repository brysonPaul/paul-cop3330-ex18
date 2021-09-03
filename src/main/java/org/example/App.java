/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        float temp=0;
        String convert=" ",convertTo= " ";
        float finalVal = 0;
        String choice = strIO("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ",sc);
        if(choice.equalsIgnoreCase("C")) {
            convert="Fahrenheit";
            convertTo= "Celsius";
        } else {
            convert = "Celsius";
            convertTo = "Fahrenheit";
        }
        while (true)
        {
            try {
                temp = Float.parseFloat(strIO("Please enter the temperature in " + convert + ": ", sc));
            }
            catch(Exception exception) {
                System.out.println("Please enter only numeric values");
                continue;
            }
            break;
        }

        if(choice.equalsIgnoreCase("C")) {
            finalVal = (float)((temp - 32) * (5.0 / 9.0));
        } else {
            finalVal = (float)((temp * 9.0 / 5.0) + 32);
        }
        System.out.println("The temperature in " + convertTo + " is " + finalVal);

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
