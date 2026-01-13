package com.github.sameerbhilare.command.lights;

// Command Interface (supports undo)
public interface Command {
    void execute();
    void undo();
}
