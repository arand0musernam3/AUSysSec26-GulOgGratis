package m90;

import kotlin.jvm.internal.IntCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f29889a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f29890b;

    static {
        o30.f0.P(IntCompanionObject.INSTANCE);
        f29890b = c1.a("kotlin.UInt", l0.f29821a);
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return new u70.z(decoder.x(f29890b).p());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29890b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i11 = ((u70.z) obj).f40866a;
        encoder.getClass();
        encoder.v(f29890b).u(i11);
    }
}
