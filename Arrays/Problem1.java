/*You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
*/

package Array;
import java.util.Scanner;
class Problem1{
    public static int[] twoSum(int[] nums,int target){
        //i select the first number
        for(int i=0;i<nums.length;i++){
            //j select the second number
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};//returning the index of the two numbers
                }
            }
        }
        return new int[]{};//returning empty array if no such numbers found.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        twoSum(nums,target);
        System.out.println("The index of the two numbers are:");
        int[] result = twoSum(nums,target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}