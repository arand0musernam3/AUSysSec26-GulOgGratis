package o30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends w.b {
    @Override // w.b
    public final g H(j jVar) {
        g gVar;
        g gVar2 = g.f31883d;
        synchronized (jVar) {
            try {
                gVar = jVar.f31921b;
                if (gVar != gVar2) {
                    jVar.f31921b = gVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // w.b
    public final r I(j jVar) {
        r rVar;
        r rVar2 = r.f31910c;
        synchronized (jVar) {
            try {
                rVar = jVar.f31922c;
                if (rVar != rVar2) {
                    jVar.f31922c = rVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    @Override // w.b
    public final void X(r rVar, r rVar2) {
        rVar.f31912b = rVar2;
    }

    @Override // w.b
    public final void Y(r rVar, Thread thread) {
        rVar.f31911a = thread;
    }

    @Override // w.b
    public final boolean v(j jVar, g gVar, g gVar2) {
        synchronized (jVar) {
            try {
                if (jVar.f31921b != gVar) {
                    return false;
                }
                jVar.f31921b = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w.b
    public final boolean w(s sVar, Object obj, Object obj2) {
        synchronized (sVar) {
            try {
                if (sVar.f31920a != obj) {
                    return false;
                }
                sVar.f31920a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w.b
    public final boolean x(s sVar, r rVar, r rVar2) {
        synchronized (sVar) {
            try {
                if (sVar.f31922c != rVar) {
                    return false;
                }
                sVar.f31922c = rVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
