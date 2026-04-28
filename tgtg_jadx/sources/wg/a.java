package wg;

import vg.b;
import vg.c;
import vg.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.SAVED_ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.SELECT_AREA_SEARCH_BOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.INITIAL_LOCATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.SEARCH_RESULTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[b.values().length];
        try {
            iArr3[b.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[b.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[b.CONFIRM.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[b.SAVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[b.APPLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[b.ADD_STATIONS.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[jl.b.values().length];
        try {
            iArr4[jl.b.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[jl.b.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[jl.b.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[jl.b.GPS.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[jl.b.SELECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[jl.b.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[jl.b.STATIONS.ordinal()] = 7;
        } catch (NoSuchFieldError unused19) {
        }
        $EnumSwitchMapping$3 = iArr4;
    }
}
