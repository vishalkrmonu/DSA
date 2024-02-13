// Input: strs = ["cba","daf","ghi"]
//         Output: 1
//         Explanation: The grid looks as follows:
//           cba
//           daf
//           ghi
//         Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
        class STR{
            public static int minDeletionSize(String[] strs) {
                int row=strs.length;
                int col=strs[0].length();
                int ans=0;
                for(int i=0;i<col;i++)
                {
                    for(int j=0;j<row-1;j++)
                    {
                        if(strs[j].charAt(i)>strs[j+1].charAt(i))
                        {
                            ans++;
                            break;
                        }
                    }
                }
                return ans;
            }
            public static void main(String[] args){
               String[] strs ={"abs","bcm","mnv"};
               int result=minDeletionSize(strs);
                System.out.println(result);
            }
        }

        // import java.math.BigInteger;

// class Solution {
//     public String multiply(String num1, String num2) {
//         BigInteger a = new BigInteger(num1);
//         BigInteger b = new BigInteger(num2);

//         BigInteger mul = a.multiply(b);

//         // BigInteger mul = a*b;
//         String c = String.valueOf(mul);
//         return c;

//     }
// }

// Input: nums = [5,14,13,8,12]
// Output: 673
// Explanation: Before performing any operation, nums is [5,14,13,8,12] and concatenation value is 0.
//  - In the first operation:
// We pick the first element, 5, and the last element, 12.
// Their concatenation is 512, and we add it to the concatenation value, so it becomes equal to 512.
// Then we delete them from the nums, so nums becomes equal to [14,13,8].
//  - In the second operation:
// We pick the first element, 14, and the last element, 8.
// Their concatenation is 148, and we add it to the concatenation value, so it becomes equal to 660.
// Then we delete them from the nums, so nums becomes equal to [13].
//  - In the third operation:
// nums has only one element, so we pick 13 and add it to the concatenation value, so it becomes equal to 673.
// Then we delete it from nums, so nums become empty.
// Since the concatenation value is 673 so the answer is 673.
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j=nums.length-1;
        long result=0;
        while(i<j){
String s=nums[i] + ""+nums[j];
result+=Long.parseLong(s);
i++;
j--;
        }
        if(i==j){
            result+=nums[i];
        }
return result;
    }
}


// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
class Soluti {
    public boolean checkIfPangram(String sentence) {
        // Create a set to store unique characters
        Set<Character> s = new HashSet<>();

        // Iterate over each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Add the character to the set
            s.add(c);
        }

        // Check if the size of the set is equal to 26 (all English letters)
        if (s.size() == 26) {
            return true;
        }
        
        // If the set size is not 26, it's not a pangram
        return false;
    }
}

class Solu {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++){
           map.put(sentence.charAt(i),1);
        }
        if(map.size() == 26){
            return true;
        }
        return false;
    }
}


// Input: s = "aa", distance = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
// Output: false
// Explanation:
// - 'a' appears at indices 0 and 1 so there are zero letters between them.
// Because distance[0] = 1, s is not a well-spaced string.
class Solution {
    public static boolean checkDistances(String s, int[] distance) {
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           int x = s.lastIndexOf(c);
           if (i != x) {
               int distanceValue = x - i - 1;
               if (distance[c - 'a'] != distanceValue) return false;
           }
           
       }

       return true;
   }
}