package xn;

import com.app.tgtg.model.remote.brief.BriefOrderChangeState;
import com.app.tgtg.model.remote.order.OrderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[OrderState.values().length];
        try {
            iArr[OrderState.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[BriefOrderChangeState.values().length];
        try {
            iArr2[BriefOrderChangeState.DELEGATE_ACCEPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[BriefOrderChangeState.DELEGATED_FULFILLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BriefOrderChangeState.DELEGATED_RETURNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
