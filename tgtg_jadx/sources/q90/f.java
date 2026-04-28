package q90;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s90.g f36490a;

    public f(File file) {
        file.getClass();
        ia0.w wVar = ia0.m.f23661a;
        String str = ia0.a0.f23602b;
        ia0.a0 a0VarT = n20.f.t(file);
        wVar.getClass();
        t90.e eVar = t90.e.l;
        eVar.getClass();
        this.f36490a = new s90.g(wVar, a0VarT, eVar);
    }

    public final void a(g0 g0Var) {
        g0Var.getClass();
        s90.g gVar = this.f36490a;
        String strI = ox.h.I(g0Var.f36505a);
        synchronized (gVar) {
            strI.getClass();
            gVar.r();
            gVar.a();
            s90.g.J(strI);
            s90.d dVar = (s90.d) gVar.f38943i.get(strI);
            if (dVar == null) {
                return;
            }
            gVar.H(dVar);
            if (gVar.f38941g <= gVar.f38937c) {
                gVar.f38948o = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36490a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f36490a.flush();
    }
}
