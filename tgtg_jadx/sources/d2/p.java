package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1.t0 f13873a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1.t0 f13874b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f13875c = new s(b4.d.f5683a, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f13876d = o.f13866b;

    public static final void a(b4.t tVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-211209833);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            int iHashCode = Long.hashCode(sVar.T);
            b4.t tVarC = b4.a.c(tVar, sVar);
            u3.i iVarL = sVar.l();
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(f13876d, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.p0(tVar, i11);
        }
    }

    public static final void b(z4.l1 l1Var, z4.m1 m1Var, z4.t0 t0Var, z5.m mVar, int i11, int i12, b4.f fVar) {
        b4.k kVar;
        Object objG = t0Var.G();
        n nVar = objG instanceof n ? (n) objG : null;
        z4.l1.n(l1Var, m1Var, ((nVar == null || (kVar = nVar.f13857o) == null) ? fVar : kVar).a((((long) m1Var.f47183a) << 32) | (((long) m1Var.f47184b) & 4294967295L), (((long) i11) << 32) | (((long) i12) & 4294967295L), mVar));
    }

    public static final q1.t0 c(boolean z11) {
        q1.t0 t0Var = new q1.t0(9);
        b4.k kVar = b4.d.f5683a;
        t0Var.m(kVar, new s(kVar, z11));
        b4.k kVar2 = b4.d.f5684b;
        t0Var.m(kVar2, new s(kVar2, z11));
        b4.k kVar3 = b4.d.f5685c;
        t0Var.m(kVar3, new s(kVar3, z11));
        b4.k kVar4 = b4.d.f5686d;
        t0Var.m(kVar4, new s(kVar4, z11));
        b4.k kVar5 = b4.d.f5687e;
        t0Var.m(kVar5, new s(kVar5, z11));
        b4.k kVar6 = b4.d.f5688f;
        t0Var.m(kVar6, new s(kVar6, z11));
        b4.k kVar7 = b4.d.f5689g;
        t0Var.m(kVar7, new s(kVar7, z11));
        b4.k kVar8 = b4.d.f5690h;
        t0Var.m(kVar8, new s(kVar8, z11));
        b4.k kVar9 = b4.d.f5691i;
        t0Var.m(kVar9, new s(kVar9, z11));
        return t0Var;
    }

    public static final z4.u0 d(b4.f fVar, boolean z11) {
        z4.u0 u0Var = (z4.u0) (z11 ? f13873a : f13874b).d(fVar);
        return u0Var == null ? new s(fVar, z11) : u0Var;
    }
}
