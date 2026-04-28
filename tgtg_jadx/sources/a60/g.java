package a60;

import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f861d = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f[] f863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f864c;

    public g(h0 h0Var, TreeMap treeMap) {
        this.f862a = h0Var;
        this.f863b = (f[]) treeMap.values().toArray(new f[treeMap.size()]);
        this.f864c = n.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        try {
            Object objF = this.f862a.f();
            try {
                pVar.e();
                while (pVar.G()) {
                    int iY0 = pVar.y0(this.f864c);
                    if (iY0 == -1) {
                        pVar.z0();
                        pVar.B0();
                    } else {
                        f fVar = this.f863b[iY0];
                        fVar.f855b.set(objF, fVar.f856c.a(pVar));
                    }
                }
                pVar.t();
                return objF;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e5) {
            org.bouncycastle.jce.provider.a.m(e5);
            return null;
        } catch (InvocationTargetException e11) {
            b60.f.g(e11);
            throw null;
        }
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        try {
            qVar.g();
            for (f fVar : this.f863b) {
                qVar.u(fVar.f854a);
                fVar.f856c.e(qVar, fVar.f855b.get(obj));
            }
            qVar.r();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f862a + ")";
    }
}
