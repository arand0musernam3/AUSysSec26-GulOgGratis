package v2;

import i4.u0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import m3.m;
import m3.s;
import m5.k0;
import m5.l0;
import m5.t0;
import q5.n;
import q5.o;
import q5.r;
import x5.l;
import x5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements y3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f41942a = new j();

    public static final List a(t0 t0Var, o3.e eVar) {
        if (eVar != null && eVar.f31832c != 0) {
            return CollectionsKt.r0(eVar.f());
        }
        if (t0Var != null) {
            long j9 = t0Var.f29650a;
            if (!t0.d(j9)) {
                return c0.c(new m5.f(new l0(0L, 0L, (r) null, (n) null, (o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (p) null, (t5.c) null, 0L, l.f43854c, (u0) null, 61439), t0.g(j9), t0.f(j9)));
            }
        }
        return n0.f26529a;
    }

    public static final long b(int i11, int i12, int i13, long j9) {
        int i14;
        int iG = t0.g(j9);
        int iF = t0.f(j9);
        if (iF < i11) {
            return j9;
        }
        if (iG <= i11 && i12 <= iF) {
            i14 = i13 - (i12 - i11);
            if (iG == iF) {
            }
            i11 = iF + i14;
            return k0.b(iG, i11);
        }
        if (iG > i11 && iF < i12) {
            i11 += i13;
            iG = i11;
        } else if (iG >= i12) {
            i14 = i13 - (i12 - i11);
        } else if (i11 < iG) {
            iG = i11 + i13;
            i11 = (i13 - (i12 - i11)) + iF;
        }
        return k0.b(iG, i11);
        iG += i14;
        i11 = iF + i14;
        return k0.b(iG, i11);
    }

    public static final void c(a aVar) {
        w2.k0 k0Var = aVar.f41920b;
        int length = k0Var.length();
        int length2 = k0Var.length() + 1;
        if (length < 0 || length >= length2) {
            c2.a.a("Expected " + length + " to be in [0, " + length2 + ')');
        }
        aVar.f41922d = k0.b(length, length);
    }

    public static final void d(ub.a aVar, b bVar, b bVar2, ub.a aVar2, boolean z11) {
        o3.e eVar = (o3.e) aVar2.f40981b;
        int i11 = eVar.f31832c;
        if (i11 > 1) {
            aVar.F(new y2.d(0, bVar.f41928c.toString(), bVar2.f41928c.toString(), bVar.f41929d, bVar2.f41929d, 0L, false, 32));
            return;
        }
        if (i11 == 1) {
            w2.j jVar = (w2.j) eVar.f31830a[0];
            long jB = k0.b(jVar.f42943c, jVar.f42944d);
            w2.j jVar2 = (w2.j) ((o3.e) aVar2.f40981b).f31830a[0];
            long jB2 = k0.b(jVar2.f42941a, jVar2.f42942b);
            if (t0.d(jB) && t0.d(jB2)) {
                return;
            }
            aVar.F(new y2.d(t0.g(jB), k0.l(jB, bVar), k0.l(jB2, bVar2), bVar.f41929d, bVar2.f41929d, 0L, z11, 32));
        }
    }

    public static final h f(m3.n nVar) {
        int length = "".length();
        long jB = k0.b(length, length);
        Object[] objArr = new Object[0];
        e eVar = e.f41933c;
        boolean zF = ((s) nVar).f("") | ((s) nVar).e(jB);
        s sVar = (s) nVar;
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = new dw.b(jB, 4);
            sVar.k0(objM);
        }
        return (h) y3.j.d(objArr, eVar, (Function0) objM, sVar, 48);
    }

    public static final void g(a aVar, int i11, int i12) {
        aVar.f(k0.b(n80.p.c(i11, 0, aVar.f41920b.length()), n80.p.c(i12, 0, aVar.f41920b.length())));
    }
}
