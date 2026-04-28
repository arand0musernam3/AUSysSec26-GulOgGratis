package m90;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f29870a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f29871b;

    static {
        ByteCompanionObject.INSTANCE.getClass();
        f29871b = c1.a("kotlin.UByte", j.f29812a);
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        return new u70.w(decoder.x(f29871b).A());
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29871b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte b8 = ((u70.w) obj).f40863a;
        encoder.getClass();
        encoder.v(f29871b).j(b8);
    }
}
