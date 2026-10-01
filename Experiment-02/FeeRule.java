package com.scsvmv.fee.service;
public class FeeRule {
    public static double fee(String course) {
        if (course.equals("BE")) return 75000;
        if (course.equals("ME")) return 60000;
        return 40000;
    }
}

/*
Sample Input:
This helper class is called by FeeApp.
Example course values: BE, ME, BSc

Sample Output:
FeeRule.fee("BE")  returns 75000.0
FeeRule.fee("ME")  returns 60000.0
FeeRule.fee("BSc") returns 40000.0
*/