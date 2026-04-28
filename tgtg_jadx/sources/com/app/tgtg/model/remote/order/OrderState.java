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
@h(with = OrderStateSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "REDEEMED", "REFUNDED_OR_CANCELLED", "UNREDEEMED", "NOT_COLLECTED", "AUTO_REFUNDED", "REFUNDED", "ADDITIONAL_AUTHORIZATION_REQUIRED", "REAUTHORIZATION_REQUIRED", "AUTHORIZED", "CAPTURED", "CANCELLED", "FAILED", "PAID", "ABORTED", "USER_ABORTED", "SHIPPED", "DELIVERED", "COLLECTION_OFFERED", "COLLECTION_DELEGATED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OrderState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OrderState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final OrderState ACTIVE = new OrderState("ACTIVE", 0);
    public static final OrderState REDEEMED = new OrderState("REDEEMED", 1);
    public static final OrderState REFUNDED_OR_CANCELLED = new OrderState("REFUNDED_OR_CANCELLED", 2);
    public static final OrderState UNREDEEMED = new OrderState("UNREDEEMED", 3);
    public static final OrderState NOT_COLLECTED = new OrderState("NOT_COLLECTED", 4);
    public static final OrderState AUTO_REFUNDED = new OrderState("AUTO_REFUNDED", 5);
    public static final OrderState REFUNDED = new OrderState("REFUNDED", 6);
    public static final OrderState ADDITIONAL_AUTHORIZATION_REQUIRED = new OrderState("ADDITIONAL_AUTHORIZATION_REQUIRED", 7);
    public static final OrderState REAUTHORIZATION_REQUIRED = new OrderState("REAUTHORIZATION_REQUIRED", 8);
    public static final OrderState AUTHORIZED = new OrderState("AUTHORIZED", 9);
    public static final OrderState CAPTURED = new OrderState("CAPTURED", 10);
    public static final OrderState CANCELLED = new OrderState("CANCELLED", 11);
    public static final OrderState FAILED = new OrderState("FAILED", 12);
    public static final OrderState PAID = new OrderState("PAID", 13);
    public static final OrderState ABORTED = new OrderState("ABORTED", 14);
    public static final OrderState USER_ABORTED = new OrderState("USER_ABORTED", 15);
    public static final OrderState SHIPPED = new OrderState("SHIPPED", 16);
    public static final OrderState DELIVERED = new OrderState("DELIVERED", 17);
    public static final OrderState COLLECTION_OFFERED = new OrderState("COLLECTION_OFFERED", 18);
    public static final OrderState COLLECTION_DELEGATED = new OrderState("COLLECTION_DELEGATED", 19);
    public static final OrderState UNKNOWN = new OrderState("UNKNOWN", 20);

    private static final /* synthetic */ OrderState[] $values() {
        return new OrderState[]{ACTIVE, REDEEMED, REFUNDED_OR_CANCELLED, UNREDEEMED, NOT_COLLECTED, AUTO_REFUNDED, REFUNDED, ADDITIONAL_AUTHORIZATION_REQUIRED, REAUTHORIZATION_REQUIRED, AUTHORIZED, CAPTURED, CANCELLED, FAILED, PAID, ABORTED, USER_ABORTED, SHIPPED, DELIVERED, COLLECTION_OFFERED, COLLECTION_DELEGATED, UNKNOWN};
    }

    static {
        OrderState[] orderStateArr$values = $values();
        $VALUES = orderStateArr$values;
        $ENTRIES = n.w(orderStateArr$values);
        INSTANCE = new Companion(null);
    }

    private OrderState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static OrderState valueOf(String str) {
        return (OrderState) Enum.valueOf(OrderState.class, str);
    }

    public static OrderState[] values() {
        return (OrderState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
