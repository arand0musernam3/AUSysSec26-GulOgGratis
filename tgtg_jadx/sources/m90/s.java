package m90;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f29850a;

    public s(KSerializer kSerializer) {
        this.f29850a = kSerializer;
    }

    @Override // m90.a
    public void f(l90.a aVar, int i11, Object obj) {
        i(i11, obj, aVar.n(getDescriptor(), i11, this.f29850a, null));
    }

    public abstract void i(int i11, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        l90.b bVarX = encoder.x(descriptor);
        Iterator itC = c(obj);
        for (int i11 = 0; i11 < iD; i11++) {
            bVarX.i(getDescriptor(), i11, this.f29850a, itC.next());
        }
        bVarX.b(descriptor);
    }
}
