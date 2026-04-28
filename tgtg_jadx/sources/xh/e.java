package xh;

import g3.x5;
import kotlin.Unit;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44314a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9.f0 f44315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f44316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ii.j0 f44317d;

    public /* synthetic */ e(g9.f0 f0Var, b1 b1Var, ii.j0 j0Var) {
        this.f44315b = f0Var;
        this.f44316c = b1Var;
        this.f44317d = j0Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f44314a) {
            case 0:
                w.a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                m3.s sVar = (m3.s) ((m3.n) obj3);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = m3.i.w(null);
                    sVar.k0(objM);
                }
                b1 b1Var = (b1) objM;
                long j9 = lv.s.J;
                b1 b1Var2 = this.f44316c;
                ii.j0 j0Var = this.f44317d;
                g9.f0 f0Var = this.f44315b;
                x5.a(null, null, u3.e.e(-1623281214, sVar, new lp.v(20, b1Var2, j0Var, f0Var, b1Var)), null, null, 0, 0L, j9, null, u3.e.e(-1924663028, sVar, new g(f0Var, b1Var2, b1Var)), sVar, 817889664, 379);
                break;
            default:
                m3.n nVar = (m3.n) obj3;
                w.a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                b4.t tVarE = d2.c.E(b4.q.f5711a);
                long j11 = lv.s.J;
                g9.f0 f0Var2 = this.f44315b;
                x5.a(tVarE, a.f44306a, u3.e.e(-135917510, nVar, new f(f0Var2, this.f44316c, 1)), null, null, 0, 0L, j11, null, u3.e.e(-2001031932, nVar, new oo.s(14, this.f44317d, f0Var2)), nVar, 817889712, 376);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(b1 b1Var, ii.j0 j0Var, g9.f0 f0Var) {
        this.f44316c = b1Var;
        this.f44317d = j0Var;
        this.f44315b = f0Var;
    }
}
