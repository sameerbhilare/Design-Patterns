package com.github.sameerbhilare.command.texteditor;

// Concrete command - Action
public class InsertTextCommand implements Command {

    // Receiver
    TextEditor editor;
    // additional data required for receiver
    String text;

    public InsertTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.insert(text);
    }

    @Override
    public void undo() {
        editor.delete(text.length());
    }
}
