package v0;

import s0.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f41603a;

    static {
        int[] iArr = new int[x.values().length];
        f41603a = iArr;
        try {
            iArr[x.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f41603a[x.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f41603a[x.FIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
