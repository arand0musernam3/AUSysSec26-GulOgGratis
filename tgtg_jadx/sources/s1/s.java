package s1;

import java.util.LinkedHashMap;
import t1.n1;
import t1.q1;
import t1.u1;
import t1.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f38673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b4.f f38674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z5.m f38675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f38676d = m3.i.w(new z5.l(0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1.t0 f38677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1.l1 f38678f;

    public s(q1 q1Var, b4.f fVar, z5.m mVar) {
        this.f38673a = q1Var;
        this.f38674b = fVar;
        this.f38675c = mVar;
        long[] jArr = q1.g1.f35760a;
        this.f38677e = new q1.t0();
    }

    public static final long d(s sVar, long j9, long j11) {
        return sVar.f38674b.a(j9, j11, z5.m.Ltr);
    }

    public static final long e(s sVar) {
        t1.l1 l1Var = sVar.f38678f;
        return l1Var != null ? ((z5.l) l1Var.getValue()).f47286a : ((z5.l) sVar.f38676d.getValue()).f47286a;
    }

    public static x0 f(s sVar, int i11, u1 u1Var) {
        c cVar = c.f38532d;
        sVar.getClass();
        return (i11 == 0 || (i11 == 4 && sVar.f38675c == z5.m.Ltr) || (i11 == 5 && sVar.f38675c == z5.m.Rtl)) ? r0.k(new r(cVar, sVar, 0), u1Var) : (i11 == 1 || (i11 == 4 && sVar.f38675c == z5.m.Rtl) || (i11 == 5 && sVar.f38675c == z5.m.Ltr)) ? r0.k(new r(cVar, sVar, 1), u1Var) : i11 == 2 ? r0.m(new r(cVar, sVar, 2), u1Var) : i11 == 3 ? r0.m(new r(cVar, sVar, 3), u1Var) : x0.f38729b;
    }

    public static y0 g(s sVar, int i11, u1 u1Var) {
        c cVar = c.f38533e;
        sVar.getClass();
        int i12 = 6;
        int i13 = 4;
        if (i11 != 0 && (i11 != 4 || sVar.f38675c != z5.m.Ltr)) {
            int i14 = 5;
            if (i11 != 5 || sVar.f38675c != z5.m.Rtl) {
                if (i11 == 1 || ((i11 == 4 && sVar.f38675c == z5.m.Rtl) || (i11 == 5 && sVar.f38675c == z5.m.Ltr))) {
                    r rVar = new r(sVar, cVar, i14);
                    v1 v1Var = r0.f38669a;
                    return new y0(new l1((z0) null, new j1(new q0(rVar, 6), u1Var), (c0) null, (c1) null, (LinkedHashMap) null, 125));
                }
                int i15 = 7;
                if (i11 == 2) {
                    r rVar2 = new r(sVar, cVar, i12);
                    v1 v1Var2 = r0.f38669a;
                    return new y0(new l1((z0) null, new j1(new q0(rVar2, 7), u1Var), (c0) null, (c1) null, (LinkedHashMap) null, 125));
                }
                if (i11 != 3) {
                    return y0.f38731b;
                }
                r rVar3 = new r(sVar, cVar, i15);
                v1 v1Var3 = r0.f38669a;
                return new y0(new l1((z0) null, new j1(new q0(rVar3, 7), u1Var), (c0) null, (c1) null, (LinkedHashMap) null, 125));
            }
        }
        r rVar4 = new r(sVar, cVar, i13);
        v1 v1Var4 = r0.f38669a;
        return new y0(new l1((z0) null, new j1(new q0(rVar4, 6), u1Var), (c0) null, (c1) null, (LinkedHashMap) null, 125));
    }

    @Override // t1.n1
    public final Object a() {
        return this.f38673a.f().a();
    }

    @Override // t1.n1
    public final Object c() {
        return this.f38673a.f().c();
    }
}
