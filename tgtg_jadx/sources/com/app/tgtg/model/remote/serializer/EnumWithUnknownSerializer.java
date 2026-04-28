package com.app.tgtg.model.remote.serializer;

import a80.a;
import j4.s;
import java.lang.Enum;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/app/tgtg/model/remote/serializer/EnumWithUnknownSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "La80/a;", "entries", "fallbackValue", "<init>", "(La80/a;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "La80/a;", "Ljava/lang/Enum;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnumWithUnknownSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumWithUnknownSerializer.kt\ncom/app/tgtg/model/remote/serializer/EnumWithUnknownSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n296#2,2:32\n*S KotlinDebug\n*F\n+ 1 EnumWithUnknownSerializer.kt\ncom/app/tgtg/model/remote/serializer/EnumWithUnknownSerializer\n*L\n25#1:32,2\n*E\n"})
public class EnumWithUnknownSerializer<T extends Enum<T>> implements KSerializer {
    public static final int $stable = 8;

    @NotNull
    private final SerialDescriptor descriptor;

    @NotNull
    private final a entries;

    @NotNull
    private final T fallbackValue;

    public EnumWithUnknownSerializer(@NotNull a aVar, @NotNull T t9) {
        aVar.getClass();
        t9.getClass();
        this.entries = aVar;
        this.fallbackValue = t9;
        this.descriptor = h.g(t9.getClass().getSimpleName());
    }

    @Override // i90.b
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        Object next;
        decoder.getClass();
        String strR = decoder.r();
        Iterator<E> it = this.entries.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Enum) next).name(), strR)) {
                break;
            }
        }
        T t9 = (T) next;
        if (t9 != null) {
            return t9;
        }
        sa0.a.f38953a.c(s.k("Unknown value ", strR, " in ", this.fallbackValue.getClass().getSimpleName()), new Object[0]);
        return this.fallbackValue;
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        encoder.getClass();
        value.getClass();
        encoder.D(value.name());
    }
}
