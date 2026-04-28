package lp;

import d2.m2;
import g3.r9;
import g3.s0;
import hp.o0;
import hp.r0;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f28037b;

    public /* synthetic */ e(List list, int i11) {
        this.f28036a = i11;
        this.f28037b = list;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f28036a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                List list = this.f28037b;
                hp.b bVar = (hp.b) list.get(n80.p.c(iIntValue, 0, list.size() - 1));
                b4.t tVarD = m2.d(b4.q.f5711a, 1.0f);
                u0 u0VarD = d2.p.d(b4.d.f5690h, false);
                m3.s sVar = (m3.s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                b4.t tVarC = b4.a.c(tVarD, nVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, nVar);
                m3.i.C(iVarL, b5.i.f5842e, nVar);
                m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(nVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, nVar);
                r9.d(bVar.f22252a, null, lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28264c, nVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                sVar.q(true);
                break;
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                List list2 = this.f28037b;
                hp.b bVar2 = (hp.b) list2.get(n80.p.c(iIntValue2, 0, list2.size() - 1));
                b4.q qVar = b4.q.f5711a;
                b4.t tVarD2 = m2.d(qVar, 1.0f);
                u0 u0VarD2 = d2.p.d(b4.d.f5690h, false);
                m3.s sVar2 = (m3.s) nVar2;
                int iHashCode2 = Long.hashCode(sVar2.T);
                u3.i iVarL2 = sVar2.l();
                b4.t tVarC2 = b4.a.c(tVarD2, nVar2);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar2);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD2, b5.i.f5843f, nVar2);
                m3.i.C(iVarL2, b5.i.f5842e, nVar2);
                m3.i.v(nVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(nVar2, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, nVar2);
                r9.d(bVar2.f22253b, m2.d(qVar, 1.0f), lv.s.I, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, nVar2, 432, 12582912, 130040);
                sVar2.q(true);
                break;
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.n nVar3 = (m3.n) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((f2.d) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= ((m3.s) nVar3).d(iIntValue3) ? 32 : 16;
                }
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    List list3 = this.f28037b;
                    d.e((o0) list3.get(iIntValue3), sVar3, 0);
                    if (iIntValue3 != list3.size() - 1) {
                        sVar3.a0(-280658642);
                        s0.g(d2.c.A(b4.q.f5711a, lv.t.f28253g, lv.t.f28249c), 1, lv.s.H, sVar3, 438, 0);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(-280333824);
                        sVar3.q(false);
                    }
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.n nVar4 = (m3.n) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((f2.d) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= ((m3.s) nVar4).d(iIntValue5) ? 32 : 16;
                }
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    float f11 = lv.t.f28254h;
                    b4.q qVar2 = b4.q.f5711a;
                    d2.c.f(m2.e(qVar2, f11), sVar4);
                    List list4 = this.f28037b;
                    d.i(iIntValue5 + 1, 0, null, ((r0) list4.get(iIntValue5)).f22321a, ((r0) list4.get(iIntValue5)).f22322b, sVar4);
                    if (iIntValue5 == list4.size() - 1) {
                        sVar4.a0(939125503);
                        d2.c.f(m2.e(qVar2, lv.t.f28253g), sVar4);
                        sVar4.q(false);
                    } else {
                        sVar4.a0(939198539);
                        sVar4.q(false);
                    }
                } else {
                    sVar4.U();
                }
                break;
            default:
                int iIntValue7 = ((Integer) obj2).intValue();
                m3.n nVar5 = (m3.n) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((g2.l) obj).getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= ((m3.s) nVar5).d(iIntValue7) ? 32 : 16;
                }
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    Object obj5 = this.f28037b.get(iIntValue7);
                    obj5.getClass();
                    String upperCase = ((String) obj5).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    r9.d(upperCase, m2.m(b4.q.f5711a, 35), lv.s.E, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28279s, sVar5, 432, 12582912, 130040);
                } else {
                    sVar5.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
