package b60;

import a60.k;
import a60.o;
import a60.p;
import a60.q;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6042a;

    public b(k kVar) {
        this.f6042a = kVar;
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        if (pVar.i0() != o.NULL) {
            return this.f6042a.a(pVar);
        }
        pVar.Q();
        return null;
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        if (obj == null) {
            qVar.A();
        } else {
            this.f6042a.e(qVar, obj);
        }
    }

    public final String toString() {
        return this.f6042a + ".nullSafe()";
    }
}
