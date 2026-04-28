package o00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends ox.h {
    @Override // ox.h
    public final void W(i1 i1Var, Thread thread) {
        i1Var.f31679a = thread;
    }

    @Override // ox.h
    public final void X(i1 i1Var, i1 i1Var2) {
        i1Var.f31680b = i1Var2;
    }

    @Override // ox.h
    public final boolean Y(j1 j1Var, i1 i1Var, i1 i1Var2) {
        synchronized (j1Var) {
            try {
                if (j1Var.f31692c != i1Var) {
                    return false;
                }
                j1Var.f31692c = i1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ox.h
    public final i1 Z(t1 t1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.f31678c;
        synchronized (t1Var) {
            try {
                i1Var = t1Var.f31692c;
                if (i1Var != i1Var2) {
                    t1Var.f31692c = i1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i1Var;
    }

    @Override // ox.h
    public final b1 a0(t1 t1Var) {
        b1 b1Var;
        b1 b1Var2 = b1.f31625b;
        synchronized (t1Var) {
            try {
                b1Var = t1Var.f31691b;
                if (b1Var != b1Var2) {
                    t1Var.f31691b = b1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b1Var;
    }

    @Override // ox.h
    public final boolean b0(j1 j1Var, Object obj, Object obj2) {
        synchronized (j1Var) {
            try {
                if (j1Var.f31690a != obj) {
                    return false;
                }
                j1Var.f31690a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
