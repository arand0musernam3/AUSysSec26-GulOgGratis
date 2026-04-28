package g3;

import com.app.tgtg.R;
import kotlin.Unit;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19216b;

    public /* synthetic */ o6(String str, int i11) {
        this.f19215a = i11;
        this.f19216b = str;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f19215a;
        String strU = this.f19216b;
        b4.q qVar = b4.q.f5711a;
        switch (i11) {
            case 0:
                da daVar = (da) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((m3.s) nVar).f(daVar) : ((m3.s) nVar).h(daVar) ? 4 : 2;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ba.a(daVar, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, u3.e.e(435848468, sVar, new bn.h0(strU, 1)), sVar, (iIntValue & 14) | 805306368);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d2.g0 g0Var = d2.m2.f13850c;
                    b4.t tVarZ = d2.c.z(g0Var, lv.t.f28255i);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar, sVar2);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar2, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar2);
                    d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(g0Var, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar2);
                    m3.i.C(iVarL2, gVar2, sVar2);
                    w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC2, gVar4, sVar2);
                    m5.u0 u0Var = lv.v.f28270i;
                    long j9 = lv.s.J;
                    if (0.6f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    r9.d(this.f19216b, new d2.n1(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), j9, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, u0Var, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    if (0.4f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    b4.t tVarThen = new d2.n1(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true).then(g0Var);
                    z4.u0 u0VarD2 = d2.p.d(b4.d.f5687e, false);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    u3.i iVarL3 = sVar2.l();
                    b4.t tVarC3 = b4.a.c(tVarThen, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(u0VarD2, gVar, sVar2);
                    m3.i.C(iVarL3, gVar2, sVar2);
                    w.a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC3, gVar4, sVar2);
                    v1.n.d(o00.x0.z(R.drawable.gift_icon, sVar2, 0), null, d2.c.z(qVar, lv.t.f28252f), null, null, 0.0f, null, sVar2, 440, 120);
                    e0.f.D(sVar2, true, true, true);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                m3.n nVar3 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, nVar3, 0);
                m3.s sVar3 = (m3.s) nVar3;
                int iHashCode4 = Long.hashCode(sVar3.T);
                u3.i iVarL4 = sVar3.l();
                b4.t tVarC4 = b4.a.c(qVar, nVar3);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(hVar2);
                } else {
                    sVar3.n0();
                }
                m3.i.C(yVarA, b5.i.f5843f, nVar3);
                m3.i.C(iVarL4, b5.i.f5842e, nVar3);
                m3.i.v(nVar3, Integer.valueOf(iHashCode4), b5.i.f5844g);
                m3.i.z(nVar3, b5.i.f5845h);
                m3.i.C(tVarC4, b5.i.f5841d, nVar3);
                ki.j.e(c5.d2.j(qVar, "CollectionInstructions"), o30.f0.U(nVar3, R.string.charity_item_collection_instructions), this.f19216b, null, true, nVar3, 24582, 8);
                s0.g(c5.d2.j(qVar, "CollectionDivider"), 1, lv.s.H, nVar3, 438, 0);
                sVar3.q(true);
                break;
            case 3:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d2.j2) obj).getClass();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b4.t tVarD = d2.m2.d(qVar, 1.0f);
                    float f11 = lv.t.f28253g;
                    b4.t tVarD2 = d2.c.D(tVarD, f11, 0.0f, f11, 0.0f, 10);
                    d2.i2 i2VarA2 = d2.h2.a(d2.i.f13805e, b4.d.f5693k, sVar4, 54);
                    int iHashCode5 = Long.hashCode(sVar4.T);
                    u3.i iVarL5 = sVar4.l();
                    b4.t tVarC5 = b4.a.c(tVarD2, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar3);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(i2VarA2, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL5, b5.i.f5842e, sVar4);
                    m3.i.v(sVar4, Integer.valueOf(iHashCode5), b5.i.f5844g);
                    m3.i.z(sVar4, b5.i.f5845h);
                    m3.i.C(tVarC5, b5.i.f5841d, sVar4);
                    m5.u0 u0Var2 = lv.v.f28281u;
                    long j11 = lv.s.f28217b;
                    r9.d(this.f19216b, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar4, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    d2.c.f(d2.m2.m(qVar, lv.t.f28251e), sVar4);
                    v1.n.d(o00.x0.z(R.drawable.ic_chevron_right, sVar4, 0), null, null, null, null, 0.0f, new i4.o(j11, 5), sVar4, 56, 60);
                    sVar4.q(true);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((d2.j2) obj).getClass();
                m3.s sVar5 = (m3.s) nVar5;
                if (!sVar5.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    sVar5.U();
                } else if (strU == null) {
                    sVar5.a0(-881625224);
                    sVar5.q(false);
                } else {
                    sVar5.a0(-881625223);
                    sVar5.a0(387204551);
                    if (strU.length() == 0) {
                        strU = o30.f0.U(sVar5, R.string.profile_page_header);
                    }
                    sVar5.q(false);
                    r9.d(strU, null, lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28270i, sVar5, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                    sVar5.q(false);
                }
                break;
            case 5:
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d2.j2) obj).getClass();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    r9.d(this.f19216b, null, lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar6, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                } else {
                    sVar6.U();
                }
                break;
            default:
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b4.t tVarE = d2.m2.e(d2.m2.d(qVar, 1.0f), 88);
                    z4.u0 u0VarD3 = d2.p.d(b4.d.f5687e, false);
                    int iHashCode6 = Long.hashCode(sVar7.T);
                    u3.i iVarL6 = sVar7.l();
                    b4.t tVarC6 = b4.a.c(tVarE, sVar7);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(hVar4);
                    } else {
                        sVar7.n0();
                    }
                    b5.g gVar5 = b5.i.f5843f;
                    m3.i.C(u0VarD3, gVar5, sVar7);
                    b5.g gVar6 = b5.i.f5842e;
                    m3.i.C(iVarL6, gVar6, sVar7);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    b5.g gVar7 = b5.i.f5844g;
                    m3.i.v(sVar7, numValueOf2, gVar7);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar7, dVar2);
                    b5.g gVar8 = b5.i.f5841d;
                    m3.i.C(tVarC6, gVar8, sVar7);
                    b4.t tVarD3 = d2.m2.d(qVar, 1.0f);
                    d2.y yVarA2 = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar7, 48);
                    int iHashCode7 = Long.hashCode(sVar7.T);
                    u3.i iVarL7 = sVar7.l();
                    b4.t tVarC7 = b4.a.c(tVarD3, sVar7);
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(hVar4);
                    } else {
                        sVar7.n0();
                    }
                    m3.i.C(yVarA2, gVar5, sVar7);
                    m3.i.C(iVarL7, gVar6, sVar7);
                    w.a0.y(iHashCode7, sVar7, gVar7, sVar7, dVar2);
                    m3.i.C(tVarC7, gVar8, sVar7);
                    r9.d(this.f19216b, null, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar7, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                    r9.d(r8.k.f(lv.t.f28248b, R.string.item_view_ingredients_explainer_likelihood, qVar, sVar7, sVar7), null, lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar7, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                    sVar7.q(true);
                    sVar7.q(true);
                } else {
                    sVar7.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
