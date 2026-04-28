package com.app.tgtg.model.remote.order;

import a80.a;
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
@h(with = PaymentStatusSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/app/tgtg/model/remote/order/PaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "AUTHORIZATION_INITIATED", "REAUTHORIZATION_REQUIRED", "ADDITIONAL_AUTHORIZATION_REQUIRED", "ADDITIONAL_AUTHORIZATION_INITIATED", "AUTHORIZED", "CAPTURE_INITIATED", "CAPTURED", "CANCELLED", "FAILED", "CANCEL_INITIATED", "ABORTED", "USER_ABORTED", "PARTIAL_REFUND_INITIATED", "PARTIALLY_REFUNDED", "FULL_REFUND_INITIATED", "FULLY_REFUNDED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PaymentStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PaymentStatus[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final PaymentStatus CREATED = new PaymentStatus("CREATED", 0);
    public static final PaymentStatus AUTHORIZATION_INITIATED = new PaymentStatus("AUTHORIZATION_INITIATED", 1);
    public static final PaymentStatus REAUTHORIZATION_REQUIRED = new PaymentStatus("REAUTHORIZATION_REQUIRED", 2);
    public static final PaymentStatus ADDITIONAL_AUTHORIZATION_REQUIRED = new PaymentStatus("ADDITIONAL_AUTHORIZATION_REQUIRED", 3);
    public static final PaymentStatus ADDITIONAL_AUTHORIZATION_INITIATED = new PaymentStatus("ADDITIONAL_AUTHORIZATION_INITIATED", 4);
    public static final PaymentStatus AUTHORIZED = new PaymentStatus("AUTHORIZED", 5);
    public static final PaymentStatus CAPTURE_INITIATED = new PaymentStatus("CAPTURE_INITIATED", 6);
    public static final PaymentStatus CAPTURED = new PaymentStatus("CAPTURED", 7);
    public static final PaymentStatus CANCELLED = new PaymentStatus("CANCELLED", 8);
    public static final PaymentStatus FAILED = new PaymentStatus("FAILED", 9);
    public static final PaymentStatus CANCEL_INITIATED = new PaymentStatus("CANCEL_INITIATED", 10);
    public static final PaymentStatus ABORTED = new PaymentStatus("ABORTED", 11);
    public static final PaymentStatus USER_ABORTED = new PaymentStatus("USER_ABORTED", 12);
    public static final PaymentStatus PARTIAL_REFUND_INITIATED = new PaymentStatus("PARTIAL_REFUND_INITIATED", 13);
    public static final PaymentStatus PARTIALLY_REFUNDED = new PaymentStatus("PARTIALLY_REFUNDED", 14);
    public static final PaymentStatus FULL_REFUND_INITIATED = new PaymentStatus("FULL_REFUND_INITIATED", 15);
    public static final PaymentStatus FULLY_REFUNDED = new PaymentStatus("FULLY_REFUNDED", 16);
    public static final PaymentStatus UNKNOWN = new PaymentStatus("UNKNOWN", 17);

    private static final /* synthetic */ PaymentStatus[] $values() {
        return new PaymentStatus[]{CREATED, AUTHORIZATION_INITIATED, REAUTHORIZATION_REQUIRED, ADDITIONAL_AUTHORIZATION_REQUIRED, ADDITIONAL_AUTHORIZATION_INITIATED, AUTHORIZED, CAPTURE_INITIATED, CAPTURED, CANCELLED, FAILED, CANCEL_INITIATED, ABORTED, USER_ABORTED, PARTIAL_REFUND_INITIATED, PARTIALLY_REFUNDED, FULL_REFUND_INITIATED, FULLY_REFUNDED, UNKNOWN};
    }

    static {
        PaymentStatus[] paymentStatusArr$values = $values();
        $VALUES = paymentStatusArr$values;
        $ENTRIES = n.w(paymentStatusArr$values);
        INSTANCE = new Companion(null);
    }

    private PaymentStatus(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PaymentStatus valueOf(String str) {
        return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
    }

    public static PaymentStatus[] values() {
        return (PaymentStatus[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/PaymentStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/PaymentStatus;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PaymentStatusSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
