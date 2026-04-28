package com.app.tgtg.model.remote;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.g0;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"com/app/tgtg/model/remote/OrderId.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/OrderId;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-uMNtn9M", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/String;)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-qS0Xzp0", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/String;", "deserialize", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class OrderId$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final OrderId$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OrderId$$serializer orderId$$serializer = new OrderId$$serializer();
        INSTANCE = orderId$$serializer;
        $stable = 8;
        g0 g0Var = new g0("com.app.tgtg.model.remote.OrderId", orderId$$serializer);
        g0Var.j("value", false);
        descriptor = g0Var;
    }

    private OrderId$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r1.f29848a};
    }

    @Override // i90.b
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return OrderId.m209boximpl(m218deserializeqS0Xzp0(decoder));
    }

    @NotNull
    /* JADX INFO: renamed from: deserialize-qS0Xzp0, reason: not valid java name */
    public final String m218deserializeqS0Xzp0(@NotNull Decoder decoder) {
        decoder.getClass();
        return OrderId.m210constructorimpl(decoder.x(descriptor).r());
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m219serializeuMNtn9M(encoder, ((OrderId) obj).m217unboximpl());
    }

    /* JADX INFO: renamed from: serialize-uMNtn9M, reason: not valid java name */
    public final void m219serializeuMNtn9M(@NotNull Encoder encoder, @NotNull String value) {
        encoder.getClass();
        value.getClass();
        Encoder encoderV = encoder.v(descriptor);
        if (encoderV == null) {
            return;
        }
        encoderV.D(value);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
