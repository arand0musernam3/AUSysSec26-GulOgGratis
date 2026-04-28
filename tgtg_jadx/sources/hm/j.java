package hm;

import com.app.tgtg.model.remote.order.CancelOrderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class j {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[zn.e.values().length];
        try {
            iArr[zn.e.BBMSURVEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zn.e.USERREDEEMEDREWARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zn.e.USERHASEXPIREDREWARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[mv.y.values().length];
        try {
            iArr2[mv.y.MAIN_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[CancelOrderState.values().length];
        try {
            iArr3[CancelOrderState.ALREADY_CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[CancelOrderState.CANCEL_DEADLINE_EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[CancelOrderState.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
