package com.app.tgtg.model.remote.payment;

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
@h(with = LineTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/payment/LineType;", "", "<init>", "(Ljava/lang/String;I)V", "BAG_FEE", "SALES_TAXES", "SUBTOTAL", "DELIVERY_FEE", "BASKET_ITEMS_TOTAL", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LineType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LineType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final LineType BAG_FEE = new LineType("BAG_FEE", 0);
    public static final LineType SALES_TAXES = new LineType("SALES_TAXES", 1);
    public static final LineType SUBTOTAL = new LineType("SUBTOTAL", 2);
    public static final LineType DELIVERY_FEE = new LineType("DELIVERY_FEE", 3);
    public static final LineType BASKET_ITEMS_TOTAL = new LineType("BASKET_ITEMS_TOTAL", 4);
    public static final LineType UNKNOWN = new LineType("UNKNOWN", 5);

    private static final /* synthetic */ LineType[] $values() {
        return new LineType[]{BAG_FEE, SALES_TAXES, SUBTOTAL, DELIVERY_FEE, BASKET_ITEMS_TOTAL, UNKNOWN};
    }

    static {
        LineType[] lineTypeArr$values = $values();
        $VALUES = lineTypeArr$values;
        $ENTRIES = n.w(lineTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private LineType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static LineType valueOf(String str) {
        return (LineType) Enum.valueOf(LineType.class, str);
    }

    public static LineType[] values() {
        return (LineType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/LineType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/LineType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LineTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
