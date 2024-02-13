// string palindrome
class Solution {
    public boolean isPalindrome(String s) {
        // Check if the string is empty, return false if it is
        if (s.isEmpty())
            return false;
        
        // Initialize two pointers, one at the beginning and one at the end of the string
        int low = 0, high = s.length() - 1;
        
        // Iterate through the string until the pointers meet or cross
        while (low <= high) {
            // Get characters at the current positions
            char ch1 = s.charAt(low);
            char ch2 = s.charAt(high);
            
            // If the character at the left pointer is not a letter or digit, move the pointer to the right
            if (!Character.isLetterOrDigit(ch1))
                low++;
            // If the character at the right pointer is not a letter or digit, move the pointer to the left
            else if (!Character.isLetterOrDigit(ch2))
                high--;
            else {
                // If both characters are letters or digits, compare them after converting to lowercase
                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2))
                    return false;
                
                // Move both pointers towards the center
                low++;
                high--;
            }
        }
        
        // If all characters have been compared and found to match, the string is a palindrome
        return true;
    }
}

//number
class Solution {
    public boolean isPalindrome(int x) {
        // Store the original value of x in t
        int t = x;
        // Initialize a variable to store the reversed value
        int rev = 0;

        // Reverse the digits of x
        while (x > 0) {
            // Extract the last digit of x using modulo and add it to rev
            rev = (x % 10) + rev * 10;
            // Remove the last digit from x
            x = x / 10;
        }

        // Check if the reversed value (rev) is equal to the original value (t)
        if (t == rev) {
            // If they are equal, the number is a palindrome
            return true;
        }
        // If they are not equal, the number is not a palindrome
        return false;
    }
}


class Solution {
    public int reverse(int x) {
        // Initialize a variable to store the reversed value
        long r = 0;

        // Reverse the digits of x
        while (x != 0) {
            // Extract the last digit of x using modulo and add it to r
            r = (x % 10) + r * 10;
            // Remove the last digit from x
            x = x / 10;
        }

        // Check if the reversed value is within the valid range of a 32-bit signed integer
        if (r < Math.pow(-2, 31) || r > Math.pow(2, 31)) {
            // If out of range, return 0
            return 0;
        } else {
            // Otherwise, return the reversed value as an integer
            return (int) r;
        }
    }
}


 int n=s.length();
       String t = new String();
       String g = new String();

        for(int i=0;i<n/2;i++){
        t = t+s.charAt(i);
        }
        for(int i=n/2;i<n;i++){
       g = g+s.charAt(i);
        
        }
        if(t.equals(g)){
            return true;
        }
        return false;

leetcode 2515
        class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)){
            return 0;
        }
        for(int i=0;i<words.length;i++){
           if(words[(startIndex-i+words.length)%words.length].equals(target)){
return i;
           }
           if(words[(startIndex+i)%words.length].equals(target)){
        
        return i;

    }
}
return -1;
    }
}