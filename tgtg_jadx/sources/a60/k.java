package a60;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public abstract Object a(p pVar);

    public final Object b(String str) {
        ia0.g gVar = new ia0.g();
        gVar.F0(str);
        p pVar = new p(gVar);
        Object objA = a(pVar);
        if (pVar.i0() == o.END_DOCUMENT) {
            return objA;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final b60.b c() {
        return this instanceof b60.b ? (b60.b) this : new b60.b(this);
    }

    public final String d(Object obj) {
        ia0.g gVar = new ia0.g();
        try {
            e(new q(gVar), obj);
            return gVar.g0();
        } catch (IOException e5) {
            i4.a.d(e5);
            return null;
        }
    }

    public abstract void e(q qVar, Object obj);
}
