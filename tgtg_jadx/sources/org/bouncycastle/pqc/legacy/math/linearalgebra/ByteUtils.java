package org.bouncycastle.pqc.legacy.math.linearalgebra;

import b3.i;
import org.bouncycastle.util.Strings;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteUtils {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private ByteUtils() {
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[][] bArr) {
        int length = bArr[0].length;
        byte[] bArr2 = new byte[bArr.length * length];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i11, length);
            i11 += length;
        }
        return bArr2;
    }

    public static int deepHashCode(byte[][] bArr) {
        int iDeepHashCode = 1;
        for (byte[] bArr2 : bArr) {
            iDeepHashCode = (iDeepHashCode * 31) + deepHashCode(bArr2);
        }
        return iDeepHashCode;
    }

    public static boolean equals(byte[][][] bArr, byte[][][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte[][] bArr3 = bArr[length];
            if (bArr3.length != bArr2[length].length) {
                return false;
            }
            for (int length2 = bArr3.length - 1; length2 >= 0; length2--) {
                zEquals &= equals(bArr[length][length2], bArr2[length][length2]);
            }
        }
        return zEquals;
    }

    public static byte[] fromHexString(String str) {
        char[] charArray = Strings.toUpperCase(str).toCharArray();
        int i11 = 0;
        for (char c3 : charArray) {
            if ((c3 >= '0' && c3 <= '9') || (c3 >= 'A' && c3 <= 'F')) {
                i11++;
            }
        }
        byte[] bArr = new byte[(i11 + 1) >> 1];
        int i12 = i11 & 1;
        for (char c7 : charArray) {
            if (c7 >= '0' && c7 <= '9') {
                int i13 = i12 >> 1;
                byte b8 = (byte) (bArr[i13] << 4);
                bArr[i13] = b8;
                bArr[i13] = (byte) ((c7 - '0') | b8);
            } else if (c7 >= 'A' && c7 <= 'F') {
                int i14 = i12 >> 1;
                byte b11 = (byte) (bArr[i14] << 4);
                bArr[i14] = b11;
                bArr[i14] = (byte) ((c7 - '7') | b11);
            }
            i12++;
        }
        return bArr;
    }

    public static byte[][] split(byte[] bArr, int i11) throws ArrayIndexOutOfBoundsException {
        if (i11 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        byte[][] bArr2 = {new byte[i11], new byte[bArr.length - i11]};
        System.arraycopy(bArr, 0, bArr2[0], 0, i11);
        System.arraycopy(bArr, i11, bArr2[1], 0, bArr.length - i11);
        return bArr2;
    }

    public static byte[] subArray(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, i11, bArr2, 0, i13);
        return bArr2;
    }

    public static String toBinaryString(byte[] bArr) {
        String strL = "";
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b8 = bArr[i11];
            for (int i12 = 0; i12 < 8; i12++) {
                strL = strL + ((b8 >>> i12) & 1);
            }
            if (i11 != bArr.length - 1) {
                strL = k.l(strL, " ");
            }
        }
        return strL;
    }

    public static char[] toCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            cArr[i11] = (char) bArr[i11];
        }
        return cArr;
    }

    public static String toHexString(byte[] bArr, String str, String str2) {
        String str3 = new String(str);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            StringBuilder sbO = i.o(str3);
            char[] cArr = HEX_CHARS;
            sbO.append(cArr[(bArr[i11] >>> 4) & 15]);
            StringBuilder sbO2 = i.o(sbO.toString());
            sbO2.append(cArr[bArr[i11] & 15]);
            str3 = sbO2.toString();
            if (i11 < bArr.length - 1) {
                str3 = k.l(str3, str2);
            }
        }
        return str3;
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr3[length] = (byte) (bArr[length] ^ bArr2[length]);
        }
        return bArr3;
    }

    public static byte[] subArray(byte[] bArr, int i11) {
        return subArray(bArr, i11, bArr.length);
    }

    public static int deepHashCode(byte[] bArr) {
        int i11 = 1;
        for (byte b8 : bArr) {
            i11 = (i11 * 31) + b8;
        }
        return i11;
    }

    public static int deepHashCode(byte[][][] bArr) {
        int iDeepHashCode = 1;
        for (byte[][] bArr2 : bArr) {
            iDeepHashCode = (iDeepHashCode * 31) + deepHashCode(bArr2);
        }
        return iDeepHashCode;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            zEquals &= equals(bArr[length], bArr2[length]);
        }
        return zEquals;
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z11 = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z11 &= bArr[length] == bArr2[length];
        }
        return z11;
    }

    public static String toHexString(byte[] bArr) {
        String string = "";
        for (int i11 = 0; i11 < bArr.length; i11++) {
            StringBuilder sbO = i.o(string);
            char[] cArr = HEX_CHARS;
            sbO.append(cArr[(bArr[i11] >>> 4) & 15]);
            StringBuilder sbO2 = i.o(sbO.toString());
            sbO2.append(cArr[bArr[i11] & 15]);
            string = sbO2.toString();
        }
        return string;
    }
}
