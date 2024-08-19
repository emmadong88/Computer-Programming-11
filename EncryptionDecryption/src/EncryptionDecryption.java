import java.util.Scanner;

public class EncryptionDecryption {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a string:");                                  //Ask the uer to enter a new string.

            String str = scan.nextLine();                                           //Read the input entered by the user.

            String encryptedString = encryptString(str);                            //Call the encryptString method and get the encrypted string.
            String decryptedString = decryptString(encryptedString);                //Call the decryptString method and get the encrypted string.

            System.out.println("Encrypted string is: " + encryptedString);          //Print out the encrypted string.
            System.out.println("Decrypted string is: " + decryptedString);          //Print out the encrypted string.
        }

        public static String encryptString(String str) {
            String[] words = str.split("\\s+");                            //split the sentence or phrase into words and store them in the string array.
            String encryptedString = "";                                     //Declare a new string "encryptedString" starting with empty. It will be filled with encrypted words later.
            for (String word : words) {                                        //Create a for loop to iterate through each word in the array.
                encryptedString += encryptedWord(word) + " ";                  //Call the encryptedWord method and add the encrypted words to encryptedString.
            }
            return encryptedString;
        }

        public static String decryptString(String encryptedString) {
            String[] words = encryptedString.split("\\s+");                    //split the encrypted sentence or phrase into words and store them in the string array.
            String decryptedString = "";                                         //Declare a new string variable "decryptedString" starting with empty. It will be filled with decrypted words later.
            for (String word : words) {                                         //Create a for loop to iterate through each word in the array.
                decryptedString += decryptedWord(word) + " ";                   //Call the decryptedWord method and add the decrypted words to decryptedString.
            }
            return decryptedString;
        }

        static String encryptedWord(String word) {
            char lastLetter = word.charAt(word.length() - 1);              //To get the last letter of the word.
            String strL = word.substring(0, word.length() - 1);            //To get the letters from the index position of 0 up to the index position before the last letter.
            String add = "ay";                                             //Create a string for the letters to be added.
            return lastLetter + strL + add;                              //Return the value in order: move the last letter to the front and add "ay" to the end of encrypted word.
        }

        static String decryptedWord(String word) {
            String strD = word.substring(1, word.length() - 2);         //Remove the first letter, which is the last letter of the original word, and the last two letters ("ay") of the encrypted word.
            char firstLetter = word.charAt(0);                          //To get the first letter of the encrypted word.
            return strD + firstLetter;                                  //Add the first letter of the encrypted word to the end of the word to get the original word.
        }
    }
