package ii;

import com.app.tgtg.R;
import com.google.android.gms.internal.measurement.cg;
import d2.m2;
import g3.j5;
import g3.r9;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.c3;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3 f23970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f23971c;

    public /* synthetic */ s(Function0 function0, c3 c3Var, int i11) {
        this.f23969a = i11;
        this.f23971c = function0;
        this.f23970b = c3Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        int i11 = this.f23969a;
        int i12 = 2;
        d2.u uVar = d2.u.f13938a;
        b4.q qVar = b4.q.f5711a;
        m3.f fVar = m3.m.f29332a;
        c3 c3Var = this.f23970b;
        Function0 function0 = this.f23971c;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l.e(R.drawable.ic_available_donations_empty_state, ((Boolean) c3Var.getValue()).booleanValue() ? R.string.charity_home_empty_available_donations_inactive : R.string.charity_home_empty_available_donations_active, 6, d2.c.B(qVar, lv.t.f28253g, 0.0f, 2), sVar);
                    if (((Boolean) c3Var.getValue()).booleanValue()) {
                        sVar.a0(-837282698);
                        b4.t tVarD = m2.d(qVar, 1.0f);
                        u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar.T);
                        u3.i iVarL = sVar.l();
                        b4.t tVarC = b4.a.c(tVarD, sVar);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(hVar);
                        } else {
                            sVar.n0();
                        }
                        m3.i.C(u0VarD, b5.i.f5843f, sVar);
                        m3.i.C(iVarL, b5.i.f5842e, sVar);
                        m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                        m3.i.z(sVar, b5.i.f5845h);
                        m3.i.C(tVarC, b5.i.f5841d, sVar);
                        String strU = o30.f0.U(sVar, R.string.charity_home_manage_card_button);
                        b4.t tVarA = uVar.a(qVar, b4.d.f5687e);
                        boolean zF = sVar.f(function0);
                        Object objM = sVar.M();
                        if (zF || objM == fVar) {
                            objM = new j5(10, function0);
                            sVar.k0(objM);
                        }
                        v0.n.l(tVarA, strU, null, null, null, false, false, null, null, (Function0) objM, sVar, 0, 508);
                        sVar.q(true);
                        sVar.q(false);
                    } else {
                        sVar.a0(-836783939);
                        sVar.q(false);
                    }
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    s1.y.d(cg.q((List) c3Var.getValue()), null, null, null, null, u3.e.e(149068285, sVar2, new s(function0, c3Var, i12)), sVar2, 196608, 30);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                m3.n nVar3 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                b4.t tVarD2 = m2.d(d2.c.D(d2.c.z(qVar, lv.t.f28253g), 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), 1.0f);
                b4.k kVar = b4.d.f5683a;
                u0 u0VarD2 = d2.p.d(kVar, false);
                m3.s sVar3 = (m3.s) nVar3;
                int iHashCode2 = Long.hashCode(sVar3.T);
                u3.i iVarL2 = sVar3.l();
                b4.t tVarC2 = b4.a.c(tVarD2, nVar3);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(hVar2);
                } else {
                    sVar3.n0();
                }
                b5.g gVar = b5.i.f5843f;
                m3.i.C(u0VarD2, gVar, nVar3);
                b5.g gVar2 = b5.i.f5842e;
                m3.i.C(iVarL2, gVar2, nVar3);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                b5.g gVar3 = b5.i.f5844g;
                m3.i.v(nVar3, numValueOf, gVar3);
                b5.d dVar = b5.i.f5845h;
                m3.i.z(nVar3, dVar);
                b5.g gVar4 = b5.i.f5841d;
                m3.i.C(tVarC2, gVar4, nVar3);
                r9.d(o30.f0.U(nVar3, R.string.charity_home_title_history), uVar.a(qVar, b4.d.f5686d), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, nVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                if (((List) c3Var.getValue()).isEmpty()) {
                    z11 = true;
                    sVar3.a0(1417968159);
                    sVar3.q(false);
                } else {
                    sVar3.a0(1416712132);
                    m5.h hVar3 = new m5.h(o30.f0.U(nVar3, R.string.discover_browse_buckets_btn));
                    m5.u0 u0Var = lv.v.f28281u;
                    long j9 = lv.s.f28217b;
                    m5.u0 u0VarA = m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    b4.k kVar2 = b4.d.f5688f;
                    b4.t tVarD3 = d2.c.D(uVar.a(qVar, kVar2), 0.0f, 0.0f, lv.t.f28255i, 0.0f, 11);
                    boolean zF2 = sVar3.f(function0);
                    Object objM2 = sVar3.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new j5(11, function0);
                        sVar3.k0(objM2);
                    }
                    r9.e(hVar3, androidx.compose.foundation.b.c(tVarD3, false, null, null, (Function0) objM2, 15), 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, u0VarA, nVar3, 0, 0, 262140);
                    b4.t tVarA2 = uVar.a(qVar, kVar2);
                    u0 u0VarD3 = d2.p.d(kVar, false);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    u3.i iVarL3 = sVar3.l();
                    b4.t tVarC3 = b4.a.c(tVarA2, nVar3);
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar2);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(u0VarD3, gVar, nVar3);
                    m3.i.C(iVarL3, gVar2, nVar3);
                    m3.i.v(nVar3, Integer.valueOf(iHashCode3), gVar3);
                    m3.i.z(nVar3, dVar);
                    m3.i.C(tVarC3, gVar4, nVar3);
                    v1.n.d(x0.z(R.drawable.ic_chevron_right, nVar3, 0), null, m2.m(qVar, 30), null, null, 0.0f, new i4.o(j9, 5), nVar3, 1573304, 56);
                    z11 = true;
                    sVar3.q(true);
                    sVar3.q(false);
                }
                sVar3.q(z11);
                break;
            default:
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean z12 = !((List) c3Var.getValue()).isEmpty();
                    boolean zF3 = sVar4.f(function0);
                    Object objM3 = sVar4.M();
                    if (zF3 || objM3 == fVar) {
                        objM3 = new vm.r(25, function0);
                        sVar4.k0(objM3);
                    }
                    yj.a.h(z12, (Function0) objM3, sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ s(c3 c3Var, Function0 function0, int i11) {
        this.f23969a = i11;
        this.f23970b = c3Var;
        this.f23971c = function0;
    }
}
