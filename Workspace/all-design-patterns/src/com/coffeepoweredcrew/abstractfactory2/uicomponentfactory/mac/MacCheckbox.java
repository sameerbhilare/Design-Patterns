package com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.mac;

import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Mac Checkbox...");
    }
}
