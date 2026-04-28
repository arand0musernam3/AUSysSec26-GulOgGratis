package u50;

import b0.z;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f40810e = {1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f40811f = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f40812g = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f40813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[][] f40814i;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f40813h = iArr;
        int[][] iArr2 = new int[20][];
        f40814i = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i11 = 10; i11 < 20; i11++) {
            int[] iArr3 = f40813h[i11 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                iArr4[i12] = iArr3[(iArr3.length - i12) - 1];
            }
            f40814i[i11] = iArr4;
        }
    }

    public static boolean B(String str) {
        int length = str.length();
        if (length != 0) {
            int i11 = length - 1;
            if (C(str.subSequence(0, i11)) == Character.digit(str.charAt(i11), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int C(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            int iCharAt = charSequence.charAt(i12) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                FormatException formatException = FormatException.f12900c;
                if (ReaderException.f12901a) {
                    throw new FormatException();
                }
                throw FormatException.f12900c;
            }
            i11 += iCharAt;
        }
        int i13 = i11 * 3;
        for (int i14 = length - 2; i14 >= 0; i14 -= 2) {
            int iCharAt2 = charSequence.charAt(i14) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                FormatException formatException2 = FormatException.f12900c;
                if (ReaderException.f12901a) {
                    throw new FormatException();
                }
                throw FormatException.f12900c;
            }
            i13 += iCharAt2;
        }
        return (1000 - i13) % 10;
    }
}
