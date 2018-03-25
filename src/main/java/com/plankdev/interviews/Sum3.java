package com.plankdev.interviews;


import java.util.ArrayList;
import java.util.List;

public class Sum3 {

    private ArrayList<Integer> internalList = new ArrayList<>();
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    public void addLast(int[] list) {
        for (int i : list) {
            internalList.add(i);
        }
    }

    /**
     * Calculates the sum of 3 elements from the given internalList. <br>
     * The starting point of calculation is given as a parameter.
     * @param currentStartPos starting position of list to start calculation from.
     * @return calculated Sum of 3 elements of internalList or 0.
     */
    private int calculateSumOf3(int currentStartPos) {
        int currentEndPos = currentStartPos + 3;

        //check out of bound
        if(currentEndPos > internalList.size()) {
            return 0;
        }

        List<Integer> elementsToCalc = internalList.subList(currentStartPos, currentEndPos);
        int sum = 0;
        for (int i : elementsToCalc) {
            sum += i;
        }
        return sum;
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given sum.
     */
    public boolean containsSum3(int sum) {
        int calculatedSum = 0;
        boolean containsSum = false;
        for (int pos = 0; pos <= internalList.size(); pos++) {
            calculatedSum = calculateSumOf3(pos);
            if(calculatedSum == sum) {
                containsSum = true;
            }
        }
        return containsSum;
    }

    public static void main(String[] args) {
        Sum3 s = new Sum3();

        s.addLast(new int[] { 1, 2, 3 });

        System.out.println(s.containsSum3(6));
        System.out.println(s.containsSum3(9));

        s.addLast(new int[] { 4 });

        System.out.println(s.containsSum3(9));

        Sum3 s2 = new Sum3();
        s2.addLast(new int[] { 1, 2, 3,5,6,7 });
        System.out.println(s2.containsSum3(4));
    }
}
