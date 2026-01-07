package com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.windows;

import com.coffeepoweredcrew.abstractfactory2.uicomponentfactory.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Button...");
    }
}
