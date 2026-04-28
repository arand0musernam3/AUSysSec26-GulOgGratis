package com.adyen.threeds2.customization;

import com.adyen.threeds2.exception.InvalidInputException;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ScreenCustomization extends Customization {
    private String mBackgroundColorCode;
    private String mStatusBarColorCode;

    public final String getBackgroundColor() {
        return this.mBackgroundColorCode;
    }

    public final String getStatusBarColor() {
        return this.mStatusBarColorCode;
    }

    public final void setBackgroundColor(String str) throws InvalidInputException {
        this.mBackgroundColorCode = requireHexColorCode(str);
    }

    @d
    public final void setStatusBarColor(String str) {
        this.mStatusBarColorCode = requireHexColorCode(str);
    }
}
