package no;

import com.app.tgtg.model.remote.order.OrderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class u {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[oo.f.values().length];
        try {
            iArr[oo.f.GENERIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oo.f.DISABLE_INVITATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[OrderState.values().length];
        try {
            iArr2[OrderState.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[OrderState.NOT_COLLECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[OrderState.REFUNDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[OrderState.AUTO_REFUNDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[OrderState.COLLECTION_DELEGATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
