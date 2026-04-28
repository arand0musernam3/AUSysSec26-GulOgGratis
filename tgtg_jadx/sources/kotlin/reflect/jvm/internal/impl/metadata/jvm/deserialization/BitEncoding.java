package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class BitEncoding {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean FORCE_8TO7_ENCODING;

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 1 || i11 == 3 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 12 || i11 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 3 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 12 || i11 == 14) ? 2 : 3];
        if (i11 == 1 || i11 == 3 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 12 || i11 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = Bayeux.KEY_DATA;
        }
        if (i11 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i11 == 3) {
            objArr[1] = "encode8to7";
        } else if (i11 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i11 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i11 == 10) {
            objArr[1] = "dropMarker";
        } else if (i11 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i11 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i11) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 1 && i11 != 3 && i11 != 6 && i11 != 8 && i11 != 10 && i11 != 12 && i11 != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        FORCE_8TO7_ENCODING = "true".equals(property);
    }

    private BitEncoding() {
    }

    private static void addModuloByte(@NotNull byte[] bArr, int i11) {
        if (bArr == null) {
            $$$reportNull$$$0(4);
        }
        int length = bArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = (byte) ((bArr[i12] + i11) & 127);
        }
    }

    @NotNull
    private static byte[] combineStringArrayIntoBytes(@NotNull String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(11);
        }
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i11 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i12 = 0;
            while (i12 < length2) {
                bArr[i11] = (byte) str2.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }

    @NotNull
    private static byte[] decode7to8(@NotNull byte[] bArr) {
        if (bArr == null) {
            $$$reportNull$$$0(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i11 + 1;
            int i15 = i12 + 1;
            bArr2[i13] = (byte) (((bArr[i11] & 255) >>> i12) + ((bArr[i14] & ((1 << i15) - 1)) << (7 - i12)));
            if (i12 == 6) {
                i11 += 2;
                i12 = 0;
            } else {
                i11 = i14;
                i12 = i15;
            }
        }
        return bArr2;
    }

    @NotNull
    public static byte[] decodeBytes(@NotNull String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                byte[] bArrStringsToBytes = UtfEncodingKt.stringsToBytes(dropMarker(strArr));
                if (bArrStringsToBytes == null) {
                    $$$reportNull$$$0(8);
                }
                return bArrStringsToBytes;
            }
            if (cCharAt == 65535) {
                strArr = dropMarker(strArr);
            }
        }
        byte[] bArrCombineStringArrayIntoBytes = combineStringArrayIntoBytes(strArr);
        addModuloByte(bArrCombineStringArrayIntoBytes, 127);
        return decode7to8(bArrCombineStringArrayIntoBytes);
    }

    @NotNull
    private static String[] dropMarker(@NotNull String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
