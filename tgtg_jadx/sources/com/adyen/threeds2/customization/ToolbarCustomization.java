package com.adyen.threeds2.customization;

import com.adyen.threeds2.exception.InvalidInputException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ToolbarCustomization extends Customization {
    private String mBackgroundColorCode;
    private String mButtonText;
    private String mHeaderText;

    public final String getBackgroundColor() {
        return this.mBackgroundColorCode;
    }

    public final String getButtonText() {
        return this.mButtonText;
    }

    public final String getHeaderText() {
        return this.mHeaderText;
    }

    public final void setBackgroundColor(String str) throws InvalidInputException {
        this.mBackgroundColorCode = requireHexColorCode(str);
    }

    public final void setButtonText(String str) throws InvalidInputException {
        this.mButtonText = requireNonEmpty("buttonText", str);
    }

    public final void setHeaderText(String str) throws InvalidInputException {
        this.mHeaderText = requireNonEmpty("headerText", str);
    }
}
