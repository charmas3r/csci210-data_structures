
/**
 * Recursive algorithm to determine if a string is a palindrome
 * 
 * @author Evan Smith 
 * @version 2017
 */
public class Palindrome
{
    // instance variables - replace the example below with your own
    private int left;
    private int right;
    private String phrase;

    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome()
    {
        // initialise instance variables
        phrase = "wastaw";
        left = 0;
        right = phrase.length() - 1;
        
        palindrome(phrase, left, right);
        
    }

    /**
     * palindrome is a recursive method to determine if a stringh is a palindrome
     * 
     * @param  phrase   string phrase to be tested
     * @param  left     index of first character in string
     * @param  right    index of last character in string
     * @return     boolean check if the string is a palindrome
     */
    public boolean palindrome(String phrase, int left, int right)
    {
        boolean check = true;
            
            if (left == right)
                check = true; //base case
        
            else {
                if (phrase.charAt(left) == phrase.charAt(right)){
                    if (left <= right)
                    return palindrome(phrase, (left + 1), (right - 1));
                }
                else 
                    check = false;
             }
             
        return check;
    }
}
