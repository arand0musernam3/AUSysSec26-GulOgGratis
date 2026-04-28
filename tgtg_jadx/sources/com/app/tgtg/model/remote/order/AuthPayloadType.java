package com.app.tgtg.model.remote.order;

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
@h(with = AuthPayloadSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/app/tgtg/model/remote/order/AuthPayloadType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "VOUCHER_AUTH_PAYLOAD", "CHARITY_AUTH_PAYLOAD", "SATISPAY_AUTH_PAYLOAD", "EDENRED_AUTH_PAYLOAD", "ADYEN_AUTH_PAYLOAD", "ADYEN_ADDITIONAL_AUTH_PAYLOAD", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthPayloadType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthPayloadType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final AuthPayloadType VOUCHER_AUTH_PAYLOAD = new AuthPayloadType("VOUCHER_AUTH_PAYLOAD", 0, "voucherAuthorizationPayload");
    public static final AuthPayloadType CHARITY_AUTH_PAYLOAD = new AuthPayloadType("CHARITY_AUTH_PAYLOAD", 1, "charityAuthorizationPayload");
    public static final AuthPayloadType SATISPAY_AUTH_PAYLOAD = new AuthPayloadType("SATISPAY_AUTH_PAYLOAD", 2, "satispayAuthorizationPayload");
    public static final AuthPayloadType EDENRED_AUTH_PAYLOAD = new AuthPayloadType("EDENRED_AUTH_PAYLOAD", 3, "edenredAuthorizationPayload");
    public static final AuthPayloadType ADYEN_AUTH_PAYLOAD = new AuthPayloadType("ADYEN_AUTH_PAYLOAD", 4, "adyenAuthorizationPayload");
    public static final AuthPayloadType ADYEN_ADDITIONAL_AUTH_PAYLOAD = new AuthPayloadType("ADYEN_ADDITIONAL_AUTH_PAYLOAD", 5, "adyenAdditionalAuthorizationPayload");
    public static final AuthPayloadType UNKNOWN = new AuthPayloadType("UNKNOWN", 6, PaymentMethodTypes.UNKNOWN);

    private static final /* synthetic */ AuthPayloadType[] $values() {
        return new AuthPayloadType[]{VOUCHER_AUTH_PAYLOAD, CHARITY_AUTH_PAYLOAD, SATISPAY_AUTH_PAYLOAD, EDENRED_AUTH_PAYLOAD, ADYEN_AUTH_PAYLOAD, ADYEN_ADDITIONAL_AUTH_PAYLOAD, UNKNOWN};
    }

    static {
        AuthPayloadType[] authPayloadTypeArr$values = $values();
        $VALUES = authPayloadTypeArr$values;
        $ENTRIES = n.w(authPayloadTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private AuthPayloadType(String str, int i11, String str2) {
        this.type = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthPayloadType valueOf(String str) {
        return (AuthPayloadType) Enum.valueOf(AuthPayloadType.class, str);
    }

    public static AuthPayloadType[] values() {
        return (AuthPayloadType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/AuthPayloadType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/AuthPayloadType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AuthPayloadSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
