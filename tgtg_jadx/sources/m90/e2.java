package m90;

import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f29790a = new e2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f29791b;

    static {
        ShortCompanionObject.INSTANCE.getClass();
        f29791b = c1.a("kotlin.UShort", q1.f29844a);
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return new u70.g0(decoder.x(f29791b).B());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29791b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short s7 = ((u70.g0) obj).f40839a;
        encoder.getClass();
        encoder.v(f29791b).h(s7);
    }
}
