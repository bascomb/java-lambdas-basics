package com.bascomb;

public class ComplexInterfaceImpl implements ComplexInterface {

    public boolean hasField = true;

    @Override
    public boolean isTrue(boolean b) {
        return b;
    }

    @Override
    public boolean isFalse(boolean b) {
        return !b;
    }

    public boolean getHasField() {
        return hasField;
    }
}
