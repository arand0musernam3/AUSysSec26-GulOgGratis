package m90;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f29861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f29862b;

    public t0(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f29861a = kSerializer;
        this.f29862b = kSerializer2;
    }

    @Override // m90.a
    public final void f(l90.a aVar, int i11, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objN = aVar.n(getDescriptor(), i11, this.f29861a, null);
        int iW = aVar.w(getDescriptor());
        if (iW != i11 + 1) {
            i4.a.i(r8.k.k("Value must follow key in a map, index for key: ", i11, iW, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objN);
        KSerializer kSerializer = this.f29862b;
        map.put(objN, (!zContainsKey || (kSerializer.getDescriptor().getKind() instanceof k90.d)) ? aVar.n(getDescriptor(), iW, kSerializer, null) : aVar.n(getDescriptor(), iW, kSerializer, kotlin.collections.x0.c(objN, map)));
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        d(obj);
        SerialDescriptor descriptor = getDescriptor();
        l90.b bVarX = encoder.x(descriptor);
        Iterator itC = c(obj);
        int i11 = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i12 = i11 + 1;
            bVarX.i(getDescriptor(), i11, this.f29861a, key);
            i11 += 2;
            bVarX.i(getDescriptor(), i12, this.f29862b, value);
        }
        bVarX.b(descriptor);
    }
}
