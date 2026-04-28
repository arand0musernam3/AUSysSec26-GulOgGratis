package com.app.tgtg.model.remote.order;

import a80.a;
import i90.g;
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
@h(with = OrderTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderType;", "", "<init>", "(Ljava/lang/String;I)V", "MAGICBAG", "MANUFACTURER", "CHARITY", "FLASH_SALES", "CATERING", "TABLE_RESERVATION", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OrderType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("MAGICBAG")
    public static final OrderType MAGICBAG = new OrderType("MAGICBAG", 0);

    @g("MANUFACTURER")
    public static final OrderType MANUFACTURER = new OrderType("MANUFACTURER", 1);

    @g("CHARITY")
    public static final OrderType CHARITY = new OrderType("CHARITY", 2);

    @g("FLASH_SALES")
    public static final OrderType FLASH_SALES = new OrderType("FLASH_SALES", 3);

    @g("CATERING")
    public static final OrderType CATERING = new OrderType("CATERING", 4);

    @g("TABLE_RESERVATION")
    public static final OrderType TABLE_RESERVATION = new OrderType("TABLE_RESERVATION", 5);
    public static final OrderType UNKNOWN = new OrderType("UNKNOWN", 6);

    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{MAGICBAG, MANUFACTURER, CHARITY, FLASH_SALES, CATERING, TABLE_RESERVATION, UNKNOWN};
    }

    static {
        OrderType[] orderTypeArr$values = $values();
        $VALUES = orderTypeArr$values;
        $ENTRIES = n.w(orderTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private OrderType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/OrderType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/OrderType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return OrderTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
