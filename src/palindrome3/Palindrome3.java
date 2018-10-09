/*
 *Sean Luo 8/10/2018
 *Palindrome3.java
 *This is progrem calculates the Palindrome3.
 */
package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author clkong
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence, newsentence, backwords = "";
        int pos= 0;
        //sentence represents the phrase pepole enter.
        //newsentence represnets the sentence hasn't  blank space.
        //backwords represents the inverted sentences
        //pos represent how many words are in the sentence.
        sentence = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a phrase is a palindrome.\n\n"
                + "Enter a phrase(do not include a punctuation mark):");
        newsentence = sentence.replaceAll(" ","");
        backwords = "";
        for (pos = newsentence.length() - 1; pos >= 0; pos--) {
            backwords += newsentence.charAt(pos);
        }
        if (newsentence.equalsIgnoreCase(backwords)) {
            JOptionPane.showMessageDialog(null,sentence + " IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null,sentence + " IS NOT a palindrome.");
    }
    
}
}

