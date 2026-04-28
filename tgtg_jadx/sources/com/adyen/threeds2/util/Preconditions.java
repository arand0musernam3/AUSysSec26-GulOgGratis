package com.adyen.threeds2.util;

import com.adyen.threeds2.exception.InvalidInputException;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void requireNonEmpty(String str, String str2) throws InvalidInputException {
        if (str2 == null || str2.length() == 0) {
            throw new InvalidInputException(k.l(str, " must not be empty."), null);
        }
    }

    public static void requireNonLessThan(String str, int i11, int i12) throws InvalidInputException {
        if (i11 >= i12) {
            return;
        }
        throw new InvalidInputException(str + " must not be less than " + i12 + ".", null);
    }

    public static void requireNonNegative(String str, int i11) throws InvalidInputException {
        if (i11 < 0) {
            throw new InvalidInputException(k.l(str, " must not be negative."), null);
        }
    }

    public static void requireNonNull(String str, Object obj) throws InvalidInputException {
        if (obj == null) {
            throw new InvalidInputException(k.l(str, " must not be null."), null);
        }
    }
}
