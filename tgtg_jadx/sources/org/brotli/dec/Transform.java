package org.brotli.dec;

import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class Transform {
    static final Transform[] TRANSFORMS = {new Transform("", 0, ""), new Transform("", 0, " "), new Transform(" ", 0, " "), new Transform("", 12, ""), new Transform("", 10, " "), new Transform("", 0, " the "), new Transform(" ", 0, ""), new Transform("s ", 0, " "), new Transform("", 0, " of "), new Transform("", 10, ""), new Transform("", 0, " and "), new Transform("", 13, ""), new Transform("", 1, ""), new Transform(", ", 0, " "), new Transform("", 0, ", "), new Transform(" ", 10, " "), new Transform("", 0, " in "), new Transform("", 0, " to "), new Transform("e ", 0, " "), new Transform("", 0, "\""), new Transform("", 0, "."), new Transform("", 0, "\">"), new Transform("", 0, "\n"), new Transform("", 3, ""), new Transform("", 0, "]"), new Transform("", 0, " for "), new Transform("", 14, ""), new Transform("", 2, ""), new Transform("", 0, " a "), new Transform("", 0, " that "), new Transform(" ", 10, ""), new Transform("", 0, ". "), new Transform(".", 0, ""), new Transform(" ", 0, ", "), new Transform("", 15, ""), new Transform("", 0, " with "), new Transform("", 0, "'"), new Transform("", 0, " from "), new Transform("", 0, " by "), new Transform("", 16, ""), new Transform("", 17, ""), new Transform(" the ", 0, ""), new Transform("", 4, ""), new Transform("", 0, ". The "), new Transform("", 11, ""), new Transform("", 0, " on "), new Transform("", 0, " as "), new Transform("", 0, " is "), new Transform("", 7, ""), new Transform("", 1, "ing "), new Transform("", 0, "\n\t"), new Transform("", 0, ":"), new Transform(" ", 0, ". "), new Transform("", 0, "ed "), new Transform("", 20, ""), new Transform("", 18, ""), new Transform("", 6, ""), new Transform("", 0, "("), new Transform("", 10, ", "), new Transform("", 8, ""), new Transform("", 0, " at "), new Transform("", 0, "ly "), new Transform(" the ", 0, " of "), new Transform("", 5, ""), new Transform("", 9, ""), new Transform(" ", 10, ", "), new Transform("", 10, "\""), new Transform(".", 0, "("), new Transform("", 11, " "), new Transform("", 10, "\">"), new Transform("", 0, "=\""), new Transform(" ", 0, "."), new Transform(".com/", 0, ""), new Transform(" the ", 0, " of the "), new Transform("", 10, "'"), new Transform("", 0, ". This "), new Transform("", 0, MessageLogView.COMMA_SEPARATOR), new Transform(".", 0, " "), new Transform("", 10, "("), new Transform("", 10, "."), new Transform("", 0, " not "), new Transform(" ", 0, "=\""), new Transform("", 0, "er "), new Transform(" ", 11, " "), new Transform("", 0, "al "), new Transform(" ", 11, ""), new Transform("", 0, "='"), new Transform("", 11, "\""), new Transform("", 10, ". "), new Transform(" ", 0, "("), new Transform("", 0, "ful "), new Transform(" ", 10, ". "), new Transform("", 0, "ive "), new Transform("", 0, "less "), new Transform("", 11, "'"), new Transform("", 0, "est "), new Transform(" ", 10, "."), new Transform("", 11, "\">"), new Transform(" ", 0, "='"), new Transform("", 10, MessageLogView.COMMA_SEPARATOR), new Transform("", 0, "ize "), new Transform("", 11, "."), new Transform("Â ", 0, ""), new Transform(" ", 0, MessageLogView.COMMA_SEPARATOR), new Transform("", 10, "=\""), new Transform("", 11, "=\""), new Transform("", 0, "ous "), new Transform("", 11, ", "), new Transform("", 10, "='"), new Transform(" ", 10, MessageLogView.COMMA_SEPARATOR), new Transform(" ", 11, "=\""), new Transform(" ", 11, ", "), new Transform("", 11, MessageLogView.COMMA_SEPARATOR), new Transform("", 11, "("), new Transform("", 11, ". "), new Transform(" ", 11, "."), new Transform("", 11, "='"), new Transform(" ", 11, ". "), new Transform(" ", 10, "=\""), new Transform(" ", 11, "='"), new Transform(" ", 10, "='")};
    private final byte[] prefix;
    private final byte[] suffix;
    private final int type;

    public Transform(String str, int i11, String str2) {
        this.prefix = readUniBytes(str);
        this.type = i11;
        this.suffix = readUniBytes(str2);
    }

    public static byte[] readUniBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = (byte) str.charAt(i11);
        }
        return bArr;
    }

    public static int transformDictionaryWord(byte[] bArr, int i11, byte[] bArr2, int i12, int i13, Transform transform) {
        int i14 = i11;
        for (byte b8 : transform.prefix) {
            bArr[i14] = b8;
            i14++;
        }
        int i15 = transform.type;
        int omitFirst = WordTransformType.getOmitFirst(i15);
        if (omitFirst > i13) {
            omitFirst = i13;
        }
        int i16 = i12 + omitFirst;
        int omitLast = (i13 - omitFirst) - WordTransformType.getOmitLast(i15);
        int i17 = omitLast;
        while (i17 > 0) {
            bArr[i14] = bArr2[i16];
            i17--;
            i14++;
            i16++;
        }
        if (i15 == 11 || i15 == 10) {
            int i18 = i14 - omitLast;
            if (i15 == 10) {
                omitLast = 1;
            }
            while (omitLast > 0) {
                byte b11 = bArr[i18];
                int i19 = b11 & 255;
                if (i19 < 192) {
                    if (i19 >= 97 && i19 <= 122) {
                        bArr[i18] = (byte) (b11 ^ 32);
                    }
                    i18++;
                    omitLast--;
                } else if (i19 < 224) {
                    int i21 = i18 + 1;
                    bArr[i21] = (byte) (bArr[i21] ^ 32);
                    i18 += 2;
                    omitLast -= 2;
                } else {
                    int i22 = i18 + 2;
                    bArr[i22] = (byte) (bArr[i22] ^ 5);
                    i18 += 3;
                    omitLast -= 3;
                }
            }
        }
        for (byte b12 : transform.suffix) {
            bArr[i14] = b12;
            i14++;
        }
        return i14 - i11;
    }
}
