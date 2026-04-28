package co;

import c5.x1;
import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n0;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m2.y1;
import m3.b1;
import m3.h1;
import m3.k1;
import m5.u0;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z1.g0;
import z1.h3;
import z1.y2;
import z4.c0;
import z4.m1;
import z4.t0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8805d;

    public /* synthetic */ x(boolean z11, h1 h1Var, h1 h1Var2) {
        this.f8802a = 1;
        this.f8803b = z11;
        this.f8804c = h1Var;
        this.f8805d = h1Var2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j9;
        int i11 = this.f8802a;
        m3.f fVar = m3.m.f29332a;
        boolean z11 = this.f8803b;
        int i12 = 0;
        Object obj4 = this.f8805d;
        Object obj5 = this.f8804c;
        switch (i11) {
            case 0:
                h1 h1Var = (h1) obj5;
                b1 b1Var = (b1) obj4;
                m3.n nVar = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                float fE = d70.a.e(nVar, h1Var.h());
                b4.q qVar = b4.q.f5711a;
                b4.t tVarS = m2.s(qVar, fE, 0.0f, 2);
                m3.s sVar = (m3.s) nVar;
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new t(h1Var, 1);
                    sVar.k0(objM);
                }
                float f11 = 8;
                long j11 = lv.s.J;
                b4.t tVarK = v1.n.k(v1.n.j(c0.q(tVarS, (Function1) objM), lv.s.C, l2.g.b(f11)), (float) 1.5d, j11, l2.g.b(f11));
                float f12 = lv.t.f28251e;
                float f13 = lv.t.f28249c;
                b4.t tVarC = d2.c.C(tVarK, f12, f13, f12, f13);
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarC, sVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA, b5.i.f5843f, sVar);
                m3.i.C(iVarL, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar);
                if (z11) {
                    sVar.a0(-112445302);
                    j9 = j11;
                    v1.n.d(x0.z(R.drawable.blob_flash, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                    b3.i.y(qVar, f13, sVar, false);
                } else {
                    j9 = j11;
                    sVar.a0(-112221389);
                    sVar.q(false);
                }
                r9.d((String) b1Var.getValue(), null, z11 ? lv.s.f28234o : j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 0, 12582912, 131066);
                sVar.q(true);
                return Unit.f26487a;
            case 1:
                w0 w0Var = (w0) obj;
                t0 t0Var = (t0) obj2;
                z5.a aVar = (z5.a) obj3;
                int iG = z5.b.g(((h1) obj5).h(), aVar.f47271a);
                long j12 = aVar.f47271a;
                int iF = z5.b.f(((h1) obj4).h(), j12);
                int iK = z11 ? iG : z5.a.k(j12);
                if (!z11) {
                    iG = z5.a.i(j12);
                }
                m1 m1VarD = t0Var.D(z5.a.b(aVar.f47271a, iK, iG, 0, iF, 4));
                return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new d2.k(m1VarD, 7));
            case 2:
                hp.g gVar = (hp.g) obj5;
                Function0 function0 = (Function0) obj4;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b4.q qVar2 = b4.q.f5711a;
                    b4.t tVarZ = d2.c.z(m2.d(qVar2, 1.0f), lv.t.f28252f);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC3 = b4.a.c(tVarZ, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar2);
                    lp.r.b(gVar, this.f8803b, function0, null, sVar2, 0);
                    String str = gVar.f22276b;
                    u0 u0Var = lv.v.f28272k;
                    q5.r rVar = q5.r.f36046k;
                    long j13 = lv.s.C;
                    float f14 = lv.t.f28251e;
                    r9.d(str, d2.c.B(qVar2, 0.0f, f14, 1), j13, 0L, rVar, 0L, null, null, 0L, 2, false, 2, 0, null, u0Var, sVar2, 1573296, 12607872, 110520);
                    m3.s sVar3 = sVar2;
                    String str2 = gVar.f22277c;
                    if (str2 == null) {
                        sVar3.a0(305513144);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(305513145);
                        r9.d(str2, null, j13, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, lv.v.f28274n, sVar3, MLKEMEngine.KyberPolyBytes, 12607872, 110586);
                        sVar3 = sVar3;
                        sVar3.q(false);
                    }
                    m3.s sVar4 = sVar3;
                    n0.a(m2.d(d2.c.D(qVar2, 0.0f, lv.t.f28253g, 0.0f, 0.0f, 13), 1.0f), d2.i.g(f14), d2.i.g(f14), null, 0, 0, u3.e.e(860424790, sVar3, new lp.h(i12, gVar)), sVar4, 1573302, 56);
                    sVar4.q(true);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            default:
                y1 y1Var = (y1) obj5;
                k1 k1Var = y1Var.f29144f;
                b2.l lVar = (b2.l) obj4;
                ((Integer) obj3).getClass();
                m3.s sVar5 = (m3.s) ((m3.n) obj2);
                sVar5.a0(-2137546592);
                boolean z12 = ((z1.h2) k1Var.getValue()) == z1.h2.Vertical || !(sVar5.j(x1.f7421n) == z5.m.Rtl);
                boolean zF = sVar5.f(y1Var);
                Object objM2 = sVar5.M();
                if (zF || objM2 == fVar) {
                    objM2 = new jd.a(y1Var, 22);
                    sVar5.k0(objM2);
                }
                b1 b1VarB = m3.i.B((Function1) objM2, sVar5);
                Object objM3 = sVar5.M();
                if (objM3 == fVar) {
                    g0 g0Var = new g0(new sn.c(b1VarB, 14));
                    sVar5.k0(g0Var);
                    objM3 = g0Var;
                }
                h3 h3Var = (h3) objM3;
                boolean zF2 = sVar5.f(h3Var) | sVar5.f(y1Var);
                Object objM4 = sVar5.M();
                if (zF2 || objM4 == fVar) {
                    objM4 = new m2.x1(h3Var, y1Var);
                    sVar5.k0(objM4);
                }
                b4.t tVarB = y2.b(b4.q.f5711a, (m2.x1) objM4, (z1.h2) k1Var.getValue(), z11 && y1Var.f29140b.h() != 0.0f, z12, lVar);
                sVar5.q(false);
                return tVarB;
        }
    }

    public /* synthetic */ x(Object obj, boolean z11, Object obj2, int i11) {
        this.f8802a = i11;
        this.f8804c = obj;
        this.f8803b = z11;
        this.f8805d = obj2;
    }
}
