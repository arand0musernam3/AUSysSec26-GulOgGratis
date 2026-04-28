package com.app.tgtg.model.remote.order.response;

import com.app.tgtg.model.local.AppConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0080\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0080\u0004R\u0015\u0010\b\u001a\u00020\t8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/app/tgtg/model/remote/order/response/ProviderTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/response/ProviderType;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProviderType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProviderType.kt\ncom/app/tgtg/model/remote/order/response/ProviderTypeSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n296#2,2:38\n*S KotlinDebug\n*F\n+ 1 ProviderType.kt\ncom/app/tgtg/model/remote/order/response/ProviderTypeSerializer\n*L\n24#1:38,2\n*E\n"})
public final class ProviderTypeSerializer implements KSerializer {
    public static final int $stable = 0;

    @NotNull
    public static final ProviderTypeSerializer INSTANCE = new ProviderTypeSerializer();

    private ProviderTypeSerializer() {
    }

    @Override // i90.b
    @NotNull
    public ProviderType deserialize(@NotNull Decoder decoder) {
        Object next;
        decoder.getClass();
        String strR = decoder.r();
        Iterator<E> it = ProviderType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ProviderType) next).getValue(), strR)) {
                break;
            }
        }
        ProviderType providerType = (ProviderType) next;
        return providerType == null ? ProviderType.UNKNOWN : providerType;
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return h.g(AppConstants.STRING_SERIALIZER);
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull ProviderType value) {
        encoder.getClass();
        value.getClass();
        encoder.D(value.getValue());
    }
}
