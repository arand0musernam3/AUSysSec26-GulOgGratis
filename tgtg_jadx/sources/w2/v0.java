package w2;

import a3.c2;
import a3.t3;
import a3.u3;
import b5.l2;
import c5.x1;
import f0.p2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v1.y1;
import v80.b2;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends b5.n implements b5.c0, b5.r, b5.k, b5.s, l2 {
    public a3.u A;
    public q B;
    public b2 C;
    public m5.t0 D;
    public h4.c E = new h4.c(-1.0f, -1.0f, -1.0f, -1.0f);
    public int F;
    public int G;
    public final x2.g H;
    public final s2.j I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f43054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o1 f43056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s1 f43057t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x2.w f43058u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i4.r f43059v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f43060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y1 f43061x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h2 f43062y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s2.l f43063z;

    public v0(boolean z11, boolean z12, o1 o1Var, s1 s1Var, x2.w wVar, i4.r rVar, boolean z13, y1 y1Var, h2 h2Var, s2.l lVar, a3.u uVar) {
        this.f43054q = z11;
        this.f43055r = z12;
        this.f43056s = o1Var;
        this.f43057t = s1Var;
        this.f43058u = wVar;
        this.f43059v = rVar;
        this.f43060w = z13;
        this.f43061x = y1Var;
        this.f43062y = h2Var;
        this.f43063z = lVar;
        this.A = uVar;
        x2.g iVar = v1.i1.a() ? new x2.i(s1Var, wVar, o1Var, z11 || z12) : new x2.a();
        L0(iVar);
        this.H = iVar;
        s2.j jVar = new s2.j(this.f43063z, new c2(this, null, 10), new p2(this, null, 2), new sg.c(this, 21));
        L0(jVar);
        this.I = jVar;
    }

    public final boolean O0() {
        if (!this.f43060w) {
            return false;
        }
        if (!this.f43054q && !this.f43055r) {
            return false;
        }
        i4.r rVar = this.f43059v;
        float f11 = r0.f43032a;
        return ((rVar instanceof i4.x0) && ((i4.x0) rVar).f23332a == 16) ? false : true;
    }

    public final void P0() {
        if (this.B == null) {
            this.B = new q(((Boolean) b5.o.e(this, x1.f7430w)).booleanValue());
            b5.o.h(this);
        }
        this.C = v80.f0.B(getCoroutineScope(), null, null, new t0(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(z4.l1 r17, int r18, int r19, long r20, z5.m r22) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.v0.Q0(z4.l1, int, int, long, z5.m):void");
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        this.H.h0(b0Var);
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(final z4.w0 w0Var, z4.t0 t0Var, long j9) {
        if (this.f43062y == h2.Vertical) {
            final z4.m1 m1VarD = t0Var.D(z5.a.b(j9, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int iMin = Math.min(m1VarD.f47184b, z5.a.h(j9));
            final int i11 = 1;
            return z4.w0.f(w0Var, m1VarD.f47183a, iMin, new Function1(this) { // from class: w2.s0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v0 f43039b;

                {
                    this.f43039b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            z4.l1 l1Var = (z4.l1) obj;
                            z4.m1 m1Var = m1VarD;
                            int i12 = m1Var.f47183a;
                            v0 v0Var = this.f43039b;
                            v0Var.Q0(l1Var, iMin, i12, v0Var.f43057t.d().f41929d, w0Var.getLayoutDirection());
                            z4.l1.o(l1Var, m1Var, -v0Var.f43061x.f41888a.h(), 0);
                            break;
                        default:
                            z4.l1 l1Var2 = (z4.l1) obj;
                            z4.m1 m1Var2 = m1VarD;
                            int i13 = m1Var2.f47184b;
                            v0 v0Var2 = this.f43039b;
                            v0Var2.Q0(l1Var2, iMin, i13, v0Var2.f43057t.d().f41929d, w0Var.getLayoutDirection());
                            z4.l1.o(l1Var2, m1Var2, 0, -v0Var2.f43061x.f41888a.h());
                            break;
                    }
                    return Unit.f26487a;
                }
            });
        }
        final z4.m1 m1VarD2 = t0Var.D(z5.a.b(j9, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int iMin2 = Math.min(m1VarD2.f47183a, z5.a.i(j9));
        final int i12 = 0;
        return z4.w0.f(w0Var, iMin2, m1VarD2.f47184b, new Function1(this) { // from class: w2.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v0 f43039b;

            {
                this.f43039b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        z4.l1 l1Var = (z4.l1) obj;
                        z4.m1 m1Var = m1VarD2;
                        int i122 = m1Var.f47183a;
                        v0 v0Var = this.f43039b;
                        v0Var.Q0(l1Var, iMin2, i122, v0Var.f43057t.d().f41929d, w0Var.getLayoutDirection());
                        z4.l1.o(l1Var, m1Var, -v0Var.f43061x.f41888a.h(), 0);
                        break;
                    default:
                        z4.l1 l1Var2 = (z4.l1) obj;
                        z4.m1 m1Var2 = m1VarD2;
                        int i13 = m1Var2.f47184b;
                        v0 v0Var2 = this.f43039b;
                        v0Var2.Q0(l1Var2, iMin2, i13, v0Var2.f43057t.d().f41929d, w0Var.getLayoutDirection());
                        z4.l1.o(l1Var2, m1Var2, 0, -v0Var2.f43061x.f41888a.h());
                        break;
                }
                return Unit.f26487a;
            }
        });
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) {
        int iG;
        int iF;
        k4.b bVar = o0Var.f5908a;
        o0Var.b();
        v2.b bVarD = this.f43057t.d();
        m5.q0 q0VarG = this.f43056s.f43008b.g();
        if (q0VarG == null) {
            return;
        }
        Pair pair = bVarD.f41931f;
        Pair pair2 = bVarD.f41931f;
        long j9 = bVarD.f41929d;
        if (pair != null) {
            int i11 = ((v2.i) pair.f26485a).f41941a;
            long j11 = ((m5.t0) pair.f26486b).f29650a;
            if (!m5.t0.d(j11)) {
                i4.h hVarK = q0VarG.k(m5.t0.g(j11), m5.t0.f(j11));
                m5.u0 u0Var = q0VarG.f29617a.f29604b;
                if (i11 == 1) {
                    i4.r rVarC = u0Var.f29655a.f29575a.c();
                    if (rVarC != null) {
                        k4.d.s(o0Var, hVarK, rVarC, 0.2f, null, 56);
                    } else {
                        long jB = u0Var.b();
                        if (jB == 16) {
                            jB = i4.v.f23309b;
                        }
                        k4.d.r0(o0Var, hVarK, i4.v.b(i4.v.d(jB) * 0.2f, jB), 0.0f, null, 60);
                    }
                } else {
                    k4.d.r0(o0Var, hVarK, ((t3) b5.o.e(this, u3.f588a)).f579b, 0.0f, null, 60);
                }
            }
        }
        if (m5.t0.d(j9)) {
            m5.k0.i(bVar.f25938b.i(), q0VarG);
            if (pair2 == null) {
                q qVar = this.B;
                float fH = qVar != null ? qVar.f43019c.h() : 0.0f;
                if (fH != 0.0f && O0()) {
                    h4.c cVarK = this.f43058u.k();
                    float f11 = cVarK.f21382c;
                    float f12 = cVarK.f21380a;
                    float f13 = f11 - f12;
                    k4.d.h(o0Var, this.f43059v, (((long) Float.floatToRawIntBits((f13 / 2.0f) + f12)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(cVarK.f21381b))), cVarK.c(), f13, fH, 432);
                }
            }
        } else {
            if (pair2 == null && (iG = m5.t0.g(j9)) != (iF = m5.t0.f(j9))) {
                k4.d.r0(o0Var, q0VarG.k(iG, iF), ((t3) b5.o.e(this, u3.f588a)).f579b, 0.0f, null, 60);
            }
            m5.k0.i(bVar.f25938b.i(), q0VarG);
        }
        this.H.n(o0Var);
    }

    @Override // b4.s
    public final void onAttach() {
        if (this.f43054q && O0()) {
            P0();
        }
    }

    @Override // b5.s
    public final void v(z4.z zVar) {
        this.f43056s.f43010d.setValue(zVar);
        this.H.v(zVar);
    }
}
