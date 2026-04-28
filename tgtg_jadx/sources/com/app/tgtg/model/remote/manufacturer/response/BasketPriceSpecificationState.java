package com.app.tgtg.model.remote.manufacturer.response;

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
@h(with = BasketPriceSpecificationStateSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "INSUFFICIENT_STOCK", "MISSING_TAX_DATA", "TAX_SERVICE_DOWN", "MISSING_ADDRESS_IN_REQUEST", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BasketPriceSpecificationState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BasketPriceSpecificationState[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final BasketPriceSpecificationState SUCCESS = new BasketPriceSpecificationState("SUCCESS", 0);
    public static final BasketPriceSpecificationState INSUFFICIENT_STOCK = new BasketPriceSpecificationState("INSUFFICIENT_STOCK", 1);
    public static final BasketPriceSpecificationState MISSING_TAX_DATA = new BasketPriceSpecificationState("MISSING_TAX_DATA", 2);
    public static final BasketPriceSpecificationState TAX_SERVICE_DOWN = new BasketPriceSpecificationState("TAX_SERVICE_DOWN", 3);
    public static final BasketPriceSpecificationState MISSING_ADDRESS_IN_REQUEST = new BasketPriceSpecificationState("MISSING_ADDRESS_IN_REQUEST", 4);
    public static final BasketPriceSpecificationState UNKNOWN = new BasketPriceSpecificationState("UNKNOWN", 5);

    private static final /* synthetic */ BasketPriceSpecificationState[] $values() {
        return new BasketPriceSpecificationState[]{SUCCESS, INSUFFICIENT_STOCK, MISSING_TAX_DATA, TAX_SERVICE_DOWN, MISSING_ADDRESS_IN_REQUEST, UNKNOWN};
    }

    static {
        BasketPriceSpecificationState[] basketPriceSpecificationStateArr$values = $values();
        $VALUES = basketPriceSpecificationStateArr$values;
        $ENTRIES = n.w(basketPriceSpecificationStateArr$values);
        INSTANCE = new Companion(null);
    }

    private BasketPriceSpecificationState(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static BasketPriceSpecificationState valueOf(String str) {
        return (BasketPriceSpecificationState) Enum.valueOf(BasketPriceSpecificationState.class, str);
    }

    public static BasketPriceSpecificationState[] values() {
        return (BasketPriceSpecificationState[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketPriceSpecificationStateSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
