package z2;

import com.adyen.checkout.components.core.Address;
import kotlin.collections.n0;
import m2.g0;
import m5.k0;
import m5.u0;
import m5.v;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f46824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q5.h f46825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46829g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z5.c f46831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m5.b f46832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46833k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f46834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f46835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z5.m f46836o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f46840s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46830h = a.f46795a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f46837p = z5.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f46838q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46839r = -1;

    public e(String str, u0 u0Var, q5.h hVar, int i11, boolean z11, int i12, int i13) {
        this.f46823a = str;
        this.f46824b = u0Var;
        this.f46825c = hVar;
        this.f46826d = i11;
        this.f46827e = z11;
        this.f46828f = i12;
        this.f46829g = i13;
        long j9 = 0;
        this.l = (j9 & 4294967295L) | (j9 << 32);
    }

    public static long f(e eVar, long j9, z5.m mVar) {
        u0 u0Var = eVar.f46824b;
        b bVar = eVar.f46834m;
        z5.c cVar = eVar.f46831i;
        cVar.getClass();
        b bVarG = w.b.G(bVar, mVar, u0Var, cVar, eVar.f46825c);
        eVar.f46834m = bVarG;
        return bVarG.a(eVar.f46829g, j9);
    }

    public final int a(int i11, z5.m mVar) {
        int i12 = this.f46838q;
        int i13 = this.f46839r;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        long jA = z5.b.a(0, i11, 0, Integer.MAX_VALUE);
        if (this.f46829g > 1) {
            jA = f(this, jA, mVar);
        }
        v vVarE = e(mVar);
        long jX = v0.n.x(vVarE.c(), this.f46826d, jA, this.f46827e);
        boolean z11 = this.f46827e;
        int i14 = this.f46826d;
        int i15 = this.f46828f;
        int iR = g0.r(new m5.b((u5.d) vVarE, ((z11 || !(i14 == 2 || i14 == 4 || i14 == 5)) && i15 >= 1) ? i15 : 1, i14, jX).b());
        int iJ = z5.a.j(jA);
        if (iR < iJ) {
            iR = iJ;
        }
        this.f46838q = i11;
        this.f46839r = iR;
        return iR;
    }

    public final boolean b(long j9, z5.m mVar) {
        v vVar;
        this.f46840s = (this.f46840s << 2) | 3;
        boolean z11 = true;
        long jF = this.f46829g > 1 ? f(this, j9, mVar) : j9;
        m5.b bVar = this.f46832j;
        boolean z12 = false;
        if (bVar != null && (vVar = this.f46835n) != null && !vVar.a() && mVar == this.f46836o && (z5.a.c(jF, this.f46837p) || (z5.a.i(jF) == z5.a.i(this.f46837p) && z5.a.k(jF) == z5.a.k(this.f46837p) && z5.a.h(jF) >= bVar.b() && !bVar.f29514d.f30529d))) {
            if (!z5.a.c(jF, this.f46837p)) {
                m5.b bVar2 = this.f46832j;
                bVar2.getClass();
                this.l = z5.b.d(jF, (((long) g0.r(Math.min(bVar2.f29511a.f40775i.c(), bVar2.d()))) << 32) | (((long) g0.r(bVar2.b())) & 4294967295L));
                if (this.f46826d == 3 || (((int) (r12 >> 32)) >= bVar2.d() && ((int) (4294967295L & r12)) >= bVar2.b())) {
                    z11 = false;
                }
                this.f46833k = z11;
                this.f46837p = jF;
            }
            return false;
        }
        v vVarE = e(mVar);
        long jX = v0.n.x(vVarE.c(), this.f46826d, jF, this.f46827e);
        boolean z13 = this.f46827e;
        int i11 = this.f46826d;
        int i12 = this.f46828f;
        m5.b bVar3 = new m5.b((u5.d) vVarE, ((z13 || !(i11 == 2 || i11 == 4 || i11 == 5)) && i12 >= 1) ? i12 : 1, i11, jX);
        this.f46837p = jF;
        this.l = z5.b.d(jF, (((long) g0.r(bVar3.b())) & 4294967295L) | (((long) g0.r(bVar3.d())) << 32));
        if (this.f46826d != 3 && (((int) (r1 >> 32)) < bVar3.d() || ((int) (r1 & 4294967295L)) < bVar3.b())) {
            z12 = true;
        }
        this.f46833k = z12;
        this.f46832j = bVar3;
        return true;
    }

    public final void c() {
        this.f46832j = null;
        this.f46835n = null;
        this.f46836o = null;
        this.f46838q = -1;
        this.f46839r = -1;
        this.f46837p = z5.b.h(0, 0, 0, 0);
        long j9 = 0;
        this.l = (j9 & 4294967295L) | (j9 << 32);
        this.f46833k = false;
    }

    public final void d(z5.c cVar) {
        long jA;
        z5.c cVar2 = this.f46831i;
        if (cVar != null) {
            int i11 = a.f46796b;
            jA = a.a(cVar.a(), cVar.X());
        } else {
            jA = a.f46795a;
        }
        if (cVar2 == null) {
            this.f46831i = cVar;
            this.f46830h = jA;
        } else if (cVar == null || this.f46830h != jA) {
            this.f46831i = cVar;
            this.f46830h = jA;
            this.f46840s = (this.f46840s << 2) | 1;
            c();
        }
    }

    public final v e(z5.m mVar) {
        v dVar = this.f46835n;
        if (dVar == null || mVar != this.f46836o || dVar.a()) {
            this.f46836o = mVar;
            String str = this.f46823a;
            u0 u0VarK = k0.k(this.f46824b, mVar);
            n0 n0Var = n0.f26529a;
            z5.c cVar = this.f46831i;
            cVar.getClass();
            dVar = new u5.d(str, u0VarK, n0Var, n0Var, this.f46825c, cVar);
        }
        this.f46835n = dVar;
        return dVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f46832j != null ? "<paragraph>" : Address.ADDRESS_NULL_PLACEHOLDER);
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f46830h));
        sb2.append(", history=");
        return a0.j(this.f46840s, ", constraints=$)", sb2);
    }
}
