package n90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f30789a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k90.e f30790b = ox.h.p("kotlinx.serialization.json.JsonNull", k90.i.f26239j, new SerialDescriptor[0]);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        xz.b.j(decoder);
        if (decoder.v()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return y.INSTANCE;
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f30790b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        ((y) obj).getClass();
        xz.b.i(encoder);
        encoder.f();
    }
}
