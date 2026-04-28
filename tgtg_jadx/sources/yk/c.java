package yk;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[jl.a.values().length];
        try {
            iArr[jl.a.ROW_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jl.a.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jl.a.SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[j.values().length];
        try {
            iArr2[j.ADDRESS_PICKER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j.SELECTED_ADDRESS_PICKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j.STATIONS_PICKER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j.SELECT_AREA.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
