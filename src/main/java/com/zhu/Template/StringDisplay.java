package com.zhu.Template;

public class StringDisplay extends AbstractDisplay {
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" + str + "|");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");

        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }

        System.out.println("+");
    }
}
