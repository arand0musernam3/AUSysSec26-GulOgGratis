package w90;

import ia0.d0;
import ia0.g;
import ia0.j0;
import ia0.l0;
import ia0.q;
import java.io.IOException;
import q90.t;
import q90.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f43328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f43329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f43331d;

    public a(f fVar, v vVar) {
        vVar.getClass();
        this.f43331d = fVar;
        this.f43328a = vVar;
        this.f43329b = new q(((d0) fVar.f43344c.f39792c).f23622a.i());
    }

    @Override // ia0.j0
    public long F(g gVar, long j9) {
        f fVar = this.f43331d;
        gVar.getClass();
        try {
            return ((d0) fVar.f43344c.f39792c).F(gVar, j9);
        } catch (IOException e5) {
            fVar.f43343b.e();
            a(f.f43341f);
            throw e5;
        }
    }

    public final void a(t tVar) {
        q90.d0 d0Var;
        q90.q qVar;
        tVar.getClass();
        f fVar = this.f43331d;
        int i11 = fVar.f43345d;
        if (i11 == 6) {
            return;
        }
        if (i11 != 5) {
            a40.d0.d(fVar.f43345d, "state: ");
            return;
        }
        q qVar2 = this.f43329b;
        l0 l0Var = qVar2.f23670e;
        qVar2.f23670e = l0.f23657d;
        l0Var.a();
        l0Var.b();
        fVar.f43345d = 6;
        if (tVar.size() <= 0 || (d0Var = fVar.f43342a) == null || (qVar = d0Var.f36472j) == null) {
            return;
        }
        v90.f.b(qVar, this.f43328a, tVar);
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f43329b;
    }
}
