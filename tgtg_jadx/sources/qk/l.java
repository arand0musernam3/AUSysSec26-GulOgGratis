package qk;

import androidx.lifecycle.n;
import at.o;
import f0.f2;
import java.util.HashMap;
import kotlin.Metadata;
import lh.u;
import nk.r0;
import nk.v0;
import y80.a2;
import y80.h1;
import y80.m1;
import y80.r;
import y80.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqk/l;", "Lmk/a;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends mk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f37188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f37189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1.a f37190e;

    public l(mk.b bVar, f2 f2Var) {
        super(bVar);
        a2 a2VarC = r.c(r0.f31058a);
        this.f37188c = a2VarC;
        this.f37189d = new h1(a2VarC);
        this.f37190e = new m1.a(f2Var);
        m1 m1Var = (m1) f2Var.f16653f;
        x70.c cVar = null;
        int i11 = 13;
        int i12 = 10;
        int i13 = 1;
        int i14 = 11;
        y80.i[] iVarArr = {r.y(new o(new n(m1Var, cVar, 19)), new nk.i(cVar, f2Var, 8)), r.y(new o(new n(m1Var, cVar, i11)), new nk.i(cVar, f2Var, 3)), new nk.n(new o(new n(m1Var, cVar, 21)), f2Var, 2), r.y(new o(new n(m1Var, cVar, 17)), new nk.i(cVar, f2Var, 6)), r.y(new o(new n(m1Var, cVar, 22)), new nk.i(cVar, f2Var, i12)), new nk.n(new o(new n(m1Var, cVar, 16)), f2Var, i13), r.y(new o(new n(m1Var, cVar, i14)), new nk.i(cVar, f2Var, i13)), r.y(new o(new n(m1Var, cVar, 9)), new nk.i(cVar, f2Var, 0)), r.y(new o(new n(m1Var, cVar, 27)), new nk.i(cVar, f2Var, i14)), new nk.n(new o(new n(m1Var, cVar, i12)), f2Var, 0), r.y(new o(new n(m1Var, cVar, 12)), new nk.i(cVar, f2Var, 2)), r.y(new o(new n(m1Var, cVar, 15)), new nk.i(cVar, f2Var, 5)), r.y(new o(new n(m1Var, cVar, 14)), new nk.i(cVar, f2Var, 4)), r.y(new o(new n(m1Var, cVar, 18)), new nk.i(cVar, f2Var, 7)), r.y(new o(new n(m1Var, cVar, 20)), new nk.i(cVar, f2Var, 9)), new nk.n(new o(new n(m1Var, cVar, 23)), f2Var, 3), new nk.n(new o(new n(m1Var, null, 24)), f2Var, 4), new nk.n(new o(new n(m1Var, null, 25)), f2Var, 5), new nk.n(new o(new n(m1Var, null, 26)), f2Var, 6)};
        x70.c cVar2 = null;
        r.u(androidx.lifecycle.m1.d(this), new w(new w(new w(new w(a70.i.a(iVarArr), new u(3, cVar2, 2)), new is.h(f2Var, cVar2, i11), 5), new is.h(this, cVar2, 27), 5), new k(3, cVar2, 0)));
        m1Var.i(ok.l.f32607a);
        String strC = c();
        if (strC == null) {
            m1Var.i(ok.e.f32586a);
            return;
        }
        String strB = b();
        String strA = a();
        f70.i iVar = (f70.i) this.f29971a.f29974b.a("ORIGIN");
        m1Var.i(new ok.j(strC, new v0(strB, strA, iVar == null ? f70.i.UNKNOWN : iVar, (HashMap) this.f29971a.f29974b.a("DEEPLINK_PARAMETERS_MAP"), (String) this.f29971a.f29974b.a("DISPLAY_TYPE"), (String) this.f29971a.f29974b.a("CATEGORY_TYPE"))));
    }
}
