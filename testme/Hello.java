package com.dangvue0.testme;

public class Hello {
    static void TestMe() {
        System.out.println("HEY You!");
    }

    public static void main(String[] args) {
        TestMe();

    }

    StringBuilder zword = new StringBuilder();
    void fillString(StringBuilder zword) {
        this.zword.append("WAH");
        System.out.println(zword);
    }

}
