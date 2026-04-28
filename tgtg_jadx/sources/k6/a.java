package k6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25992a;

    static {
        int[] iArr = new int[j.values().length];
        f25992a = iArr;
        try {
            iArr[j.LEFT_TO_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25992a[j.LEFT_TO_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25992a[j.RIGHT_TO_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f25992a[j.RIGHT_TO_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f25992a[j.START_TO_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f25992a[j.START_TO_END.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f25992a[j.END_TO_START.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f25992a[j.END_TO_END.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f25992a[j.TOP_TO_TOP.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f25992a[j.TOP_TO_BOTTOM.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f25992a[j.TOP_TO_BASELINE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f25992a[j.BOTTOM_TO_TOP.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f25992a[j.BOTTOM_TO_BOTTOM.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f25992a[j.BOTTOM_TO_BASELINE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f25992a[j.BASELINE_TO_BOTTOM.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f25992a[j.BASELINE_TO_TOP.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f25992a[j.BASELINE_TO_BASELINE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f25992a[j.CIRCULAR_CONSTRAINT.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f25992a[j.CENTER_HORIZONTALLY.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f25992a[j.CENTER_VERTICALLY.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
    }
}
