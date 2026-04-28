package m90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f29848a = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f29849b = new i1("kotlin.String", k90.d.f26221r);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return decoder.r();
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29849b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        encoder.getClass();
        str.getClass();
        encoder.D(str);
    }
}
