package m90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f29844a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f29845b = new i1("kotlin.Short", k90.d.f26220q);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.B());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29845b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        encoder.getClass();
        encoder.h(sShortValue);
    }
}
