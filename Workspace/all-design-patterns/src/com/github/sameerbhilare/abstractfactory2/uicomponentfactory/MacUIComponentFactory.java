package com.github.sameerbhilare.abstractfactory2.uicomponentfactory;

import com.github.sameerbhilare.abstractfactory2.uicomponentfactory.mac.MacButton;
import com.github.sameerbhilare.abstractfactory2.uicomponentfactory.mac.MacCheckbox;

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
