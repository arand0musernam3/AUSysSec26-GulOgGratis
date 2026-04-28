package com.app.tgtg.model.remote.order.response;

import a80.a;
import com.adyen.checkout.components.core.PaymentMethodTypes;
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
@h(with = ProviderTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/ProviderType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ADYEN_SAVED_PAYMENT", "EDENRED_SAVED_PAYMENT", "ADYEN_PAYMENT_METHOD", "SATISPAY_PAYMENT_METHOD", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProviderType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProviderType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final ProviderType ADYEN_SAVED_PAYMENT = new ProviderType("ADYEN_SAVED_PAYMENT", 0, "adyenSavedPaymentMethod");
    public static final ProviderType EDENRED_SAVED_PAYMENT = new ProviderType("EDENRED_SAVED_PAYMENT", 1, "edenredSavedPaymentMethod");
    public static final ProviderType ADYEN_PAYMENT_METHOD = new ProviderType("ADYEN_PAYMENT_METHOD", 2, "adyenPaymentMethod");
    public static final ProviderType SATISPAY_PAYMENT_METHOD = new ProviderType("SATISPAY_PAYMENT_METHOD", 3, "MobileSatispayPaymentMethod");
    public static final ProviderType UNKNOWN = new ProviderType("UNKNOWN", 4, PaymentMethodTypes.UNKNOWN);

    private static final /* synthetic */ ProviderType[] $values() {
        return new ProviderType[]{ADYEN_SAVED_PAYMENT, EDENRED_SAVED_PAYMENT, ADYEN_PAYMENT_METHOD, SATISPAY_PAYMENT_METHOD, UNKNOWN};
    }

    static {
        ProviderType[] providerTypeArr$values = $values();
        $VALUES = providerTypeArr$values;
        $ENTRIES = n.w(providerTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ProviderType(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ProviderType valueOf(String str) {
        return (ProviderType) Enum.valueOf(ProviderType.class, str);
    }

    public static ProviderType[] values() {
        return (ProviderType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/ProviderType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/response/ProviderType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProviderTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
