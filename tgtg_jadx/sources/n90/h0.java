package n90;

import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f30769a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k90.e f30770b = ox.h.p("kotlinx.serialization.json.JsonPrimitive", k90.d.f26221r, new SerialDescriptor[0]);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        n nVarO = xz.b.j(decoder).o();
        if (nVarO instanceof g0) {
            return (g0) nVarO;
        }
        throw o90.k.d(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(nVarO.getClass()), nVarO.toString());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f30770b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g0 g0Var = (g0) obj;
        encoder.getClass();
        g0Var.getClass();
        xz.b.i(encoder);
        if (g0Var instanceof y) {
            encoder.w(z.f30789a, y.INSTANCE);
        } else {
            encoder.w(w.f30787a, (v) g0Var);
        }
    }
}
