package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements s0.o2, s0.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.i1 f5372a;

    public q1() {
        s0.i1 i1VarH = s0.i1.h();
        i1VarH.v(s0.o2.L0, w.s.f42779a);
        i1VarH.v(y0.i.f44569d1, "MeteringRepeating");
        i1VarH.v(s0.o2.U0, s0.q2.METERING_REPEATING);
        this.f5372a = i1VarH;
    }

    @Override // s0.s1
    public final s0.u0 getConfig() {
        return this.f5372a;
    }

    @Override // s0.c1
    public final int k() {
        return 34;
    }

    @Override // s0.o2
    public final s0.q2 n() {
        return s0.q2.METERING_REPEATING;
    }
}
