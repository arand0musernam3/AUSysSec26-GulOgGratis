package x2;

import a3.j0;
import a3.k0;
import m2.l1;
import m2.t0;
import w2.o1;
import w2.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us.j f43751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43752b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f43753c = 9205357640488583168L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43754d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f43755e = t0.SelectionEnd;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43756f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0 f43757g = k0.f431d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f43758h;

    public m(w wVar, us.j jVar) {
        this.f43758h = wVar;
        this.f43751a = jVar;
    }

    @Override // m2.l1
    public final void a(long j9, j0 j0Var) {
        w wVar = this.f43758h;
        boolean z11 = wVar.f43789i;
        s1 s1Var = wVar.f43781a;
        o1 o1Var = wVar.f43782b;
        if (z11) {
            wVar.z(this.f43755e, j9);
            wVar.v(false);
            wVar.f43796q.setValue(k.Touch);
            this.f43753c = j9;
            this.f43754d = 0L;
            wVar.f43801v = -1;
            this.f43756f = true;
            this.f43757g = j0Var;
            if (o1Var.f43008b.g() == null) {
                return;
            }
            if (o1Var.e(j9)) {
                if (s1Var.d().f41928c.length() == 0) {
                    return;
                }
                int iC = o1Var.c(j9, true);
                long jA = wVar.A(new v2.b(wVar.f43781a.d(), m5.t0.f29648b, null, null, null, null, 60), iC, iC, false, this.f43757g, false, false);
                s1Var.j(jA);
                wVar.w(b0.Selection);
                this.f43752b = (int) (jA >> 32);
                return;
            }
            int iC2 = o1Var.c(j9, true);
            r4.a aVar = wVar.f43790j;
            if (aVar != null) {
                aVar.a(9);
            }
            s1Var.getClass();
            s1Var.j(m5.k0.b(iC2, iC2));
            wVar.v(true);
            this.f43756f = false;
            wVar.w(b0.Cursor);
        }
    }

    @Override // m2.l1
    public final void b() {
        f();
    }

    @Override // m2.l1
    public final void e(long j9) {
        int iIntValue;
        int iC;
        j0 j0Var;
        w wVar = this.f43758h;
        boolean z11 = wVar.f43789i;
        s1 s1Var = wVar.f43781a;
        o1 o1Var = wVar.f43782b;
        if (!z11 || o1Var.f43008b.g() == null || s1Var.d().f41928c.length() == 0) {
            return;
        }
        long jF = h4.b.f(this.f43754d, j9);
        this.f43754d = jF;
        long jF2 = h4.b.f(this.f43753c, jF);
        if (this.f43752b >= 0 || o1Var.e(jF2)) {
            int i11 = this.f43752b;
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 < 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : o1Var.c(this.f43753c, false);
            iC = o1Var.c(jF2, false);
            if (this.f43752b < 0 && iIntValue == iC) {
                return;
            }
            j0Var = this.f43757g;
            wVar.w(b0.Selection);
        } else {
            iIntValue = o1Var.c(this.f43753c, true);
            iC = o1Var.c(jF2, true);
            j0Var = iIntValue == iC ? k0.f431d : this.f43757g;
        }
        j0 j0Var2 = j0Var;
        int i12 = iIntValue;
        int i13 = iC;
        long j11 = s1Var.d().f41929d;
        long jA = wVar.A(wVar.f43781a.d(), i12, i13, false, j0Var2, false, false);
        if (this.f43752b == -1 && !m5.t0.d(jA)) {
            this.f43752b = (int) (jA >> 32);
        }
        if (m5.t0.h(jA)) {
            jA = m5.k0.b((int) (jA & 4294967295L), (int) (jA >> 32));
        }
        if (!m5.t0.c(jA, j11)) {
            int i14 = (int) (jA >> 32);
            int i15 = (int) (j11 >> 32);
            t0 t0Var = (i14 == i15 || ((int) (jA & 4294967295L)) != ((int) (j11 & 4294967295L))) ? ((i14 != i15 || ((int) (jA & 4294967295L)) == ((int) (j11 & 4294967295L))) && ((float) (i14 + ((int) (jA & 4294967295L)))) / 2.0f <= ((float) (i15 + ((int) (j11 & 4294967295L)))) / 2.0f) ? t0.SelectionStart : t0.SelectionEnd : t0.SelectionStart;
            this.f43755e = t0Var;
            this.f43756f = false;
        }
        if (m5.t0.d(j11) || !m5.t0.d(jA)) {
            s1Var.j(jA);
        }
        wVar.z(this.f43755e, jF2);
    }

    public final void f() {
        if ((this.f43753c & 9223372034707292159L) != 9205357640488583168L) {
            w wVar = this.f43758h;
            wVar.d();
            this.f43752b = -1;
            this.f43753c = 9205357640488583168L;
            this.f43754d = 0L;
            wVar.f43801v = -1;
            this.f43757g = k0.f431d;
            wVar.f43796q.setValue(k.None);
            this.f43751a.invoke();
            if (this.f43756f) {
                wVar.r();
            }
        }
    }

    @Override // m2.l1
    public final void onCancel() {
        f();
    }

    @Override // m2.l1
    public final void c() {
    }

    @Override // m2.l1
    public final void d() {
    }
}
