package vi;

import a3.m3;
import android.graphics.ColorMatrixColorFilter;
import androidx.lifecycle.m1;
import ao.e1;
import ao.g3;
import b4.q;
import b4.t;
import c5.x1;
import cj.e0;
import cn.x;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.CardStatus;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import com.app.tgtg.model.remote.payment.SpecificationLine;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.tgtg.componentlibrary.component.radiobutton.PantryRadioButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.u;
import d2.w;
import d2.y;
import d2.z;
import d6.r;
import g3.d7;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import i4.g0;
import i4.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.v;
import m3.b1;
import m3.g1;
import m3.s;
import m3.w1;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.b0;
import s1.r0;
import s1.y0;
import t1.u1;
import w.a0;
import y80.h1;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f42347a = new u3.d(new tp.a(7), false, -330031819);

    public static final void a(m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(383624484);
        if (sVar.R(i11 & 1, i11 != 0)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            float f11 = mVar.f44015k;
            q qVar = q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            t tVarJ = v1.n.j(d2.c.B(qVar, mVar.f44015k, 0.0f, 2), hVar.B, l2.g.b(kVar.f43980d));
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            float f12 = mVar.l;
            float f13 = mVar.f44017n;
            r9.d(f0.U(sVar, R.string.checkout_view_fee_warning), d2.c.C(qVar, f13, f12, f13, f12), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43962k, sVar, 0, 0, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u60.a(i11, 12);
        }
    }

    public static final void b(cj.q qVar, e0 e0Var, Function0 function0, boolean z11, b1 b1Var, boolean z12, m3.n nVar, int i11) {
        int i12;
        qVar.getClass();
        e0Var.getClass();
        function0.getClass();
        b1Var.getClass();
        s sVar = (s) nVar;
        sVar.c0(501675950);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(e0Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(b1Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z12) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            float f11 = lv.t.f28253g;
            float f12 = lv.t.f28254h;
            q qVar2 = q.f5711a;
            t tVarC = d2.c.C(qVar2, f11, f12, f11, f12);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarC, sVar);
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
            if (qVar.f8334b0) {
                sVar.a0(705583024);
                sVar.q(false);
            } else {
                sVar.a0(705381214);
                p(qVar, e0Var, sVar, i12 & 126);
                b3.i.y(qVar2, f11, sVar, false);
            }
            if (z12) {
                sVar.a0(705640839);
                t tVarE = m2.e(qVar2, lv.t.f28257k);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                h(i12 & 896, z(tVarE.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), b1Var), function0, sVar, !z11);
                sVar.q(false);
            } else {
                sVar.a0(706060486);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                q(z(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), b1Var), !z11, qVar.g(), function0, sVar, (i12 << 3) & 7168);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.b(qVar, e0Var, function0, z11, b1Var, z12, i11);
        }
    }

    public static final void c(cj.q qVar, e0 e0Var, UserAddress userAddress, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, m3.n nVar, int i11) {
        int i12;
        e0 e0Var2;
        Function0 function05;
        Function2 function22;
        Function0 function06 = function0;
        qVar.getClass();
        e0Var.getClass();
        function06.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function2.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1124577798);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            e0Var2 = e0Var;
            i12 |= sVar.h(e0Var2) ? 32 : 16;
        } else {
            e0Var2 = e0Var;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(userAddress) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(str != null ? ParcelDeliveryOptionId.m221boximpl(str) : null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function06) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function02) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            function05 = function04;
            i12 |= sVar.h(function05) ? 8388608 : 4194304;
        } else {
            function05 = function04;
        }
        if ((100663296 & i11) == 0) {
            function22 = function2;
            i12 |= sVar.h(function22) ? 67108864 : 33554432;
        } else {
            function22 = function2;
        }
        if (sVar.R(i12 & 1, (38347923 & i12) != 38347922)) {
            ItemType itemType = ItemType.MANUFACTURER;
            ItemType itemType2 = ItemType.CATERING;
            if (d0.h(itemType, itemType2).contains(qVar.g())) {
                sVar.a0(-1551787692);
                if (qVar.f8334b0) {
                    sVar.a0(-1551779663);
                    int i13 = i12 & 126;
                    int i14 = i12 >> 3;
                    wi.a.g(qVar, e0Var2, str, function06, function02, function03, function05, function22, sVar, (i14 & 29360128) | i13 | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (458752 & i14) | (3670016 & i14));
                    sVar.q(false);
                } else {
                    if (e0Var.o()) {
                        BasicItem basicItemF = qVar.f();
                        if ((basicItemF != null ? basicItemF.getItemType() : null) != itemType2) {
                            sVar.a0(-1551228855);
                            wi.m.c(qVar, e0Var, userAddress, str, function0, function02, function03, function04, function2, sVar, 268435454 & i12);
                            sVar.q(false);
                            sVar = sVar;
                        }
                    }
                    sVar.a0(-1550723090);
                    int i15 = (i12 & 14) | ((i12 >> 3) & 112);
                    int i16 = i12 >> 6;
                    wi.h.d(qVar, userAddress, function0, function02, function03, sVar, i15 | (i16 & 896) | (i16 & 7168) | (i16 & 57344));
                    sVar = sVar;
                    function06 = function0;
                    sVar.q(false);
                    sVar.q(false);
                }
                function06 = function0;
                sVar.q(false);
            } else {
                sVar.a0(-1550436898);
                i(qVar, function06, sVar, ((i12 >> 9) & 112) | (i12 & 14));
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(qVar, e0Var, userAddress, str, function06, function02, function03, function04, function2, i11, 0);
        }
    }

    public static final void d(d7 d7Var, m3.n nVar, int i11) {
        int i12;
        d7 d7Var2;
        d7Var.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1156030553);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(d7Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.i iVar = (x60.i) sVar.j(PantryThemeKt.getLocalPantryShadow());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            d7Var2 = d7Var;
            s0.b(f4.g.g(d2.c.A(q.f5711a, mVar.f44015k, mVar.f44014j), l2.g.b(kVar.l), iVar.f43950a), l2.g.b(kVar.l), s0.p(hVar.G, sVar, 0), null, null, u3.e.e(1505920537, sVar, new x(25, mVar, d7Var2, jVar, hVar)), sVar, 196608, 24);
        } else {
            d7Var2 = d7Var;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(d7Var2, i11, 26);
        }
    }

    public static final void e(cj.q qVar, m3.n nVar, int i11) {
        int i12;
        qVar.getClass();
        g3 g3Var = qVar.f8333b;
        s sVar = (s) nVar;
        sVar.c0(-599566209);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            if (g3Var.n().getBankTransactionFee() != null) {
                sVar.a0(1092158666);
                a(sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(1092182691);
                sVar.q(false);
            }
            if (g3Var.n().getShowCardIssueWarning()) {
                sVar.a0(1092227424);
                f(sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(1092261059);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(qVar, i11, 0);
        }
    }

    public static final void f(m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1186167172);
        if (sVar.R(i11 & 1, i11 != 0)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            float f11 = mVar.f44015k;
            q qVar = q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            t tVarJ = v1.n.j(d2.c.B(qVar, mVar.f44015k, 0.0f, 2), hVar.f43949z, l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43980d));
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            float f12 = mVar.l;
            float f13 = mVar.f44017n;
            r9.d(f0.U(sVar, R.string.checkout_view_3ds_warning), d2.c.C(qVar, f13, f12, f13, f12), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 0, 0, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u60.a(i11, 13);
        }
    }

    public static final void g(boolean z11, Price price, m3.n nVar, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(1756098143);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(price) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            float f11 = mVar.l;
            q qVar = q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar2);
            sVar = sVar2;
            r9.d(f0.T(R.string.edenred_daily_balance, new Object[]{mv.d.i(price, 1)}, sVar2), d2.c.A(v1.n.j(m2.d(qVar, 1.0f), z11 ? hVar.B : hVar.f43915f, l2.g.b(((x60.k) sVar2.j(PantryThemeKt.getLocalPantryRadius())).f43978b)), mVar.f44017n, mVar.l), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, ((x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography())).f43960i, sVar, 0, 0, 130044);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e.p(z11, price, i11, 4);
        }
    }

    public static final void h(int i11, t tVar, Function0 function0, m3.n nVar, boolean z11) {
        int i12;
        s sVar;
        tVar.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1725668027);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function0) ? 256 : 128;
        }
        int i13 = i12;
        if (sVar2.R(i13 & 1, (i13 & 147) != 146)) {
            l2.f fVarB = l2.g.b(100);
            b2 b2Var = g3.p.f19253a;
            int i14 = i13 << 3;
            s0.a(function0, tVar, z11, fVarB, g3.p.a(lv.s.f28216a0, 0L, 0L, 0L, sVar2, 14), null, null, null, null, f42347a, sVar2, ((i13 >> 6) & 14) | 805306368 | (i14 & 112) | (i14 & 896), 480);
            sVar = sVar2;
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.g(tVar, z11, function0, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0363  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(cj.q r48, kotlin.jvm.functions.Function0 r49, m3.n r50, int r51) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.c.i(cj.q, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final void j(PaymentMethods paymentMethods, boolean z11, m3.n nVar, int i11) {
        int i12;
        i4.x xVar;
        paymentMethods.getClass();
        s sVar = (s) nVar;
        sVar.c0(1849410383);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(paymentMethods) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            if (z11) {
                float[] fArrL = g0.l();
                g0.x(0.0f, fArrL);
                xVar = new i4.x(new ColorMatrixColorFilter(fArrL));
                xVar.f23331b = fArrL;
            } else {
                xVar = null;
            }
            i4.x xVar2 = xVar;
            t tVarR = g0.r(m2.n(q.f5711a, 54, 29), 0.0f, 0.0f, z11 ? 0.38f : 1.0f, 0.0f, 0L, null, 524283);
            PaymentType paymentType = paymentMethods.getPaymentType();
            v1.n.d(x0.z(paymentType != null ? paymentType.getIconResId() : 2131231573, sVar, 0), null, tVarR, null, null, 0.0f, xVar2, sVar, 56, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e.p(paymentMethods, z11, i11, 5);
        }
    }

    public static final void k(t tVar, k0 k0Var, m3.n nVar, int i11) {
        t tVar2;
        s sVar = (s) nVar;
        sVar.c0(-266701858);
        int i12 = i11 | 6 | (sVar.f(k0Var) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
            int i13 = i11 & 1;
            q qVar = q.f5711a;
            if (i13 == 0 || sVar.z()) {
                tVar2 = qVar;
            } else {
                sVar.U();
                tVar2 = tVar;
            }
            sVar.r();
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.l lVar = (x60.l) sVar.j(PantryThemeKt.getLocalPantrySize());
            t tVarD = m2.d(tVar2, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            t tVarN = m2.n(qVar, 54, 29);
            float f11 = kVar.f43981e;
            float f12 = kVar.f43979c;
            p.a(v1.n.i(f4.g.b(tVarN, l2.g.b(f11)), k0Var, 0.0f, 6), sVar, 0);
            d2.c.f(m2.m(qVar, mVar.f44017n), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            p.a(v1.n.i(f4.g.b(m2.e(new n1(1.0f, true), lVar.f43999k), l2.g.b(f12)), k0Var, 0.0f, 6), sVar, 0);
            d2.c.f(m2.m(qVar, mVar.f44017n), sVar);
            p.a(v1.n.i(f4.g.b(m2.m(qVar, lVar.f43995g), l2.g.b(f12)), k0Var, 0.0f, 6), sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(tVar2, k0Var, i11, 1);
        }
    }

    public static final void l(cj.q qVar, PaymentMethods paymentMethods, boolean z11, PaymentType paymentType, m3.n nVar, int i11) {
        int i12;
        cj.q qVar2;
        String str;
        long j9;
        boolean z12;
        cj.q qVar3 = qVar;
        s sVar = (s) nVar;
        sVar.c0(-838732284);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar3) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(paymentMethods) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.d(paymentType == null ? -1 : paymentType.ordinal()) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            if (paymentMethods != null) {
                sVar.a0(1446598780);
                v(qVar3, paymentMethods, z11, sVar, i12 & 1022);
                sVar.q(false);
                qVar2 = qVar3;
            } else {
                sVar.a0(1446849105);
                b1 b1VarN = m3.i.n(qVar3.f8351m, sVar, 0);
                y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                q qVar4 = q.f5711a;
                t tVarC = b4.a.c(qVar4, sVar);
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
                sVar.a0(1123407376);
                Iterator it = ((List) b1VarN.getValue()).iterator();
                while (it.hasNext()) {
                    PaymentMethods paymentMethods2 = (PaymentMethods) it.next();
                    boolean zN = qVar3.n(paymentMethods2);
                    ProviderType providerType = paymentMethods2.getProviderType();
                    ProviderType providerType2 = ProviderType.EDENRED_SAVED_PAYMENT;
                    boolean z13 = providerType == providerType2 && !zN;
                    Iterator it2 = it;
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    t tVarC2 = b4.a.c(qVar4, sVar);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar3);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar);
                    j(paymentMethods2, z13, sVar, 0);
                    d2.c.f(m2.m(qVar4, mVar.f44017n), sVar);
                    String strY = y(paymentMethods2, sVar);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    n1 n1Var = new n1(1.0f, true);
                    m5.u0 u0Var = jVar.f43958g;
                    if (z11 || z13) {
                        str = strY;
                        j9 = hVar.V;
                    } else {
                        str = strY;
                        j9 = hVar.J;
                    }
                    s sVar2 = sVar;
                    x60.m mVar2 = mVar;
                    boolean z14 = z13;
                    q qVar5 = qVar4;
                    x60.j jVar2 = jVar;
                    x60.h hVar4 = hVar;
                    r9.d(str, n1Var, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 0, 0, 131064);
                    sVar = sVar2;
                    boolean z15 = paymentType == paymentMethods2.getPaymentType() && !z11;
                    boolean z16 = (z11 || z14) ? false : true;
                    boolean zH = sVar.h(qVar) | sVar.h(paymentMethods2);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new us.j(5, qVar, paymentMethods2);
                        sVar.k0(objM);
                    }
                    PantryRadioButtonKt.PantryRadioButton(z15, (Function0) objM, qVar5, z16, sVar, MLKEMEngine.KyberPolyBytes, 0);
                    sVar.q(true);
                    if (paymentMethods2.getProviderType() == providerType2) {
                        sVar.a0(1214899774);
                        Price availableAmount = paymentMethods2.getAvailableAmount();
                        if (availableAmount == null) {
                            sVar.a0(-992812669);
                            z12 = false;
                            sVar.q(false);
                        } else {
                            z12 = false;
                            sVar.a0(-992812668);
                            g(zN, availableAmount, sVar, 0);
                            sVar.q(false);
                        }
                        sVar.q(z12);
                    } else {
                        sVar.a0(-992580509);
                        sVar.q(false);
                    }
                    hVar = hVar4;
                    jVar = jVar2;
                    qVar3 = qVar;
                    it = it2;
                    mVar = mVar2;
                    qVar4 = qVar5;
                }
                qVar2 = qVar3;
                e0.f.D(sVar, false, true, false);
            }
        } else {
            qVar2 = qVar3;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(qVar2, paymentMethods, z11, paymentType, i11, 10);
        }
    }

    public static final void m(final PriceSpecification priceSpecification, m3.n nVar, final int i11) {
        final int i12;
        float f11;
        s sVar = (s) nVar;
        sVar.c0(2127352984);
        int i13 = (sVar.h(priceSpecification) ? 4 : 2) | i11;
        final int i14 = 0;
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            if (priceSpecification == null) {
                sVar.a0(-564433738);
                n(null, lp.d.v(sVar), sVar, 0);
                sVar.q(false);
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    w1VarS.f29476d = new Function2(priceSpecification, i11, i14) { // from class: vi.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f42359a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ PriceSpecification f42360b;

                        {
                            this.f42359a = i14;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = this.f42359a;
                            m3.n nVar2 = (m3.n) obj;
                            ((Integer) obj2).getClass();
                            switch (i15) {
                                case 0:
                                    c.m(this.f42360b, nVar2, m3.i.F(1));
                                    break;
                                default:
                                    c.m(this.f42360b, nVar2, m3.i.F(1));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    return;
                }
                return;
            }
            sVar.a0(-564322262);
            sVar.q(false);
            float f12 = mVar.f44015k;
            float f13 = mVar.l;
            q qVar = q.f5711a;
            t tVarA = b0.a(d2.c.A(qVar, f12, f13), null, 3);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
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
            float f14 = f13;
            t tVarZ = d2.c.z(v1.n.j(qVar, hVar.f43907b, l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43980d)), mVar.f44015k);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            y yVarA2 = w.a(dVar, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            sVar.a0(-2087973182);
            for (SpecificationLine specificationLine : priceSpecification.getSpecificationLines()) {
                String displayValue = specificationLine.getDisplayValue();
                if (displayValue == null) {
                    sVar.a0(-1646296856);
                    sVar.q(false);
                    f11 = f14;
                } else {
                    sVar.a0(-1646296855);
                    o(displayValue, mv.d.i(specificationLine.getAmount(), 1), null, 0L, sVar, 0, 12);
                    f11 = f14;
                    b3.i.y(qVar, f11, sVar, false);
                }
                f14 = f11;
            }
            sVar.q(false);
            i12 = 1;
            o(f0.U(sVar, R.string.checkout_view_label_total_amount), mv.d.i(priceSpecification.getTotal(), 1), jVar.f43959h, hVar.J, sVar, 0, 0);
            e0.f.D(sVar, true, true, true);
        } else {
            i12 = 1;
            sVar.U();
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            w1VarS2.f29476d = new Function2(priceSpecification, i11, i12) { // from class: vi.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f42359a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PriceSpecification f42360b;

                {
                    this.f42359a = i12;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f42359a;
                    m3.n nVar2 = (m3.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            c.m(this.f42360b, nVar2, m3.i.F(1));
                            break;
                        default:
                            c.m(this.f42360b, nVar2, m3.i.F(1));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void n(t tVar, k0 k0Var, m3.n nVar, int i11) {
        t tVar2;
        t tVar3;
        s sVar = (s) nVar;
        sVar.c0(-300138706);
        int i12 = i11 | 6 | (sVar.f(k0Var) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
            int i13 = i11 & 1;
            q qVar = q.f5711a;
            if (i13 == 0 || sVar.z()) {
                tVar3 = qVar;
            } else {
                sVar.U();
                tVar3 = tVar;
            }
            sVar.r();
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            x60.l lVar = (x60.l) sVar.j(PantryThemeKt.getLocalPantrySize());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            float f11 = mVar.f44015k;
            float f12 = mVar.l;
            t tVarD = m2.d(d2.c.A(tVar3, f11, f12), 1.0f);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            t tVar4 = tVar3;
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
            long j9 = hVar.f43907b;
            float f13 = kVar.f43980d;
            float f14 = kVar.f43979c;
            t tVarZ = d2.c.z(v1.n.j(qVar, j9, l2.g.b(f13)), mVar.f44015k);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            y yVarA2 = w.a(dVar, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            t tVarD2 = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5692j, sVar, 6);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC4, gVar4, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            p.a(v1.n.i(f4.g.b(m2.e(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), lVar.f43999k), l2.g.b(f14)), k0Var, 0.0f, 6), sVar, 0);
            d2.c.f(m2.m(qVar, f12), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            p.a(v1.n.i(f4.g.b(m2.e(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), lVar.f43995g), l2.g.b(f14)), k0Var, 0.0f, 6), sVar, 0);
            sVar.q(true);
            sVar.q(true);
            sVar.q(true);
            sVar.q(true);
            tVar2 = tVar4;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(tVar2, k0Var, i11, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final java.lang.String r25, final java.lang.String r26, m5.u0 r27, long r28, m3.n r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.c.o(java.lang.String, java.lang.String, m5.u0, long, m3.n, int, int):void");
    }

    public static final void p(final cj.q qVar, e0 e0Var, m3.n nVar, int i11) {
        int i12;
        Object e1Var;
        int userPurchaseLimit;
        BasicItem basicItemF;
        qVar.getClass();
        e0Var.getClass();
        s sVar = (s) nVar;
        sVar.c0(420972603);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(e0Var) ? 32 : 16;
        }
        final int i13 = 1;
        final int i14 = 0;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b1 b1VarN = m3.i.n(qVar.f8359u, sVar, 0);
            Integer numValueOf = Integer.valueOf(((Number) b1VarN.getValue()).intValue());
            boolean zH = sVar.h(qVar) | sVar.h(e0Var) | sVar.f(b1VarN);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            x70.c cVar = null;
            if (zH || objM == fVar) {
                e1Var = new e1(qVar, e0Var, b1VarN, cVar, 21);
                sVar.k0(e1Var);
            } else {
                e1Var = objM;
            }
            m3.i.h(numValueOf, (Function2) e1Var, sVar);
            long j9 = lv.s.I;
            l2.f fVarB = l2.g.b(44);
            q qVar2 = q.f5711a;
            t tVarE = m2.e(v1.n.j(qVar2, j9, fVarB), lv.t.f28257k);
            float f11 = lv.t.f28251e;
            t tVarD = d2.c.D(tVarE, f11, 0.0f, f11, 0.0f, 10);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            boolean z11 = ((Number) b1VarN.getValue()).intValue() > 1;
            j5.j jVar = new j5.j(0);
            boolean zH2 = sVar.h(qVar);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new Function0() { // from class: vi.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                cj.q qVar3 = qVar;
                                qVar3.getClass();
                                v80.f0.B(m1.d(qVar3), null, null, new cj.b(qVar3, (x70.c) null, 1), 3);
                                break;
                            default:
                                cj.q qVar4 = qVar;
                                qVar4.getClass();
                                v80.f0.B(m1.d(qVar4), null, null, new cj.b(qVar4, (x70.c) null, 0), 3);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM2);
            }
            v1.n.d(x0.z(R.drawable.quantity_remove, sVar, 0), f0.U(sVar, R.string.voice_over_quantity_selector_minus), androidx.compose.foundation.b.c(qVar2, z11, null, jVar, (Function0) objM2, 10), null, null, 0.0f, new i4.o(z11 ? lv.s.C : lv.s.G, 5), sVar, 8, 56);
            String strValueOf = String.valueOf(((Number) b1VarN.getValue()).intValue());
            m5.u0 u0VarA = m5.u0.a(v.f28281u, 0L, 0L, null, null, 0L, null, 1, 0L, null, null, 16744447);
            long j11 = lv.s.C;
            r9.d(strValueOf, d2.c.B(qVar2, lv.t.f28252f, 0.0f, 2), j11, 0L, null, 0L, null, new x5.k(1), 0L, 0, false, 0, 0, null, u0VarA, sVar, 432, 0, 130040);
            sVar = sVar;
            int iIntValue = ((Number) b1VarN.getValue()).intValue();
            BasicItem basicItemF2 = qVar.f();
            if ((basicItemF2 != null ? Integer.valueOf(basicItemF2.getUserPurchaseLimit()) : null) == null || ((basicItemF = qVar.f()) != null && basicItemF.getUserPurchaseLimit() == 0)) {
                userPurchaseLimit = 10000;
            } else {
                BasicItem basicItemF3 = qVar.f();
                basicItemF3.getClass();
                userPurchaseLimit = basicItemF3.getUserPurchaseLimit();
            }
            BasicItem basicItemF4 = qVar.f();
            boolean z12 = iIntValue < Math.min(userPurchaseLimit, basicItemF4 != null ? basicItemF4.getItemsAvailable() : 0);
            j5.j jVar2 = new j5.j(0);
            boolean zH3 = sVar.h(qVar);
            Object objM3 = sVar.M();
            if (zH3 || objM3 == fVar) {
                objM3 = new Function0() { // from class: vi.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                cj.q qVar3 = qVar;
                                qVar3.getClass();
                                v80.f0.B(m1.d(qVar3), null, null, new cj.b(qVar3, (x70.c) null, 1), 3);
                                break;
                            default:
                                cj.q qVar4 = qVar;
                                qVar4.getClass();
                                v80.f0.B(m1.d(qVar4), null, null, new cj.b(qVar4, (x70.c) null, 0), 3);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM3);
            }
            t tVarC2 = androidx.compose.foundation.b.c(qVar2, z12, null, jVar2, (Function0) objM3, 10);
            n4.b bVarZ = x0.z(R.drawable.quantity_add, sVar, 0);
            if (!z12) {
                j11 = lv.s.G;
            }
            v1.n.d(bVarZ, f0.U(sVar, R.string.voice_over_quantity_selector_plus), tVarC2, null, null, 0.0f, new i4.o(j11, 5), sVar, 8, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(qVar, e0Var, i11, 11);
        }
    }

    public static final void q(t tVar, boolean z11, ItemType itemType, Function0 function0, m3.n nVar, int i11) {
        t tVar2;
        int i12;
        ItemType itemType2;
        s sVar;
        tVar.getClass();
        itemType.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(637191247);
        if ((i11 & 6) == 0) {
            tVar2 = tVar;
            i12 = (sVar2.f(tVar2) ? 4 : 2) | i11;
        } else {
            tVar2 = tVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.d(itemType.ordinal()) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            itemType2 = itemType;
            sVar = sVar2;
            v0.n.l(tVar2, f0.U(sVar2, itemType2 == ItemType.MANUFACTURER ? R.string.mnu_checkout_overview_pay_btn : R.string.checkout_reserve_button), null, null, lv.e.LARGE, z11, false, null, null, function0, sVar, (i12 & 14) | 24576 | ((i12 << 12) & 458752) | ((i12 << 18) & 1879048192), 460);
        } else {
            itemType2 = itemType;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(tVar, z11, itemType2, function0, i11, 9);
        }
    }

    public static final void r(m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1413193207);
        if (sVar.R(i11 & 1, i11 != 0)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(new z5.l(0L));
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            k0 k0VarI = qb.e.I(d0.h(new i4.v(lv.s.R), new i4.v(lv.s.J)), 0.0f, (int) (((z5.l) b1Var.getValue()).f47286a & 4294967295L), 8);
            q qVar = q.f5711a;
            t tVarI = v1.n.i(qVar, k0VarI, 0.0f, 6);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new sn.c(b1Var, 4);
                sVar.k0(objM2);
            }
            t tVarO = c0.o(tVarI, (Function1) objM2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarO, sVar);
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
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            d2.c.f(m2.m(qVar, mVar.f44017n), sVar);
            t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.checkout_scroll_to_reserve), null, hVar.Y, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43959h, sVar, 0, 0, 131066);
            sVar = sVar;
            v1.n.d(x0.z(R.drawable.double_arrow_down, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            sVar.q(true);
            b3.i.y(qVar, mVar.f44014j, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u60.a(i11, 14);
        }
    }

    public static final void s(w6 w6Var, final cj.q qVar, final Function0 function0, final float f11, m3.n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        qVar.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(348362075);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(qVar) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.c(f11) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            x60.k kVar = (x60.k) sVar2.j(PantryThemeKt.getLocalPantryRadius());
            final long j9 = ((x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor())).J;
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            final x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            b1 b1VarN = m3.i.n(qVar.f8351m, sVar2, 0);
            List list = (List) b1VarN.getValue();
            final ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                PaymentMethods paymentMethods = (PaymentMethods) obj;
                x60.m mVar2 = mVar;
                if (paymentMethods.getProviderType() == ProviderType.ADYEN_SAVED_PAYMENT || paymentMethods.getProviderType() == ProviderType.EDENRED_SAVED_PAYMENT) {
                    arrayList.add(obj);
                }
                mVar = mVar2;
            }
            final x60.m mVar3 = mVar;
            List list2 = (List) b1VarN.getValue();
            final ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                PaymentMethods paymentMethods2 = (PaymentMethods) next;
                Iterator it2 = it;
                if (paymentMethods2.getProviderType() != ProviderType.ADYEN_SAVED_PAYMENT && paymentMethods2.getProviderType() != ProviderType.EDENRED_SAVED_PAYMENT) {
                    arrayList2.add(next);
                }
                it = it2;
            }
            Unit unit = Unit.f26487a;
            boolean zH = sVar2.h(qVar) | sVar2.f(b1VarN);
            Object objM = sVar2.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new rf.c(qVar, b1VarN, null, 17);
                sVar2.k0(objM);
            }
            m3.i.h(unit, (Function2) objM, sVar2);
            float f12 = kVar.f43977a;
            sVar = sVar2;
            v3.a(function0, null, w6Var, 0.0f, false, l2.g.c(f12, f12, 0.0f, 0.0f, 12), ((x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor())).G, 0L, 0.0f, 0L, null, null, null, u3.e.e(-414764611, sVar2, new i80.n() { // from class: vi.i
                @Override // i80.n
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    final cj.q qVar2;
                    float f13;
                    b4.i iVar;
                    m5.u0 u0Var;
                    m3.n nVar2 = (m3.n) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    b4.i iVar2 = b4.d.f5694m;
                    ((z) obj2).getClass();
                    s sVar3 = (s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x60.m mVar4 = mVar3;
                        float f14 = mVar4.f44015k;
                        float f15 = mVar4.f44017n;
                        float f16 = mVar4.f44014j;
                        q qVar3 = q.f5711a;
                        t tVarC = d2.c.C(qVar3, f14, f14, f14, f11);
                        d2.d dVar = d2.i.f13803c;
                        y yVarA = w.a(dVar, iVar2, sVar3, 0);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC2 = b4.a.c(tVarC, sVar3);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        b5.g gVar = b5.i.f5843f;
                        m3.i.C(yVarA, gVar, sVar3);
                        b5.g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL, gVar2, sVar3);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b5.g gVar3 = b5.i.f5844g;
                        m3.i.v(sVar3, numValueOf, gVar3);
                        b5.d dVar2 = b5.i.f5845h;
                        m3.i.z(sVar3, dVar2);
                        b5.g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC2, gVar4, sVar3);
                        t tVarD = m2.d(qVar3, 1.0f);
                        u0 u0VarD = p.d(b4.d.f5683a, false);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        u3.i iVarL2 = sVar3.l();
                        float f17 = f15;
                        t tVarC3 = b4.a.c(tVarD, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(u0VarD, gVar, sVar3);
                        m3.i.C(iVarL2, gVar2, sVar3);
                        a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar2);
                        m3.i.C(tVarC3, gVar4, sVar3);
                        b4.k kVar2 = b4.d.f5687e;
                        u uVar = u.f13938a;
                        t tVarA = uVar.a(qVar3, kVar2);
                        String strU = f0.U(sVar3, R.string.checkout_pay_with_no_selected_payment);
                        x60.j jVar2 = jVar;
                        m5.u0 u0Var2 = jVar2.f43957f;
                        m5.u0 u0Var3 = jVar2.f43967q;
                        long j11 = j9;
                        r9.d(strU, tVarA, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar3, 0, 0, 131064);
                        long j12 = j11;
                        t tVarB = d2.c.B(uVar.a(qVar3, b4.d.f5688f), f14, 0.0f, 2);
                        j5.j jVar3 = new j5.j(0);
                        final Function0 function02 = function0;
                        boolean zF = sVar3.f(function02);
                        Object objM2 = sVar3.M();
                        m3.f fVar = m3.m.f29332a;
                        if (zF || objM2 == fVar) {
                            objM2 = new rr.a(28, function02);
                            sVar3.k0(objM2);
                        }
                        v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar3, 0), f0.U(sVar3, R.string.voice_over_close), androidx.compose.foundation.b.c(tVarB, false, null, jVar3, (Function0) objM2, 11), null, null, 0.0f, null, sVar3, 8, 120);
                        s sVar4 = sVar3;
                        sVar4.q(true);
                        ArrayList<PaymentMethods> arrayList3 = arrayList;
                        boolean zIsEmpty = arrayList3.isEmpty();
                        cj.q qVar4 = qVar;
                        if (zIsEmpty) {
                            qVar2 = qVar4;
                            f13 = f17;
                            iVar = iVar2;
                            u0Var = u0Var3;
                            sVar4.a0(-1823568977);
                            sVar4.q(false);
                        } else {
                            r8.k.t(f16, -1824659712, qVar3, sVar4, sVar4);
                            qVar2 = qVar4;
                            u0Var = u0Var3;
                            r9.d(f0.U(sVar4, R.string.saved_payment_options_title), null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar4, 0, 0, 131066);
                            j12 = j12;
                            sVar4 = sVar4;
                            iVar = iVar2;
                            y yVarA2 = w.a(dVar, iVar, sVar4, 0);
                            int iHashCode3 = Long.hashCode(sVar4.T);
                            u3.i iVarL3 = sVar4.l();
                            t tVarC4 = b4.a.c(qVar3, sVar4);
                            sVar4.e0();
                            if (sVar4.S) {
                                sVar4.k(hVar);
                            } else {
                                sVar4.n0();
                            }
                            m3.i.C(yVarA2, gVar, sVar4);
                            m3.i.C(iVarL3, gVar2, sVar4);
                            a0.y(iHashCode3, sVar4, gVar3, sVar4, dVar2);
                            m3.i.C(tVarC4, gVar4, sVar4);
                            sVar4.a0(1725003345);
                            for (PaymentMethods paymentMethods3 : arrayList3) {
                                boolean zN = qVar2.n(paymentMethods3);
                                boolean z11 = paymentMethods3.getProviderType() == ProviderType.EDENRED_SAVED_PAYMENT && !zN;
                                float f18 = f17;
                                d2.c.f(m2.m(qVar3, f18), sVar4);
                                boolean zH2 = sVar4.h(qVar2) | sVar4.f(function02);
                                Object objM3 = sVar4.M();
                                if (zH2 || objM3 == fVar) {
                                    final int i13 = 0;
                                    objM3 = new Function1() { // from class: vi.j
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            PaymentMethods paymentMethods4 = (PaymentMethods) obj5;
                                            switch (i13) {
                                                case 0:
                                                    paymentMethods4.getClass();
                                                    qVar2.q(paymentMethods4);
                                                    function02.invoke();
                                                    break;
                                                default:
                                                    paymentMethods4.getClass();
                                                    qVar2.q(paymentMethods4);
                                                    function02.invoke();
                                                    break;
                                            }
                                            return Unit.f26487a;
                                        }
                                    };
                                    sVar4.k0(objM3);
                                }
                                c.t(paymentMethods3, zN, z11, (Function1) objM3, sVar4, 0, 0);
                                f17 = f18;
                            }
                            f13 = f17;
                            e0.f.D(sVar4, false, true, false);
                        }
                        s sVar5 = sVar4;
                        r9.d(r8.k.f(f16, R.string.payment_options_title, qVar3, sVar4, sVar4), null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar5, 0, 0, 131066);
                        d2.c.f(m2.m(qVar3, f13), sVar5);
                        y yVarA3 = w.a(d2.i.f13803c, iVar, sVar5, 0);
                        int iHashCode4 = Long.hashCode(sVar5.T);
                        u3.i iVarL4 = sVar5.l();
                        t tVarC5 = b4.a.c(qVar3, sVar5);
                        b5.j.R.getClass();
                        b5.h hVar2 = b5.i.f5839b;
                        sVar5.e0();
                        if (sVar5.S) {
                            sVar5.k(hVar2);
                        } else {
                            sVar5.n0();
                        }
                        m3.i.C(yVarA3, b5.i.f5843f, sVar5);
                        m3.i.C(iVarL4, b5.i.f5842e, sVar5);
                        m3.i.v(sVar5, Integer.valueOf(iHashCode4), b5.i.f5844g);
                        m3.i.z(sVar5, b5.i.f5845h);
                        m3.i.C(tVarC5, b5.i.f5841d, sVar5);
                        sVar5.a0(-863344807);
                        for (PaymentMethods paymentMethods4 : arrayList2) {
                            boolean zH3 = sVar5.h(qVar2) | sVar5.f(function02);
                            Object objM4 = sVar5.M();
                            if (zH3 || objM4 == fVar) {
                                final int i14 = 1;
                                objM4 = new Function1() { // from class: vi.j
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        PaymentMethods paymentMethods42 = (PaymentMethods) obj5;
                                        switch (i14) {
                                            case 0:
                                                paymentMethods42.getClass();
                                                qVar2.q(paymentMethods42);
                                                function02.invoke();
                                                break;
                                            default:
                                                paymentMethods42.getClass();
                                                qVar2.q(paymentMethods42);
                                                function02.invoke();
                                                break;
                                        }
                                        return Unit.f26487a;
                                    }
                                };
                                sVar5.k0(objM4);
                            }
                            c.t(paymentMethods4, false, false, (Function1) objM4, sVar5, 0, 6);
                            d2.c.f(m2.m(qVar3, f14), sVar5);
                        }
                        e0.f.D(sVar5, false, true, true);
                        d2.c.f(m2.m(qVar3, f16), sVar5);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, ((i12 >> 6) & 14) | ((i12 << 6) & 896), 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p9.f(w6Var, qVar, function0, f11, i11);
        }
    }

    public static final void t(PaymentMethods paymentMethods, boolean z11, boolean z12, Function1 function1, m3.n nVar, int i11, int i12) {
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        s sVar;
        boolean z15;
        boolean z16;
        x60.h hVar;
        long j9;
        boolean z17;
        boolean z18;
        s sVar2 = (s) nVar;
        sVar2.c0(1693727990);
        int i15 = i11 | (sVar2.h(paymentMethods) ? 4 : 2);
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 = i15 | 48;
            z13 = z11;
        } else {
            z13 = z11;
            i13 = i15 | (sVar2.g(z13) ? 32 : 16);
        }
        int i17 = i12 & 4;
        if (i17 != 0) {
            i14 = i13 | MLKEMEngine.KyberPolyBytes;
            z14 = z12;
        } else {
            z14 = z12;
            i14 = i13 | (sVar2.g(z14) ? 256 : 128);
        }
        int i18 = i14 | (sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i18 & 1, (i18 & 1171) != 1170)) {
            boolean z19 = i16 != 0 ? true : z13;
            boolean z21 = i17 != 0 ? false : z14;
            x60.h hVar2 = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar2);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar3);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            t tVarD = m2.d(qVar, 1.0f);
            boolean z22 = !z21;
            boolean z23 = z19;
            j5.j jVar2 = new j5.j(0);
            boolean zH = ((i18 & 7168) == 2048) | sVar2.h(paymentMethods);
            Object objM = sVar2.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new us.j(7, function1, paymentMethods);
                sVar2.k0(objM);
            }
            t tVarC2 = androidx.compose.foundation.b.c(tVarD, z22, null, jVar2, (Function0) objM, 10);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC3 = b4.a.c(tVarC2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar3);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC3, gVar4, sVar2);
            int i19 = i18 >> 3;
            j(paymentMethods, z21, sVar2, (i18 & 14) | (i19 & 112));
            float f11 = mVar.l;
            d2.c.f(m2.m(qVar, f11), sVar2);
            String strY = y(paymentMethods, sVar2);
            m5.u0 u0Var = ((x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography())).f43958g;
            if (z21) {
                hVar = hVar2;
                j9 = hVar.V;
            } else {
                hVar = hVar2;
                j9 = hVar.J;
            }
            boolean z24 = z21;
            x60.h hVar4 = hVar;
            r9.d(strY, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 0, 0, 131066);
            sVar = sVar2;
            if (paymentMethods.getCardStatus() == CardStatus.EXPIRED) {
                r8.k.t(f11, 873071306, qVar, sVar, sVar);
                String strU = f0.U(sVar, R.string.payment_methods_toolbar_expired_title);
                m5.u0 u0Var2 = jVar.f43961j;
                long j11 = hVar4.L;
                t tVarJ = v1.n.j(qVar, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).f43915f, l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43985i));
                float f12 = mVar.f44016m;
                r9.d(strU, d2.c.C(tVarJ, f11, f12, f11, f12), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 0, 0, 131064);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(873928518);
                sVar.q(false);
            }
            sVar.q(true);
            if (paymentMethods.getProviderType() == ProviderType.EDENRED_SAVED_PAYMENT) {
                sVar.a0(-775712457);
                Price availableAmount = paymentMethods.getAvailableAmount();
                if (availableAmount == null) {
                    sVar.a0(1722717610);
                    z18 = false;
                    sVar.q(false);
                    z17 = z23;
                } else {
                    z18 = false;
                    sVar.a0(1722717611);
                    z17 = z23;
                    g(z17, availableAmount, sVar, i19 & 14);
                    sVar.q(false);
                }
                sVar.q(z18);
            } else {
                z17 = z23;
                sVar.a0(1722903394);
                sVar.q(false);
            }
            sVar.q(true);
            z16 = z24;
            z15 = z17;
        } else {
            sVar = sVar2;
            sVar.U();
            z15 = z13;
            z16 = z14;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.a(paymentMethods, z15, z16, function1, i11, i12);
        }
    }

    public static final void u(cj.q qVar, boolean z11, Function0 function0, m3.n nVar, int i11) {
        int i12;
        Function0 function02;
        boolean z12;
        qVar.getClass();
        h1 h1Var = qVar.f8353o;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1515777598);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            PaymentMethods paymentMethods = (PaymentMethods) m3.i.n(h1Var, sVar, 0).getValue();
            PaymentType paymentType = paymentMethods != null ? paymentMethods.getPaymentType() : null;
            b1 b1VarN = m3.i.n(qVar.G, sVar, 0);
            b1 b1VarN2 = m3.i.n(h1Var, sVar, 0);
            float f11 = mVar.f44015k;
            float f12 = mVar.l;
            q qVar2 = q.f5711a;
            t tVarD = m2.d(d2.c.B(v1.n.k(d2.c.A(qVar2, f11, f12), ((x60.a) sVar.j(PantryThemeKt.getLocalPantryBorder())).f43895b, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).f43922i0, l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43977a)), 0.0f, f11, 1), 1.0f);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            t tVarB = d2.c.B(qVar2, f11, 0.0f, 2);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int i13 = i12;
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarB, sVar);
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
            r9.d(f0.U(sVar, R.string.checkout_label_payment_method), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43967q, sVar, 0, 0, 131066);
            d2.c.f(m2.m(qVar2, f12), sVar);
            if (((Boolean) b1VarN.getValue()).booleanValue()) {
                sVar.a0(-480791698);
                boolean z13 = !z11;
                j5.j jVar2 = new j5.j(0);
                boolean z14 = (i13 & 896) == 256;
                Object objM = sVar.M();
                if (z14 || objM == m3.m.f29332a) {
                    function02 = function0;
                    objM = new rr.a(27, function02);
                    sVar.k0(objM);
                } else {
                    function02 = function0;
                }
                t tVarC3 = androidx.compose.foundation.b.c(qVar2, z13, null, jVar2, (Function0) objM, 10);
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                t tVarC4 = b4.a.c(tVarC3, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                m3.i.C(i2VarA, gVar, sVar);
                m3.i.C(iVarL3, gVar2, sVar);
                a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
                m3.i.C(tVarC4, gVar4, sVar);
                sVar = sVar;
                z12 = true;
                l(qVar, (PaymentMethods) b1VarN2.getValue(), z11, paymentType, sVar, (i13 & 14) | ((i13 << 3) & 896));
                sVar.q(true);
                sVar.q(false);
            } else {
                sVar.a0(-480942079);
                k(null, lp.d.v(sVar), sVar, 0);
                sVar.q(false);
                function02 = function0;
                sVar = sVar;
                z12 = true;
            }
            sVar.q(z12);
            sVar.q(z12);
        } else {
            function02 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(i11, 11, qVar, function02, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(cj.q r19, com.app.tgtg.model.remote.payment.PaymentMethods r20, final boolean r21, m3.n r22, int r23) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.c.v(cj.q, com.app.tgtg.model.remote.payment.PaymentMethods, boolean, m3.n, int):void");
    }

    public static final void w(final b1 b1Var, final z4.z zVar, Function0 function0, m3.n nVar, int i11) {
        s sVar;
        b1Var.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(230819029);
        int i12 = i11 | (sVar2.h(zVar) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            final x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            final x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            final z5.c cVar = (z5.c) sVar2.j(x1.f7416h);
            float fC0 = cVar.c0(mVar.l);
            final float fC02 = cVar.c0(mVar.f44017n);
            final float fC03 = cVar.c0(mVar.f44014j);
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = new g1(0.0f);
                sVar2.k0(objM);
            }
            final g1 g1Var = (g1) objM;
            sVar = sVar2;
            r.a(new ke.d(fC0, zVar), function0, null, u3.e.e(-1198583945, sVar2, new Function2() { // from class: vi.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar3 = (s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                        s1.x0 x0VarD = r0.d(new u1(1000, 1500, null, 4), 2);
                        y0 y0VarE = r0.e(new u1(1500, 0, null, 4), 2);
                        final x60.m mVar2 = mVar;
                        final x60.h hVar2 = hVar;
                        final z5.c cVar2 = cVar;
                        final g1 g1Var2 = g1Var;
                        final z4.z zVar2 = zVar;
                        final float f11 = fC02;
                        final float f12 = fC03;
                        s1.y.d(zBooleanValue, null, x0VarD, y0VarE, null, u3.e.e(-1395776433, sVar3, new i80.n() { // from class: vi.m
                            @Override // i80.n
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                ((s1.z) obj3).getClass();
                                x60.m mVar3 = mVar2;
                                float f13 = mVar3.f44014j;
                                float f14 = mVar3.f44015k;
                                t tVarC = d2.c.C(q.f5711a, f13, f14, f13, f14);
                                s sVar4 = (s) ((m3.n) obj4);
                                Object objM2 = sVar4.M();
                                m3.f fVar = m3.m.f29332a;
                                g1 g1Var3 = g1Var2;
                                if (objM2 == fVar) {
                                    objM2 = new fi.a(g1Var3, 2);
                                    sVar4.k0(objM2);
                                }
                                t tVarO = c0.o(tVarC, (Function1) objM2);
                                x60.h hVar3 = hVar2;
                                s0.b(tVarO, oo.e.b(cVar2, ((g1Var3.h() - (((int) (zVar2.u() >> 32)) / 2)) - f11) - f12), s0.p(hVar3.G, sVar4, 0), s0.q(5, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1829239103, sVar4, new oo.s(10, mVar3, hVar3)), sVar4, 196608, 16);
                                return Unit.f26487a;
                            }
                        }), sVar3, 200064, 18);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, ((i12 >> 3) & 112) | 3072, 4);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(b1Var, zVar, function0, i11, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        r9 = java.lang.Integer.valueOf(r9);
        r14.k0(r9);
        r9 = r9;
     */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [t1.u1, t1.x, x70.c] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(cj.q r17, m3.n r18, int r19) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.c.x(cj.q, m3.n, int):void");
    }

    public static final String y(PaymentMethods paymentMethods, m3.n nVar) {
        paymentMethods.getClass();
        String displayValue = paymentMethods.getDisplayValue();
        if (displayValue != null && displayValue.length() != 0) {
            s sVar = (s) nVar;
            sVar.a0(-473980754);
            sVar.q(false);
            return paymentMethods.getDisplayValue();
        }
        s sVar2 = (s) nVar;
        sVar2.a0(-473932115);
        PaymentType paymentType = paymentMethods.getPaymentType();
        paymentType.getClass();
        String strU = f0.U(sVar2, paymentType.getTitleResId());
        sVar2.q(false);
        return strU;
    }

    public static final t z(t tVar, b1 b1Var) {
        tVar.getClass();
        return b4.a.a(tVar, c5.m2.f7291a, new gi.b(b1Var, 6));
    }
}
