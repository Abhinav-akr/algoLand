package com.backtracking;

public class punishmentNumberTestClient {
    public static void main(String[] args) {
        // Test case 1: Simple case with n = 10
        punishmentNumber punishment1 = new punishmentNumber(10);
        int result1 = punishment1.getPunishmentNumber();
        System.out.println("Punishment number for n = 10: " + result1);

//        // Test case 2: Larger case with n = 20
//        punishmentNumber punishment2 = new punishmentNumber(20);
//        int result2 = punishment2.getPunishmentNumber();
//        System.out.println("Punishment number for n = 20: " + result2); // Expected output: 30
//
//        // Test case 3: Edge case with n = 0
//        punishmentNumber punishment3 = new punishmentNumber(0);
//        int result3 = punishment3.getPunishmentNumber();
//        System.out.println("Punishment number for n = 0: " + result3); // Expected output: 0
    }
}
