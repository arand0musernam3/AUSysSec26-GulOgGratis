package m90;

import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f29795b = new f2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i90.a f29796a = new i90.a("kotlin.Unit", Unit.f26487a);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        this.f29796a.deserialize(decoder);
        return Unit.f26487a;
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return this.f29796a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Unit unit = (Unit) obj;
        encoder.getClass();
        unit.getClass();
        this.f29796a.serialize(encoder, unit);
    }
}
