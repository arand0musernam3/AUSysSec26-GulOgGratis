package com.app.tgtg.model.remote.user.response;

import com.app.tgtg.model.remote.user.response.C2CReferralType;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0080\u0004J\u0012\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/C2CReferralTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class C2CReferralTypeSerializer implements KSerializer {

    @NotNull
    public static final C2CReferralTypeSerializer INSTANCE = new C2CReferralTypeSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = h.g("C2CReferralType");
    public static final int $stable = 8;

    private C2CReferralTypeSerializer() {
    }

    @Override // i90.b
    @NotNull
    public C2CReferralType deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        try {
            return C2CReferralType.Companion.findByKey$default(C2CReferralType.INSTANCE, decoder.r(), null, 2, null);
        } catch (IllegalArgumentException unused) {
            return C2CReferralType.UNKNOWN;
        }
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull C2CReferralType value) {
        encoder.getClass();
        value.getClass();
        encoder.D(value.name());
    }
}
