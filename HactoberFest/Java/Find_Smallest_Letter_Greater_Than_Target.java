public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] letters = {'c', 'f', 'j', 'p', 'v'};
        char target = 'g';
        char result = solution.nextGreatestLetter(letters, target);
        System.out.println("Next greatest letter to '" + target + "' is: " + result);
    }

    static class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (letters[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
        }
    }
}
