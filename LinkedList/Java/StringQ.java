// Given a string array of words, return the sum of two  maximum values of 
// length(words[i]) + length(words[j]) where the two words do not share common letters. 
// If no such two words exist, return 0. For input strings will be space separated
 
// Example 1:
// Input: abcw baz foo bar xtgn abcdeg
// Output: 9
// Explanation: The two words can be abcw and xtgn


import java.util.*;

public class StringQ {

    public static void main(String args[]) {

        // First, slice the string based on " "
        // Create an array of strings= {"abcw", "baz",..etc}
        // Traverse that array..."abcw" -> "baz" ?(there is no charachter common)
        // If var MAX > len(str1) + len(str2)
        // Swap the value of MAX with len(str1) + len(str2)

        String test = "abcw baz foo bar xtgn abcdeg";

        

    }
}