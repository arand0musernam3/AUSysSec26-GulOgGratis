package m90;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // i90.b
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object objA = a();
        int iB = b(objA);
        l90.a aVarC = decoder.c(getDescriptor());
        while (true) {
            int iW = aVarC.w(getDescriptor());
            if (iW == -1) {
                aVarC.b(getDescriptor());
                return h(objA);
            }
            f(aVarC, iW + iB, objA);
        }
    }

    public abstract void f(l90.a aVar, int i11, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
