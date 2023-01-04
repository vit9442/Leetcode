package Task4;

/*
        https://leetcode.com/problems/kth-largest-element-in-an-array/description/
        Given an integer array nums and an integer k, return the kth largest element in the array.
        Note that it is the kth largest element in the sorted order, not the kth distinct element.
        You must solve it in O(n) time complexity.
        */

import java.util.Random;

public class KthLargestElementinanArray {
    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = new Solution().findKthLargest(nums, k);
        System.out.printf("%d по-величине элемент в массиве - %d ",k, res);



    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int pIndex = start;
        while (start <= end) {


            int rand = new Random().nextInt(end - start + 1) + start;

            int buf = nums[rand];
            nums[rand] = nums[end];
            nums[end] = buf;

            int pivot = nums[end];
            pIndex = start;
            for(int i = start; i < end; i++){

                if(nums[i] <= pivot){
                    buf = nums[i];
                    nums[i] = nums[pIndex];
                    nums[pIndex] = buf;
                    ++pIndex;
                }
            }
            buf = nums[pIndex];
            nums[pIndex] = nums[end];
            nums[end] = buf;

            if(pIndex == nums.length - k){
                return nums[pIndex];
            }
            else if(pIndex < nums.length - k ){
                start = pIndex + 1;
            } else{
                end = pIndex - 1;
            }
        }
        return nums[pIndex];

    }
}