package e6;

import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends f0 {
    @Override // o30.f0
    public final void I(g gVar, g gVar2) {
        gVar.f15768b = gVar2;
    }

    @Override // o30.f0
    public final void J(g gVar, Thread thread) {
        gVar.f15767a = thread;
    }

    @Override // o30.f0
    public final boolean t(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f15774b != dVar) {
                    return false;
                }
                hVar.f15774b = dVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o30.f0
    public final boolean u(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f15773a != obj) {
                    return false;
                }
                hVar.f15773a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o30.f0
    public final boolean v(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f15775c != gVar) {
                    return false;
                }
                hVar.f15775c = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
