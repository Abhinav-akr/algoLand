package com.backtracking;

public class punishmentNumber {
    private int n;

    public punishmentNumber(int n) {
        this.n = n;
    }

    private boolean checkSumOfSubstringsEqualsSquare(String numStr, int currIdx, int leftSum) {
        // Base case: when we reach the end of the string or leftSum is less than or equal to 0
        if(currIdx == numStr.length()) {
            return leftSum == 0;
        }
        if(leftSum < 0) {
            return false; // If leftSum is negative, we cannot form a valid sum
        }
       // Iterate through all possible substrings starting from currIdx
        for(int i = currIdx; i < numStr.length(); i++) {
            // Extract the substring from currIdx to i
            String substring = numStr.substring(currIdx, i + 1);
            // Convert the substring to an integer
            int substringValue = Integer.parseInt(substring);
            // Check if the current substring can be part of the sum
            if(checkSumOfSubstringsEqualsSquare(numStr, i + 1, leftSum - substringValue)) {
                return true;
            }

        }
        return false;
    }

    private boolean isPunishmentNumber(int square, int num) {
        // Convert the number to a string to easily access its digits
        String numStr = String.valueOf(square);
        return checkSumOfSubstringsEqualsSquare(numStr, 0, num);
    }

    public int getPunishmentNumber() {
        int punishmentNumber = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (isPunishmentNumber(square, i)) {
                punishmentNumber += square;
            }
        }
        return punishmentNumber;
    }
}
