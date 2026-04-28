package com.app.tgtg.model.remote.user.response;

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
@h(with = CouponCodeStateSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/CouponCodeState;", "", "<init>", "(Ljava/lang/String;I)V", "CREATED", "CLAIMED", "USED", "GENERATED_REAL_PURCHASE", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CouponCodeState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CouponCodeState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CouponCodeState CREATED = new CouponCodeState("CREATED", 0);
    public static final CouponCodeState CLAIMED = new CouponCodeState("CLAIMED", 1);
    public static final CouponCodeState USED = new CouponCodeState("USED", 2);
    public static final CouponCodeState GENERATED_REAL_PURCHASE = new CouponCodeState("GENERATED_REAL_PURCHASE", 3);
    public static final CouponCodeState UNKNOWN = new CouponCodeState("UNKNOWN", 4);

    private static final /* synthetic */ CouponCodeState[] $values() {
        return new CouponCodeState[]{CREATED, CLAIMED, USED, GENERATED_REAL_PURCHASE, UNKNOWN};
    }

    static {
        CouponCodeState[] couponCodeStateArr$values = $values();
        $VALUES = couponCodeStateArr$values;
        $ENTRIES = n.w(couponCodeStateArr$values);
        INSTANCE = new Companion(null);
    }

    private CouponCodeState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CouponCodeState valueOf(String str) {
        return (CouponCodeState) Enum.valueOf(CouponCodeState.class, str);
    }

    public static CouponCodeState[] values() {
        return (CouponCodeState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/CouponCodeState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/CouponCodeState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CouponCodeStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
