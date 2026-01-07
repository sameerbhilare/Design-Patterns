package com.github.sameerbhilare.abstractfactory2.uicomponentfactory.mac;

import com.github.sameerbhilare.abstractfactory2.uicomponentfactory.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Mac Button...");
    }
}
