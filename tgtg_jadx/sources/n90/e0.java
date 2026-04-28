package n90;

import java.util.Map;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f30757a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f30758b = d0.f30753b;

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        xz.b.j(decoder);
        o30.f0.R(StringCompanionObject.INSTANCE);
        return new b0((Map) o30.f0.j(r1.f29848a, q.f30781a).deserialize(decoder));
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f30758b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b0 b0Var = (b0) obj;
        encoder.getClass();
        b0Var.getClass();
        xz.b.i(encoder);
        o30.f0.R(StringCompanionObject.INSTANCE);
        o30.f0.j(r1.f29848a, q.f30781a).serialize(encoder, b0Var);
    }
}
