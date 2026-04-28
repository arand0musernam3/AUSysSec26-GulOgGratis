package m90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f29836a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f29837b = new i1("kotlin.Char", k90.d.l);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.i());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29837b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        encoder.getClass();
        encoder.o(cCharValue);
    }
}
