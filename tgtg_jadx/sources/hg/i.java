package hg;

import b4.k;
import b4.q;
import b4.t;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.tgtg.componentlibrary.component.iconbutton.variant.AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.u;
import d2.w;
import d2.y;
import g3.j5;
import g3.r9;
import g3.s0;
import i4.g0;
import i4.r;
import i4.v;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import n80.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import x60.l;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22061a = 260;

    public static final void a(VoucherPaymentInformation voucherPaymentInformation, boolean z11, boolean z12, Function0 function0, n nVar, int i11) {
        float f11;
        t tVarQ;
        boolean z13 = z12;
        k kVar = b4.d.f5683a;
        voucherPaymentInformation.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-648557472);
        int i12 = i11 | (sVar.f(voucherPaymentInformation) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        int i13 = i12 | (sVar.g(z13) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            int iC = p.c(voucherPaymentInformation.getNumberOfVouchers(), 1, 3);
            float f12 = lVar.f44001n;
            int i14 = iC - 1;
            float f13 = f22061a;
            float f14 = (i14 * f12) + f13;
            q qVar = q.f5711a;
            t tVarT = m2.t(z11 ? m2.d(qVar, 1.0f) : m2.q(qVar, f14), 3);
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarT, sVar);
            j.R.getClass();
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
            sVar.a0(-1031185132);
            int i15 = 0;
            while (i15 < iC) {
                boolean z14 = i15 == i14;
                float f15 = i15;
                float f16 = f12 * f15;
                t tVarA = u.f13938a.a(qVar, kVar);
                if (z11) {
                    tVarQ = d2.c.D(m2.d(qVar, 1.0f), 0.0f, 0.0f, f16, 0.0f, 11);
                    f11 = f16;
                } else {
                    f11 = f16;
                    tVarQ = m2.q(qVar, f13);
                }
                float f17 = f13;
                c(b4.a.d(d2.c.w(tVarA.then(tVarQ), f11, 0.0f, 2), f15), z13, z11, z14 ? function0 : null, u3.e.e(-1661169725, sVar, new g(voucherPaymentInformation, z13, z14, function0)), sVar, ((i13 >> 3) & 112) | 24576 | ((i13 << 3) & 896), 0);
                i15++;
                z13 = z12;
                iC = iC;
                i14 = i14;
                f13 = f17;
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.a(voucherPaymentInformation, z11, z12, function0, i11, 2);
        }
    }

    public static final void b(BasicVoucher basicVoucher, boolean z11, boolean z12, Function0 function0, n nVar, int i11) {
        basicVoucher.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1682762567);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z12) ? 256 : 128;
        }
        int i13 = i12 | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            c(null, z11, z12, function0, u3.e.e(-1898534976, sVar, new bn.d(basicVoucher, z11, function0, 6)), sVar, (i13 & 112) | 24576 | (i13 & 896) | (i13 & 7168), 1);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.a(basicVoucher, z11, z12, function0, i11, 1);
        }
    }

    public static final void c(t tVar, boolean z11, boolean z12, Function0 function0, u3.d dVar, n nVar, int i11, int i12) {
        t tVar2;
        int i13;
        int i14;
        u3.d dVar2 = dVar;
        s sVar = (s) nVar;
        sVar.c0(357629108);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            tVar2 = tVar;
        } else if ((i11 & 6) == 0) {
            tVar2 = tVar;
            i13 = (sVar.f(tVar2) ? 4 : 2) | i11;
        } else {
            tVar2 = tVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.g(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(dVar2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            t tVarC = q.f5711a;
            if (i15 != 0) {
                tVar2 = tVarC;
            }
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            l lVar = (l) sVar.j(PantryThemeKt.getLocalPantrySize());
            x60.a aVar = (x60.a) sVar.j(PantryThemeKt.getLocalPantryBorder());
            x60.i iVar = (x60.i) sVar.j(PantryThemeKt.getLocalPantryShadow());
            boolean zC = sVar.c(lVar.f43994f) | sVar.c(kVar.f43977a);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (zC || objM == fVar) {
                objM = new gg.a(kVar.f43977a, lVar.f43994f);
                sVar.k0(objM);
            }
            gg.a aVar2 = (gg.a) objM;
            long jK = hVar.G;
            long j9 = hVar.f43947x;
            if (z11) {
                jK = g0.k(j9, jK);
            }
            long jB = v.b(0.64f, hVar.f43912d0);
            long j11 = jK;
            long j12 = hVar.f43918g0;
            boolean zE = sVar.e(jB) | sVar.e(j12);
            Object objM2 = sVar.M();
            if (zE || objM2 == fVar) {
                objM2 = qb.e.I(d0.h(new v(jB), new v(j12)), 0.0f, 0.0f, 14);
                sVar.k0(objM2);
            }
            r rVar = (r) objM2;
            t tVarT = m2.t(tVar2.then(Intrinsics.areEqual(tVar2, tVarC) ? z12 ? m2.d(tVarC, 1.0f) : m2.q(tVarC, f22061a) : tVarC), 3);
            if (z11) {
                tVarT = v1.n.k(tVarT, aVar.f43895b, hVar.f43927l0, aVar2);
            }
            t tVarG = f4.g.g(tVarT, aVar2, iVar.f43950a);
            if (function0 != null) {
                sVar.a0(-1683127270);
                boolean z13 = (i13 & 7168) == 2048;
                Object objM3 = sVar.M();
                if (z13 || objM3 == fVar) {
                    objM3 = new j5(3, function0);
                    sVar.k0(objM3);
                }
                tVarC = androidx.compose.foundation.b.c(tVarC, false, null, null, (Function0) objM3, 15);
                i14 = 0;
                sVar.q(false);
            } else {
                i14 = 0;
                sVar.a0(-1683008354);
                sVar.q(false);
            }
            dVar2 = dVar;
            s0.b(tVarG.then(tVarC), aVar2, s0.p(j11, sVar, i14), null, null, u3.e.e(1411092610, sVar, new h(z11, rVar, aVar2, dVar2)), sVar, 196608, 24);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.e(tVar2, z11, z12, function0, dVar2, i11, i12);
        }
    }

    public static final void d(String str, u3.d dVar, u3.d dVar2, String str2, boolean z11, Function0 function0, n nVar, int i11) {
        Function2 function2;
        Function2 function22;
        s sVar;
        boolean z12;
        String str3 = str2;
        Function0 function02 = function0;
        s sVar2 = (s) nVar;
        sVar2.c0(1503618889);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str3) ? NewHope.SENDB_BYTES : 1024) | (sVar2.g(z11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function02) ? 131072 : 65536);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            l lVar = (l) sVar2.j(PantryThemeKt.getLocalPantrySize());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            float f11 = mVar.f44015k;
            q qVar = q.f5711a;
            t tVarZ = d2.c.z(qVar, f11);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarZ, sVar2);
            j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
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
            b5.d dVar3 = b5.i.f5845h;
            m3.i.z(sVar2, dVar3);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            t tVarE = m2.e(m2.d(qVar, 1.0f), lVar.f43994f);
            b4.j jVar2 = b4.d.f5692j;
            d2.b bVar = d2.i.f13801a;
            i2 i2VarA = h2.a(bVar, jVar2, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC2 = b4.a.c(tVarE, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar3);
            m3.i.C(tVarC2, gVar4, sVar2);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(str, new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar2, i12 & 14, 0, 131064);
            function2 = dVar;
            sVar = sVar2;
            function2.invoke(sVar, 6);
            sVar.q(true);
            function22 = dVar2;
            function22.invoke(sVar, 6);
            t tVarE2 = m2.e(qVar, lVar.f43993e);
            i2 i2VarA2 = h2.a(bVar, b4.d.l, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarE2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar3);
            m3.i.C(tVarC3, gVar4, sVar);
            str3 = str2;
            ig.b.d(str3, sVar, (i12 >> 9) & 14);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar);
            z12 = z11;
            function02 = function0;
            e(z12, function02, sVar, (i12 >> 12) & 126);
            sVar.q(true);
            sVar.q(true);
        } else {
            function2 = dVar;
            function22 = dVar2;
            sVar = sVar2;
            z12 = z11;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.w(str, function2, function22, str3, z12, function02, i11, 2);
        }
    }

    public static final void e(boolean z11, Function0 function0, n nVar, int i11) {
        int i12;
        Function0 function02;
        int i13;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1346901719);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            if (z11) {
                i13 = R.drawable.ic_minus;
            } else {
                if (z11) {
                    e40.a.f();
                    return;
                }
                i13 = R.drawable.ic_plus;
            }
            function02 = function0;
            AccentPantryIconButtonKt.SmallAccentPantryIconButton(function02, null, null, false, false, u3.e.e(-148737025, sVar, new c60.b(i13, 15)), sVar, ((i12 >> 3) & 14) | 196608, 30);
        } else {
            function02 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(z11, function02, i11, 0);
        }
    }
}
