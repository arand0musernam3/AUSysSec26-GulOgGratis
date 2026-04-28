package com.adyen.threeds2.customization;

import com.adyen.threeds2.exception.InvalidInputException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandableInfoCustomization extends Customization {
    private String mBorderColorCode;
    private String mExpandedStateIndicatorColorCode;
    private String mHeadingTextColorCode;
    private String mHeadingTextFontName;
    private String mHighlightedBackgroundColorCode;
    private int mHeadingTextFontSize = -1;
    private int mBorderWidth = -1;

    public final String getBorderColor() {
        return this.mBorderColorCode;
    }

    public final int getBorderWidth() {
        return this.mBorderWidth;
    }

    public final String getExpandedStateIndicatorColor() {
        return this.mExpandedStateIndicatorColorCode;
    }

    public final String getHeadingTextColor() {
        return this.mHeadingTextColorCode;
    }

    public final String getHeadingTextFontName() {
        return this.mHeadingTextFontName;
    }

    public final int getHeadingTextFontSize() {
        return this.mHeadingTextFontSize;
    }

    public final String getHighlightedBackgroundColor() {
        return this.mHighlightedBackgroundColorCode;
    }

    public final void setBorderColor(String str) throws InvalidInputException {
        this.mBorderColorCode = requireHexColorCode(str);
    }

    public final void setBorderWidth(int i11) throws InvalidInputException {
        this.mBorderWidth = requireNonNegative("borderWidth", i11).intValue();
    }

    public final void setExpandStateIndicatorColor(String str) throws InvalidInputException {
        this.mExpandedStateIndicatorColorCode = requireHexColorCode(str);
    }

    public final void setHeadingTextColor(String str) throws InvalidInputException {
        this.mHeadingTextColorCode = requireHexColorCode(str);
    }

    public final void setHeadingTextFontName(String str) throws InvalidInputException {
        this.mHeadingTextFontName = requireNonEmpty("fontName", str);
    }

    public final void setHeadingTextFontSize(int i11) throws InvalidInputException {
        this.mHeadingTextFontSize = requireNonNegative("fontSize", i11).intValue();
    }

    public final void setHighlightedBackgroundColor(String str) throws InvalidInputException {
        this.mHighlightedBackgroundColorCode = requireHexColorCode(str);
    }
}
