package com.github.sameerbhilare.command.lights;

public class Client {

    public static void main(String[] args) {

        // Receiver
        Light light = new Light();

        // Commands
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        remote.pressButton(lightOnCommand); // Light ON
        remote.pressButton(lightOffCommand); // Ligh OFF

        remote.pressUndo(); // Light ON
        remote.pressUndo(); // Light OFF
    }
}
