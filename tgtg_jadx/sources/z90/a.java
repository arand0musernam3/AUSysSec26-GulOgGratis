package z90;

import y00.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f47413a = new d0(11);

    public static final int a(int i11, String str) {
        char cCharAt = str.charAt(i11);
        return (cCharAt << 7) + str.charAt(i11 + 1);
    }
}
