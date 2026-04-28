package g2;

import h2.h0;
import h2.r0;
import java.util.List;
import v80.f0;
import z4.l1;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements j, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z5.m f18229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f18232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f18234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f18235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f18236k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18240p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18242r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f18243s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f18244t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18245u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18246v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18247w;

    public s(int i11, Object obj, int i12, int i13, z5.m mVar, int i14, int i15, List list, long j9, Object obj2, h0 h0Var, long j11, int i16, int i17) {
        this.f18226a = i11;
        this.f18227b = obj;
        this.f18228c = i12;
        this.f18229d = mVar;
        this.f18230e = i14;
        this.f18231f = i15;
        this.f18232g = list;
        this.f18233h = j9;
        this.f18234i = obj2;
        this.f18235j = h0Var;
        this.f18236k = j11;
        this.l = i16;
        this.f18237m = i17;
        int size = list.size();
        int iMax = 0;
        for (int i18 = 0; i18 < size; i18++) {
            iMax = Math.max(iMax, ((m1) list.get(i18)).f47184b);
        }
        this.f18238n = iMax;
        int i19 = i13 + iMax;
        this.f18239o = i19 >= 0 ? i19 : 0;
        this.f18243s = (((long) this.f18228c) << 32) | (((long) iMax) & 4294967295L);
        this.f18244t = 0L;
        this.f18245u = -1;
        this.f18246v = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(l1 l1Var, boolean z11) {
        if (this.f18240p == Integer.MIN_VALUE) {
            c2.a.a("position() should be called first");
        }
        List list = this.f18232g;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m1 m1Var = (m1) list.get(i11);
            int i12 = this.f18241q - m1Var.f47184b;
            int i13 = this.f18242r;
            long j9 = this.f18244t;
            h2.b0 b0VarA = this.f18235j.a(i11, this.f18227b);
            l4.b bVar = null;
            Object[] objArr = 0;
            if (b0VarA != null) {
                if (z11) {
                    b0VarA.f21059r = j9;
                } else {
                    long jD = z5.j.d(!z5.j.b(b0VarA.f21059r, h2.b0.f21041s) ? b0VarA.f21059r : j9, ((z5.j) b0VarA.f21058q.getValue()).f47280a);
                    int i14 = (int) (j9 & 4294967295L);
                    if (((i14 <= i12 && ((int) (jD & 4294967295L)) <= i12) || (i14 >= i13 && ((int) (jD & 4294967295L)) >= i13)) && ((Boolean) b0VarA.f21050h.getValue()).booleanValue()) {
                        f0.B(b0VarA.f21043a, null, null, new h2.y(b0VarA, objArr == true ? 1 : 0, 1), 3);
                    }
                    j9 = jD;
                }
                bVar = b0VarA.f21055n;
            }
            long jD2 = z5.j.d(j9, this.f18233h);
            if (!z11 && b0VarA != null) {
                b0VarA.f21054m = jD2;
            }
            if (bVar != null) {
                l1Var.getClass();
                l1.b(l1Var, m1Var);
                m1Var.l0(z5.j.d(jD2, m1Var.f47187e), 0.0f, bVar);
            } else {
                l1.w(l1Var, m1Var, jD2);
            }
        }
    }

    @Override // h2.r0
    public final int b() {
        return this.f18232g.size();
    }

    @Override // h2.r0
    public final int c() {
        return this.f18239o;
    }

    @Override // h2.r0
    public final boolean d() {
        return this.f18247w;
    }

    @Override // h2.r0
    public final int e() {
        return this.f18237m;
    }

    @Override // h2.r0
    public final Object f(int i11) {
        return ((m1) this.f18232g.get(i11)).G();
    }

    @Override // h2.r0
    public final long g() {
        return this.f18236k;
    }

    @Override // h2.r0
    public final int getIndex() {
        return this.f18226a;
    }

    @Override // h2.r0
    public final Object getKey() {
        return this.f18227b;
    }

    @Override // h2.r0
    public final boolean h() {
        return true;
    }

    @Override // h2.r0
    public final void i() {
        this.f18247w = true;
    }

    @Override // h2.r0
    public final long j(int i11) {
        return this.f18244t;
    }

    @Override // h2.r0
    public final int k() {
        return this.l;
    }

    @Override // h2.r0
    public final void l(int i11, int i12, int i13, int i14) {
        m(i11, i12, i13, i14, -1, -1);
    }

    public final void m(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f18240p = i14;
        if (this.f18229d == z5.m.Rtl) {
            i12 = (i13 - i12) - this.f18228c;
        }
        this.f18244t = (((long) i12) << 32) | (((long) i11) & 4294967295L);
        this.f18245u = i15;
        this.f18246v = i16;
        this.f18241q = -this.f18230e;
        this.f18242r = i14 + this.f18231f;
    }
}
