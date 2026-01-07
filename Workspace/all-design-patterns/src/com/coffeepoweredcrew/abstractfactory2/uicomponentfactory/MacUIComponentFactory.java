package com.coffeepoweredcrew.abstractfactory2.uicomponentfactory;

import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.mac.MacButton;
import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.mac.MacCheckbox;
import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.windows.WindowsButton;
import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.windows.WindowsCheckbox;

public class MacUIComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
