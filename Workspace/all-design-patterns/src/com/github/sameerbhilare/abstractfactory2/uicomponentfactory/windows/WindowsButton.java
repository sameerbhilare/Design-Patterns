package com.github.sameerbhilare.abstractfactory2.uicomponentfactory.windows;

import com.github.sameerbhilare.abstractfactory2.uicomponentfactory.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Button...");
    }
}
