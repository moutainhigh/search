package com.wang.search.normal;

public class Test {

    public static void main(String[] args) {
        int i = 0;
        test(i);
    }

    private static void test(int i) {
        System.out.println(i);
        try {
            do {
                i++;
                if (i == 10) {
                    throw new RuntimeException("错误");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("over");
        }
    }
}
