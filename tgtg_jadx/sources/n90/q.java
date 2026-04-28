package n90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f30781a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k90.e f30782b = ox.h.o("kotlinx.serialization.json.JsonElement", k90.c.f26213k, new SerialDescriptor[0], new m5.d0(19));

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return xz.b.j(decoder).o();
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f30782b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        encoder.getClass();
        nVar.getClass();
        xz.b.i(encoder);
        if (nVar instanceof g0) {
            encoder.w(h0.f30769a, nVar);
            return;
        }
        if (nVar instanceof b0) {
            encoder.w(e0.f30757a, nVar);
        } else if (nVar instanceof e) {
            encoder.w(g.f30762a, nVar);
        } else {
            e40.a.f();
        }
    }
}
