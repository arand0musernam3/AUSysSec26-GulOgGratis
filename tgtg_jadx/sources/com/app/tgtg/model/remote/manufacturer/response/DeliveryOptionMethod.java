package com.app.tgtg.model.remote.manufacturer.response;

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
@h(with = DeliveryOptionMethodSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "", "trackingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingValue", "()Ljava/lang/String;", "HOME", "PICKUP_POINT", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeliveryOptionMethod {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DeliveryOptionMethod[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final DeliveryOptionMethod HOME = new DeliveryOptionMethod("HOME", 0, "home standard");
    public static final DeliveryOptionMethod PICKUP_POINT = new DeliveryOptionMethod("PICKUP_POINT", 1, "pudo");
    public static final DeliveryOptionMethod UNKNOWN = new DeliveryOptionMethod("UNKNOWN", 2, PaymentMethodTypes.UNKNOWN);

    @NotNull
    private final String trackingValue;

    private static final /* synthetic */ DeliveryOptionMethod[] $values() {
        return new DeliveryOptionMethod[]{HOME, PICKUP_POINT, UNKNOWN};
    }

    static {
        DeliveryOptionMethod[] deliveryOptionMethodArr$values = $values();
        $VALUES = deliveryOptionMethodArr$values;
        $ENTRIES = n.w(deliveryOptionMethodArr$values);
        INSTANCE = new Companion(null);
    }

    private DeliveryOptionMethod(String str, int i11, String str2) {
        this.trackingValue = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static DeliveryOptionMethod valueOf(String str) {
        return (DeliveryOptionMethod) Enum.valueOf(DeliveryOptionMethod.class, str);
    }

    public static DeliveryOptionMethod[] values() {
        return (DeliveryOptionMethod[]) $VALUES.clone();
    }

    @NotNull
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DeliveryOptionMethodSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
