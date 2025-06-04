package com.backtracking;

import java.util.List;

public class uniqueSubsetsTestClient {

        public static void main(String[] args) {
            // Test case 1: Simple array with unique elements
            int[] nums1 = {1, 2, 3};
            uniqueSubsets subsets1 = new uniqueSubsets(nums1);
            List<List<Integer>> result1 = subsets1.generateUniqueElementsSubsets();

            System.out.println("Subsets for {1, 2, 3}:");
            printSubsets(result1);
            System.out.println("Total number of subsets: " + result1.size());

            // Test case 2: Empty array
            int[] nums2 = {};
            uniqueSubsets subsets2 = new uniqueSubsets(nums2);
            List<List<Integer>> result2 = subsets2.generateUniqueElementsSubsets();

            System.out.println("\nSubsets for {}:");
            printSubsets(result2);
            System.out.println("Total number of subsets: " + result2.size());

            // Test case 3: Larger array
            int[] nums3 = {5, 2, 9, 1};
            uniqueSubsets subsets3 = new uniqueSubsets(nums3);
            List<List<Integer>> result3 = subsets3.generateUniqueElementsSubsets();

            System.out.println("\nSubsets for {5, 2, 9, 1}:");
            printSubsets(result3);
            System.out.println("Total number of subsets: " + result3.size());
        }

        private static void printSubsets(List<List<Integer>> subsets) {
            for (List<Integer> subset : subsets) {
                System.out.print("[ ");
                for (Integer num : subset) {
                    System.out.print(num + " ");
                }
                System.out.println("]");
            }
        }
}

