package Task1;
/*
    https://leetcode.com/problems/search-insert-position/
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.
*/
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 5;

        System.out.println("Массив:");
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println("\nИскомое число: " + target);
        int res = new Solution().searchInsert(arr, target);
        System.out.printf("Число %d находится на позиции %d", target, res);
    }


}

class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        if (nums[mid] > target)
            return mid;
        else return mid + 1;
    }
}

