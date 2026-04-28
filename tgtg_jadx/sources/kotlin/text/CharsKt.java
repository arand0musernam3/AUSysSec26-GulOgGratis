package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {2, 3, 0}, xi = 49)
public final class CharsKt extends a {
    public static boolean b(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public static String c(char c3, Locale locale) {
        locale.getClass();
        String strValueOf = String.valueOf(c3);
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c3);
            strValueOf2.getClass();
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (Intrinsics.areEqual(upperCase, upperCase2)) {
                return String.valueOf(Character.toTitleCase(c3));
            }
        } else if (c3 != 329) {
            char cCharAt = upperCase.charAt(0);
            String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return cCharAt + lowerCase;
        }
        return upperCase;
    }
}
