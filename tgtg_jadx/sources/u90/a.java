package u90;

import ia0.c0;
import ia0.l0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import q90.d0;
import q90.p0;
import q90.w;
import q90.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40873a = new a();

    @Override // q90.x
    public final p0 intercept(w wVar) throws IOException {
        v90.e fVar;
        v90.g gVar = (v90.g) wVar;
        n nVar = gVar.f42186a;
        synchronized (nVar) {
            if (!nVar.f40937p) {
                throw new IllegalStateException("released");
            }
            if (nVar.f40934m || nVar.l || nVar.f40936o || nVar.f40935n) {
                throw new IllegalStateException("Check failed.");
            }
        }
        g gVar2 = nVar.f40930h;
        gVar2.getClass();
        o oVarA = gVar2.a();
        d0 d0Var = nVar.f40923a;
        oVarA.getClass();
        d0Var.getClass();
        t5.a aVar = oVarA.f40947h;
        x90.n nVar2 = oVarA.f40948i;
        if (nVar2 != null) {
            fVar = new x90.o(d0Var, oVarA, gVar, nVar2);
        } else {
            oVarA.f40944e.setSoTimeout(gVar.f42192g);
            l0 l0VarI = ((ia0.d0) aVar.f39792c).f23622a.i();
            long j9 = gVar.f42192g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            l0VarI.g(j9, timeUnit);
            ((c0) aVar.f39793d).f23611a.i().g(gVar.f42193h, timeUnit);
            fVar = new w90.f(d0Var, oVarA, aVar);
        }
        e20.a aVar2 = new e20.a(nVar, gVar2, fVar);
        nVar.f40933k = aVar2;
        nVar.f40939r = aVar2;
        synchronized (nVar) {
            nVar.l = true;
            nVar.f40934m = true;
        }
        if (!nVar.f40938q) {
            return v90.g.a(gVar, 0, aVar2, null, 61).b(gVar.f42190e);
        }
        i4.a.k("Canceled");
        return null;
    }
}
