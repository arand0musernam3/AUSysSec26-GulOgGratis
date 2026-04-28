package o0;

import s0.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[q2.values().length];
        try {
            iArr[q2.IMAGE_ANALYSIS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q2.IMAGE_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q2.PREVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q2.VIDEO_CAPTURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q2.STREAM_SHARING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[p0.b.values().length];
        try {
            iArr2[p0.b.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[p0.b.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p0.b.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[p0.b.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[p0.b.RECORDING_QUALITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
