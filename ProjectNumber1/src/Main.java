import java.util.Scanner;
import java.util.SplittableRandom;

import static java.lang.System.*;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {

        int count = 0;                              //Declare a variable "count" and initialize it as 0.
        for (char a : s.toCharArray()) {            //Convert the string s into a character array and create a for loop to iterate through the characters of the array.
            switch (a) {                            //Use the switch statement to take in the variable "a" and compare each case with the characters in the array.
                case 'a':                           //Each vowel is set up as a case.
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;                        //Increment "count" when a character equals to the cases "a, e, i, o, u".
            }
        }
        return count;                   //return the result of count. Run the method and bring the results into the variable in main method???
            }

    //Code you problem number two here
    static int problemTwo(String s){

        int countBobs = 0;                              //Declare a variable countBob and initialize it as 0.
        for (int i = 0; i < s.length() - 2; i++) {      /*
                                                         Create a for loop to iterate through the string s. Because the length of "bob" is 3,
                                                         set up the condition i<s.length ()-2 to make sure it does not exceed the length of string s.
                                                        */
            if (s.substring(i, i + 3).equals("bob")){     /*
                                                           Extract substring from string s from the current position i up to the position i+3, which means taking
                                                          3 characters, and compare each substrings to "bob"
                                                           */
                countBobs++;                                //If an extracted substring equals to "bob", it increments countBobs.
            }
        }
        return countBobs;                           //return the result of countBob.
            }

    //Code your solution to problem number 3 here
    static String problemThree(String s){

        int currentLen = 0;                        //Initialize a variable "currentLen" as 0 to track the length of the current string in alphabetical order.
        int maxLen = 0;                            //Initialize a variable "maxLen" as 0 to track the maximum length of the substring in alphabetical order when iterate the string s.
        int startIndex = 0;                        //Initialize a variable "starIndex" as 0 to track the start index position of the longest substring in alphabetical order.

        for (int i = 0; i < s.length()-1; i++) {    //Iterate through the string s.
            if (s.charAt(i) <= s.charAt(i+1)) {     //If the current character is less than or equal to the next character, it increments the currentLen.
                currentLen++;
            } else {                                //If not, the count breaks. Then it checks if the current length is greater or equal to the previous maximum length.
                if (currentLen > maxLen) {          //If yes, maximum length is replaced by the current length and the start index position is also updated.
                    maxLen = currentLen;
                    startIndex = i - maxLen;
                   }
                currentLen = 0;                     //Reset the current length as 0 and find the next substring in alphabetic order.
            }
        }
        if (currentLen > maxLen) {                  /*Compare the length of the final substring, which has the last character of the string s,
                                                    with the maximum length found in the for loop.
                                                    */
            maxLen = currentLen;                    //If the final substring has a longer length, update the maximum length and start index position of the final substring.
            startIndex = s.length() - maxLen-1;
        }
        return s.substring(startIndex, startIndex + maxLen+1);      //return the longest substring with characters in alphabetical order.
    }


    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        These tests will put your methods through several, different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        problemOne("iueuaondjmhoiuxj");

        out.println("problemOne");
        for(String s: StringTests.problemOne){                      //Iterate through the elements of String s problemOne array.
            int vowels=Main.problemOne(s);                          //Declare a variable to call the result in static int problemOne.
            out.println("Number of vowels: "+vowels);               //Printout the result
        }
        out.println("\nproblemTwo");
        for(String s: StringTests.problemTwo){                      //Iterate through the elements of String s problemTwo array.
            int bobs=Main.problemTwo(s);                            //Declare a variable to call the result in static int problemTwo.
            out.println("Number of times bob occurs is: "+bobs);    //Printout the result
        }

        out.println("\nproblemThree");
        for(String s: StringTests.problemThree) {                   //Iterate through the elements of String s problemThree array.
            String longestString = Main.problemThree(s);            //Declare a variable to call the result in static String problemThree.
            out.println("Longest substring in alphabetical order is: " + longestString);    //Printout the result
        }
    }
}
