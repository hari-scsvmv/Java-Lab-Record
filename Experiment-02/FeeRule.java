package com.scsvmv.fee.service;
public class FeeRule {
    public static double fee(String course) {
        if (course.equals("BE")) return 75000;
        if (course.equals("ME")) return 60000;
        return 40000;
    }
}

/*
Sample Usage:
FeeRule.fee("BE")  returns 75000.0
FeeRule.fee("ME")  returns 60000.0
FeeRule.fee("BSc") returns 40000.0
*/