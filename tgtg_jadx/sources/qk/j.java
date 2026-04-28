package qk;

import a3.t0;
import bn.v;
import c5.x1;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.google.android.gms.internal.measurement.cg;
import d2.g0;
import d2.m0;
import d2.m2;
import f2.c0;
import g3.g7;
import g3.x5;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lw.r;
import m2.c2;
import m3.c3;
import m3.n;
import m3.s;
import m3.w1;
import n80.p;
import nk.q0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import z3.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f37184a = 230;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f37185b = 56;

    public static final void a(q0 q0Var, m1.a aVar, g7 g7Var, final c0 c0Var, n nVar, int i11) {
        int i12;
        s sVar;
        rk.d dVar;
        int i13;
        boolean z11;
        final q0 q0Var2 = q0Var;
        final m1.a aVar2 = aVar;
        q0Var2.getClass();
        aVar2.getClass();
        g7Var.getClass();
        c0Var.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-786863193);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(q0Var2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar2.f(aVar2) : sVar2.h(aVar2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(g7Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.f(c0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        int i14 = i12;
        if (sVar2.R(i14 & 1, (i14 & 1171) != 1170)) {
            z5.c cVar = (z5.c) sVar2.j(x1.f7416h);
            final float fC0 = cVar.c0(f37184a);
            final float fC02 = cVar.c0(f37185b);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.q(new Function0() { // from class: qk.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(c0Var.h() <= 0 ? p.b(r0.i() / (fC0 - fC02), 0.0f, 1.0f) : 1.0f);
                    }
                });
                sVar2.k0(objM);
            }
            c3 c3Var = (c3) objM;
            boolean zC = sVar2.c(((Number) c3Var.getValue()).floatValue());
            Object objM2 = sVar2.M();
            if (zC || objM2 == fVar) {
                objM2 = new rk.d(((Number) c3Var.getValue()).floatValue(), 1.0f - p.b(((Number) c3Var.getValue()).floatValue() * 2.5f, 0.0f, 1.0f), p.b((((Number) c3Var.getValue()).floatValue() - 0.6f) * 2.5f, 0.0f, 1.0f));
                sVar2.k0(objM2);
            }
            rk.d dVar2 = (rk.d) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = new y();
                sVar2.k0(objM3);
            }
            final y yVar = (y) objM3;
            int i15 = i14 & 112;
            sVar2.a0(-2043766563);
            v70.e eVarB = kotlin.collections.c0.b();
            final int i16 = 2;
            eVarB.add(new m("header", u3.e.e(735196345, sVar2, new Function2() { // from class: qk.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i17) {
                        case 0:
                            s sVar3 = (s) nVar2;
                            if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("ItemDescription", yVar, u3.e.e(877852919, sVar3, new e(q0Var2, aVar2, 7)), sVar3, 390);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 1:
                            s sVar4 = (s) nVar2;
                            if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("Directions", yVar, u3.e.e(-17462678, sVar4, new e(q0Var2, aVar2, 6)), sVar4, 390);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            s sVar5 = (s) nVar2;
                            if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("GeneralInfo", yVar, u3.e.e(-685562488, sVar5, new e(q0Var2, aVar2, 10)), sVar5, 390);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            })));
            eVarB.add(new m("info", u3.e.e(1638008610, sVar2, new e(q0Var2, aVar2, 9))));
            nk.a aVar3 = q0Var2.f31039e;
            BasicItem basicItem = q0Var2.f31035a;
            if (aVar3.f30972h) {
                dVar = dVar2;
            } else {
                dVar = dVar2;
                eVarB.add(new m("address", new u3.d(new e(q0Var2, aVar2, 0), true, 1619399392)));
            }
            if (!mv.d.q(basicItem) || aVar3.f30965a) {
                eVarB.add(new m("reminder", new u3.d(new e(q0Var2, aVar2, 2), true, -1002497207)));
            }
            boolean z12 = aVar3.f30973i;
            String str = aVar3.f30970f;
            if (z12) {
                i13 = i14;
            } else {
                final int i17 = 0;
                i13 = i14;
                eVarB.add(new m("description", new u3.d(new Function2() { // from class: qk.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i172 = i17;
                        n nVar2 = (n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i172) {
                            case 0:
                                s sVar3 = (s) nVar2;
                                if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("ItemDescription", yVar, u3.e.e(877852919, sVar3, new e(q0Var2, aVar2, 7)), sVar3, 390);
                                } else {
                                    sVar3.U();
                                }
                                break;
                            case 1:
                                s sVar4 = (s) nVar2;
                                if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("Directions", yVar, u3.e.e(-17462678, sVar4, new e(q0Var2, aVar2, 6)), sVar4, 390);
                                } else {
                                    sVar4.U();
                                }
                                break;
                            default:
                                s sVar5 = (s) nVar2;
                                if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("GeneralInfo", yVar, u3.e.e(-685562488, sVar5, new e(q0Var2, aVar2, 10)), sVar5, 390);
                                } else {
                                    sVar5.U();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, 336266216)));
            }
            if (Intrinsics.areEqual(str, mv.s.TREATMENT1.a()) && (basicItem instanceof Item) && ((Item) basicItem).getItemSpecialReward() != null) {
                eVarB.add(new m("", new u3.d(new e(q0Var2, aVar2, 3), true, 1675029639)));
            }
            if (!aVar3.f30971g) {
                final int i18 = 0;
                eVarB.add(new m("ratings", new u3.d(new Function2() { // from class: qk.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = i18;
                        n nVar2 = (n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i19) {
                            case 0:
                                s sVar3 = (s) nVar2;
                                if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("Ratings", yVar, u3.e.e(-739587531, sVar3, new h(q0Var2, 1)), sVar3, 390);
                                } else {
                                    sVar3.U();
                                }
                                break;
                            case 1:
                                s sVar4 = (s) nVar2;
                                if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("CollectionInstructions", yVar, u3.e.e(-2068916141, sVar4, new h(q0Var2, 2)), sVar4, 390);
                                } else {
                                    sVar4.U();
                                }
                                break;
                            default:
                                s sVar5 = (s) nVar2;
                                if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("MoreInfo", yVar, u3.e.e(1937939315, sVar5, new h(q0Var2, 0)), sVar5, 390);
                                } else {
                                    sVar5.U();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, -1281174234)));
            }
            if (Intrinsics.areEqual(str, mv.s.TREATMENT2.a()) && (basicItem instanceof Item) && ((Item) basicItem).getItemSpecialReward() != null) {
                eVarB.add(new m("", new u3.d(new e(q0Var2, aVar2, 4), true, 57589189)));
            }
            final int i19 = 1;
            eVarB.add(new m("directions", new u3.d(new Function2() { // from class: qk.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i172 = i19;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i172) {
                        case 0:
                            s sVar3 = (s) nVar2;
                            if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("ItemDescription", yVar, u3.e.e(877852919, sVar3, new e(q0Var2, aVar2, 7)), sVar3, 390);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 1:
                            s sVar4 = (s) nVar2;
                            if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("Directions", yVar, u3.e.e(-17462678, sVar4, new e(q0Var2, aVar2, 6)), sVar4, 390);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            s sVar5 = (s) nVar2;
                            if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("GeneralInfo", yVar, u3.e.e(-685562488, sVar5, new e(q0Var2, aVar2, 10)), sVar5, 390);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }, true, 398046939)));
            final int i21 = 1;
            eVarB.add(new m("collection", new u3.d(new Function2() { // from class: qk.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i192 = i21;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i192) {
                        case 0:
                            s sVar3 = (s) nVar2;
                            if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("Ratings", yVar, u3.e.e(-739587531, sVar3, new h(q0Var2, 1)), sVar3, 390);
                            } else {
                                sVar3.U();
                            }
                            break;
                        case 1:
                            s sVar4 = (s) nVar2;
                            if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("CollectionInstructions", yVar, u3.e.e(-2068916141, sVar4, new h(q0Var2, 2)), sVar4, 390);
                            } else {
                                sVar4.U();
                            }
                            break;
                        default:
                            s sVar5 = (s) nVar2;
                            if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                j.b("MoreInfo", yVar, u3.e.e(1937939315, sVar5, new h(q0Var2, 0)), sVar5, 390);
                            } else {
                                sVar5.U();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            }, true, 2098834564)));
            if (!mv.d.p(basicItem)) {
                final int i22 = 2;
                eVarB.add(new m("packaging", new u3.d(new Function2() { // from class: qk.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i192 = i22;
                        n nVar2 = (n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (i192) {
                            case 0:
                                s sVar3 = (s) nVar2;
                                if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("Ratings", yVar, u3.e.e(-739587531, sVar3, new h(q0Var2, 1)), sVar3, 390);
                                } else {
                                    sVar3.U();
                                }
                                break;
                            case 1:
                                s sVar4 = (s) nVar2;
                                if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("CollectionInstructions", yVar, u3.e.e(-2068916141, sVar4, new h(q0Var2, 2)), sVar4, 390);
                                } else {
                                    sVar4.U();
                                }
                                break;
                            default:
                                s sVar5 = (s) nVar2;
                                if (sVar5.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    j.b("MoreInfo", yVar, u3.e.e(1937939315, sVar5, new h(q0Var2, 0)), sVar5, 390);
                                } else {
                                    sVar5.U();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, 1396352612)));
            }
            if (basicItem.getInformation().isEdible()) {
                eVarB.add(new m("safety", new u3.d(new e(q0Var2, aVar2, 5), true, -1559851261)));
            }
            if (cg.q(q0Var2.f31036b)) {
                z11 = true;
                eVarB.add(new m("recommendations", new u3.d(new e(q0Var2, aVar2, 1), true, -221087838)));
            } else {
                z11 = true;
            }
            v70.e eVarA = kotlin.collections.c0.a(eVarB);
            sVar2.q(false);
            Unit unit = Unit.f26487a;
            boolean z13 = (i15 == 32 || ((i13 & 64) != 0 && sVar2.h(aVar2))) ? z11 : false;
            Object objM4 = sVar2.M();
            if (z13 || objM4 == fVar) {
                objM4 = new c2(24, yVar, aVar2);
                sVar2.k0(objM4);
            }
            m3.i.d(unit, (Function1) objM4, sVar2);
            g0 g0Var = m2.f13850c;
            u3.d dVarE = u3.e.e(-1470851390, sVar2, new e(q0Var2, aVar2, 8));
            u3.d dVarE2 = u3.e.e(-1603175135, sVar2, new i(g7Var, 0));
            v vVar = new v(c0Var, eVarA, q0Var2, aVar2, dVar, 12);
            q0Var2 = q0Var2;
            aVar2 = aVar2;
            u3.d dVarE3 = u3.e.e(1286887864, sVar2, vVar);
            int i23 = i13;
            x5.a(g0Var, null, dVarE, dVarE2, null, 0, 0L, 0L, null, dVarE3, sVar2, 805309830, 498);
            sVar = sVar2;
            if (q0Var2.f31045k) {
                sVar.a0(493838473);
                rk.e.c(q0Var2, aVar2, sVar, i23 & 126);
                sVar.q(false);
            } else {
                sVar.a0(493948027);
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(q0Var2, aVar2, i11, g7Var, c0Var, 17);
        }
    }

    public static final void b(String str, Set set, u3.d dVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1106589222);
        int i12 = (sVar.h(set) ? 32 : 16) | i11;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = sVar.h(set);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new r(set, str);
                sVar.k0(objM);
            }
            nv.c.a((Function0) objM, u3.e.e(1825795223, sVar, new m0(dVar, 5)), sVar, 48);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(str, set, dVar, i11, 21);
        }
    }
}
