package com.adyen.threeds2.customization;

import com.adyen.threeds2.exception.InvalidInputException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ButtonCustomization extends Customization {
    private String mBackgroundColorCode;
    private int mCornerRadius = -1;

    public final String getBackgroundColor() {
        return this.mBackgroundColorCode;
    }

    public final int getCornerRadius() {
        return this.mCornerRadius;
    }

    public final void setBackgroundColor(String str) throws InvalidInputException {
        this.mBackgroundColorCode = requireHexColorCode(str);
    }

    public final void setCornerRadius(int i11) throws InvalidInputException {
        this.mCornerRadius = requireNonNegative("cornerRadius", i11).intValue();
    }
}
