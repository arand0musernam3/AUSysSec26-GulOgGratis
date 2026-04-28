package f2;

import h2.h0;
import h2.r0;
import java.util.List;
import z4.l1;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements m, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b4.e f17202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b4.j f17203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z5.m f17204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f17209k;
    public final Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f17210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f17211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f17212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f17214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f17216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17218u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f17221x;

    public t(int i11, List list, boolean z11, b4.e eVar, b4.j jVar, z5.m mVar, boolean z12, int i12, int i13, int i14, long j9, Object obj, Object obj2, h0 h0Var, long j11) {
        this.f17199a = i11;
        this.f17200b = list;
        this.f17201c = z11;
        this.f17202d = eVar;
        this.f17203e = jVar;
        this.f17204f = mVar;
        this.f17205g = z12;
        this.f17206h = i12;
        this.f17207i = i13;
        this.f17208j = i14;
        this.f17209k = j9;
        this.l = obj;
        this.f17210m = obj2;
        this.f17211n = h0Var;
        this.f17212o = j11;
        int size = list.size();
        int i15 = 0;
        int iMax = 0;
        for (int i16 = 0; i16 < size; i16++) {
            m1 m1Var = (m1) list.get(i16);
            boolean z13 = this.f17201c;
            i15 += z13 ? m1Var.f47184b : m1Var.f47183a;
            iMax = Math.max(iMax, !z13 ? m1Var.f47184b : m1Var.f47183a);
        }
        this.f17214q = i15;
        int i17 = i15 + this.f17208j;
        this.f17215r = i17 >= 0 ? i17 : 0;
        this.f17216s = iMax;
        this.f17221x = new int[this.f17200b.size() * 2];
    }

    public final int a(long j9) {
        return (int) (this.f17201c ? j9 & 4294967295L : j9 >> 32);
    }

    @Override // h2.r0
    public final int b() {
        return this.f17200b.size();
    }

    @Override // h2.r0
    public final int c() {
        return this.f17215r;
    }

    @Override // h2.r0
    public final boolean d() {
        return this.f17217t;
    }

    @Override // h2.r0
    public final int e() {
        return 1;
    }

    @Override // h2.r0
    public final Object f(int i11) {
        return ((m1) this.f17200b.get(i11)).G();
    }

    @Override // h2.r0
    public final long g() {
        return this.f17212o;
    }

    @Override // h2.r0
    public final int getIndex() {
        return this.f17199a;
    }

    @Override // h2.r0
    public final Object getKey() {
        return this.l;
    }

    @Override // h2.r0
    public final boolean h() {
        return this.f17201c;
    }

    @Override // h2.r0
    public final void i() {
        this.f17217t = true;
    }

    @Override // h2.r0
    public final long j(int i11) {
        if (i11 == 0 && this.f17200b.size() == 0) {
            int i12 = this.f17213p;
            if (this.f17201c) {
                return (4294967295L & ((long) i12)) | (((long) 0) << 32);
            }
            return (4294967295L & ((long) 0)) | (((long) i12) << 32);
        }
        int i13 = i11 * 2;
        int[] iArr = this.f17221x;
        int i14 = iArr[i13];
        return (4294967295L & ((long) iArr[i13 + 1])) | (((long) i14) << 32);
    }

    @Override // h2.r0
    public final int k() {
        return 0;
    }

    @Override // h2.r0
    public final void l(int i11, int i12, int i13, int i14) {
        n(i11, i13, i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(l1 l1Var, boolean z11) {
        List list;
        int i11;
        int i12;
        long j9;
        if (this.f17218u == Integer.MIN_VALUE) {
            c2.a.a("position() should be called first");
        }
        List list2 = this.f17200b;
        int i13 = 0;
        for (int size = list2.size(); i13 < size; size = i11) {
            m1 m1Var = (m1) list2.get(i13);
            int i14 = this.f17219v;
            boolean z12 = this.f17201c;
            int i15 = i14 - (z12 ? m1Var.f47184b : m1Var.f47183a);
            int i16 = this.f17220w;
            long j11 = j(i13);
            h2.b0 b0VarA = this.f17211n.a(i13, this.l);
            l4.b bVar = null;
            Object[] objArr = 0;
            if (b0VarA != null) {
                if (z11) {
                    b0VarA.f21059r = j11;
                    list = list2;
                    i11 = size;
                } else {
                    list = list2;
                    i11 = size;
                    if (!z5.j.b(b0VarA.f21059r, h2.b0.f21041s)) {
                        j11 = b0VarA.f21059r;
                    }
                    long jD = z5.j.d(j11, ((z5.j) b0VarA.f21058q.getValue()).f47280a);
                    if (((a(j11) <= i15 && a(jD) <= i15) || (a(j11) >= i16 && a(jD) >= i16)) && ((Boolean) b0VarA.f21050h.getValue()).booleanValue()) {
                        v80.f0.B(b0VarA.f21043a, null, null, new h2.y(b0VarA, objArr == true ? 1 : 0, 1), 3);
                    }
                    j11 = jD;
                }
                bVar = b0VarA.f21055n;
            } else {
                list = list2;
                i11 = size;
            }
            if (this.f17205g) {
                int i17 = this.f17218u;
                if (z12) {
                    i12 = i13;
                    j9 = (((long) ((int) (j11 >> 32))) << 32) | (((long) ((i17 - ((int) (j11 & 4294967295L))) - (z12 ? m1Var.f47184b : m1Var.f47183a))) & 4294967295L);
                } else {
                    i12 = i13;
                    j9 = (((long) ((int) (j11 & 4294967295L))) & 4294967295L) | (((long) ((i17 - ((int) (j11 >> 32))) - (z12 ? m1Var.f47184b : m1Var.f47183a))) << 32);
                }
                j11 = j9;
            } else {
                i12 = i13;
            }
            long jD2 = z5.j.d(j11, this.f17209k);
            if (!z11 && b0VarA != null) {
                b0VarA.f21054m = jD2;
            }
            if (z12) {
                if (bVar != null) {
                    l1Var.getClass();
                    l1.b(l1Var, m1Var);
                    m1Var.l0(z5.j.d(jD2, m1Var.f47187e), 0.0f, bVar);
                } else {
                    l1.w(l1Var, m1Var, jD2);
                }
            } else if (bVar == null) {
                l1.q(l1Var, m1Var, jD2);
            } else if (l1Var.e() == z5.m.Ltr || l1Var.g() == 0) {
                l1.b(l1Var, m1Var);
                m1Var.l0(z5.j.d(jD2, m1Var.f47187e), 0.0f, bVar);
            } else {
                int iG = (l1Var.g() - m1Var.f47183a) - ((int) (jD2 >> 32));
                l1.b(l1Var, m1Var);
                m1Var.l0(z5.j.d((((long) iG) << 32) | (4294967295L & ((long) ((int) (jD2 & 4294967295L)))), m1Var.f47187e), 0.0f, bVar);
            }
            i13 = i12 + 1;
            list2 = list;
        }
    }

    public final void n(int i11, int i12, int i13) {
        int i14;
        this.f17213p = i11;
        boolean z11 = this.f17201c;
        this.f17218u = z11 ? i13 : i12;
        List list = this.f17200b;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            m1 m1Var = (m1) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f17221x;
            if (z11) {
                b4.e eVar = this.f17202d;
                if (eVar == null) {
                    c2.a.b("null horizontalAlignment when isVertical == true");
                    qc.y.m();
                    return;
                } else {
                    iArr[i16] = eVar.a(m1Var.f47183a, i12, this.f17204f);
                    iArr[i16 + 1] = i11;
                    i14 = m1Var.f47184b;
                }
            } else {
                iArr[i16] = i11;
                int i17 = i16 + 1;
                b4.j jVar = this.f17203e;
                if (jVar == null) {
                    c2.a.b("null verticalAlignment when isVertical == false");
                    qc.y.m();
                    return;
                } else {
                    iArr[i17] = jVar.a(m1Var.f47184b, i13);
                    i14 = m1Var.f47183a;
                }
            }
            i11 += i14;
        }
        this.f17219v = -this.f17206h;
        this.f17220w = this.f17218u + this.f17207i;
    }
}
