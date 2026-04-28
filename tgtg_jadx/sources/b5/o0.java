package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements k4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.b f5908a = new k4.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f5909b;

    @Override // k4.d
    public final void A(i4.f fVar, long j9, long j11, long j12, float f11, i4.w wVar, int i11) {
        this.f5908a.A(fVar, j9, j11, j12, f11, wVar, i11);
    }

    @Override // k4.d
    public final void B(long j9, float f11, float f12, long j11, long j12, float f13, k4.h hVar) {
        this.f5908a.B(j9, f11, f12, j11, j12, f13, hVar);
    }

    @Override // k4.d
    public final void C(i4.f fVar, long j9, float f11, i4.w wVar, int i11) {
        this.f5908a.C(fVar, j9, f11, wVar, i11);
    }

    @Override // k4.d
    public final void D0(long j9, long j11, long j12, float f11, int i11) {
        this.f5908a.D0(j9, j11, j12, f11, i11);
    }

    @Override // k4.d
    public final void H(long j9, long j11, long j12, float f11, int i11, i4.i iVar) {
        this.f5908a.H(j9, j11, j12, f11, i11, iVar);
    }

    @Override // z5.c
    public final long I(float f11) {
        return this.f5908a.I(f11);
    }

    @Override // k4.d
    public final void J0(i4.h hVar, i4.r rVar, float f11, k4.e eVar, int i11) {
        this.f5908a.J0(hVar, rVar, f11, eVar, i11);
    }

    @Override // z5.c
    public final float O(int i11) {
        return this.f5908a.O(i11);
    }

    @Override // z5.c
    public final float R(float f11) {
        return f11 / this.f5908a.a();
    }

    @Override // k4.d
    public final void W(long j9, long j11, long j12, long j13, k4.e eVar) {
        this.f5908a.W(j9, j11, j12, j13, eVar);
    }

    @Override // z5.c
    public final float X() {
        return this.f5908a.X();
    }

    @Override // z5.c
    public final float a() {
        return this.f5908a.a();
    }

    public final void b() {
        k4.b bVar = this.f5908a;
        i4.t tVarI = bVar.f25938b.i();
        l lVar = this.f5909b;
        if (lVar == null) {
            throw b3.i.D("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        b4.s sVar = (b4.s) lVar;
        b4.s child$ui = sVar.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & 4) == 0) {
            child$ui = null;
        } else {
            while (child$ui != null && (child$ui.getKindSet$ui() & 2) == 0) {
                if ((child$ui.getKindSet$ui() & 4) != 0) {
                    break;
                } else {
                    child$ui = child$ui.getChild$ui();
                }
            }
            child$ui = null;
        }
        if (child$ui == null) {
            s1 s1VarE = m.e(lVar, 4);
            if (s1VarE.d1() == sVar.getNode()) {
                s1VarE = s1VarE.f5967q;
                s1VarE.getClass();
            }
            s1VarE.s1(tVarI, (l4.b) bVar.f25938b.f24503c);
            return;
        }
        o3.e eVar = null;
        while (child$ui != null) {
            if (child$ui instanceof r) {
                r rVar = (r) child$ui;
                l4.b bVar2 = (l4.b) bVar.f25938b.f24503c;
                s1 s1VarE2 = m.e(rVar, 4);
                long jZ = b0.z.z(s1VarE2.f47185c);
                m0 m0Var = s1VarE2.f5966p;
                m0Var.getClass();
                ((c5.y) p0.a(m0Var)).getSharedDrawScope().c(tVarI, jZ, s1VarE2, rVar, bVar2);
            } else if ((child$ui.getKindSet$ui() & 4) != 0 && (child$ui instanceof n)) {
                int i11 = 0;
                for (b4.s child$ui2 = ((n) child$ui).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            child$ui = child$ui2;
                        } else {
                            if (eVar == null) {
                                eVar = new o3.e(new b4.s[16], 0);
                            }
                            if (child$ui != null) {
                                eVar.b(child$ui);
                                child$ui = null;
                            }
                            eVar.b(child$ui2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            child$ui = m.b(eVar);
        }
    }

    public final void c(i4.t tVar, long j9, s1 s1Var, r rVar, l4.b bVar) {
        r rVar2 = this.f5909b;
        this.f5909b = rVar;
        z5.m mVar = s1Var.f5966p.A;
        k4.b bVar2 = this.f5908a;
        j30.g gVar = bVar2.f25938b;
        k4.a aVar = ((k4.b) gVar.f24504d).f25937a;
        z5.c cVar = aVar.f25933a;
        z5.m mVar2 = aVar.f25934b;
        i4.t tVarI = gVar.i();
        j30.g gVar2 = bVar2.f25938b;
        long jO = gVar2.o();
        l4.b bVar3 = (l4.b) gVar2.f24503c;
        gVar2.y(s1Var);
        gVar2.A(mVar);
        gVar2.x(tVar);
        gVar2.B(j9);
        gVar2.f24503c = bVar;
        tVar.e();
        try {
            rVar.n(this);
            tVar.o();
            gVar2.y(cVar);
            gVar2.A(mVar2);
            gVar2.x(tVarI);
            gVar2.B(jO);
            gVar2.f24503c = bVar3;
            this.f5909b = rVar2;
        } catch (Throwable th2) {
            tVar.o();
            gVar2.y(cVar);
            gVar2.A(mVar2);
            gVar2.x(tVarI);
            gVar2.B(jO);
            gVar2.f24503c = bVar3;
            throw th2;
        }
    }

    @Override // z5.c
    public final float c0(float f11) {
        return this.f5908a.a() * f11;
    }

    @Override // k4.d
    public final long d() {
        return this.f5908a.d();
    }

    public final void e(i4.r rVar, long j9, long j11, long j12, float f11, k4.e eVar) {
        k4.b bVar = this.f5908a;
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        bVar.f25937a.f25935c.j(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), bVar.c(rVar, eVar, f11, null, 3, 1));
    }

    @Override // k4.d
    public final j30.g g0() {
        return this.f5908a.f25938b;
    }

    @Override // k4.d
    public final z5.m getLayoutDirection() {
        return this.f5908a.f25937a.f25934b;
    }

    @Override // k4.d
    public final void i0(i4.h hVar, long j9, float f11, k4.e eVar) {
        this.f5908a.i0(hVar, j9, f11, eVar);
    }

    @Override // z5.c
    public final int j0(long j9) {
        return this.f5908a.j0(j9);
    }

    @Override // k4.d
    public final void k0(long j9, float f11, long j11, k4.e eVar) {
        this.f5908a.k0(j9, f11, j11, eVar);
    }

    @Override // z5.c
    public final long l(float f11) {
        return this.f5908a.l(f11);
    }

    @Override // z5.c
    public final long m(long j9) {
        return this.f5908a.m(j9);
    }

    @Override // z5.c
    public final int q0(float f11) {
        return this.f5908a.q0(f11);
    }

    @Override // k4.d
    public final void s0(i4.r rVar, long j9, long j11, float f11, k4.e eVar, int i11) {
        this.f5908a.s0(rVar, j9, j11, f11, eVar, i11);
    }

    @Override // z5.c
    public final float t(long j9) {
        return this.f5908a.t(j9);
    }

    @Override // k4.d
    public final long t0() {
        return this.f5908a.t0();
    }

    @Override // z5.c
    public final long x0(long j9) {
        return this.f5908a.x0(j9);
    }

    @Override // z5.c
    public final float z0(long j9) {
        return this.f5908a.z0(j9);
    }
}
