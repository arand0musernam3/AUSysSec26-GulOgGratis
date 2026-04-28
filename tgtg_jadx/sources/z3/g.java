package z3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f47001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47004d;

    public g(long j9, k kVar) {
        int iB;
        int iNumberOfTrailingZeros;
        this.f47001a = kVar;
        this.f47002b = j9;
        yj.m mVar = l.f47036a;
        if (j9 != 0) {
            k kVarD = d();
            long j11 = kVarD.f47028c;
            long[] jArr = kVarD.f47029d;
            if (jArr != null) {
                j9 = jArr[0];
            } else {
                long j12 = kVarD.f47027b;
                if (j12 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                } else {
                    long j13 = kVarD.f47026a;
                    if (j13 != 0) {
                        j11 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
                    }
                }
                j9 = ((long) iNumberOfTrailingZeros) + j11;
            }
            synchronized (l.f47038c) {
                iB = l.f47041f.b(j9);
            }
        } else {
            iB = -1;
        }
        this.f47004d = iB;
    }

    public static void q(g gVar) {
        l.f47037b.I(gVar);
    }

    public final void a() {
        synchronized (l.f47038c) {
            b();
            p();
        }
    }

    public void b() {
        l.f47039d = l.f47039d.d(g());
    }

    public abstract void c();

    public k d() {
        return this.f47001a;
    }

    public abstract Function1 e();

    public abstract boolean f();

    public long g() {
        return this.f47002b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final g j() {
        t5.a aVar = l.f47037b;
        g gVar = (g) aVar.j();
        aVar.I(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(d0 d0Var);

    public final void o() {
        int i11 = this.f47004d;
        if (i11 >= 0) {
            l.u(i11);
            this.f47004d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(k kVar) {
        this.f47001a = kVar;
    }

    public void s(long j9) {
        this.f47002b = j9;
    }

    public void t(int i11) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g u(Function1 function1);
}
