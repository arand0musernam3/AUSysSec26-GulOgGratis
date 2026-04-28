package rk;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.r9;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.w1;
import nk.q0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {
    public static final void a(int i11, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(776461712);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12;
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(v1.n.j(m2.d(qVar, 1.0f), lv.s.I, l2.g.b(10)), lv.t.f28252f);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
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
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.info_icon, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(r8.k.f(lv.t.f28251e, i11, qVar, sVar, sVar), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 131070);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, i12, 8);
        }
    }

    public static final void b(q0 q0Var, m3.n nVar, int i11) {
        q0Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1533873000);
        int i12 = i11 | (sVar.h(q0Var) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            PackagingOptions packagingOption = q0Var.f31035a.getInformation().getPackagingOption();
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
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
            r9.d(f0.U(sVar, R.string.item_view_packaging_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 0, 12582912, 131070);
            sVar = sVar;
            d2.c.f(m2.m(qVar, lv.t.f28252f), sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28251e;
            i2 i2VarA = h2.a(d2.i.g(f11), b4.d.f5692j, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            c(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), packagingOption.getInfo().getContainerProvided(), packagingOption.getInfo().getContainerProvidedString(), packagingOption.getInfo().getContainerLabel(), packagingOption.getInfo().getContainerIcon(), sVar, 0);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            c(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), packagingOption.getInfo().getBagProvided(), packagingOption.getInfo().getBagProvidedString(), packagingOption.getInfo().getBagLabel(), packagingOption.getInfo().getBagIcon(), sVar, 0);
            sVar.q(true);
            Integer infoBoxText = packagingOption.getInfo().getInfoBoxText();
            if (infoBoxText == null) {
                sVar.a0(-727310107);
                sVar.q(false);
            } else {
                sVar.a0(-727310106);
                int iIntValue = infoBoxText.intValue();
                d2.c.f(m2.m(qVar, f11), sVar);
                a(iIntValue, sVar, 0);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new qk.h(q0Var, i11, 5);
        }
    }

    public static final void c(final b4.t tVar, final boolean z11, final int i11, final int i12, final int i13, m3.n nVar, final int i14) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-686084123);
        int i15 = i14 | (sVar.f(tVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.d(i12) ? NewHope.SENDB_BYTES : 1024) | (sVar.d(i13) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i15 & 1, (i15 & 9363) != 9362)) {
            b4.t tVarD = d2.c.D(v1.n.j(v1.n.k(tVar, 1, lv.s.H, l2.g.b(8)), z11 ? lv.s.J : lv.s.I, g0.f23254b), 0.0f, lv.t.f28252f, 0.0f, lv.t.f28251e, 5);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            v1.n.d(x0.z(i13, sVar, (i15 >> 12) & 14), null, null, null, null, 0.0f, z11 ? null : new i4.o(lv.s.E, 5), sVar, 56, 60);
            r9.d(f0.U(sVar, i12), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 131070);
            r9.d(f0.U(sVar, i11), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(z11, i11, i12, i13, i14) { // from class: rk.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f38113b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f38114c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f38115d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f38116e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    v.c(this.f38112a, this.f38113b, this.f38114c, this.f38115d, this.f38116e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }
}
