package com.github.sameerbhilare.command.texteditor;

public class Client {

    public static void main(String[] args) {

        // Receiver
        TextEditor editor = new TextEditor();

        // Invoker
        EditorInvoker invoker = new EditorInvoker();

        // Commands
        invoker.executeCommand(new InsertTextCommand(editor, "Hello")); // Hello
        invoker.executeCommand(new InsertTextCommand(editor, "World")); // HelloWorld
        System.out.println(editor.getContent()); // => HelloWorld

        invoker.undo(); // Hello
        System.out.println(editor.getContent()); // => Hello

        invoker.executeCommand(new InsertTextCommand(editor, "Sameer")); // HelloSameer
        System.out.println(editor.getContent()); // => HelloSameer

        invoker.undo(); // Hello
        System.out.println(editor.getContent()); // => Hello

        invoker.undo(); //
        System.out.println(editor.getContent()); // =>

        invoker.undo(); //
        System.out.println(editor.getContent()); // =>

    }
}
