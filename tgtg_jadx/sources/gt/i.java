package gt;

import com.app.tgtg.model.remote.brief.BriefOrderChangeState;
import com.app.tgtg.model.remote.order.OrderType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[OrderType.values().length];
        try {
            iArr[OrderType.MAGICBAG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderType.MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderType.CHARITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OrderType.FLASH_SALES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[OrderType.CATERING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[OrderType.TABLE_RESERVATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[OrderType.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[BriefOrderChangeState.values().length];
        try {
            iArr2[BriefOrderChangeState.NO_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[BriefOrderChangeState.TIME_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[BriefOrderChangeState.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[BriefOrderChangeState.REFUNDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[BriefOrderChangeState.DELEGATE_ACCEPTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[BriefOrderChangeState.DELEGATED_RETURNED.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[BriefOrderChangeState.DELEGATED_CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[BriefOrderChangeState.DELEGATED_TIME_RETURNED.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[BriefOrderChangeState.DELEGATED_FULFILLED.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
