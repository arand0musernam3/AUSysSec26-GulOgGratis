package com.adyen.threeds2.customization;

import com.adyen.threeds2.exception.InvalidInputException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class LabelCustomization extends Customization {
    private String mHeadingTextColorCode;
    private String mHeadingTextFontName;
    private String mInputLabelTextColorCode;
    private String mInputLabelTextFontName;
    private int mHeadingTextFontSize = -1;
    private int mInputLabelTextFontSize = -1;

    public final String getHeadingTextColor() {
        return this.mHeadingTextColorCode;
    }

    public final String getHeadingTextFontName() {
        return this.mHeadingTextFontName;
    }

    public final int getHeadingTextFontSize() {
        return this.mHeadingTextFontSize;
    }

    public final String getInputLabelTextColor() {
        return this.mInputLabelTextColorCode;
    }

    public final String getInputLabelTextFontName() {
        return this.mInputLabelTextFontName;
    }

    public final int getInputLabelTextFontSize() {
        return this.mInputLabelTextFontSize;
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

    public final void setInputLabelTextColor(String str) throws InvalidInputException {
        this.mInputLabelTextColorCode = requireHexColorCode(str);
    }

    public final void setInputLabelTextFontName(String str) throws InvalidInputException {
        this.mInputLabelTextFontName = requireNonEmpty("fontName", str);
    }

    public final void setInputLabelTextFontSize(int i11) throws InvalidInputException {
        this.mInputLabelTextFontSize = requireNonNegative("fontSize", i11).intValue();
    }
}
