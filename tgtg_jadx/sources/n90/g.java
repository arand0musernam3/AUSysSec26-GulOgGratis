package n90;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f30762a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f30763b = f.f30759b;

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        xz.b.j(decoder);
        return new e((List) new m90.d(q.f30781a, 0).e(decoder));
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f30763b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e eVar = (e) obj;
        encoder.getClass();
        eVar.getClass();
        xz.b.i(encoder);
        q qVar = q.f30781a;
        SerialDescriptor descriptor = qVar.getDescriptor();
        descriptor.getClass();
        m90.c cVar = new m90.c(descriptor, 1);
        int size = eVar.size();
        l90.b bVarX = encoder.x(cVar);
        Iterator<n> it = eVar.iterator();
        for (int i11 = 0; i11 < size; i11++) {
            bVarX.i(cVar, i11, qVar, it.next());
        }
        bVarX.b(cVar);
    }
}
