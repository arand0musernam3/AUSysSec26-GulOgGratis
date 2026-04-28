package gn;

import a3.p2;
import a3.x1;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.s1;
import cg.q0;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import d2.b2;
import d2.g0;
import d2.m2;
import d40.t1;
import g3.d0;
import g3.f6;
import g3.q9;
import g3.r9;
import i4.r0;
import i4.v0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import m3.b1;
import m3.c3;
import m3.d3;
import m3.h1;
import m3.w1;
import o00.x0;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import z1.h2;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f20581a = new u3.d(new g60.a(5), false, -1918497306);

    public static final void a(b4.t tVar, String str, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(779335344);
        int i12 = (sVar.f(str) ? 32 : 16) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x0.f((he.k) e0.D(new le.q(r8.k.l(str, ".lottie")), sVar, 0).getValue(), f4.g.j(d2.c.k(m2.d(tVar, 1.0f), 1.0f), 1.2f, 1.2f).then(m2.f13850c), false, 0.2f, Integer.MAX_VALUE, true, null, sVar, 1769472, MLKEMEngine.KyberPolyBytes, 4190108);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cp.g(str, tVar, i11, 2);
        }
    }

    public static final void b(final dn.k kVar, u3.d dVar, v0 v0Var, final long j9, final u3.d dVar2, m3.n nVar, final int i11) {
        final u3.d dVar3;
        v0 v0Var2;
        z1.r rVar = (z1.r) kVar.f15019c;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(827017240);
        int i12 = i11 | (sVar.f(kVar) ? 4 : 2) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(0, sVar);
            }
            final h1 h1Var = (h1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = w.a0.s(0, sVar);
            }
            final h1 h1Var2 = (h1) objM2;
            boolean zF = sVar.f(rVar);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                objM3 = new g(rVar, h2.Vertical, 0);
                sVar.k0(objM3);
            }
            v4.a aVar = (v4.a) objM3;
            a0 a0Var = (a0) rVar.f46652g.getValue();
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objM4 = sVar.M();
            x70.c cVar = null;
            if (z11 || objM4 == fVar) {
                objM4 = new a3.y(kVar, cVar, 10);
                sVar.k0(objM4);
            }
            m3.i.h(a0Var, (Function2) objM4, sVar);
            g0 g0Var = m2.f13850c;
            b4.t tVarA = v4.f.a(z1.k.e(g0Var, (z1.r) kVar.f15019c, h2.Vertical, false, null, 60), aVar, null);
            boolean z12 = i13 == 4;
            Object objM5 = sVar.M();
            if (z12 || objM5 == fVar) {
                final int i14 = 0;
                objM5 = new Function1() { // from class: gn.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        z5.l lVar = (z5.l) obj;
                        switch (i14) {
                            case 0:
                                int i15 = (int) (lVar.f47286a & 4294967295L);
                                h1 h1Var3 = h1Var;
                                h1Var3.i(i15);
                                if (h1Var3.h() > 0 && h1Var2.h() > 0) {
                                    kVar.A();
                                }
                                break;
                            default:
                                int i16 = (int) (lVar.f47286a & 4294967295L);
                                h1 h1Var4 = h1Var;
                                h1Var4.i(i16);
                                if (h1Var2.h() > 0 && h1Var4.h() > 0) {
                                    kVar.A();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM5);
            }
            b4.t tVarQ = c0.q(tVarA, (Function1) objM5);
            b4.k kVar2 = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar2, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarQ, sVar);
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
            b5.d dVar4 = b5.i.f5845h;
            m3.i.z(sVar, dVar4);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(g0Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar4);
            m3.i.C(tVarC2, gVar4, sVar);
            dVar2.invoke(d2.z.f13980a, sVar, 54);
            sVar.q(true);
            b4.k kVar3 = b4.d.f5690h;
            d2.u uVar = d2.u.f13938a;
            b4.t tVarA2 = uVar.a(g0Var, kVar3);
            boolean z13 = i13 == 4;
            Object objM6 = sVar.M();
            if (z13 || objM6 == fVar) {
                objM6 = new q9(kVar, 2);
                sVar.k0(objM6);
            }
            b4.t tVarU = d2.c.u(tVarA2, (Function1) objM6);
            r0 r0Var = i4.g0.f23254b;
            b4.t tVarJ = v1.n.j(tVarU, j9, r0Var);
            v0Var2 = r0Var;
            u0 u0VarD2 = d2.p.d(kVar2, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarJ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar4);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.t tVarU2 = m2.u(b4.q.f5711a, null, 3);
            boolean z14 = i13 == 4;
            Object objM7 = sVar.M();
            if (z14 || objM7 == fVar) {
                final int i15 = 1;
                objM7 = new Function1() { // from class: gn.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        z5.l lVar = (z5.l) obj;
                        switch (i15) {
                            case 0:
                                int i152 = (int) (lVar.f47286a & 4294967295L);
                                h1 h1Var3 = h1Var2;
                                h1Var3.i(i152);
                                if (h1Var3.h() > 0 && h1Var.h() > 0) {
                                    kVar.A();
                                }
                                break;
                            default:
                                int i16 = (int) (lVar.f47286a & 4294967295L);
                                h1 h1Var4 = h1Var2;
                                h1Var4.i(i16);
                                if (h1Var.h() > 0 && h1Var4.h() > 0) {
                                    kVar.A();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM7);
            }
            b4.t tVarQ2 = c0.q(tVarU2, (Function1) objM7);
            u0 u0VarD3 = d2.p.d(kVar2, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarQ2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD3, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar4);
            m3.i.C(tVarC4, gVar4, sVar);
            dVar3 = dVar;
            dVar3.invoke(uVar, sVar, 54);
            e0.f.D(sVar, true, true, true);
        } else {
            dVar3 = dVar;
            sVar.U();
            v0Var2 = v0Var;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final v0 v0Var3 = v0Var2;
            w1VarS.f29476d = new Function2(dVar3, v0Var3, j9, dVar2, i11) { // from class: gn.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u3.d f20594b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v0 f20595c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f20596d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ u3.d f20597e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(27697);
                    a.b(this.f20593a, this.f20594b, this.f20595c, this.f20596d, this.f20597e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void c(nq.d dVar, fn.c cVar, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, Function0 function02, Function1 function14, m3.n nVar, int i11) {
        nq.d dVar2;
        m3.s sVar;
        dVar.getClass();
        cVar.getClass();
        function14.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(221964601);
        int i12 = i11 | (sVar2.h(dVar) ? 4 : 2) | (sVar2.h(cVar) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128) | (sVar2.h(function12) ? 2048 : 1024) | (sVar2.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function13) ? 131072 : 65536) | (sVar2.h(function0) ? 1048576 : 524288) | (sVar2.h(function02) ? 8388608 : 4194304) | (sVar2.h(function14) ? 67108864 : 33554432);
        if (sVar2.R(i12 & 1, (i12 & 38347923) != 38347922)) {
            sVar2.Y(-1440367647, Integer.valueOf(dVar.getLayoutFile()));
            boolean zH = ((i12 & 896) == 256) | sVar2.h(dVar) | sVar2.h(cVar) | ((i12 & 7168) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((29360128 & i12) == 8388608) | ((3670016 & i12) == 1048576) | ((i12 & 234881024) == 67108864);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                t tVar = new t(dVar, cVar, function1, function12, function13, function2, function02, function0, function14);
                dVar2 = dVar;
                sVar2.k0(tVar);
                objM = tVar;
            } else {
                dVar2 = dVar;
            }
            Function1 function15 = (Function1) objM;
            boolean zH2 = sVar2.h(dVar2);
            Object objM2 = sVar2.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new q9(dVar2, 4);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            c6.r.b(function15, null, (Function1) objM2, sVar, 0, 2);
            sVar.q(false);
        } else {
            dVar2 = dVar;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u(dVar2, cVar, function1, function12, function2, function13, function0, function02, function14, i11);
        }
    }

    public static final void d(b4.t tVar, String str, m3.n nVar, int i11) {
        w1 w1VarS;
        cp.g gVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-486503733);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16);
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else {
            if (str == null || StringsKt.H(str)) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    gVar = new cp.g(str, tVar, i11, 3);
                    w1VarS.f29476d = gVar;
                }
                return;
            }
            x0.f((he.k) e0.D(new le.q(str.concat(".lottie")), sVar, 0).getValue(), m2.m(tVar, 80), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572864, 0, 4194236);
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            gVar = new cp.g(str, tVar, i11, 4);
            w1VarS.f29476d = gVar;
        }
    }

    public static final void e(fn.c cVar, dn.k kVar, m3.n nVar, int i11) {
        fn.c cVar2;
        dn.k kVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(332930014);
        int i12 = (sVar.h(cVar) ? 4 : 2) | i11 | (sVar.f(kVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b1 b1VarN = m3.i.n(cVar.I, sVar, 0);
            Boolean bool = (Boolean) b1VarN.getValue();
            bool.booleanValue();
            boolean zF = sVar.f(b1VarN) | ((i12 & 112) == 32) | sVar.h(cVar);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                cVar2 = cVar;
                kVar2 = kVar;
                x1 x1Var = new x1(kVar2, cVar2, b1VarN, (x70.c) null, 27);
                sVar.k0(x1Var);
                objM = x1Var;
            } else {
                cVar2 = cVar;
                kVar2 = kVar;
            }
            m3.i.h(bool, (Function2) objM, sVar);
        } else {
            cVar2 = cVar;
            kVar2 = kVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i(cVar2, kVar2, i11, 0);
        }
    }

    public static final void f(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1548945611);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                com.braze.h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            if (((Boolean) b0.z.w(((fn.c) t1.K(Reflection.getOrCreateKotlinClass(fn.c.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar)).E, Boolean.FALSE, sVar, 48).getValue()).booleanValue()) {
                sVar.a0(-489704311);
                d3 d3Var = c5.x1.f7416h;
                m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), f20581a, sVar, 56);
                sVar.q(false);
            } else {
                sVar.a0(-489229577);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g60.a(i11, 7);
        }
    }

    public static final void g(HeroComponentResponse heroComponentResponse, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-807592132);
        int i13 = i11 | (sVar.h(heroComponentResponse) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function12) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            Context context = (Context) sVar.j(c5.v0.f7390b);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = Boolean.valueOf(mv.r0.r(context));
                sVar.k0(objM);
            }
            boolean zBooleanValue = ((Boolean) objM).booleanValue();
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.TRUE);
                sVar.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            Unit unit = Unit.f26487a;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new q0(b1Var, null, 3);
                sVar.k0(objM3);
            }
            m3.i.h(unit, (Function2) objM3, sVar);
            boolean zF = sVar.f(heroComponentResponse.getBackgroundColor());
            Object objM4 = sVar.M();
            if (zF || objM4 == fVar) {
                objM4 = m3.i.q(new m(heroComponentResponse, 0));
                sVar.k0(objM4);
            }
            c3 c3Var = (c3) objM4;
            boolean zF2 = sVar.f(heroComponentResponse.getBackgroundAnimationId());
            Object objM5 = sVar.M();
            if (zF2 || objM5 == fVar) {
                objM5 = m3.i.q(new cw.b(heroComponentResponse, 22));
                sVar.k0(objM5);
            }
            c3 c3Var2 = (c3) objM5;
            b4.q qVar = b4.q.f5711a;
            float f11 = 425;
            b4.t tVarJ = v1.n.j(m2.e(m2.d(qVar, 1.0f), f11), ((i4.v) c3Var.getValue()).f23317a, i4.g0.f23254b);
            u0 u0VarD = d2.p.d(b4.d.f5684b, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
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
            if (((String) c3Var2.getValue()) != null) {
                sVar.a0(71471622);
                i12 = i13;
                a(b4.a.d(m2.e(m2.d(qVar, 1.0f), f11), 0.0f), (String) c3Var2.getValue(), sVar, 6);
                sVar.q(false);
            } else {
                i12 = i13;
                sVar.a0(71773376);
                sVar.q(false);
            }
            float f12 = lv.t.f28253g;
            b4.t tVarD = d2.c.D(qVar, 0.0f, f12, 0.0f, lv.t.f28252f, 5);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            o(heroComponentResponse, sVar, i12 & 14);
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.k kVar = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            b4.t tVarD3 = d2.c.D(uVar.a(qVar, kVar), 0.0f, f12, 0.0f, lv.t.f28251e, 5);
            Boolean bool = (Boolean) b1Var.getValue();
            bool.booleanValue();
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new g9.r0(11);
                sVar.k0(objM6);
            }
            s1.i.a(bool, tVarD3, (Function1) objM6, null, null, null, u3.e.e(421535873, sVar, new dp.s(2, heroComponentResponse, function12, function1, b1Var)), sVar, 1573248, 56);
            sVar.q(true);
            sVar.q(true);
            d((zBooleanValue && ((Boolean) b1Var.getValue()).booleanValue()) ? b4.a.d(d2.c.v(uVar.a(qVar, b4.d.f5690h), -147, -4), 5.0f) : b4.a.d(d2.c.v(uVar.a(qVar, b4.d.f5689g), 4, -4), 5.0f), heroComponentResponse.getDoodleAnimationId(), sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(heroComponentResponse, function1, function12, i11, 16);
        }
    }

    public static final void h(List list, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1342494030);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function12) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            f2.c0 c0VarA = f2.e0.a(0, 0, 0, 3, sVar);
            a2.j jVarG = b0.a0.G(c0VarA, sVar, 0, 2);
            b4.t tVarJ = v1.n.j(m2.d(b4.q.f5711a, 1.0f), lv.s.K, i4.g0.f23254b);
            float f11 = lv.t.f28253g;
            b2 b2VarE = d2.c.e(f11, 0.0f, f11, 0.0f, 10);
            boolean zH = ((i12 & 112) == 32) | sVar.h(list) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new k(list, function1, function12, 0);
                sVar.k0(objM);
            }
            ox.h.d(tVarJ, c0VarA, b2VarE, false, null, null, jVarG, false, null, (Function1) objM, sVar, 390, 440);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l(list, function1, function12, i11, 0);
        }
    }

    public static final void i(int i11, dn.k kVar, fn.c cVar, List list, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function2 function2, m3.n nVar) {
        int i12;
        m3.s sVar;
        int i13;
        int i14;
        int i15;
        LifecycleOwner lifecycleOwner;
        f2.c0 c0Var;
        z3.u uVar;
        List list2;
        f2.c0 c0Var2;
        dn.k kVar2 = kVar;
        list.getClass();
        cVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(265163354);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(kVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(function12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(function13) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(function0) ? 8388608 : 4194304;
        }
        if (sVar2.R(i12 & 1, (i12 & 4793491) != 4793490)) {
            f2.c0 c0VarA = f2.e0.a(0, 0, 0, 3, sVar2);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new z3.u();
                sVar2.k0(objM);
            }
            z3.u uVar2 = (z3.u) objM;
            z3.r rVar = new z3.r();
            rVar.addAll(list);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) sVar2.j(w8.g.f43289a);
            int i16 = i12 & 896;
            int i17 = i12;
            boolean zF = sVar2.f(c0VarA) | (i16 == 256) | sVar2.h(lifecycleOwner2);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                i13 = i16;
                i14 = i17;
                i15 = 1048576;
                objM2 = new b0.x1(5, lifecycleOwner2, c0VarA, kVar2, uVar2);
                lifecycleOwner = lifecycleOwner2;
                c0Var = c0VarA;
                kVar2 = kVar2;
                uVar = uVar2;
                sVar2.k0(objM2);
            } else {
                c0Var = c0VarA;
                uVar = uVar2;
                i15 = 1048576;
                i13 = i16;
                lifecycleOwner = lifecycleOwner2;
                i14 = i17;
            }
            m3.i.d(lifecycleOwner, (Function1) objM2, sVar2);
            boolean zF2 = sVar2.f(c0Var) | (i13 == 256);
            Object objM3 = sVar2.M();
            if (zF2 || objM3 == fVar) {
                objM3 = new v(c0Var, kVar2, uVar, (x70.c) null);
                sVar2.k0(objM3);
            }
            m3.i.h(c0Var, (Function2) objM3, sVar2);
            boolean zF3 = (i13 == 256) | sVar2.f(c0Var);
            Object objM4 = sVar2.M();
            if (zF3 || objM4 == fVar) {
                objM4 = new v(kVar2, c0Var, uVar, (x70.c) null);
                sVar2.k0(objM4);
            }
            m3.i.h(kVar2, (Function2) objM4, sVar2);
            boolean zH = sVar2.h(list) | sVar2.f(c0Var) | (i13 == 256);
            Object objM5 = sVar2.M();
            if (zH || objM5 == fVar) {
                co.n nVar2 = new co.n(list, c0Var, kVar2, uVar, null, 2);
                list2 = list;
                c0Var2 = c0Var;
                sVar2.k0(nVar2);
                objM5 = nVar2;
            } else {
                c0Var2 = c0Var;
                list2 = list;
            }
            m3.i.h(list2, (Function2) objM5, sVar2);
            b4.t tVarD = m2.d(d2.c.D(b4.q.f5711a, 0.0f, lv.t.f28251e, 0.0f, lv.t.f28257k, 5), 1.0f);
            boolean zF4 = sVar2.f(rVar) | sVar2.h(cVar) | ((i14 & 7168) == 2048) | ((57344 & i14) == 16384) | ((3670016 & i14) == i15) | ((458752 & i14) == 131072) | ((29360128 & i14) == 8388608);
            Object objM6 = sVar2.M();
            if (zF4 || objM6 == fVar) {
                d0 d0Var = new d0(rVar, cVar, function1, function12, function2, function13, function0, uVar);
                sVar2.k0(d0Var);
                objM6 = d0Var;
            }
            sVar = sVar2;
            ox.h.c(tVarD, c0Var2, null, null, null, null, false, null, (Function1) objM6, sVar, 6, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(list, cVar, kVar, function1, function12, function13, function2, function0, i11);
        }
    }

    public static final void j(dn.k kVar, z3.u uVar, List list) {
        if (kVar.n()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                View view = (View) uVar.get(Integer.valueOf(iIntValue));
                if (view != null) {
                    hq.c cVar = view instanceof hq.c ? (hq.c) view : null;
                    if (cVar != null) {
                        cVar.setVerticalPosition(iIntValue);
                        cVar.c(true);
                    }
                }
            }
        }
    }

    public static final void k(List list, dn.k kVar, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(135540816);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(kVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function1) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(function12) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(function13) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(function2) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(function0) ? 1048576 : 524288;
        }
        if (sVar2.R(i12 & 1, (599187 & i12) != 599186)) {
            s1 s1VarA = z8.a.a(sVar2);
            if (s1VarA == null) {
                com.braze.h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            fn.c cVar = (fn.c) t1.K(Reflection.getOrCreateKotlinClass(fn.c.class), s1VarA, e0.r(s1VarA, sVar2), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar2);
            int i13 = i12 & 14;
            int i14 = i12 << 3;
            sVar = sVar2;
            i(i13 | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), kVar, cVar, list, function0, function1, function12, function13, function2, sVar);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.f(list, kVar, function1, function12, function13, function2, function0, i11, 2);
        }
    }

    public static final void l(fn.c cVar, Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1646987337);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean zD = cVar.f17800g.d();
            String strC = cVar.c();
            b4.t tVarD = d2.c.D(b4.q.f5711a, 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13);
            boolean zG = sVar.g(zD) | sVar.f(strC);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zG || objM == fVar) {
                objM = new g60.e(zD, strC);
                sVar.k0(objM);
            }
            Function1 function1 = (Function1) objM;
            boolean zG2 = sVar.g(zD) | ((i12 & 112) == 32) | sVar.f(strC);
            Object objM2 = sVar.M();
            if (zG2 || objM2 == fVar) {
                objM2 = new f6(function0, zD, strC, 2);
                sVar.k0(objM2);
            }
            c6.r.b(function1, tVarD, (Function1) objM2, sVar, 48, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(cVar, function0, i11, 7);
        }
    }

    public static final void m(int i11, dn.k kVar, fn.c cVar, List list, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function2 function2, m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1878395557);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16) | (sVar.f(kVar) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function12) ? 131072 : 65536) | (sVar.h(function13) ? 1048576 : 524288) | (sVar.h(function2) ? 8388608 : 4194304);
        if (sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            int i13 = i12 >> 3;
            int i14 = i12 >> 6;
            l(cVar, function0, sVar, (i13 & 14) | (i14 & 112));
            k(list, kVar, function1, function12, function13, function2, function0, sVar, (i13 & 112) | (i12 & 14) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i12 << 9) & 3670016));
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(list, cVar, kVar, function0, function1, function12, function13, function2, i11, 0);
        }
    }

    public static final void n(int i11, List list, Function0 function0, Function1 function1, m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-117082423);
        int i12 = 256;
        int i13 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            int size = list.size();
            if (size > 3) {
                size = 3;
            }
            List listM0 = CollectionsKt.m0(kotlin.collections.d0.h(Float.valueOf(5.0f), Float.valueOf(0.0f), Float.valueOf(-5.0f)), size);
            List listM02 = CollectionsKt.m0(list, 3);
            listM02.getClass();
            Iterator it = new d1(listM02).iterator();
            int i14 = 0;
            while (true) {
                ListIterator listIterator = ((c1) it).f26493a;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.d0.n();
                    throw null;
                }
                BasicItem basicItem = (BasicItem) objPrevious;
                Float f11 = (Float) CollectionsKt.Q(i14, listM0);
                b4.t tVarI = f4.g.i(b4.q.f5711a, f11 != null ? f11.floatValue() : 0.0f);
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (objM == fVar) {
                    objM = new p2(8, function0);
                    sVar.k0(objM);
                }
                Function1 function12 = (Function1) objM;
                boolean zH = ((i13 & 896) == i12) | sVar.h(basicItem);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new eg.k(function1, basicItem, 1);
                    sVar.k0(objM2);
                }
                t1.m(tVarI, basicItem, true, false, false, false, function12, (Function0) objM2, null, sVar, MLKEMEngine.KyberPolyBytes, 312);
                i14 = i15;
                i12 = i12;
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b0(list, function0, function1, i11, 0);
        }
    }

    public static final void o(HeroComponentResponse heroComponentResponse, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-25715128);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(heroComponentResponse) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            boolean zF = sVar.f(heroComponentResponse.getTitlePrimaryColor());
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = m3.i.q(new m(heroComponentResponse, 1));
                sVar.k0(objM);
            }
            c3 c3Var = (c3) objM;
            boolean zF2 = sVar.f(heroComponentResponse.getTitleSecondaryColor());
            Object objM2 = sVar.M();
            if (zF2 || objM2 == fVar) {
                objM2 = m3.i.q(new m(heroComponentResponse, 2));
                sVar.k0(objM2);
            }
            m5.u0 u0VarA = m5.u0.a(lv.v.f28264c, ((i4.v) c3Var.getValue()).f23317a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            m5.u0 u0VarA2 = m5.u0.a(lv.v.f28267f, ((i4.v) ((c3) objM2).getValue()).f23317a, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            String title = heroComponentResponse.getTitle();
            m5.h hVarP = title != null ? p(title, u0VarA, u0VarA2, 4) : null;
            if (hVarP == null) {
                sVar.a0(-1574367178);
                sVar.q(false);
            } else {
                sVar.a0(-1574367177);
                r9.e(hVarP, null, 0L, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, null, sVar, 0, 0, 523262);
                sVar = sVar;
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(heroComponentResponse, i11, 7);
        }
    }

    public static m5.h p(String str, m5.u0 u0Var, m5.u0 u0Var2, int i11) {
        boolean z11 = (i11 & 8) == 0;
        float f11 = (i11 & 16) != 0 ? 1.0f : 0.8f;
        List listS = StringsKt.S(str, new char[]{'#'}, 6);
        m5.e eVar = new m5.e();
        int i12 = 0;
        for (Object obj : listS) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                kotlin.collections.d0.n();
                throw null;
            }
            String str2 = (String) obj;
            int i14 = eVar.i((i12 % 2 == 0 ? u0Var : u0Var2).f29655a);
            try {
                eVar.c(str2);
                if (z11 && i12 != listS.size() - 1 && ((CharSequence) listS.get(i13)).length() > 0 && ((CharSequence) listS.get(i12)).length() > 0) {
                    eVar.c("\n");
                }
                i12 = i13;
            } finally {
                eVar.g(i14);
            }
        }
        long jF = b0.a0.F(Math.max(z5.o.c(u0Var.f29655a.f29576b), z5.o.c(u0Var2.f29655a.f29576b)), 4294967296L);
        b0.a0.j(jF);
        eVar.f29527c.add(new m5.d(new m5.w(0, 0, b0.a0.F(z5.o.c(jF) * f11, 1095216660480L & jF), null, null, null, 0, 0, null), 0, eVar.f29525a.length(), 8));
        return eVar.j();
    }
}
