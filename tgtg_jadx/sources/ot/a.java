package ot;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import n90.b;
import n90.b0;
import n90.c;
import n90.e;
import n90.n;
import n90.o;
import n90.q;
import oa0.d;
import oa0.g;
import oa0.n0;
import q90.g0;
import q90.r0;
import retrofit2.HttpException;
import u70.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f33760a;

    public a(d dVar) {
        dVar.getClass();
        this.f33760a = dVar;
    }

    public static final qg.a a(a aVar, HttpException httpException) {
        r0 r0Var;
        String strP;
        String string;
        n nVar;
        String strB;
        String strB2;
        n nVar2;
        n0 n0Var = httpException.f37957b;
        if (n0Var != null && (r0Var = n0Var.f32353c) != null && (strP = r0Var.p()) != null && (string = StringsKt.e0(strP).toString()) != null) {
            try {
                b bVar = c.f30748d;
                bVar.getClass();
                n nVar3 = (n) o.g((n) bVar.b(q.f30781a, string)).get("errors");
                e eVarF = nVar3 != null ? o.f(nVar3) : null;
                b0 b0VarG = (eVarF == null || (nVar2 = (n) CollectionsKt.firstOrNull(eVarF)) == null) ? null : o.g(nVar2);
                if (b0VarG != null && (nVar = (n) b0VarG.get("code")) != null && (strB = o.h(nVar).b()) != null) {
                    n nVar4 = (n) b0VarG.get(InAppMessageBase.MESSAGE);
                    if (nVar4 == null || (strB2 = o.h(nVar4).b()) == null) {
                        strB2 = strB;
                    }
                    n nVar5 = (n) b0VarG.get("stack_trace");
                    return new qg.a(strB, strB2, nVar5 != null ? o.h(nVar5).b() : null, httpException);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // oa0.d
    public final void cancel() {
        this.f33760a.cancel();
    }

    @Override // oa0.d
    public final d clone() {
        return new a(this.f33760a.clone());
    }

    @Override // oa0.d
    public final n0 e() {
        u70.o oVar = u70.q.f40850b;
        return n0.b(new u70.q(new p(new RuntimeException("We don't use synchronous calls"))));
    }

    @Override // oa0.d
    public final void g(g gVar) {
        this.f33760a.g(new k8.d(29, gVar, this));
    }

    @Override // oa0.d
    public final boolean p() {
        return this.f33760a.p();
    }

    @Override // oa0.d
    public final g0 r() {
        g0 g0VarR = this.f33760a.r();
        g0VarR.getClass();
        return g0VarR;
    }
}
