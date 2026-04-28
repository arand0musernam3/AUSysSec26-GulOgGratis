package oo;

import com.app.tgtg.model.remote.item.response.CancellingEntity;
import com.app.tgtg.model.remote.item.response.PaymentState;
import com.app.tgtg.model.remote.order.OrderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[PaymentState.values().length];
        try {
            iArr[PaymentState.RESERVATION_LIFTED_AND_VOUCHER_REINSTATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentState.MONEY_RETURNED_AND_VOUCHER_REINSTATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentState.RESERVATION_LIFTED_AND_DISCOUNT_REINSTATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentState.MONEY_RETURNED_AND_DISCOUNT_REINSTATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentState.RESERVATION_LIFTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentState.MONEY_RETURNED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentState.VOUCHER_REINSTATED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PaymentState.ZERO_COST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[CancellingEntity.values().length];
        try {
            iArr2[CancellingEntity.CONSUMER.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[CancellingEntity.STORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[CancellingEntity.ADMIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[CancellingEntity.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[OrderState.values().length];
        try {
            iArr3[OrderState.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[OrderState.REFUNDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[OrderState.AUTO_REFUNDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
