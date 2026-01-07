package com.coffeepoweredcrew.abstractfactory2.uicomponentfactory;

import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.windows.WindowsButton;
import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.windows.WindowsCheckbox;

public class WindowsUIComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
