import java.util.*;
class countPairss{
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
       countPairss s=new countPairss();
        List<Integer> nums=List.of(2,3,4,5,6,7,8);
int target=10;
System.out.println(s.countPairs(nums, target));
        }
}




class kid {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        
        // Find the maximum number of candies in the array
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        
        // Create a list to store the results
        List<Boolean> result = new ArrayList<>();
        
        // Check if each child can have the greatest number of candies
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        kid k=new kid();
        int [] candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(k.kidsWithCandies(candies, extraCandies));
    }
}

// Input: nums = [5,10,1,5,2], k = 1
// Output: 13
// Explanation: The binary representation of the indices are: 
// 0 = 0002
// 1 = 0012
// 2 = 0102
// 3 = 0112
// 4 = 1002 
// Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
// Hence, the answer is nums[1] + nums[2] + nums[4] = 13.
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}

// int x = -5;
// int absoluteValue = Math.abs(x); // absoluteValue will be 5



// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> ans=new ArrayList<>();
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//         for(int j=1;j<nums.length+1;j++){
//             if(!set.contains(j)){
//                 ans.add(j);
//             }
//         }
//         return ans;
//     }
// }
class Solutio {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[nums[i]-1]++;
        }
        for(int i=0;i<n;i++){
         if(arr[i]==0) {
         ans.add(i+1);
         }}
        return ans;
    }
}