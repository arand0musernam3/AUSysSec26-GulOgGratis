package com.app.tgtg.model.remote.mapService.response;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0080\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/app/tgtg/model/remote/mapService/response/FilterChipIdSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/mapService/response/FilterChipId;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFilterChipId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterChipId.kt\ncom/app/tgtg/model/remote/mapService/response/FilterChipIdSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n296#2,2:36\n*S KotlinDebug\n*F\n+ 1 FilterChipId.kt\ncom/app/tgtg/model/remote/mapService/response/FilterChipIdSerializer\n*L\n28#1:36,2\n*E\n"})
public final class FilterChipIdSerializer implements KSerializer {
    public static final int $stable = 0;

    @NotNull
    public static final FilterChipIdSerializer INSTANCE = new FilterChipIdSerializer();

    private FilterChipIdSerializer() {
    }

    @Override // i90.b
    @NotNull
    public FilterChipId deserialize(@NotNull Decoder decoder) {
        Object next;
        decoder.getClass();
        String strR = decoder.r();
        Iterator<E> it = FilterChipId.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((FilterChipId) next).name(), strR)) {
                break;
            }
        }
        FilterChipId filterChipId = (FilterChipId) next;
        return filterChipId == null ? FilterChipId.UNKNOWN : filterChipId;
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return h.g("FilterChipId");
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull FilterChipId value) {
        encoder.getClass();
        value.getClass();
        encoder.D(value.name());
    }
}
