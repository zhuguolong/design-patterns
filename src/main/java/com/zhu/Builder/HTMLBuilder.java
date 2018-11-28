package com.zhu.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhugu
 * 2018/11/28 22:02
 */
public class HTMLBuilder extends Builder {
    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";

        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>" + title + "</title></head></html>");
        // 输出标题
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");

        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }

        writer.close();
    }

    @Override
    public void close() {
        writer.println("</body></html>");
    }

    public String getResult() {
        return fileName;
    }
}
