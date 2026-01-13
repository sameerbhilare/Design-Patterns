package com.github.sameerbhilare.command.texteditor;

// Concrete command - Action
// NOT being used in the Client because InsertTextCommand's undo() function is taking care
public class DeleteTextCommand implements Command {

    TextEditor editor;
    String deletedText;

    public DeleteTextCommand(TextEditor editor, String deletedText) {
        this.editor = editor;
        this.deletedText = deletedText;
    }

    @Override
    public void execute() {
        editor.delete(deletedText.length());
    }

    @Override
    public void undo() {
        editor.insert(deletedText);
    }
}
