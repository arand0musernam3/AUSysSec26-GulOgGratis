package com.adyen.checkout.core.internal.util;

import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00020\b\"\u00020\tJ\u001c\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u000b\u001a\u00020\b\"\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/core/internal/util/StringUtil;", "", "()V", "isDigitsAndSeparatorsOnly", "", "value", "", "separators", "", "", "normalize", "additionalCharsToReplace", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StringUtil {

    @NotNull
    public static final StringUtil INSTANCE = new StringUtil();

    private StringUtil() {
    }

    @NotNull
    public static final String normalize(@NotNull String value, @NotNull char... additionalCharsToReplace) {
        value.getClass();
        additionalCharsToReplace.getClass();
        return new Regex(a0.p("[\\s", new String(additionalCharsToReplace), "]")).replace(value, "");
    }

    public final boolean isDigitsAndSeparatorsOnly(@NotNull String value, @NotNull char... separators) {
        value.getClass();
        separators.getClass();
        int length = value.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                return true;
            }
            char cCharAt = value.charAt(i11);
            if (!Character.isDigit(cCharAt)) {
                if ((separators.length == 0) || !y.s(separators, cCharAt)) {
                    break;
                }
            }
            i11++;
        }
        return false;
    }
}
