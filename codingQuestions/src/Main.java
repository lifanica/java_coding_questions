/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */

import questions.TwoSum;

import java.util.Arrays;

/**
 * @author Ivan Lifaniça
 */

public class Main {
    public static void main(String [] args){

        TwoSum t = new TwoSum();
        System.out.println(Arrays.toString(t.twoSumWithMap(new int[]{2, 5, 5, 11}, 10)));
    }
}
