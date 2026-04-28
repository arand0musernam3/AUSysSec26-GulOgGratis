package us;

import android.content.res.Resources;
import ao.p2;
import c5.v0;
import cg.z;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.CountryBasedVoucher;
import com.app.tgtg.model.remote.voucher.CurrencyBasedVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.app.tgtg.model.remote.voucher.FilteredStore;
import com.app.tgtg.model.remote.voucher.UsageDetailsType;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.app.tgtg.model.remote.voucher.VoucherState;
import com.app.tgtg.model.remote.voucher.VoucherUsageDetails;
import com.app.tgtg.model.remote.voucher.response.AddNewVoucherResponse;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.component.badgelabel.variant.NegativePantryBadgeLabelKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.y;
import d2.z1;
import g3.b9;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import g3.x5;
import i4.g0;
import i4.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lp.v;
import m3.b1;
import m3.w1;
import mv.p0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import ss.c1;
import ss.d1;
import ss.j1;
import ss.k1;
import v80.b0;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f41508a = new u3.d(new u60.a(5), false, 1023502318);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f41509b = new u3.d(new tp.a(5), false, 293774739);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f41510c = new u3.d(new tp.a(6), false, -1449408401);

    public static final void A(c1 c1Var, t5.a aVar, m3.n nVar, int i11) {
        int i12;
        c1Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2038645953);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(c1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(aVar) : sVar.h(aVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            x5.a(v1.n.j(b4.q.f5711a, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).G, g0.f23254b), u3.e.e(-1885409277, sVar, new rs.b((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing()), c1Var, aVar, 6)), null, null, null, 0, 0L, 0L, null, u3.e.e(-183634226, sVar, new ap.e((b1) objM, c1Var, aVar, 22)), sVar, 805306416, 508);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(c1Var, aVar, i11, 7);
        }
    }

    public static final void B(d1 d1Var, t5.a aVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        d1Var.getClass();
        aVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1088652396);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(d1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar2.f(aVar) : sVar2.h(aVar) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            x70.c cVar = null;
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            String str = d1Var.f39159f;
            AddNewVoucherResponse addNewVoucherResponse = d1Var.f39157d;
            boolean zH = sVar2.h(d1Var);
            Object objM2 = sVar2.M();
            if (zH || objM2 == fVar) {
                objM2 = new rf.c(d1Var, b1Var, cVar, 13);
                sVar2.k0(objM2);
            }
            m3.i.g(str, addNewVoucherResponse, (Function2) objM2, sVar2);
            int i13 = d1Var.f39163j;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = new ui.o(26);
                sVar2.k0(objM3);
            }
            i2.b bVarB = i2.g0.b(i13, (Function0) objM3, sVar2, MLKEMEngine.KyberPolyBytes);
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM4);
            }
            b0 b0Var = (b0) objM4;
            boolean zF = sVar2.f(bVarB) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && sVar2.h(aVar)));
            Object objM5 = sVar2.M();
            if (zF || objM5 == fVar) {
                objM5 = new tm.d(bVarB, aVar, null, 8);
                sVar2.k0(objM5);
            }
            m3.i.h(bVarB, (Function2) objM5, sVar2);
            sVar = sVar2;
            x5.a(v1.n.j(b4.q.f5711a, hVar.f43905a, g0.f23254b).then(m2.f13850c), u3.e.e(-1869499304, sVar2, new rs.b(mVar, aVar, b1Var, 7)), null, null, null, 0, 0L, 0L, null, u3.e.e(-1689405917, sVar2, new lo.d(hVar, b1Var, w6VarF, aVar, d1Var, bVarB, b0Var, jVar)), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(d1Var, aVar, i11, 8);
        }
    }

    public static final void C(BasicVoucher basicVoucher, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1211536849);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (basicVoucher instanceof CurrencyBasedVoucher) {
            sVar.a0(-350771046);
            c((CurrencyBasedVoucher) basicVoucher, sVar, i12 & 14);
            sVar.q(false);
        } else if (basicVoucher instanceof CountryBasedVoucher) {
            sVar.a0(-350768551);
            a((CountryBasedVoucher) basicVoucher, sVar, i12 & 14);
            sVar.q(false);
        } else {
            sVar.a0(-350766701);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.a(basicVoucher, i11, 13);
        }
    }

    public static final void D(final k1 k1Var, final t5.a aVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        k1Var.getClass();
        aVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1670490658);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(k1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar2.f(aVar) : sVar2.h(aVar) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            final x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            final x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            final x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            x70.c cVar = null;
            final w6 w6VarF = v3.f(6, 2, null, sVar2);
            String str = k1Var.f39206g;
            AddNewVoucherResponse addNewVoucherResponse = k1Var.f39203d;
            boolean zH = sVar2.h(k1Var);
            Object objM2 = sVar2.M();
            if (zH || objM2 == fVar) {
                objM2 = new rf.c(k1Var, b1Var, cVar, 14);
                sVar2.k0(objM2);
            }
            m3.i.g(str, addNewVoucherResponse, (Function2) objM2, sVar2);
            final int i13 = k1Var.f39204e == VoucherMode.REGULAR ? 0 : 1;
            sVar = sVar2;
            x5.a(v1.n.j(b4.q.f5711a, hVar.f43905a, g0.f23254b).then(m2.f13850c), u3.e.e(380140962, sVar2, new pm.m(aVar, 18)), null, null, null, 0, 0L, 0L, null, u3.e.e(-494787411, sVar2, new i80.n() { // from class: us.t
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    b1 b1Var2;
                    m3.f fVar2;
                    VoucherMode voucherMode;
                    m3.s sVar3;
                    z1 z1Var = (z1) obj;
                    m3.n nVar2 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    z1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((m3.s) nVar2).f(z1Var) ? 4 : 2;
                    }
                    m3.s sVar4 = (m3.s) nVar2;
                    if (sVar4.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x60.h hVar2 = hVar;
                        long j9 = hVar2.f43905a;
                        r0 r0Var = g0.f23254b;
                        b4.q qVar = b4.q.f5711a;
                        b4.t tVarJ = v1.n.j(qVar, j9, r0Var);
                        x60.m mVar2 = mVar;
                        float f11 = mVar2.f44015k;
                        b4.t tVarR = d2.c.r(d2.c.C(tVarJ, f11, z1Var.c(), f11, z1Var.a() + f11).then(m2.f13850c));
                        y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar4, 48);
                        int iHashCode = Long.hashCode(sVar4.T);
                        u3.i iVarL = sVar4.l();
                        b4.t tVarC = b4.a.c(tVarR, sVar4);
                        b5.j.R.getClass();
                        b5.h hVar3 = b5.i.f5839b;
                        sVar4.e0();
                        if (sVar4.S) {
                            sVar4.k(hVar3);
                        } else {
                            sVar4.n0();
                        }
                        m3.i.C(yVarA, b5.i.f5843f, sVar4);
                        m3.i.C(iVarL, b5.i.f5842e, sVar4);
                        m3.i.v(sVar4, Integer.valueOf(iHashCode), b5.i.f5844g);
                        m3.i.z(sVar4, b5.i.f5845h);
                        m3.i.C(tVarC, b5.i.f5841d, sVar4);
                        long j11 = hVar2.f43905a;
                        int i14 = i13;
                        u3.d dVarE = u3.e.e(-1753796090, sVar4, new f2.j(i14, hVar2));
                        u3.d dVarE2 = u3.e.e(-1063579237, sVar4, new rk.c(2, hVar2));
                        k1 k1Var2 = k1Var;
                        t5.a aVar2 = aVar;
                        b9.a(0, 0.0f, i14, 819658752, j11, 0L, null, sVar4, dVarE, dVarE2, u3.e.e(-167348067, sVar4, new v(19, k1Var2, hVar2, aVar2, jVar)), null);
                        List list = k1Var2.f39200a;
                        VoucherMode voucherMode2 = k1Var2.f39204e;
                        boolean zIsEmpty = list.isEmpty();
                        b1 b1Var3 = b1Var;
                        m3.f fVar3 = m3.m.f29332a;
                        if (zIsEmpty) {
                            sVar4.a0(1303640909);
                            Object objM3 = sVar4.M();
                            if (objM3 == fVar3) {
                                objM3 = new pi.b(b1Var3, 26);
                                sVar4.k0(objM3);
                            }
                            rs.k.j(voucherMode2, (Function0) objM3, sVar4, 48);
                            sVar4.q(false);
                            sVar3 = sVar4;
                            voucherMode = voucherMode2;
                            b1Var2 = b1Var3;
                            fVar2 = fVar3;
                        } else {
                            sVar4.a0(1303795413);
                            b4.t tVarD = d2.c.D(m2.d(qVar, 1.0f), 0.0f, mVar2.f44015k, 0.0f, mVar2.f44017n, 5);
                            String strU = f0.U(sVar4, voucherMode2.getAddVoucherBtn());
                            Integer numValueOf = Integer.valueOf(R.drawable.icon_add);
                            Object objM4 = sVar4.M();
                            if (objM4 == fVar3) {
                                objM4 = new pi.b(b1Var3, 27);
                                sVar4.k0(objM4);
                            }
                            b1Var2 = b1Var3;
                            fVar2 = fVar3;
                            voucherMode = voucherMode2;
                            v0.n.n(tVarD, strU, null, null, null, false, false, numValueOf, null, (Function0) objM4, sVar4, 805306368, 380);
                            sVar3 = sVar4;
                            if (1.0f <= 0.0d) {
                                e2.a.a("invalid weight; must be greater than zero");
                            }
                            n1 n1Var = new n1(1.0f, false);
                            List list2 = k1Var2.f39200a;
                            boolean zH2 = sVar3.h(aVar2) | sVar3.h(k1Var2);
                            Object objM5 = sVar3.M();
                            if (zH2 || objM5 == fVar2) {
                                objM5 = new p2(22, aVar2, k1Var2);
                                sVar3.k0(objM5);
                            }
                            rs.k.q(n1Var, list2, (Function1) objM5, sVar3, 0);
                            sVar3.q(false);
                        }
                        d2.c.f(m2.m(qVar, mVar2.f44015k), sVar3);
                        boolean zH3 = sVar3.h(aVar2) | sVar3.h(k1Var2);
                        Object objM6 = sVar3.M();
                        if (zH3 || objM6 == fVar2) {
                            objM6 = new j(aVar2, k1Var2);
                            sVar3.k0(objM6);
                        }
                        rs.k.l(voucherMode, (Function0) objM6, sVar3, 0);
                        sVar3.q(true);
                        if (((Boolean) b1Var2.getValue()).booleanValue()) {
                            sVar3.a0(119781610);
                            VoucherMode voucherMode3 = k1Var2.f39204e;
                            Object objM7 = sVar3.M();
                            if (objM7 == fVar2) {
                                objM7 = new pi.b(b1Var2, 25);
                                sVar3.k0(objM7);
                            }
                            m3.s sVar5 = sVar3;
                            rs.k.a(w6VarF, voucherMode3, aVar2, (Function0) objM7, k1Var2.f39203d, k1Var2.f39206g, k1Var2.f39207h, sVar5, 3072);
                            sVar5.q(false);
                        } else {
                            m3.s sVar6 = sVar3;
                            sVar6.a0(120222709);
                            sVar6.q(false);
                        }
                    } else {
                        sVar4.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(k1Var, aVar, i11, 9);
        }
    }

    public static final void E(BasicVoucher basicVoucher, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1730641563);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (basicVoucher instanceof CurrencyBasedVoucher) {
            sVar.a0(994201788);
            d((CurrencyBasedVoucher) basicVoucher, sVar, i12 & 14);
            sVar.q(false);
        } else if (basicVoucher instanceof CountryBasedVoucher) {
            sVar.a0(994203963);
            b((CountryBasedVoucher) basicVoucher, sVar, i12 & 14);
            sVar.q(false);
        } else {
            sVar.a0(994205503);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.a(basicVoucher, i11, 12);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final n4.b F(String str, m3.n nVar) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case 2099:
                if (upperCase.equals("AT")) {
                    m3.s sVar = (m3.s) nVar;
                    sVar.a0(-1286571540);
                    n4.b bVarZ = x0.z(R.drawable.ic_flag_at, sVar, 0);
                    sVar.q(false);
                    return bVarZ;
                }
                break;
            case 2100:
                if (upperCase.equals("AU")) {
                    m3.s sVar2 = (m3.s) nVar;
                    sVar2.a0(-1286569620);
                    n4.b bVarZ2 = x0.z(R.drawable.ic_flag_au, sVar2, 0);
                    sVar2.q(false);
                    return bVarZ2;
                }
                break;
            case 2115:
                if (upperCase.equals("BE")) {
                    m3.s sVar3 = (m3.s) nVar;
                    sVar3.a0(-1286567700);
                    n4.b bVarZ3 = x0.z(R.drawable.ic_flag_be, sVar3, 0);
                    sVar3.q(false);
                    return bVarZ3;
                }
                break;
            case 2142:
                if (upperCase.equals("CA")) {
                    m3.s sVar4 = (m3.s) nVar;
                    sVar4.a0(-1286565780);
                    n4.b bVarZ4 = x0.z(R.drawable.ic_flag_ca, sVar4, 0);
                    sVar4.q(false);
                    return bVarZ4;
                }
                break;
            case 2149:
                if (upperCase.equals("CH")) {
                    m3.s sVar5 = (m3.s) nVar;
                    sVar5.a0(-1286563860);
                    n4.b bVarZ5 = x0.z(R.drawable.ic_flag_ch, sVar5, 0);
                    sVar5.q(false);
                    return bVarZ5;
                }
                break;
            case 2167:
                if (upperCase.equals("CZ")) {
                    m3.s sVar6 = (m3.s) nVar;
                    sVar6.a0(-1286561940);
                    n4.b bVarZ6 = x0.z(R.drawable.ic_flag_cz, sVar6, 0);
                    sVar6.q(false);
                    return bVarZ6;
                }
                break;
            case 2177:
                if (upperCase.equals("DE")) {
                    m3.s sVar7 = (m3.s) nVar;
                    sVar7.a0(-1286560020);
                    n4.b bVarZ7 = x0.z(R.drawable.ic_flag_de, sVar7, 0);
                    sVar7.q(false);
                    return bVarZ7;
                }
                break;
            case 2183:
                if (upperCase.equals("DK")) {
                    m3.s sVar8 = (m3.s) nVar;
                    sVar8.a0(-1286558100);
                    n4.b bVarZ8 = x0.z(R.drawable.ic_flag_dk, sVar8, 0);
                    sVar8.q(false);
                    return bVarZ8;
                }
                break;
            case 2222:
                if (upperCase.equals("ES")) {
                    m3.s sVar9 = (m3.s) nVar;
                    sVar9.a0(-1286556180);
                    n4.b bVarZ9 = x0.z(R.drawable.ic_flag_es, sVar9, 0);
                    sVar9.q(false);
                    return bVarZ9;
                }
                break;
            case 2249:
                if (upperCase.equals("FO")) {
                    m3.s sVar10 = (m3.s) nVar;
                    sVar10.a0(-1286554260);
                    n4.b bVarZ10 = x0.z(R.drawable.ic_flag_fo, sVar10, 0);
                    sVar10.q(false);
                    return bVarZ10;
                }
                break;
            case 2252:
                if (upperCase.equals("FR")) {
                    m3.s sVar11 = (m3.s) nVar;
                    sVar11.a0(-1286552340);
                    n4.b bVarZ11 = x0.z(R.drawable.ic_flag_fr, sVar11, 0);
                    sVar11.q(false);
                    return bVarZ11;
                }
                break;
            case 2267:
                if (upperCase.equals("GB")) {
                    m3.s sVar12 = (m3.s) nVar;
                    sVar12.a0(-1286550420);
                    n4.b bVarZ12 = x0.z(R.drawable.ic_flag_gb, sVar12, 0);
                    sVar12.q(false);
                    return bVarZ12;
                }
                break;
            case 2332:
                if (upperCase.equals("IE")) {
                    m3.s sVar13 = (m3.s) nVar;
                    sVar13.a0(-1286548500);
                    n4.b bVarZ13 = x0.z(R.drawable.ic_flag_ie, sVar13, 0);
                    sVar13.q(false);
                    return bVarZ13;
                }
                break;
            case 2347:
                if (upperCase.equals("IT")) {
                    m3.s sVar14 = (m3.s) nVar;
                    sVar14.a0(-1286546580);
                    n4.b bVarZ14 = x0.z(R.drawable.ic_flag_it, sVar14, 0);
                    sVar14.q(false);
                    return bVarZ14;
                }
                break;
            case 2494:
                if (upperCase.equals("NL")) {
                    m3.s sVar15 = (m3.s) nVar;
                    sVar15.a0(-1286544660);
                    n4.b bVarZ15 = x0.z(R.drawable.ic_flag_nl, sVar15, 0);
                    sVar15.q(false);
                    return bVarZ15;
                }
                break;
            case 2497:
                if (upperCase.equals("NO")) {
                    m3.s sVar16 = (m3.s) nVar;
                    sVar16.a0(-1286542740);
                    n4.b bVarZ16 = x0.z(R.drawable.ic_flag_no, sVar16, 0);
                    sVar16.q(false);
                    return bVarZ16;
                }
                break;
            case 2556:
                if (upperCase.equals("PL")) {
                    m3.s sVar17 = (m3.s) nVar;
                    sVar17.a0(-1286540820);
                    n4.b bVarZ17 = x0.z(R.drawable.ic_flag_pl, sVar17, 0);
                    sVar17.q(false);
                    return bVarZ17;
                }
                break;
            case 2564:
                if (upperCase.equals("PT")) {
                    m3.s sVar18 = (m3.s) nVar;
                    sVar18.a0(-1286538900);
                    n4.b bVarZ18 = x0.z(R.drawable.ic_flag_pt, sVar18, 0);
                    sVar18.q(false);
                    return bVarZ18;
                }
                break;
            case 2642:
                if (upperCase.equals("SE")) {
                    m3.s sVar19 = (m3.s) nVar;
                    sVar19.a0(-1286536980);
                    n4.b bVarZ19 = x0.z(R.drawable.ic_flag_se, sVar19, 0);
                    sVar19.q(false);
                    return bVarZ19;
                }
                break;
            case 2718:
                if (upperCase.equals("US")) {
                    m3.s sVar20 = (m3.s) nVar;
                    sVar20.a0(-1286535060);
                    n4.b bVarZ20 = x0.z(R.drawable.ic_flag_us, sVar20, 0);
                    sVar20.q(false);
                    return bVarZ20;
                }
                break;
        }
        m3.s sVar21 = (m3.s) nVar;
        sVar21.a0(-1227822884);
        sVar21.q(false);
        return null;
    }

    public static final String G(UsageDetailsType usageDetailsType, String str) {
        String str2;
        int i11 = k.$EnumSwitchMapping$0[usageDetailsType.ordinal()];
        if (i11 == 1) {
            str2 = "+ ";
        } else {
            if (i11 != 2) {
                sa0.a.f38953a.c("Unexpected UsageDetailsType: " + usageDetailsType, new Object[0]);
                return str;
            }
            str2 = "- ";
        }
        return e0.f.k(str2, str);
    }

    public static final String H(UsageDetailsType usageDetailsType, String str) {
        String str2;
        int i11 = o.$EnumSwitchMapping$0[usageDetailsType.ordinal()];
        if (i11 == 1) {
            str2 = "+ ";
        } else {
            if (i11 != 2) {
                sa0.a.f38953a.c("Unexpected UsageDetailsType: " + usageDetailsType, new Object[0]);
                return str;
            }
            str2 = "- ";
        }
        return e0.f.k(str2, str);
    }

    public static final void a(CountryBasedVoucher countryBasedVoucher, m3.n nVar, int i11) {
        String strJ;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1905595851);
        int i12 = (sVar.h(countryBasedVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Integer numberOfItems = countryBasedVoucher.getNumberOfItems();
            if ((numberOfItems != null ? numberOfItems.intValue() : 0) > 1) {
                sVar.a0(1271859277);
                Integer numValueOf = Integer.valueOf(countryBasedVoucher.getItemsLeft());
                Integer numberOfItems2 = countryBasedVoucher.getNumberOfItems();
                strJ = f0.T(R.string.voucher_details_number_of_meals_multi, new Object[]{numValueOf, Integer.valueOf(numberOfItems2 != null ? numberOfItems2.intValue() : 0)}, sVar);
                sVar.q(false);
            } else {
                strJ = b3.i.j(1272052345, R.string.voucher_details_number_of_meals_single, sVar, sVar, false);
            }
            rs.k.n(R.drawable.ic_shopping_bag, R.string.vouchers_details_value, strJ, null, sVar, 0, 8);
            rs.k.n(R.drawable.ic_seal_percent, R.string.voucher_details_label_max_value_per_meal, mv.d.i(countryBasedVoucher.getMaxItemPrice(), 1), null, sVar, 0, 8);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(countryBasedVoucher, i11, 1);
        }
    }

    public static final void b(CountryBasedVoucher countryBasedVoucher, m3.n nVar, int i11) {
        String strJ;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1571208373);
        int i12 = (sVar.h(countryBasedVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Integer numberOfItems = countryBasedVoucher.getNumberOfItems();
            if ((numberOfItems != null ? numberOfItems.intValue() : 0) > 1) {
                sVar.a0(1315176205);
                Integer numValueOf = Integer.valueOf(countryBasedVoucher.getItemsLeft());
                Integer numberOfItems2 = countryBasedVoucher.getNumberOfItems();
                strJ = f0.T(R.string.voucher_details_number_of_meals_multi, new Object[]{numValueOf, Integer.valueOf(numberOfItems2 != null ? numberOfItems2.intValue() : 0)}, sVar);
                sVar.q(false);
            } else {
                strJ = b3.i.j(1315369273, R.string.voucher_details_number_of_meals_single, sVar, sVar, false);
            }
            rs.k.m(R.drawable.shopping_bag, R.string.vouchers_details_value, strJ, null, sVar, 0, 8);
            rs.k.m(R.drawable.voucher_max, R.string.voucher_details_label_max_value_per_meal, mv.d.i(countryBasedVoucher.getMaxItemPrice(), 1), null, sVar, 0, 8);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(countryBasedVoucher, i11, 0);
        }
    }

    public static final void c(CurrencyBasedVoucher currencyBasedVoucher, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1955946131);
        int i12 = (sVar.h(currencyBasedVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            rs.k.n(R.drawable.ic_seal_percent, R.string.vouchers_details_currency_balance, f0.T(R.string.vouchers_details_currency_current_balance, new Object[]{mv.d.i(currencyBasedVoucher.getCurrentAmount(), 1)}, sVar), null, sVar, 0, 8);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(currencyBasedVoucher, i11, 1);
        }
    }

    public static final void d(CurrencyBasedVoucher currencyBasedVoucher, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-935429927);
        int i12 = (sVar.h(currencyBasedVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            rs.k.m(R.drawable.voucher_max, R.string.vouchers_details_currency_balance, f0.T(R.string.vouchers_details_currency_current_balance, new Object[]{mv.d.i(currencyBasedVoucher.getCurrentAmount(), 1)}, sVar), null, sVar, 0, 8);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(currencyBasedVoucher, i11, 0);
        }
    }

    public static final void e(j1 j1Var, t5.a aVar, b4.t tVar, m3.n nVar, int i11) {
        j1Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(897841970);
        int i12 = i11 | (sVar.h(j1Var) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16) | (sVar.f(tVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            BasicVoucher basicVoucher = j1Var.f39193a;
            basicVoucher.getClass();
            DiscountVoucher discountVoucher = (DiscountVoucher) basicVoucher;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            b4.t tVarB = d2.c.B(tVar, ((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).f44021r, 0.0f, 2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            rs.k.m(R.drawable.discount_name, R.string.voucher_discount_detail_name, discountVoucher.getName(), null, sVar, 0, 8);
            String description = discountVoucher.getDescription();
            String str = description.length() > 0 ? description : null;
            if (str == null) {
                sVar.a0(-444768577);
                sVar.q(false);
            } else {
                sVar.a0(-444768576);
                rs.k.m(R.drawable.discount_description, R.string.voucher_discount_detail_description_label, str, null, sVar, 0, 8);
                sVar.q(false);
            }
            Double discountPercentage = discountVoucher.getDiscountPercentage();
            if (discountPercentage == null) {
                sVar.a0(-444513106);
                sVar.q(false);
            } else {
                sVar.a0(-444513105);
                rs.k.m(R.drawable.discount_value, R.string.voucher_discount_value_label, f0.T(R.string.voucher_discount_value_off, new Object[]{d70.a.a(discountPercentage.doubleValue(), sVar)}, sVar), null, sVar, 0, 8);
                sVar.q(false);
            }
            Price maxOrderAmount = discountVoucher.getMaxOrderAmount();
            if (maxOrderAmount == null) {
                sVar.a0(-444215754);
                sVar.q(false);
            } else {
                sVar.a0(-444215753);
                rs.k.m(R.drawable.discount_max_value, R.string.voucher_discount_detail_max_value_label, mv.d.i(maxOrderAmount, 1), null, sVar, 0, 8);
                sVar.q(false);
            }
            rs.k.m(R.drawable.discount_redemtions, R.string.voucher_discount_redemptions_label, f0.T(R.string.voucher_discount_redemptions, new Object[]{Integer.valueOf(discountVoucher.getNumberOfOrdersUsed()), Integer.valueOf(discountVoucher.getNumberOfInitialOrders())}, sVar), null, sVar, 0, 8);
            if (discountVoucher.getState() == VoucherState.PENDING) {
                sVar.a0(-443585306);
                rs.k.m(R.drawable.voucher_valid, R.string.vouchers_details_can_be_used_from, f0.T(R.string.vouchers_details_date_time_stamp, new Object[]{p0.k(discountVoucher.getValidFromUtc()), p0.k(discountVoucher.getValidFromUtc())}, sVar), null, sVar, 0, 8);
                sVar.q(false);
            } else {
                sVar.a0(-443115067);
                String validToUtc = discountVoucher.getValidToUtc();
                rs.k.m(R.drawable.voucher_valid, R.string.vouchers_details_expires, f0.T(R.string.vouchers_details_date_time_stamp, new Object[]{p0.j(validToUtc), p0.k(validToUtc)}, sVar), null, sVar, 0, 8);
                sVar.q(false);
            }
            List<ItemType> applicableItemTypes = discountVoucher.getApplicableItemTypes();
            List<ItemType> list = cg.q(applicableItemTypes) ? applicableItemTypes : null;
            if (list == null) {
                sVar.a0(-442552511);
                sVar.q(false);
            } else {
                sVar.a0(-442552510);
                Resources resources = (Resources) sVar.j(v0.f7391c);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((ItemType) obj).getResId() != 0) {
                        arrayList.add(obj);
                    }
                }
                boolean zH = sVar.h(resources);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new i(resources, 0);
                    sVar.k0(objM2);
                }
                rs.k.m(R.drawable.discount_good_for, R.string.voucher_discount_good_for_label, CollectionsKt.U(arrayList, ", ", null, null, (Function1) objM2, 30), null, sVar, 0, 8);
                sVar.q(false);
            }
            int i13 = i12 & 112;
            boolean zH2 = (i13 == 32) | sVar.h(discountVoucher);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                objM3 = new lw.o(aVar, discountVoucher, b1Var, 25);
                sVar.k0(objM3);
            }
            rs.k.m(R.drawable.voucher_info, R.string.vouchers_details_additional_details, null, (Function0) objM3, sVar, 0, 4);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-441735443);
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new pi.b(b1Var, 21);
                    sVar.k0(objM4);
                }
                rs.k.c(j1Var, (Function0) objM4, sVar, (i12 & 14) | 48);
                sVar.q(false);
            } else {
                sVar.a0(-441538438);
                sVar.q(false);
            }
            boolean zH3 = sVar.h(discountVoucher) | (i13 == 32);
            Object objM5 = sVar.M();
            if (zH3 || objM5 == fVar) {
                objM5 = new qw.b(29, discountVoucher, aVar);
                sVar.k0(objM5);
            }
            rs.k.m(R.drawable.terms_hammer, R.string.vouchers_details_terms, null, (Function0) objM5, sVar, 0, 4);
            float f11 = lv.t.f28254h;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            j(basicVoucher, sVar, 0);
            d2.c.f(m2.m(qVar, lv.t.f28253g), sVar);
            i(j1Var.f39194b, basicVoucher, sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(j1Var, aVar, tVar, i11, 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0538  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(ss.c1 r51, t5.a r52, m3.b1 r53, b4.t r54, m3.n r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.a.f(ss.c1, t5.a, m3.b1, b4.t, m3.n, int):void");
    }

    public static final void g(d1 d1Var, t5.a aVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1462158792);
        int i12 = (sVar.h(d1Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            b4.t tVarB = d2.c.B(v1.n.r(m2.f13850c, v1.n.q(sVar), true), mVar.f44010f, 0.0f, 2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            boolean zIsEmpty = d1Var.f39154a.isEmpty();
            m3.f fVar = m3.m.f29332a;
            if (zIsEmpty) {
                sVar.a0(184557506);
                rs.k.o(false, null, sVar, 6);
                sVar.q(false);
            } else {
                sVar.a0(184629581);
                List list = d1Var.f39154a;
                boolean z11 = (i12 & 112) == 32;
                Object objM = sVar.M();
                if (z11 || objM == fVar) {
                    objM = new c(1, aVar);
                    sVar.k0(objM);
                }
                rs.k.p(null, list, (Function2) objM, sVar, 0, 1);
                sVar.q(false);
            }
            b4.t tVarD = d2.c.D(b4.q.f5711a, 0.0f, mVar.l, 0.0f, mVar.f44011g, 5);
            boolean z12 = (i12 & 112) == 32;
            Object objM2 = sVar.M();
            if (z12 || objM2 == fVar) {
                objM2 = new rs.l(4, aVar);
                sVar.k0(objM2);
            }
            s(tVarD, (Function0) objM2, sVar, 0, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q(d1Var, aVar, i11, 1);
        }
    }

    public static final void h(VoucherMode voucherMode, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-791818621);
        int i12 = i11 | (sVar.d(voucherMode == null ? -1 : voucherMode.ordinal()) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            l2.f fVarB = l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43977a);
            float f11 = mVar.f44014j;
            float f12 = mVar.f44021r;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarK = v1.n.k(v1.n.j(d2.c.C(qVar, f12, f11, f12, f11), hVar.f43907b, fVarB), ((x60.a) sVar.j(PantryThemeKt.getLocalPantryBorder())).f43898e, hVar.f43922i0, fVarB);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarK, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f13 = mVar.f44014j;
            b4.t tVarC2 = d2.c.C(qVar, f12, f13, f12, f13);
            y yVarA = w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            r9.d(f0.U(sVar, voucherMode.getExpiredEmptyStateDescription()), null, hVar.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 130042);
            sVar = sVar;
            d2.c.f(m2.m(qVar, mVar.f44015k), sVar);
            v1.n.d(x0.z(R.drawable.voucher_icon, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(voucherMode, i11, 17);
        }
    }

    public static final void i(List list, BasicVoucher basicVoucher, m3.n nVar, int i11) {
        list.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1294049822);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.f(basicVoucher) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean zH = sVar.h(list) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new ry.b(15, list, basicVoucher);
                sVar.k0(objM);
            }
            ox.h.c(null, null, null, null, null, null, false, null, (Function1) objM, sVar, 0, 511);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e(list, basicVoucher, i11, 0);
        }
    }

    public static final void j(BasicVoucher basicVoucher, m3.n nVar, int i11) {
        boolean z11;
        String strT;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1232998562);
        int i12 = i11 | (sVar.f(basicVoucher) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(b4.q.f5711a, sVar);
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
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            String strU = f0.U(sVar, R.string.vouchers_details_history);
            m5.u0 u0Var = lv.v.f28279s;
            long j9 = lv.s.D;
            r9.d(strU, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            boolean z12 = basicVoucher instanceof CurrencyBasedVoucher;
            String strT2 = "";
            if (z12) {
                sVar.a0(-2071549156);
                strT = f0.T(R.string.voucher_details_history_remaining_currency, new Object[]{mv.d.i(((CurrencyBasedVoucher) basicVoucher).getCurrentAmount(), 1)}, sVar);
                z11 = false;
                sVar.q(false);
            } else {
                z11 = false;
                if (basicVoucher instanceof CountryBasedVoucher) {
                    sVar.a0(-2071542966);
                    strT = f0.T(R.string.voucher_details_history_remaining_country, new Object[]{Integer.valueOf(((CountryBasedVoucher) basicVoucher).getItemsLeft())}, sVar);
                    sVar.q(false);
                } else {
                    sVar.a0(206830076);
                    sVar.q(false);
                    strT = "";
                }
            }
            if (z12) {
                sVar.a0(-2071534258);
                strT2 = f0.T(R.string.voice_over_history_remaining, new Object[]{mv.d.i(((CurrencyBasedVoucher) basicVoucher).getCurrentAmount(), 1)}, sVar);
                sVar.q(z11);
            } else if (basicVoucher instanceof CountryBasedVoucher) {
                sVar.a0(-2071528515);
                strT2 = f0.T(R.string.voice_over_history_remaining, new Object[]{Integer.valueOf(((CountryBasedVoucher) basicVoucher).getItemsLeft())}, sVar);
                sVar.q(z11);
            } else {
                sVar.a0(207265564);
                sVar.q(z11);
            }
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            boolean zF = sVar.f(strT2);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new qb.s(strT2, 23);
                sVar.k0(objM);
            }
            r9.d(strT, j5.r.c(n1Var, z11, (Function1) objM), j9, 0L, null, 0L, null, new x5.k(6), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.a(basicVoucher, i11, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type int to ?? for r5v12 ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:138)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:213)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public static final void k(com.app.tgtg.model.remote.voucher.VoucherUsageDetails r32, com.app.tgtg.model.remote.voucher.BasicVoucher r33, m3.n r34, int r35) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.a.k(com.app.tgtg.model.remote.voucher.VoucherUsageDetails, com.app.tgtg.model.remote.voucher.BasicVoucher, m3.n, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x035a  */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(com.app.tgtg.model.remote.voucher.VoucherUsageDetails r30, com.app.tgtg.model.remote.voucher.BasicVoucher r31, m3.n r32, int r33) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.a.l(com.app.tgtg.model.remote.voucher.VoucherUsageDetails, com.app.tgtg.model.remote.voucher.BasicVoucher, m3.n, int):void");
    }

    public static final void m(List list, BasicVoucher basicVoucher, m3.n nVar, int i11) {
        list.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-459552200);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.f(basicVoucher) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.a aVar = (x60.a) sVar.j(PantryThemeKt.getLocalPantryBorder());
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(v1.n.k(m2.d(qVar, 1.0f), aVar.f43897d, hVar.f43922i0, l2.g.b(kVar.f43977a)), mVar.f44010f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(96199093);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VoucherUsageDetails voucherUsageDetails = (VoucherUsageDetails) it.next();
                if (basicVoucher == null) {
                    sVar.a0(2054638509);
                    sVar.q(false);
                } else {
                    sVar.a0(2054638510);
                    l(voucherUsageDetails, basicVoucher, sVar, 0);
                    if (Intrinsics.areEqual(voucherUsageDetails, CollectionsKt.W(list))) {
                        sVar.a0(-690920087);
                        sVar.q(false);
                    } else {
                        sVar.a0(-691277176);
                        s0.g(d2.c.A(qVar, mVar.f44017n, mVar.f44015k), aVar.f43895b, hVar.f43922i0, sVar, 0, 0);
                        sVar.q(false);
                    }
                    sVar.q(false);
                }
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e(list, basicVoucher, i11, 1);
        }
    }

    public static final void n(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(540441204);
        if (sVar.R(i11 & 1, i11 != 0)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            g3.i2.a(x0.z(R.drawable.ic_clockclockwise, sVar, 0), f0.U(sVar, R.string.vouchers_details_history), null, 0L, sVar, 8, 12);
            r9.d(r8.k.f(mVar.f44016m, R.string.vouchers_details_history, qVar, sVar, sVar), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 131066);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u60.a(i11, 6);
        }
    }

    public static final void o(j1 j1Var, t5.a aVar, b4.t tVar, m3.n nVar, int i11) {
        BasicVoucher basicVoucher;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(877323219);
        int i12 = i11 | (sVar.h(j1Var) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16) | (sVar.f(tVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            b4.t tVarB = d2.c.B(tVar, ((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).f44021r, 0.0f, 2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            BasicVoucher basicVoucher2 = j1Var.f39193a;
            rs.k.m(R.drawable.system_icon_add_voucher, R.string.vouchers_details_name, basicVoucher2.getName(), null, sVar, 0, 8);
            String shortDescription = basicVoucher2.getShortDescription();
            if (!mv.d.r(shortDescription)) {
                shortDescription = null;
            }
            String str = shortDescription;
            if (str == null) {
                sVar.a0(1354032467);
                sVar.q(false);
            } else {
                sVar.a0(1354032468);
                rs.k.m(R.drawable.discount_description, R.string.voucher_detail_description_label, str, null, sVar, 0, 8);
                sVar.q(false);
            }
            E(basicVoucher2, sVar, 0);
            if (basicVoucher2.getState() == VoucherState.PENDING) {
                sVar.a0(1354356325);
                basicVoucher = basicVoucher2;
                rs.k.m(R.drawable.voucher_valid, R.string.vouchers_details_can_be_used_from, f0.T(R.string.vouchers_details_date_time_stamp, new Object[]{p0.k(basicVoucher2.getValidFromUtc()), p0.k(basicVoucher2.getValidFromUtc())}, sVar), null, sVar, 0, 8);
                sVar.q(false);
            } else {
                basicVoucher = basicVoucher2;
                sVar.a0(1354838282);
                String validToUtc = basicVoucher.getValidToUtc();
                rs.k.m(R.drawable.voucher_valid, R.string.vouchers_details_expires, f0.T(R.string.vouchers_details_date_time_stamp, new Object[]{p0.j(validToUtc), p0.k(validToUtc)}, sVar), null, sVar, 0, 8);
                sVar.q(false);
            }
            int i13 = i12 & 112;
            boolean zH = (i13 == 32) | sVar.h(j1Var);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new lw.o(aVar, j1Var, b1Var, 26);
                sVar.k0(objM2);
            }
            rs.k.m(R.drawable.voucher_info, R.string.vouchers_details_additional_details, null, (Function0) objM2, sVar, 0, 4);
            boolean zH2 = sVar.h(j1Var) | (i13 == 32);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                objM3 = new j(0, j1Var, aVar);
                sVar.k0(objM3);
            }
            rs.k.m(R.drawable.terms_hammer, R.string.vouchers_details_terms, null, (Function0) objM3, sVar, 0, 4);
            float f11 = lv.t.f28254h;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            BasicVoucher basicVoucher3 = basicVoucher;
            j(basicVoucher3, sVar, 0);
            d2.c.f(m2.m(qVar, lv.t.f28253g), sVar);
            i(j1Var.f39194b, basicVoucher3, sVar, 0);
            sVar.q(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1462798206);
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new pi.b(b1Var, 20);
                    sVar.k0(objM4);
                }
                rs.k.c(j1Var, (Function0) objM4, sVar, (i12 & 14) | 48);
                sVar.q(false);
            } else {
                sVar.a0(1462968303);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(j1Var, aVar, tVar, i11, 0);
        }
    }

    public static final void p(c1 c1Var, t5.a aVar, b1 b1Var, b4.t tVar, m3.n nVar, int i11) {
        t5.a aVar2;
        boolean z11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-482550340);
        int i12 = i11 | (sVar.h(c1Var) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16) | (sVar.f(tVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.a aVar3 = (x60.a) sVar.j(PantryThemeKt.getLocalPantryBorder());
            b4.t tVarR = v1.n.r(tVar, v1.n.q(sVar), true);
            float f11 = mVar.f44010f;
            float f12 = mVar.f44008d;
            b4.t tVarA = d2.c.A(tVarR, f11, mVar.f44011g);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.vouchers_details_title), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43957f, sVar, 0, 0, 131066);
            sVar = sVar;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f12), sVar);
            b4.t tVarZ = d2.c.z(v1.n.k(m2.d(qVar, 1.0f), aVar3.f43895b, hVar.f43922i0, l2.g.b(kVar.f43978b)), mVar.f44010f);
            y yVarA2 = w.a(dVar, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            BasicVoucher basicVoucher = c1Var.f39144a;
            List list = c1Var.f39145b;
            List list2 = c1Var.f39146c;
            rs.k.n(R.drawable.ic_voucher, R.string.vouchers_details_name, basicVoucher.getName(), null, sVar, 0, 8);
            C(basicVoucher, sVar, 0);
            if (basicVoucher.getState() == VoucherState.PENDING) {
                sVar.a0(-515014541);
                rs.k.n(R.drawable.ic_calendarblank, R.string.vouchers_details_can_be_used_from, f0.T(R.string.vouchers_details_date_time_stamp, new Object[]{p0.j(basicVoucher.getValidFromUtc()), p0.k(basicVoucher.getValidFromUtc())}, sVar), null, sVar, 0, 8);
                sVar.q(false);
            } else {
                sVar.a0(-514529701);
                rs.k.n(R.drawable.ic_calendarblank, R.string.vouchers_details_expires, p0.j(basicVoucher.getValidToUtc()), null, sVar, 0, 8);
                sVar.q(false);
            }
            if (list2.isEmpty()) {
                sVar.a0(-513725158);
                sVar.q(false);
            } else {
                sVar.a0(-514133583);
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String name = ((FilteredStore) it.next()).getName();
                    if (name != null) {
                        arrayList.add(name);
                    }
                }
                String strU = CollectionsKt.U(arrayList, "\n", null, null, null, 62);
                if (strU.length() > 0) {
                    sVar.a0(-514003321);
                    rs.k.n(R.drawable.ic_storefront, R.string.voucher_discount_participating_stores_label, strU, null, sVar, 0, 8);
                    sVar.q(false);
                } else {
                    sVar.a0(-513739046);
                    sVar.q(false);
                }
                sVar.q(false);
            }
            String countryId = basicVoucher.getCountryId();
            if (countryId == null) {
                sVar.a0(-513675466);
                sVar.q(false);
            } else {
                sVar.a0(-513675465);
                z(F(countryId, sVar), R.string.voucher_discount_country_of_use_label, d70.a.c(countryId, sVar), sVar, 8);
                sVar.q(false);
            }
            int i13 = i12 & 112;
            boolean zH = sVar.h(c1Var) | (i13 == 32);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                z11 = true;
                objM = new n(aVar, c1Var, b1Var, 1);
                sVar.k0(objM);
            } else {
                z11 = true;
            }
            rs.k.n(R.drawable.ic_voucher_info, R.string.vouchers_details_additional_details, null, (Function0) objM, sVar, 0, 4);
            sVar.q(z11);
            if (list.isEmpty()) {
                sVar.a0(887594960);
                sVar.q(false);
            } else {
                r8.k.t(f12, 887258610, qVar, sVar, sVar);
                n(sVar, 0);
                d2.c.f(m2.m(qVar, f12), sVar);
                m(list, basicVoucher, sVar, 0);
                sVar.q(false);
            }
            d2.c.f(m2.m(qVar, f12), sVar);
            boolean zH2 = sVar.h(c1Var) | (i13 == 32);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                aVar2 = aVar;
                objM2 = new l(c1Var, aVar2);
                sVar.k0(objM2);
            } else {
                aVar2 = aVar;
            }
            r((Function0) objM2, sVar, 0);
            sVar.q(true);
        } else {
            aVar2 = aVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m(c1Var, aVar2, b1Var, tVar, i11, 0);
        }
    }

    public static final void q(d1 d1Var, t5.a aVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2134122397);
        int i12 = (sVar.h(d1Var) ? 4 : 2) | i11 | (sVar.f(aVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.t tVarB = d2.c.B(m2.f13850c, ((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).f44010f, 0.0f, 2);
            boolean z11 = false;
            b4.i iVar = b4.d.f5695n;
            boolean zH = sVar.h(d1Var);
            if ((i12 & 112) == 32) {
                z11 = true;
            }
            boolean z12 = zH | z11;
            Object objM = sVar.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new ry.b(16, d1Var, aVar);
                sVar.k0(objM);
            }
            ox.h.c(tVarB, null, null, null, iVar, null, false, null, (Function1) objM, sVar, 196608, 478);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q(d1Var, aVar, i11, 0);
        }
    }

    public static final void r(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(54855504);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = androidx.compose.foundation.b.c(d2.c.z(m2.d(qVar, 1.0f), mVar.f44015k), false, null, null, function0, 15);
            i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            r9.d(f0.U(sVar, R.string.vouchers_details_terms), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43974x, sVar, 0, 0, 131066);
            sVar = sVar;
            d2.c.f(m2.m(qVar, mVar.f44016m), sVar);
            g3.i2.a(x0.z(R.drawable.ic_arrowsquareout, sVar, 0), f0.U(sVar, R.string.terms_agree_terms_and_conditions), m2.m(qVar, mVar.f44017n), 0L, sVar, 8, 8);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new z(i11, 25, function0);
        }
    }

    public static final void s(b4.t tVar, Function0 function0, m3.n nVar, int i11, int i12) {
        b4.t tVar2;
        int i13;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(220101980);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            tVar2 = tVar;
        } else {
            tVar2 = tVar;
            i13 = i11 | (sVar.f(tVar2) ? 4 : 2);
        }
        int i15 = i13 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i15 & 1, (i15 & 19) != 18)) {
            b4.t tVar3 = i14 != 0 ? b4.q.f5711a : tVar2;
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            b4.j jVar2 = b4.d.f5693k;
            b4.t tVarE = m2.e(m2.d(tVar3, 1.0f), 48);
            boolean z11 = (i15 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new rr.a(25, function0);
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarE, false, null, null, (Function0) objM, 15);
            i2 i2VarA = h2.a(d2.i.f13801a, jVar2, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            b4.t tVar4 = tVar3;
            r9.d(f0.U(sVar, R.string.voucher_experience_used_and_expired), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 131066);
            sVar = sVar;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f, true), sVar);
            g3.i2.a(x0.z(R.drawable.system_icon_chevron_right_neutral_60, sVar, 0), f0.U(sVar, R.string.voucher_experience_used_and_expired), null, 0L, sVar, 8, 12);
            sVar.q(true);
            tVar2 = tVar4;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hj.a(tVar2, function0, i11, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(ss.i1 r40, t5.a r41, m3.n r42, int r43) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.a.t(ss.i1, t5.a, m3.n, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(ss.b1 r41, t5.a r42, m3.n r43, int r44) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.a.u(ss.b1, t5.a, m3.n, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0493  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(ss.h1 r76, t5.a r77, m3.n r78, int r79) {
        /*
            Method dump skipped, instruction units count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.a.v(ss.h1, t5.a, m3.n, int):void");
    }

    public static final void w(j1 j1Var, t5.a aVar, m3.n nVar, int i11) {
        int i12;
        j1Var.getClass();
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-453359647);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(j1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(aVar) : sVar.h(aVar) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x5.a(v1.n.j(b4.q.f5711a, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).G, g0.f23254b), u3.e.e(1988258725, sVar, new c60.c(j1Var.f39193a instanceof DiscountVoucher ? R.string.voucher_discount_details : R.string.vouchers_details_title, aVar)), null, null, null, 0, 0L, 0L, null, u3.e.e(1555421104, sVar, new oo.s(7, j1Var, aVar)), sVar, 805306416, 508);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(j1Var, aVar, i11, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0439 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(ss.a1 r77, t5.a r78, m3.n r79, int r80) {
        /*
            Method dump skipped, instruction units count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.a.x(ss.a1, t5.a, m3.n, int):void");
    }

    public static final void y(int i11, int i12, String str, String str2, m3.n nVar, int i13) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2052980865);
        int i14 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.f(str2) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i14 & 1, (i14 & 1171) != 1170)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.l lVar = (x60.l) sVar.j(PantryThemeKt.getLocalPantrySize());
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = mVar.f44015k;
            float f12 = mVar.l;
            b4.t tVarB = d2.c.B(tVarD, 0.0f, f11, 1);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            v1.n.d(x0.z(i11, sVar, i14 & 14), null, m2.m(d2.c.z(qVar, f12), lVar.f43995g), null, null, 0.0f, null, sVar, 56, 120);
            d2.c.f(m2.m(qVar, mVar.f44017n), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(f0.U(sVar, i12), null, hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43967q, sVar, 0, 0, 131066);
            d2.c.f(m2.m(qVar, f12), sVar);
            r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43966p, sVar, (i14 >> 6) & 14, 0, 131066);
            sVar = sVar;
            sVar.q(true);
            if (str2 == null) {
                sVar.a0(-291449550);
                sVar.q(false);
            } else {
                sVar.a0(-291449549);
                NegativePantryBadgeLabelKt.MediumNegativePantryBadgeLabel(str2, null, str2, null, null, sVar, 0, 26);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new defpackage.h(i11, i12, str, str2, i13, 5);
        }
    }

    public static final void z(n4.b bVar, int i11, String str, m3.n nVar, int i12) {
        int i13;
        int i14;
        b5.g gVar;
        x60.j jVar;
        b4.q qVar;
        b5.d dVar;
        x60.m mVar;
        b5.g gVar2;
        int i15;
        float f11;
        b5.g gVar3;
        x60.h hVar;
        String str2 = str;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1059031167);
        int i16 = i12 | (sVar.h(bVar) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if (sVar.R(i16 & 1, (i16 & 147) != 146)) {
            x60.h hVar2 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar2 = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar2 = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.l lVar = (x60.l) sVar.j(PantryThemeKt.getLocalPantrySize());
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar2, 1.0f);
            float f12 = mVar2.f44015k;
            float f13 = mVar2.l;
            b4.t tVarB = d2.c.B(tVarD, 0.0f, f12, 1);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            b5.g gVar4 = b5.i.f5843f;
            m3.i.C(i2VarA, gVar4, sVar);
            b5.g gVar5 = b5.i.f5842e;
            m3.i.C(iVarL, gVar5, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar6 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar6);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar7 = b5.i.f5841d;
            m3.i.C(tVarC, gVar7, sVar);
            if (bVar != null) {
                sVar.a0(-1299349423);
                jVar = jVar2;
                dVar = dVar2;
                mVar = mVar2;
                gVar = gVar7;
                qVar = qVar2;
                gVar2 = gVar5;
                i15 = i16;
                v1.n.d(bVar, null, f4.g.b(m2.m(d2.c.z(qVar2, f13), lVar.f43995g), l2.g.f26790a), null, null, 0.0f, null, sVar, 56 | (i16 & 14), 120);
                sVar.q(false);
                hVar = hVar2;
                f11 = f13;
                gVar3 = gVar4;
            } else {
                gVar = gVar7;
                jVar = jVar2;
                qVar = qVar2;
                dVar = dVar2;
                mVar = mVar2;
                gVar2 = gVar5;
                i15 = i16;
                sVar.a0(-1299051761);
                f11 = f13;
                gVar3 = gVar4;
                hVar = hVar2;
                v1.n.d(x0.z(R.drawable.voucher_globe, sVar, 0), null, d2.c.z(m2.m(qVar, lVar.f43995g), f13), null, null, 0.0f, new i4.o(hVar2.J, 5), sVar, 56, 56);
                sVar.q(false);
            }
            d2.c.f(m2.m(qVar, mVar.f44015k), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar3, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar6, sVar, dVar);
            m3.i.C(tVarC2, gVar, sVar);
            i14 = i11;
            x60.j jVar3 = jVar;
            x60.h hVar4 = hVar;
            r9.d(f0.U(sVar, i14), null, hVar4.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar3.f43967q, sVar, 0, 0, 131066);
            d2.c.f(m2.m(qVar, f11), sVar);
            str2 = str;
            i13 = i12;
            r9.d(str2, null, hVar4.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar3.f43966p, sVar, (i15 >> 6) & 14, 0, 131066);
            sVar.q(true);
            sVar.q(true);
        } else {
            i13 = i12;
            i14 = i11;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(bVar, i14, str2, i13);
        }
    }
}
