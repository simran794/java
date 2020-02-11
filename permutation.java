/*Given a string, write a function to check if it is a permutation of a palindrome.
* A palindrome is a word or phrase that is the same forwards and backwards. A permutation
* is a rearrangment of letters. The palindrome does not need to be limited to just dictionary words*/
import java.util.HashMap;

public class permutation {
    public static void main(String args[])
    {
        String s = "We panic in a pew.";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        HashMap<Character, Integer> pali = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length();i++)
        {
            if(!pali.containsKey(s.charAt(i)))
            {
                pali.put(s.charAt(i), 1);
            }
            else
            {
                pali.put(s.charAt(i),pali.get(s.charAt(i))+1);
            }
        }
        int count = 0;
        for(Character j : pali.keySet())
        {
            if(pali.get(j)%2 != 0)
            {
                count++;
            }
        }
        if(count > 1)
        {
            System.out.println("The string cannot be a palindrome");
        }
        else
        {
            System.out.println("The string can be a palindrome");
        }
        return;
    }
}
