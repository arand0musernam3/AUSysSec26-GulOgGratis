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
@h(with = CancelOrderErrorStateSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/order/CancelOrderState;", "", "<init>", "(Ljava/lang/String;I)V", "ALREADY_CANCELLED", "ILLEGAL_ORDER_STATE", "INVALID_CANCEL_REASON", "CANCEL_DEADLINE_EXCEEDED", "SUCCESS", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CancelOrderState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CancelOrderState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CancelOrderState ALREADY_CANCELLED = new CancelOrderState("ALREADY_CANCELLED", 0);
    public static final CancelOrderState ILLEGAL_ORDER_STATE = new CancelOrderState("ILLEGAL_ORDER_STATE", 1);
    public static final CancelOrderState INVALID_CANCEL_REASON = new CancelOrderState("INVALID_CANCEL_REASON", 2);
    public static final CancelOrderState CANCEL_DEADLINE_EXCEEDED = new CancelOrderState("CANCEL_DEADLINE_EXCEEDED", 3);
    public static final CancelOrderState SUCCESS = new CancelOrderState("SUCCESS", 4);
    public static final CancelOrderState UNKNOWN = new CancelOrderState("UNKNOWN", 5);

    private static final /* synthetic */ CancelOrderState[] $values() {
        return new CancelOrderState[]{ALREADY_CANCELLED, ILLEGAL_ORDER_STATE, INVALID_CANCEL_REASON, CANCEL_DEADLINE_EXCEEDED, SUCCESS, UNKNOWN};
    }

    static {
        CancelOrderState[] cancelOrderStateArr$values = $values();
        $VALUES = cancelOrderStateArr$values;
        $ENTRIES = n.w(cancelOrderStateArr$values);
        INSTANCE = new Companion(null);
    }

    private CancelOrderState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CancelOrderState valueOf(String str) {
        return (CancelOrderState) Enum.valueOf(CancelOrderState.class, str);
    }

    public static CancelOrderState[] values() {
        return (CancelOrderState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/CancelOrderState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/CancelOrderState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CancelOrderErrorStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
