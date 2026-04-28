package gf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[jf.b.values().length];
        try {
            iArr[jf.b.Created.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jf.b.Started.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jf.b.Resumed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jf.b.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[jf.b.Stopped.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[jf.b.Destroyed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
