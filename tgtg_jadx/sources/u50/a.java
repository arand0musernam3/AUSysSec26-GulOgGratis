package u50;

import b0.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f40794e = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f40795f = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean B(char[] cArr, char c3) {
        for (char c7 : cArr) {
            if (c7 == c3) {
                return true;
            }
        }
        return false;
    }
}
