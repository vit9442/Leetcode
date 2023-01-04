package Task3;
/*
        https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
        There are at least two different characters in letters.
        Return the smallest character in letters that is lexicographically greater than target.
        If such a character does not exist, return the first character in letters.
        */
public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {



    char[] letters = {'c', 'f', 'j'};
    char target = 'a';
    char res = new Solution().nextGreatestLetter(letters, target);
        System.out.println("массив символов :");
        for(char ch : letters)
            System.out.print(ch + " ");

        System.out.printf("\nсимвол \"%c\" - первый символ, который больше чем символ \"%c\"", res, target);



}



}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        if (target < letters[0]) {
            return letters[0];
        }
        while (start + 1 < end) {

            mid = (start + end) / 2;

            if (letters[mid] > target) {
                end = mid;
            } else {

                start = mid;
            }
        }
        return letters[end];
    }
}