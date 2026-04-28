package m90;

import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f29759a = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f29760b;

    static {
        o30.f0.Q(LongCompanionObject.INSTANCE);
        f29760b = c1.a("kotlin.ULong", q0.f29842a);
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return new u70.c0(decoder.x(f29760b).s());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29760b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j9 = ((u70.c0) obj).f40834a;
        encoder.getClass();
        encoder.v(f29760b).A(j9);
    }
}
