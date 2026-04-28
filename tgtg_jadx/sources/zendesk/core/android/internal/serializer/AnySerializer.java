package zendesk.core.android.internal.serializer;

import i4.a;
import java.util.List;
import java.util.Map;
import k90.e;
import k90.j;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d;
import m90.r1;
import n90.l;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@InternalZendeskApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lzendesk/core/android/internal/serializer/AnySerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "zendesk.core_core-utilities"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnySerializer implements KSerializer {

    @NotNull
    public static final AnySerializer INSTANCE = new AnySerializer();

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (StringsKt.H("Any")) {
            a.f("Blank serial names are prohibited");
        } else {
            k90.a aVar = new k90.a("Any");
            descriptor = new e("Any", j.f26240j, aVar.f26204c.size(), y.T(serialDescriptorArr), aVar);
        }
    }

    private AnySerializer() {
    }

    @Override // i90.b
    @NotNull
    public Object deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        l lVar = decoder instanceof l ? (l) decoder : null;
        if (lVar != null) {
            return AnySerializerKt.toKotlinType(lVar.o());
        }
        throw new SerializationException("This class can be loaded only by Json");
    }

    @Override // i90.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull Object value) {
        encoder.getClass();
        value.getClass();
        if (value instanceof Integer) {
            encoder.u(((Number) value).intValue());
            return;
        }
        if (value instanceof String) {
            encoder.D((String) value);
            return;
        }
        if (value instanceof Boolean) {
            encoder.k(((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Double) {
            encoder.g(((Number) value).doubleValue());
            return;
        }
        if (value instanceof Long) {
            encoder.A(((Number) value).longValue());
            return;
        }
        if (value instanceof List) {
            encoder.w(new d(this, 0), (List) value);
            return;
        }
        if (value instanceof Map) {
            f0.R(StringCompanionObject.INSTANCE);
            encoder.w(f0.j(r1.f29848a, this), (Map) value);
        } else {
            throw new SerializationException("Unsupported type: " + Reflection.getOrCreateKotlinClass(value.getClass()));
        }
    }
}
