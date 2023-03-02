/*
 * Copyright (c) 2003-2011 CEDSIF. All rights reserved.
 */
package questions;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Ivan Lifaniça
 */

public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static long firstBadVersion(long n) {
        if(n==1) return 1;
        long oldestVersion = 0;
        long latestVersion = n;
        long currVersion = n/2;
        boolean versionController = false;



        while(oldestVersion<=latestVersion) {
            if(isBadVersion(currVersion)) {
                versionController = true;
                latestVersion = currVersion -  1;
                currVersion = (oldestVersion + latestVersion) / 2;
            }
            if(!isBadVersion(currVersion)) {
                if(!versionController) {
                    oldestVersion = currVersion + 1;
                    currVersion = (oldestVersion + latestVersion) / 2;
                }
            }

        }

        return currVersion;

    }

    public static boolean isBadVersion(long n ){

        return n>=4;
    }
}
