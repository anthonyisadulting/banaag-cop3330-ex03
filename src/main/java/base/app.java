package base;

import java.util.Scanner;
/*
Exercise 3 - Printing Quotes
Quotation marks are often used to denote the start and end of a string.
But sometimes we need to print out the quotation
marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation
and author as shown in the example output.

Example Output
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 */


public class app {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("What is the quote?");
        String input1 = in.nextLine();

        System.out.print("Who said it?");
        String input2 = in.nextLine();



        String outputString = input2 + " says," + '"' + input1 + "." +'"';

        System.out.println(outputString);





    }


}
