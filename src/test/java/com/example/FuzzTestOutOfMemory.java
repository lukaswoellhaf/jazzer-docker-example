package com.example;

import com.code_intelligence.jazzer.junit.FuzzTest;

class FuzzTestOutOfMemory {
    public static long[] leak;

    @FuzzTest
    void myFuzzTest(byte[] input) {
        // Call the functions you want to test with the provided data and optionally
        // assert that the results are as expected.

        // If you want to know more about writing fuzz tests you can checkout the
        // example projects at https://github.com/CodeIntelligenceTesting/cifuzz/tree/main/examples
        // or have a look at our tutorial:
        // https://github.com/CodeIntelligenceTesting/cifuzz/blob/main/docs/How-To-Write-A-Fuzz-Test.md
        if(input.length == 0) {
            return;
        }
        leak = new long[Integer.MAX_VALUE];
    }
}
