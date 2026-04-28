package z2;

import androidx.lifecycle.n1;
import com.adyen.checkout.components.core.Address;
import java.util.List;
import kotlin.collections.n0;
import m2.g0;
import m5.k0;
import m5.p0;
import m5.q0;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m5.h f46807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q5.h f46808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f46813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f46814h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z5.c f46816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f46817k;
    public n1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z5.m f46818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q0 f46819n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f46822q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f46815i = a.f46795a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46820o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f46821p = -1;

    public d(m5.h hVar, u0 u0Var, q5.h hVar2, int i11, boolean z11, int i12, int i13, List list) {
        this.f46807a = hVar;
        this.f46808b = hVar2;
        this.f46809c = i11;
        this.f46810d = z11;
        this.f46811e = i12;
        this.f46812f = i13;
        this.f46813g = list;
        this.f46817k = u0Var;
    }

    public final int a(int i11, z5.m mVar) {
        int i12 = this.f46820o;
        int i13 = this.f46821p;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        long jA = z5.b.a(0, i11, 0, Integer.MAX_VALUE);
        if (this.f46812f > 1) {
            b bVar = this.f46814h;
            u0 u0Var = this.f46817k;
            z5.c cVar = this.f46816j;
            cVar.getClass();
            b bVarG = w.b.G(bVar, mVar, u0Var, cVar, this.f46808b);
            this.f46814h = bVarG;
            jA = bVarG.a(this.f46812f, jA);
        }
        int iR = g0.r(b(jA, mVar).f29627e);
        int iJ = z5.a.j(jA);
        if (iR < iJ) {
            iR = iJ;
        }
        this.f46820o = i11;
        this.f46821p = iR;
        return iR;
    }

    public final m5.r b(long j9, z5.m mVar) {
        n1 n1VarE = e(mVar);
        long jX = v0.n.x(n1VarE.c(), this.f46809c, j9, this.f46810d);
        boolean z11 = this.f46810d;
        int i11 = this.f46809c;
        int i12 = this.f46811e;
        return new m5.r(n1VarE, jX, ((z11 || !(i11 == 2 || i11 == 4 || i11 == 5)) && i12 >= 1) ? i12 : 1, i11);
    }

    public final boolean c(long j9, z5.m mVar) {
        this.f46822q = (this.f46822q << 2) | 3;
        if (this.f46812f > 1) {
            b bVar = this.f46814h;
            u0 u0Var = this.f46817k;
            z5.c cVar = this.f46816j;
            cVar.getClass();
            b bVarG = w.b.G(bVar, mVar, u0Var, cVar, this.f46808b);
            this.f46814h = bVarG;
            j9 = bVarG.a(this.f46812f, j9);
        }
        q0 q0Var = this.f46819n;
        if (q0Var != null) {
            m5.r rVar = q0Var.f29618b;
            p0 p0Var = q0Var.f29617a;
            if (!rVar.f29623a.a()) {
                z5.m mVar2 = p0Var.f29610h;
                long j11 = p0Var.f29612j;
                if (mVar == mVar2 && (z5.a.c(j9, j11) || (z5.a.i(j9) == z5.a.i(j11) && z5.a.k(j9) == z5.a.k(j11) && z5.a.h(j9) >= rVar.f29627e && !rVar.f29625c))) {
                    q0 q0Var2 = this.f46819n;
                    q0Var2.getClass();
                    if (z5.a.c(j9, q0Var2.f29617a.f29612j)) {
                        return false;
                    }
                    q0 q0Var3 = this.f46819n;
                    q0Var3.getClass();
                    this.f46819n = f(mVar, j9, q0Var3.f29618b);
                    return true;
                }
            }
        }
        this.f46819n = f(mVar, j9, b(j9, mVar));
        return true;
    }

    public final void d(z5.c cVar) {
        long jA;
        z5.c cVar2 = this.f46816j;
        if (cVar != null) {
            int i11 = a.f46796b;
            jA = a.a(cVar.a(), cVar.X());
        } else {
            jA = a.f46795a;
        }
        if (cVar2 == null) {
            this.f46816j = cVar;
            this.f46815i = jA;
        } else if (cVar == null || this.f46815i != jA) {
            this.f46816j = cVar;
            this.f46815i = jA;
            this.f46822q = (this.f46822q << 2) | 1;
            this.l = null;
            this.f46819n = null;
            this.f46821p = -1;
            this.f46820o = -1;
        }
    }

    public final n1 e(z5.m mVar) {
        n1 n1Var = this.l;
        if (n1Var == null || mVar != this.f46818m || n1Var.a()) {
            this.f46818m = mVar;
            m5.h hVar = this.f46807a;
            u0 u0VarK = k0.k(this.f46817k, mVar);
            z5.c cVar = this.f46816j;
            cVar.getClass();
            q5.h hVar2 = this.f46808b;
            List list = this.f46813g;
            if (list == null) {
                list = n0.f26529a;
            }
            n1Var = new n1(hVar, u0VarK, list, cVar, hVar2);
        }
        this.l = n1Var;
        return n1Var;
    }

    public final q0 f(z5.m mVar, long j9, m5.r rVar) {
        float fMin = Math.min(rVar.f29623a.c(), rVar.f29626d);
        m5.h hVar = this.f46807a;
        u0 u0Var = this.f46817k;
        List list = this.f46813g;
        if (list == null) {
            list = n0.f26529a;
        }
        int i11 = this.f46811e;
        boolean z11 = this.f46810d;
        int i12 = this.f46809c;
        z5.c cVar = this.f46816j;
        cVar.getClass();
        return new q0(new p0(hVar, u0Var, list, i11, z11, i12, cVar, mVar, this.f46808b, j9), rVar, z5.b.d(j9, (((long) g0.r(fMin)) << 32) | (((long) g0.r(rVar.f29627e)) & 4294967295L)));
    }

    public final void g(m5.h hVar, u0 u0Var, q5.h hVar2, int i11, boolean z11, int i12, int i13, List list) {
        this.f46807a = hVar;
        boolean zC = u0Var.c(this.f46817k);
        this.f46817k = u0Var;
        if (!zC) {
            this.f46822q <<= 2;
            this.l = null;
            this.f46819n = null;
            this.f46821p = -1;
            this.f46820o = -1;
        }
        this.f46808b = hVar2;
        this.f46809c = i11;
        this.f46810d = z11;
        this.f46811e = i12;
        this.f46812f = i13;
        this.f46813g = list;
        this.f46822q = (this.f46822q << 2) | 2;
        this.l = null;
        this.f46819n = null;
        this.f46821p = -1;
        this.f46820o = -1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        q0 q0Var = this.f46819n;
        Object aVar = Address.ADDRESS_NULL_PLACEHOLDER;
        sb2.append(q0Var != null ? "<TextLayoutResult>" : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f46815i));
        sb2.append(", history=");
        sb2.append(this.f46822q);
        sb2.append(", constraints=");
        q0 q0Var2 = this.f46819n;
        if (q0Var2 != null) {
            aVar = new z5.a(q0Var2.f29617a.f29612j);
        }
        sb2.append(aVar);
        sb2.append(')');
        return sb2.toString();
    }
}
