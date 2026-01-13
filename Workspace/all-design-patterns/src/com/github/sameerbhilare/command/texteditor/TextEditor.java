package com.github.sameerbhilare.command.texteditor;

// Receiver
public class TextEditor {

    private StringBuilder content = new StringBuilder();

    public void insert(String text) {
        content.append(text);
    }

    public void delete(int length) {
        int start = content.length() - length;
        content.delete(start, content.length());
    }

    public String getContent() {
        return content.toString();
    }
}
