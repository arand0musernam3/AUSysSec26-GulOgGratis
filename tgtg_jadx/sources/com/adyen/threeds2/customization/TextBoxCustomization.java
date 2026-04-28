package com.adyen.threeds2.customization;

import com.adyen.threeds2.exception.InvalidInputException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class TextBoxCustomization extends Customization {
    private String mBorderColorCode;
    private int mBorderWidth = -1;
    private int mCornerRadius = -1;

    public final String getBorderColor() {
        return this.mBorderColorCode;
    }

    public final int getBorderWidth() {
        return this.mBorderWidth;
    }

    public final int getCornerRadius() {
        return this.mCornerRadius;
    }

    public final void setBorderColor(String str) throws InvalidInputException {
        this.mBorderColorCode = requireHexColorCode(str);
    }

    public final void setBorderWidth(int i11) throws InvalidInputException {
        this.mBorderWidth = requireNonNegative("borderWidth", i11).intValue();
    }

    public final void setCornerRadius(int i11) throws InvalidInputException {
        this.mCornerRadius = requireNonNegative("cornerRadius", i11).intValue();
    }
}
