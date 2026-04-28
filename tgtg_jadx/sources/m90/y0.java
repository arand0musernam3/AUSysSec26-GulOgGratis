package m90;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f29887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f29888b;

    public y0(KSerializer kSerializer) {
        kSerializer.getClass();
        this.f29887a = kSerializer;
        this.f29888b = new l1(kSerializer.getDescriptor());
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        if (decoder.v()) {
            return decoder.h(this.f29887a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y0.class == obj.getClass() && Intrinsics.areEqual(this.f29887a, ((y0) obj).f29887a);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return this.f29888b;
    }

    public final int hashCode() {
        return this.f29887a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        if (obj != null) {
            encoder.w(this.f29887a, obj);
        } else {
            encoder.f();
        }
    }
}
