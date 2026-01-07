package com.github.sameerbhilare.abstractfactory2.uicomponentfactory.windows;

import com.github.sameerbhilare.abstractfactory2.uicomponentfactory.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Checkbox...");
    }
}
