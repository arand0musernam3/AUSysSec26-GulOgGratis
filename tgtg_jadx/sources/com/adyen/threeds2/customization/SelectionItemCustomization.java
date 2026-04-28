package com.adyen.threeds2.customization;

import com.adyen.threeds2.exception.InvalidInputException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectionItemCustomization extends Customization {
    private String mBorderColorCode;
    private int mBorderWidth = -1;
    private String mHighlightedBackgroundColorCode;
    private String mSelectionIndicatorTintColorCode;

    public final String getBorderColor() {
        return this.mBorderColorCode;
    }

    public final int getBorderWidth() {
        return this.mBorderWidth;
    }

    public final String getHighlightedBackgroundColor() {
        return this.mHighlightedBackgroundColorCode;
    }

    public final String getSelectionIndicatorTintColor() {
        return this.mSelectionIndicatorTintColorCode;
    }

    public final void setBorderColor(String str) throws InvalidInputException {
        this.mBorderColorCode = requireHexColorCode(str);
    }

    public final void setBorderWidth(int i11) throws InvalidInputException {
        this.mBorderWidth = requireNonNegative("borderWidth", i11).intValue();
    }

    public final void setHighlightedBackgroundColor(String str) throws InvalidInputException {
        this.mHighlightedBackgroundColorCode = requireHexColorCode(str);
    }

    public final void setSelectionIndicatorTintColor(String str) throws InvalidInputException {
        this.mSelectionIndicatorTintColorCode = requireHexColorCode(str);
    }
}
