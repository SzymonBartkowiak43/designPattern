package org.example.zajecia.zadanie8_command.command;

public interface Command {
    void execute();
    void undo();
    void redo();
}
