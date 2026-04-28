package vj;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f42413a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f42414b = ox.h.g("FavoriteReminderType");

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        Object next;
        try {
            String strR = decoder.r();
            Iterator<E> it = e.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((e) next).name(), strR)) {
                    break;
                }
            }
            e eVar = (e) next;
            return eVar == null ? e.UNKNOWN : eVar;
        } catch (IllegalArgumentException unused) {
            return e.UNKNOWN;
        }
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f42414b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e eVar = (e) obj;
        encoder.getClass();
        eVar.getClass();
        encoder.D(eVar.name());
    }
}
