package z4;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f47186d = n1.f47191b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47187e = 0;

    public m1() {
        long j9 = 0;
        this.f47185c = (j9 & 4294967295L) | (j9 << 32);
    }

    public Object G() {
        return null;
    }

    public abstract int b0(a aVar);

    public int d0() {
        return (int) (this.f47185c & 4294967295L);
    }

    public int e0() {
        return (int) (this.f47185c >> 32);
    }

    public final void f0() {
        this.f47183a = n80.p.c((int) (this.f47185c >> 32), z5.a.k(this.f47186d), z5.a.i(this.f47186d));
        int iC = n80.p.c((int) (this.f47185c & 4294967295L), z5.a.j(this.f47186d), z5.a.h(this.f47186d));
        this.f47184b = iC;
        int i11 = this.f47183a;
        long j9 = this.f47185c;
        this.f47187e = (((long) ((i11 - ((int) (j9 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iC - ((int) (j9 & 4294967295L))) / 2)));
    }

    public abstract void h0(long j9, float f11, Function1 function1);

    public void l0(long j9, float f11, l4.b bVar) {
        h0(j9, f11, null);
    }

    public final void o0(long j9) {
        if (z5.l.a(this.f47185c, j9)) {
            return;
        }
        this.f47185c = j9;
        f0();
    }

    public final void p0(long j9) {
        if (z5.a.c(this.f47186d, j9)) {
            return;
        }
        this.f47186d = j9;
        f0();
    }
}
