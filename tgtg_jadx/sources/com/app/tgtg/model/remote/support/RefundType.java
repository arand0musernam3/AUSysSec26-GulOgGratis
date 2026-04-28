package com.app.tgtg.model.remote.support;

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
@h(with = RefundTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/remote/support/RefundType;", "", "<init>", "(Ljava/lang/String;I)V", "VOUCHER", "ORIGINAL_PAYMENT", "REFUSE_REFUND", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RefundType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RefundType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RefundType VOUCHER = new RefundType("VOUCHER", 0);
    public static final RefundType ORIGINAL_PAYMENT = new RefundType("ORIGINAL_PAYMENT", 1);
    public static final RefundType REFUSE_REFUND = new RefundType("REFUSE_REFUND", 2);
    public static final RefundType UNKNOWN = new RefundType("UNKNOWN", 3);

    private static final /* synthetic */ RefundType[] $values() {
        return new RefundType[]{VOUCHER, ORIGINAL_PAYMENT, REFUSE_REFUND, UNKNOWN};
    }

    static {
        RefundType[] refundTypeArr$values = $values();
        $VALUES = refundTypeArr$values;
        $ENTRIES = n.w(refundTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private RefundType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static RefundType valueOf(String str) {
        return (RefundType) Enum.valueOf(RefundType.class, str);
    }

    public static RefundType[] values() {
        return (RefundType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/support/RefundType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/support/RefundType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RefundTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
