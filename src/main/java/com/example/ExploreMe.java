package com.example;

public class ExploreMe {
    // Function with multiple paths that can be discovered by a fuzzer.
    public static void exploreMe(int a, int b, String c) {
        if (a >= 20000) {
            if (b >= 2000000) {
                if (b - a < 100000) {
                    // Create reflective call
                    if (c.startsWith("@")) {
                        String className = c.substring(1);
                        try {
                            // Possibility of Remote Code Execution
                            Class.forName(className);
                        } catch (ClassNotFoundException ignored) {
                        }
                    }
                }
            }
        }
    }
}