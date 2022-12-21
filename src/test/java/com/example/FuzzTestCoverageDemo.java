package com.example;

import com.code_intelligence.jazzer.junit.FuzzTest;

import java.nio.charset.StandardCharsets;

class FuzzTestCoverageDemo {
    @FuzzTest
    void myFuzzTest(byte[] input) {
        // we simply expect the byte-array to be some string,
        // Jazzer will find out which actual input values will
        // get more code-coverage
        String value = new String(input, StandardCharsets.UTF_8);

        // Jazzer will quickly find that the string needs to match
        // these values
        if (value.contains("TEST") && value.contains("FOO") && value.contains("BAR") && value.contains("BAZ") &&
                !value.contains("FOOBAR") && !value.contains("BARBAZ")) {
            throw new IllegalStateException("Expected exception if Fuzzing manages to 'detect' the values that enters"
                    + " the exception-throwing branch.");
        }
    }
}
