package com.coffeepoweredcrew.abstractfactory2.uicomponentfactory;

public class Client {

    public static void main(String[] args) {

        UIComponentFactory windowsUIComponentFactory = new WindowsUIComponentFactory();
        Button windowsButton = windowsUIComponentFactory.createButton();
        Checkbox windowsCheckbox = windowsUIComponentFactory.createCheckbox();
        windowsButton.paint();
        windowsCheckbox.paint();

        System.out.println("===============");

        UIComponentFactory macUIComponentFactory = new MacUIComponentFactory();
        Button macButton = macUIComponentFactory.createButton();
        Checkbox macCheckbox = macUIComponentFactory.createCheckbox();
        macButton.paint();
        macCheckbox.paint();

    }
}
