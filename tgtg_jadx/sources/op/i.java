package op;

import java.util.Iterator;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f32905a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f32906b = ox.h.g("MetroSearchType");

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        Object next;
        try {
            String strR = decoder.r();
            g gVar = h.Companion;
            h hVar = h.UNKNOWN;
            gVar.getClass();
            strR.getClass();
            hVar.getClass();
            Iterator<E> it = h.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (y.k(((h) next).name(), strR, true)) {
                    break;
                }
            }
            h hVar2 = (h) next;
            return hVar2 == null ? hVar : hVar2;
        } catch (IllegalArgumentException unused) {
            return h.UNKNOWN;
        }
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f32906b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h hVar = (h) obj;
        encoder.getClass();
        hVar.getClass();
        encoder.D(hVar.name());
    }
}
