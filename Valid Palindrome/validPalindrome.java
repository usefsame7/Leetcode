

 /*
  *  Vaild Palindrome  
   -  A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

   - Given a string s, return true if it is a palindrome, or false otherwise.

 

    Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

    Example 2:

    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

    Example 3:

    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.



    - here is my solution ---> 

 */



     
    public class validPalindrome {
      
               public static void main(String[] args) {

                   String s = "A man, a plan, a canal: Panama";
                   boolean result = isPalindrome(s);
                   System.out.println(result);
                
               }


            
                public static boolean isPalindrome(String s) {
        
                      // removing all non-alphanumeric characters.
                       String newStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

                          for (int i = 0; i < newStr.length(); i++) {
            
                               // check if the forward chars == backward chars or not.
                                  if (newStr.charAt(i) != newStr.charAt(newStr.length() - i -1)) {
                                      return false;
                                  }
                          }       
                    return true;
                }
      }
