package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class uniqueSubsets {

    private int[] nums;

    public uniqueSubsets(int[] nums) {
        this.nums = nums;
    }

    public List<List<Integer>> generateUniqueElementsSubsets() {
        // create a list of subsets
        List<List<Integer>> listOfSubsets = new ArrayList<>();

        // list to hold current subset being created
        List<Integer> currSubset = new ArrayList<>();

        // call helper function to generate subsets
        generateSubsets(0, nums, currSubset, listOfSubsets);

        return listOfSubsets;
    }

    private void generateSubsets(int currIdx, int[] nums, List<Integer> currSubset, List<List<Integer>> listOfSubsets) {
        // base case: if we have considered all elements, add the current subset to the list of subsets
        if (currIdx == nums.length) {
            listOfSubsets.add(new ArrayList<>(currSubset));
            return;
        }

        // two options with the current element:
        // 1. include it in the current subset
        currSubset.add(nums[currIdx]);
        generateSubsets(currIdx+1, nums, currSubset, listOfSubsets);
        // 2. unchoose it from the current subset
        currSubset.removeLast();
        // 3. exclude it from the current subset
        generateSubsets(currIdx+1, nums, currSubset, listOfSubsets);

        // exhausted all options with the current element, so we return
    }

}
