package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18302a = 2;

    public static z a(long j9, long j11, m3.n nVar) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j21 = i4.v.f23315h;
        p0 p0Var = (p0) ((m3.s) nVar).j(r0.f19375a);
        z zVar = p0Var.f19261b0;
        if (zVar == null) {
            long jD = r0.d(p0Var, l3.n.f27052e);
            long j22 = i4.v.f23314g;
            long jD2 = r0.d(p0Var, l3.n.f27051d);
            l3.r rVar = l3.n.f27048a;
            long jD3 = r0.d(p0Var, rVar);
            l3.r rVar2 = l3.n.f27049b;
            long jD4 = r0.d(p0Var, rVar2);
            float f11 = l3.n.f27050c;
            z zVar2 = new z(jD, j22, jD3, j22, i4.v.b(f11, jD4), j22, i4.v.b(f11, r0.d(p0Var, rVar2)), r0.d(p0Var, rVar), r0.d(p0Var, l3.n.f27056i), i4.v.b(f11, r0.d(p0Var, rVar2)), i4.v.b(l3.n.f27054g, r0.d(p0Var, l3.n.f27055h)), i4.v.b(f11, r0.d(p0Var, rVar2)), jD2);
            p0Var.f19261b0 = zVar2;
            zVar = zVar2;
        }
        long j23 = i4.v.f23314g;
        long j24 = j21 != 16 ? j21 : zVar.f19850a;
        long j25 = j23 != 16 ? j23 : zVar.f19851b;
        if (j9 != 16) {
            j12 = 16;
            j13 = j9;
        } else {
            j12 = 16;
            j13 = zVar.f19852c;
        }
        if (j23 != 16) {
            j14 = j21;
            j15 = j23;
        } else {
            j14 = j21;
            j15 = zVar.f19853d;
        }
        if (j14 != j12) {
            j16 = j15;
            j17 = j14;
        } else {
            j16 = j15;
            j17 = zVar.f19854e;
        }
        if (j23 == 16) {
            j23 = zVar.f19855f;
        }
        long j26 = j23;
        if (j14 != j12) {
            j18 = j17;
            j19 = j14;
        } else {
            j18 = j17;
            j19 = zVar.f19856g;
        }
        return new z(j24, j25, j13, j16, j18, j26, j19, j9 != 16 ? j9 : zVar.f19857h, j11 != j12 ? j11 : zVar.f19858i, j14 != j12 ? j14 : zVar.f19859j, j14 != j12 ? j14 : zVar.f19860k, j14 != j12 ? j14 : zVar.l, j21 != 16 ? j14 : zVar.f19861m);
    }
}
