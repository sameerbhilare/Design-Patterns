package com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.windows;

import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Checkbox...");
    }
}
