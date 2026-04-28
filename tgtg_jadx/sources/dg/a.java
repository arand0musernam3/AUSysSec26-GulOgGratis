package dg;

import lv.q;
import lv.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[lv.e.values().length];
        try {
            iArr[lv.e.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lv.e.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lv.e.SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[q.DANGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[q.INVERTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[q.GREY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[r.values().length];
        try {
            iArr3[r.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[r.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[r.TERTIARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
