/**
 * Assignment #1.
 *
 * This program, given a word list file will find all the anagrams in the list for individual strings of letters entered from the keyboard.
 *
 * Author: Mark Mileyev (mmileyev@ucsc.edu)
 */

import java.util.*;
import java.io.*;
import java.util.Random.*;
import java.util.Scanner;
import java.util.Arrays;

/**
 Used starter program from class website for inputfiles
 @author Charlie McDowell (minor mods Dean Bailey 08/23/07)
 */

class Echot {
    public static void main(String[] args) throws FileNotFoundException {
        while(true){
            
            //Prompt user
            System.out.println("type a string of letters");
            //Input the text to search for
            Scanner scn = new Scanner(System.in);
            String input;
            input = scn.nextLine();
            //System.out.println(input); (USED TO TEST)
            char[] userInput = input.toCharArray();//Convert to array of chars
            Arrays.sort(userInput);//Alphabetize the array
            //System.out.println(userInput); (USED TO TEST)
            
            
            
            Scanner in = new Scanner(new FileInputStream(args[0]));
            
            int size = in.nextInt();//First item is the number of words
            
            
            //Loop that goes through the wordlist
            for (int i = 0; i < size; i++) {
                String word = in.next();
                char[] wordList = word.toCharArray();//Convert words to array of chars
                Arrays.sort(wordList);//Alphabetize the array
                //System.out.println(wordList); (USED TO TEST)
                //Anagram can't be the input string
                if (Arrays.equals(wordList, userInput) && !input.equals(word)){
                    System.out.println(word);
                }
            }
            //Prompt if user wants to continue
            System.out.println("Do another? (y/n)");
            Scanner reply = new Scanner(System.in);
            String rep;
            rep = scn.nextLine();
            //If "y" repeat the while loop (entire program)
            if (rep.contains("y")){
                continue;
            }
            if (rep.contains("n")){
                System.exit(0);
            }
            
        }
    }
}