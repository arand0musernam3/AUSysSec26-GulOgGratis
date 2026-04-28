package h90;

import g90.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.i1;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21671a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f21672b = h.g("Instant");

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return b.Companion.c(decoder.r());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f21672b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b bVar = (b) obj;
        encoder.getClass();
        bVar.getClass();
        encoder.D(bVar.toString());
    }
}
