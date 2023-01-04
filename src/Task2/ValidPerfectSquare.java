package Task2;
/*
        https://leetcode.com/problems/valid-perfect-square/
        Given a positive integer num, return true if num is a perfect square or false otherwise.
        A perfect square is an integer that is the square of an integer.
        In other words, it is the product of some integer with itself.
        You must not use any built-in library function, such as sqrt.*/
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        boolean res = new Solution().isPerfectSquare(num);
        if (res){
            System.out.println(num + " - полный квадрат");
        } else System.out.println(num + " - не полный квадрат");
    }
}


class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        while (start  <= end){

            long mid = (start + end) / 2;
            if(mid * mid == num)
                return true;

            if(mid * mid < num){
                start = mid + 1;
            }

            else if(mid * mid > num){
                end = mid - 1;
            }

        }
        return false;


    }
}