package com.adyen.threeds2.customization;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.util.Preconditions;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class Customization implements Serializable {
    static final int INITIAL_VALUE = -1;
    private String mTextColorCode;
    private String mTextFontName;
    private int mTextFontSize = -1;

    public static Integer parseHexColorCode(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '#') {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Typeface parseTypeface(Context context, String str) {
        Typeface typefaceCreate;
        if (str == null) {
            return null;
        }
        try {
            typefaceCreate = Typeface.createFromAsset(context.getAssets(), str);
        } catch (Exception unused) {
            typefaceCreate = null;
        }
        if (typefaceCreate != null) {
            return typefaceCreate;
        }
        try {
            typefaceCreate = Typeface.createFromFile(str);
        } catch (Exception unused2) {
        }
        if (typefaceCreate != null) {
            return typefaceCreate;
        }
        try {
            typefaceCreate = Typeface.create(str, 0);
        } catch (Exception unused3) {
        }
        if (typefaceCreate != null) {
            return typefaceCreate;
        }
        return null;
    }

    public String getTextColor() {
        return this.mTextColorCode;
    }

    public String getTextFontName() {
        return this.mTextFontName;
    }

    public int getTextFontSize() {
        return this.mTextFontSize;
    }

    public String requireHexColorCode(String str) throws InvalidInputException {
        Preconditions.requireNonNull("hexColorCode", parseHexColorCode(str));
        return str;
    }

    public String requireNonEmpty(String str, String str2) throws InvalidInputException {
        Preconditions.requireNonEmpty(str, str2);
        return str2;
    }

    public Integer requireNonNegative(String str, int i11) throws InvalidInputException {
        Preconditions.requireNonNegative(str, i11);
        return Integer.valueOf(i11);
    }

    public void setTextColor(String str) throws InvalidInputException {
        this.mTextColorCode = requireHexColorCode(str);
    }

    public void setTextFontName(String str) throws InvalidInputException {
        this.mTextFontName = requireNonEmpty("fontName", str);
    }

    public void setTextFontSize(int i11) throws InvalidInputException {
        this.mTextFontSize = requireNonNegative("fontSize", i11).intValue();
    }
}
