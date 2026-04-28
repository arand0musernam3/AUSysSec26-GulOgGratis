package m90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f29812a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f29813b = new i1("kotlin.Byte", k90.d.f26215k);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.A());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29813b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        encoder.getClass();
        encoder.j(bByteValue);
    }
}
