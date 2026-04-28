package y9;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public abstract void a(ha.c cVar, Object obj);

    public abstract String b();

    public final void c(ha.a aVar, Object obj) {
        aVar.getClass();
        if (obj == null) {
            return;
        }
        ha.c cVarV0 = aVar.v0(b());
        try {
            a(cVarV0, obj);
            cVarV0.q0();
            w.b.y(cVarV0, null);
            ox.h.E(aVar);
        } finally {
        }
    }

    public final void d(ha.a aVar, Iterable iterable) {
        aVar.getClass();
        if (iterable == null) {
            return;
        }
        ha.c cVarV0 = aVar.v0(b());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    a(cVarV0, obj);
                    cVarV0.q0();
                    cVarV0.reset();
                    ox.h.E(aVar);
                }
            }
            w.b.y(cVarV0, null);
        } finally {
        }
    }
}
