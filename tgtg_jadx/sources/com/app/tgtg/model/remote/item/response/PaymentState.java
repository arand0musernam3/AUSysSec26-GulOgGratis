package com.app.tgtg.model.remote.item.response;

import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = PaymentStateEnumSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/PaymentState;", "", "<init>", "(Ljava/lang/String;I)V", "RESERVATION_LIFTED", "MONEY_RETURNED", "VOUCHER_REINSTATED", "ZERO_COST", "RESERVATION_LIFTED_AND_VOUCHER_REINSTATED", "RESERVATION_LIFTED_AND_DISCOUNT_REINSTATED", "MONEY_RETURNED_AND_VOUCHER_REINSTATED", "MONEY_RETURNED_AND_DISCOUNT_REINSTATED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PaymentState {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ PaymentState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final PaymentState RESERVATION_LIFTED = new PaymentState("RESERVATION_LIFTED", 0);
    public static final PaymentState MONEY_RETURNED = new PaymentState("MONEY_RETURNED", 1);
    public static final PaymentState VOUCHER_REINSTATED = new PaymentState("VOUCHER_REINSTATED", 2);
    public static final PaymentState ZERO_COST = new PaymentState("ZERO_COST", 3);
    public static final PaymentState RESERVATION_LIFTED_AND_VOUCHER_REINSTATED = new PaymentState("RESERVATION_LIFTED_AND_VOUCHER_REINSTATED", 4);
    public static final PaymentState RESERVATION_LIFTED_AND_DISCOUNT_REINSTATED = new PaymentState("RESERVATION_LIFTED_AND_DISCOUNT_REINSTATED", 5);
    public static final PaymentState MONEY_RETURNED_AND_VOUCHER_REINSTATED = new PaymentState("MONEY_RETURNED_AND_VOUCHER_REINSTATED", 6);
    public static final PaymentState MONEY_RETURNED_AND_DISCOUNT_REINSTATED = new PaymentState("MONEY_RETURNED_AND_DISCOUNT_REINSTATED", 7);
    public static final PaymentState UNKNOWN = new PaymentState("UNKNOWN", 8);

    private static final /* synthetic */ PaymentState[] $values() {
        return new PaymentState[]{RESERVATION_LIFTED, MONEY_RETURNED, VOUCHER_REINSTATED, ZERO_COST, RESERVATION_LIFTED_AND_VOUCHER_REINSTATED, RESERVATION_LIFTED_AND_DISCOUNT_REINSTATED, MONEY_RETURNED_AND_VOUCHER_REINSTATED, MONEY_RETURNED_AND_DISCOUNT_REINSTATED, UNKNOWN};
    }

    static {
        PaymentState[] paymentStateArr$values = $values();
        $VALUES = paymentStateArr$values;
        $ENTRIES = n.w(paymentStateArr$values);
        INSTANCE = new Companion(null);
    }

    private PaymentState(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static PaymentState valueOf(String str) {
        return (PaymentState) Enum.valueOf(PaymentState.class, str);
    }

    public static PaymentState[] values() {
        return (PaymentState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/PaymentState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/PaymentState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PaymentStateEnumSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
