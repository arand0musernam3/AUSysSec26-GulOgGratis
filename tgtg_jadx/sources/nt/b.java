package nt;

import androidx.lifecycle.n1;
import com.app.tgtg.model.remote.Server;
import ft.l;
import ft.o;
import kotlin.jvm.internal.Intrinsics;
import q90.g0;
import q90.p0;
import q90.t;
import q90.u;
import q90.v;
import q90.w;
import q90.x;
import v80.f0;
import v90.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f31396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv.b f31398c;

    public b(o oVar, String str, mv.b bVar) {
        oVar.getClass();
        str.getClass();
        bVar.getClass();
        this.f31396a = oVar;
        this.f31397b = str;
        this.f31398c = bVar;
    }

    @Override // q90.x
    public final p0 intercept(w wVar) {
        g gVar = (g) wVar;
        g0 g0Var = gVar.f42190e;
        t tVar = g0Var.f36507c;
        v vVar = g0Var.f36505a;
        boolean zAreEqual = Intrinsics.areEqual(tVar.b("withoutAuthorization"), "true");
        n1 n1VarB = g0Var.b();
        n1VarB.u("User-Agent", "TGTG/26.4.1 " + System.getProperty("http.agent"));
        n1VarB.u("Content-Type", "application/json");
        n1VarB.u("X-Correlation-ID", this.f31397b);
        mv.b bVar = this.f31398c;
        n1VarB.u("Accept-Language", bVar.a());
        if (!zAreEqual) {
            o oVar = this.f31396a;
            if (oVar.f17955e == null) {
                oVar.f17955e = (String) f0.E(kotlin.coroutines.g.f26549a, new l(oVar, null, 0));
            }
            String str = oVar.f17955e;
            String strConcat = str != null ? "Bearer ".concat(str) : null;
            if (strConcat != null) {
                n1VarB.u("Authorization", strConcat);
            }
        }
        if (!Intrinsics.areEqual(vVar.f36626d, "meta.toogoodtogo.com")) {
            Server server = bVar.f30152c;
            u uVarG = vVar.g();
            uVarG.d(server.getDomain());
            if (server.getPort() != null) {
                uVarG.f(server.getPort().intValue());
            }
            n1VarB.f3499a = uVarG.b();
        }
        return gVar.b(new g0(n1VarB));
    }
}
