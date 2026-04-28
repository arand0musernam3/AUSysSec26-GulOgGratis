package zendesk.core.android.internal.serializer;

import i90.g;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.collections.y;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import ox.h;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@InternalZendeskApi
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0002\u0010\u001eR\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "values", "", "defaultValue", "<init>", "([Ljava/lang/Enum;Ljava/lang/Enum;)V", "Ljava/lang/Enum;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "lookup", "", "", "reverseLookup", "serialName", "getSerialName", "(Ljava/lang/Enum;)Ljava/lang/String;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "zendesk.core_core-utilities"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnumIgnoreUnknownSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumIgnoreUnknownSerializer.kt\nzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n8838#2,2:44\n9108#2,4:46\n8704#2,2:50\n8964#2,4:52\n*S KotlinDebug\n*F\n+ 1 EnumIgnoreUnknownSerializer.kt\nzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer\n*L\n29#1:44,2\n29#1:46,4\n30#1:50,2\n30#1:52,4\n*E\n"})
public abstract class EnumIgnoreUnknownSerializer<T extends Enum<T>> implements KSerializer {

    @NotNull
    private final T defaultValue;

    @NotNull
    private final SerialDescriptor descriptor;

    @NotNull
    private final Map<T, String> lookup;

    @NotNull
    private final Map<String, T> reverseLookup;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumIgnoreUnknownSerializer(@NotNull T[] tArr, @NotNull T t9) {
        tArr.getClass();
        t9.getClass();
        this.defaultValue = t9;
        String qualifiedName = Reflection.getOrCreateKotlinClass(y.x(tArr).getClass()).getQualifiedName();
        qualifiedName.getClass();
        this.descriptor = h.g(qualifiedName);
        int iA = w0.a(tArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (T t11 : tArr) {
            linkedHashMap.put(t11, getSerialName(t11));
        }
        this.lookup = linkedHashMap;
        int iA2 = w0.a(tArr.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (T t12 : tArr) {
            linkedHashMap2.put(getSerialName(t12), t12);
        }
        this.reverseLookup = linkedHashMap2;
    }

    private final String getSerialName(Enum<T> r32) {
        String strValue;
        g gVar = (g) r32.getClass().getField(r32.name()).getAnnotation(g.class);
        return (gVar == null || (strValue = gVar.value()) == null) ? r32.name() : strValue;
    }

    @Override // i90.b
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        T t9 = this.reverseLookup.get(decoder.r());
        return t9 == null ? this.defaultValue : t9;
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
        encoder.D((String) x0.c(value, this.lookup));
    }
}
