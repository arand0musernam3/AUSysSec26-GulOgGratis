package rk;

import d6.i0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f38100a;

    public q(b1 b1Var) {
        this.f38100a = b1Var;
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        kVar.getClass();
        mVar.getClass();
        z5.j jVar = (z5.j) this.f38100a.getValue();
        if (jVar == null) {
            return 0L;
        }
        long j12 = jVar.f47280a;
        int iC = n80.p.c((int) (j12 >> 32), 0, ((int) (j9 >> 32)) - ((int) (j11 >> 32)));
        return (((long) n80.p.c((int) (j12 & 4294967295L), 0, ((int) (j9 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) iC) << 32);
    }
}
