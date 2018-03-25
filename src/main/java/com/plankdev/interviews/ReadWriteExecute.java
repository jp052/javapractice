package com.plankdev.interviews;

import java.util.HashMap;

public class ReadWriteExecute {
    public static int symbolicToOctal(String permString) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        HashMap<Character, Integer> charValues = new HashMap<>();
        charValues.put('r', 4);
        charValues.put('w', 2);
        charValues.put('x', 1);
        charValues.put('-', 0);

        char[] block1 = permString.substring(0, 3).toCharArray();
        char[] block2 = permString.substring(3, 6).toCharArray();
        char[] block3 = permString.substring(6, 9).toCharArray();

        int block1Value = 0;
        int block2Value = 0;
        int block3Value = 0;

        //add block values
        for(int i = 0; i<block1.length; i++) {
            char key = block1[i];
            block1Value += charValues.get(key);
        }

        for(int i = 0; i<block2.length; i++) {
            block2Value += charValues.get(block2[i]);
        }

        for(int i = 0; i<block3.length; i++) {
            block3Value += charValues.get(block3[i]);
        }

        StringBuffer result = new StringBuffer();
        result.append(block1Value);
        result.append(block2Value);
        result.append(block3Value);

        return Integer.parseInt(result.toString());
    }

}
