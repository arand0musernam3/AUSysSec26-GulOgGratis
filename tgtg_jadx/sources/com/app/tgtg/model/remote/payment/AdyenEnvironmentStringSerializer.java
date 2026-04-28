package com.app.tgtg.model.remote.payment;

import com.adyen.checkout.core.Environment;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0080\u0004J\u0012\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/app/tgtg/model/remote/payment/AdyenEnvironmentStringSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/adyen/checkout/core/Environment;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdyenEnvironmentStringSerializer implements KSerializer {

    @NotNull
    public static final AdyenEnvironmentStringSerializer INSTANCE = new AdyenEnvironmentStringSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = h.g("AdyenEnvironment");
    public static final int $stable = 8;

    private AdyenEnvironmentStringSerializer() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // i90.b
    @NotNull
    public Environment deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        String lowerCase = decoder.r().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1837188962:
                if (lowerCase.equals("united_states")) {
                    return Environment.UNITED_STATES;
                }
                break;
            case -1291864670:
                if (lowerCase.equals("europe")) {
                    return Environment.EUROPE;
                }
                break;
            case 3001025:
                if (lowerCase.equals("apse")) {
                    return Environment.APSE;
                }
                break;
            case 3556498:
                if (lowerCase.equals("test")) {
                    return Environment.TEST;
                }
                break;
            case 933923200:
                if (lowerCase.equals("australia")) {
                    return Environment.AUSTRALIA;
                }
                break;
        }
        return Environment.EUROPE;
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Encoder r3, @org.jetbrains.annotations.NotNull com.adyen.checkout.core.Environment r4) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            com.adyen.checkout.core.Environment r0 = com.adyen.checkout.core.Environment.TEST
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r0 == 0) goto L11
            java.lang.String r4 = "test"
            goto L3d
        L11:
            com.adyen.checkout.core.Environment r0 = com.adyen.checkout.core.Environment.EUROPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            java.lang.String r1 = "europe"
            if (r0 == 0) goto L1d
        L1b:
            r4 = r1
            goto L3d
        L1d:
            com.adyen.checkout.core.Environment r0 = com.adyen.checkout.core.Environment.UNITED_STATES
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r0 == 0) goto L28
            java.lang.String r4 = "united_states"
            goto L3d
        L28:
            com.adyen.checkout.core.Environment r0 = com.adyen.checkout.core.Environment.AUSTRALIA
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r0 == 0) goto L33
            java.lang.String r4 = "australia"
            goto L3d
        L33:
            com.adyen.checkout.core.Environment r0 = com.adyen.checkout.core.Environment.APSE
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r4 == 0) goto L1b
            java.lang.String r4 = "apse"
        L3d:
            r3.D(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.payment.AdyenEnvironmentStringSerializer.serialize(kotlinx.serialization.encoding.Encoder, com.adyen.checkout.core.Environment):void");
    }
}
