package n90;

import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.b2;
import m90.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f30787a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f30788b = ox.h.g("kotlinx.serialization.json.JsonLiteral");

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        n nVarO = xz.b.j(decoder).o();
        if (nVarO instanceof v) {
            return (v) nVarO;
        }
        throw o90.k.d(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(nVarO.getClass()), nVarO.toString());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f30788b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v vVar = (v) obj;
        encoder.getClass();
        vVar.getClass();
        xz.b.i(encoder);
        boolean z11 = vVar.f30784a;
        String str = vVar.f30786c;
        if (z11) {
            encoder.D(str);
            return;
        }
        SerialDescriptor serialDescriptor = vVar.f30785b;
        if (serialDescriptor != null) {
            encoder.v(serialDescriptor).D(str);
            return;
        }
        Long lD0 = StringsKt.d0(str);
        if (lD0 != null) {
            encoder.A(lD0.longValue());
            return;
        }
        u70.c0 c0VarH = kotlin.text.c0.h(str);
        if (c0VarH != null) {
            long j9 = c0VarH.f40834a;
            u70.c0.f40833b.getClass();
            encoder.v(b2.f29760b).A(j9);
            return;
        }
        Double dF = kotlin.text.x.f(str);
        if (dF != null) {
            encoder.g(dF.doubleValue());
            return;
        }
        Boolean boolC0 = StringsKt.c0(str);
        if (boolC0 != null) {
            encoder.k(boolC0.booleanValue());
        } else {
            encoder.D(str);
        }
    }
}
