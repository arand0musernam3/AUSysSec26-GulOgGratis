package li;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import ao.g3;
import kotlin.Metadata;
import kotlin.Unit;
import v80.f0;
import w2.z;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lli/g;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f27861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f27862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh.c f27863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f27864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f27865e;

    public g(z zVar, g3 g3Var, xh.c cVar) {
        g3Var.getClass();
        cVar.getClass();
        this.f27861a = zVar;
        this.f27862b = g3Var;
        this.f27863c = cVar;
        a2 a2VarC = r.c(new f(null, false));
        this.f27864d = a2VarC;
        this.f27865e = new h1(a2VarC);
        f0.B(m1.d(this), null, null, new gf.g(this, null, 24), 3);
    }

    public static final Unit a(g gVar, boolean z11) {
        a2 a2Var = gVar.f27864d;
        f fVar = new f(((f) gVar.f27865e.f45488a.getValue()).f27859a, z11);
        a2Var.getClass();
        a2Var.k(null, fVar);
        Unit unit = Unit.f26487a;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return unit;
    }
}
