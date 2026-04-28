package zw;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f48229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f48230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f48231c;

    static {
        int[] iArr = new int[b1.values().length];
        f48231c = iArr;
        try {
            iArr[b1.Miter.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f48231c[b1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f48231c[b1.Bevel.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[a1.values().length];
        f48230b = iArr2;
        try {
            iArr2[a1.Butt.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f48230b[a1.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f48230b[a1.Square.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[t.values().length];
        f48229a = iArr3;
        try {
            iArr3[t.xMidYMin.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f48229a[t.xMidYMid.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f48229a[t.xMidYMax.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f48229a[t.xMaxYMin.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f48229a[t.xMaxYMid.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f48229a[t.xMaxYMax.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f48229a[t.xMinYMid.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f48229a[t.xMinYMax.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
