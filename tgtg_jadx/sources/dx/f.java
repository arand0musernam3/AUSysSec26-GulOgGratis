package dx;

import a3.i0;
import a3.k0;
import a3.y0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import ax.m0;
import b0.z;
import c5.v0;
import c50.f1;
import cg.g0;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.OrderId;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d40.t1;
import d6.a0;
import g3.r9;
import i4.l0;
import i4.s0;
import j4.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.k2;
import m3.w1;
import m5.q0;
import o00.h0;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import q1.t0;
import w2.j0;
import w2.q1;
import w2.s1;
import xg.b0;
import z4.c0;
import z4.l1;
import z4.m;
import z4.m1;
import z4.r1;
import z4.u0;
import z4.w0;
import z5.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f15188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15189b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15190c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f1 f15191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15192e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15193f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f15194g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f15195h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f15196i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15197j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f15198k = 0;

    public static final void a(int i11) {
        if (i11 > 0) {
            return;
        }
        i4.a.f("px must be > 0.");
    }

    public static final void b(b4.t tVar, b0 b0Var, se.b bVar, m3.n nVar, int i11) {
        m3.s sVar;
        b4.t tVar2;
        b0Var.getClass();
        bVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1773683616);
        int i12 = i11 & 1;
        if (sVar2.R(i12, i12 != 0)) {
            sVar = sVar2;
            r9.d("Email here", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 6, 0, 262142);
            tVar2 = b4.q.f5711a;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bh.a(tVar2, b0Var, bVar, i11, 0);
        }
    }

    public static final void c(b4.t tVar, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1271997085);
        int i12 = i11 | 6 | (sVar.h(function0) ? 32 : 16);
        int i13 = 1;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new rr.a(1, function02);
                sVar.k0(objM);
            }
            ex.i.b((Function0) objM, new a0(i13), u3.e.e(-357018764, sVar, new g0(function0, function02)), sVar, 432, 0);
            tVar = b4.q.f5711a;
        } else {
            sVar.U();
        }
        b4.t tVar2 = tVar;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dm.f(tVar2, function0, function02, i11, 2);
        }
    }

    public static final void d(final b4.t tVar, final String str, final long j9, final float f11, m3.n nVar, final int i11) {
        int i12;
        String str2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1167202007);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            str2 = str;
            i12 |= sVar.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.e(j9) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.c(f11) ? NewHope.SENDB_BYTES : 1024;
        }
        if (!sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.U();
        } else if (str2.length() > 0) {
            sVar.a0(-59564804);
            b4.k kVar = b4.d.f5687e;
            b4.t tVarJ = v1.n.j(f4.g.b(tVar, l2.g.b(16)), lv.s.J, i4.g0.f23254b);
            float f12 = lv.t.f28248b;
            float f13 = lv.t.f28249c;
            b4.t tVarA = d2.c.A(tVarJ, f13, f12);
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
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
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.q qVar = b4.q.f5711a;
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
            v1.n.d(x0.z(R.drawable.star_selected_small, sVar, 0), "Rating", null, null, null, f11, null, sVar, 56 | (458752 & (i12 << 6)), 92);
            r9.d(str, d2.c.D(qVar, 0.0f, 0.0f, f13, 0.0f, 11), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar, ((i12 >> 3) & 14) | 48 | (i12 & 896), 12582912, 131064);
            sVar = sVar;
            e0.f.D(sVar, true, true, false);
        } else {
            sVar.a0(-58762183);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: fg.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dx.f.d(tVar, str, j9, f11, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void e(nl.a aVar, String str, Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        b4.q qVar;
        b5.h hVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(536810431);
        int i12 = i11 | (sVar.f(aVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            le.p pVarD = e0.D(new le.q(aVar.f31083b), sVar, 0);
            m5.u0 u0Var = lv.v.f28276p;
            long j9 = lv.s.C;
            m5.u0 u0VarA = m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            m5.u0 u0VarA2 = m5.u0.a(lv.v.f28277q, j9, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            String str2 = aVar.f31086e;
            if (str2 == null) {
                str2 = "";
            }
            m5.h hVarP = gn.a.p(str2, u0VarA, u0VarA2, 28);
            b4.t tVarB = d2.c.B(v1.n.r(d2.c.t(d2.c.E(v1.n.j(m2.f13850c, lv.s.f28245z, i4.g0.f23254b))), v1.n.q(sVar), true), lv.t.f28254h, 0.0f, 2);
            d2.y yVarA = d2.w.a(d2.i.f13807g, b4.d.f5695n, sVar, 54);
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
            float f11 = lv.t.f28256j;
            float f12 = lv.t.f28251e;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarD = d2.c.D(qVar2, f12, f11, f12, 0.0f, 8);
            String str3 = aVar.f31082a;
            if (str3 == null) {
                str3 = "";
            }
            r9.d(str3, tVarD, lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28264c, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            m3.s sVar2 = sVar;
            he.k kVar = (he.k) pVarD.getValue();
            if (kVar == null) {
                sVar2.a0(-944875794);
                sVar2.q(false);
                qVar = qVar2;
            } else {
                sVar2.a0(-944875793);
                b4.t tVarM = m2.m(qVar2, 200);
                qVar = qVar2;
                x0.f(kVar, tVarM, false, 0.0f, Integer.MAX_VALUE, false, null, sVar2, 1572912, 0, 4194236);
                sVar2 = sVar2;
                sVar2.q(false);
            }
            b4.t tVarD2 = d2.c.D(qVar, 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7);
            b4.q qVar3 = qVar;
            d2.y yVarA2 = d2.w.a(d2.i.g(f11), b4.d.f5694m, sVar2, 6);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarD2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                hVar = hVar2;
                sVar2.k(hVar);
            } else {
                hVar = hVar2;
                sVar2.n0();
            }
            m3.i.C(yVarA2, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            String str4 = aVar.f31084c;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = aVar.f31085d;
            String str6 = str5 != null ? str5 : "";
            boolean z11 = (57344 & i12) == 16384;
            Object objM = sVar2.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new nn.m(10, function03);
                sVar2.k0(objM);
            }
            ba0.g.c(str4, str6, str, (Function0) objM, sVar2, (i12 << 3) & 896);
            m3.s sVar3 = sVar2;
            b5.h hVar3 = hVar;
            r9.e(hVarP, null, 0L, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, null, sVar3, 0, 0, 523262);
            b4.t tVarD3 = m2.d(d2.c.D(qVar3, 0.0f, 0.0f, 0.0f, lv.t.f28249c, 7), 1.0f);
            i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5692j, sVar3, 6);
            int iHashCode3 = Long.hashCode(sVar3.T);
            u3.i iVarL3 = sVar3.l();
            b4.t tVarC3 = b4.a.c(tVarD3, sVar3);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar3);
            } else {
                sVar3.n0();
            }
            m3.i.C(i2VarA, gVar, sVar3);
            m3.i.C(iVarL3, gVar2, sVar3);
            w.a0.y(iHashCode3, sVar3, gVar3, sVar3, dVar);
            m3.i.C(tVarC3, gVar4, sVar3);
            String strU = f0.U(sVar3, R.string.new_single_opt_in_no);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarA = d2.c.A(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f12, f12);
            lv.q qVar4 = lv.q.REGULAR;
            int i13 = ((i12 << 18) & 1879048192) | 3072;
            float f13 = 1.0f;
            v0.n.n(tVarA, strU, null, qVar4, null, false, false, null, null, function02, sVar3, i13, 500);
            String strU2 = f0.U(sVar3, R.string.new_single_opt_in_yes);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            }
            v0.n.l(d2.c.A(new n1(f13, true), f12, f12), strU2, null, qVar4, null, false, false, null, null, function0, sVar3, ((i12 << 21) & 1879048192) | 3072, 500);
            sVar = sVar3;
            e0.f.D(sVar, true, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(aVar, str, function0, function02, function03, i11, 18);
        }
    }

    public static final void f(int i11, int i12, l1.c cVar, l1.b bVar, b4.t tVar, Function1 function1, m3.n nVar, int i13) {
        int i14;
        int i15;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1937073252);
        if ((i13 & 6) == 0) {
            i14 = (sVar.d(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.d(i12) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.h(cVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.d(bVar.ordinal()) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.f(tVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= sVar.h(function1) ? 131072 : 65536;
        }
        if ((74899 & i14) == 74898 && sVar.B()) {
            sVar.U();
        } else {
            int i16 = j1.h.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i16 == 1) {
                sVar.a0(-168337169);
                t1.o(tVar, false, function1, sVar, ((i14 >> 3) & 57344) | ((i14 >> 12) & 14));
                sVar.q(false);
            } else {
                if (i16 != 2) {
                    throw e0.f.v(sVar, -1806546617, false);
                }
                sVar.a0(-168184029);
                sVar.Y(-1806539482, sVar.j(v0.f7389a));
                int rotation = ((View) sVar.j(v0.f7394f)).getDisplay().getRotation();
                if (rotation == 0) {
                    i15 = 0;
                } else if (rotation == 1) {
                    i15 = 90;
                } else if (rotation == 2) {
                    i15 = 180;
                } else {
                    if (rotation != 3) {
                        com.braze.h2.a(j4.s.f(rotation, "Unsupported surface rotation: "));
                        return;
                    }
                    i15 = 270;
                }
                sVar.q(false);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    l0 l0Var = new l0(l0.a());
                    sVar.k0(l0Var);
                    objM = l0Var;
                }
                float[] fArr = ((l0) objM).f23269a;
                RectF rectF = new RectF(0.0f, 0.0f, i11, i12);
                Matrix matrix = new Matrix();
                RectF rectF2 = m1.h.f28704a;
                Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                matrix.postRotate(-i15);
                Matrix matrix2 = new Matrix();
                matrix2.setRectToRect(rectF2, rectF, scaleToFit);
                matrix.postConcat(matrix2);
                i4.g0.w(matrix, fArr);
                bx.o.F(tVar, false, fArr, function1, sVar, ((i14 >> 3) & 57344) | ((i14 >> 12) & 14));
                sVar.q(false);
            }
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j1.f(i11, i12, cVar, bVar, tVar, function1, i13);
        }
    }

    public static final void g(l1.d dVar, b4.t tVar, final l1.c cVar, final b4.f fVar, final z4.m mVar, Function1 function1, m3.n nVar, int i11) {
        int i12;
        d2.s sVar;
        final b1 b1Var;
        boolean z11;
        final int i13;
        m3.s sVar2;
        m3.s sVar3 = (m3.s) nVar;
        sVar3.c0(2052669900);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.h(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar3.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar3.h(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar3.f(null) : sVar3.h(null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.f(fVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar3.f(mVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar3.h(function1) ? 1048576 : 524288;
        }
        int i14 = i12;
        if ((599187 & i14) == 599186 && sVar3.B()) {
            sVar3.U();
            sVar2 = sVar3;
        } else {
            sVar3.W();
            if ((i11 & 1) != 0 && !sVar3.z()) {
                sVar3.U();
            }
            sVar3.r();
            b4.t tVarThen = f4.g.c(tVar).then(m2.f13850c);
            sVar3.b0(733328855);
            t0 t0Var = d2.p.f13873a;
            b4.k kVar = b4.d.f5683a;
            boolean zAreEqual = Intrinsics.areEqual(kVar, kVar);
            m3.f fVar2 = m3.m.f29332a;
            if (zAreEqual) {
                sVar3.a0(244332343);
                sVar3.q(false);
                sVar = d2.p.f13875c;
            } else {
                sVar3.a0(244380021);
                boolean zF = sVar3.f(kVar) | sVar3.g(false);
                Object objM = sVar3.M();
                if (zF || objM == fVar2) {
                    objM = new d2.s(kVar, false);
                    sVar3.k0(objM);
                }
                sVar = (d2.s) objM;
                sVar3.q(false);
            }
            sVar3.b0(-1323940314);
            int iHashCode = Long.hashCode(sVar3.T);
            u3.i iVarL = sVar3.l();
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            u3.d dVarN = c0.n(tVarThen);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            m3.i.C(sVar, b5.i.f5843f, sVar3);
            m3.i.C(iVarL, b5.i.f5842e, sVar3);
            b5.g gVar = b5.i.f5844g;
            if (sVar3.S || !Intrinsics.areEqual(sVar3.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar3, iHashCode, gVar);
            }
            dVarN.invoke(new k2(sVar3), sVar3, 0);
            sVar3.b0(2058660585);
            sVar3.Y(-782850610, dVar);
            final int layoutDirection = ((Configuration) sVar3.j(v0.f7389a)).getLayoutDirection();
            int i15 = dVar.f26761a;
            l1.b bVarT = dVar.f26763c;
            final int i16 = dVar.f26762b;
            boolean zD = sVar3.d(bVarT == null ? -1 : bVarT.ordinal());
            Object objM2 = sVar3.M();
            if (zD || objM2 == fVar2) {
                if (bVarT == null) {
                    bVarT = bx.k.t();
                }
                sVar3.k0(bVarT);
                objM2 = bVarT;
            }
            l1.b bVar = (l1.b) objM2;
            boolean zD2 = sVar3.d(bVar.ordinal());
            Object objM3 = sVar3.M();
            if (zD2 || objM3 == fVar2) {
                objM3 = e0.f.w(bVar == l1.b.EMBEDDED, sVar3);
            }
            b1 b1Var2 = (b1) objM3;
            boolean zD3 = ((i14 & 458752) == 131072) | sVar3.d(i15) | sVar3.d(i16) | sVar3.f(b1Var2) | sVar3.h(cVar) | sVar3.d(layoutDirection) | ((57344 & i14) == 16384) | ((i14 & 7168) == 2048 || ((i14 & 4096) != 0 && sVar3.h(null)));
            Object objM4 = sVar3.M();
            if (zD3 || objM4 == fVar2) {
                b1Var = b1Var2;
                z11 = false;
                i13 = i15;
                i80.n nVar2 = new i80.n() { // from class: j1.e
                    @Override // i80.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        w0 w0Var = (w0) obj;
                        z4.t0 t0Var2 = (z4.t0) obj2;
                        final z5.a aVar = (z5.a) obj3;
                        final int i17 = i13;
                        boolean z12 = i17 >= 0;
                        final int i18 = i16;
                        if (!((i18 >= 0) & z12)) {
                            i.a("width and height must be >= 0");
                        }
                        final m1 m1VarD = t0Var2.D(z5.b.h(i17, i17, i18, i18));
                        int i19 = (m1VarD.f47183a - z5.a.i(aVar.f47271a)) / 2;
                        final int i21 = i19 > 0 ? i19 : 0;
                        int iH = (m1VarD.f47184b - z5.a.h(aVar.f47271a)) / 2;
                        final int i22 = iH > 0 ? iH : 0;
                        int i23 = m1VarD.f47183a;
                        int i24 = m1VarD.f47184b;
                        final l1.c cVar2 = cVar;
                        final int i25 = layoutDirection;
                        final m mVar2 = mVar;
                        final b4.f fVar3 = fVar;
                        final b1 b1Var3 = b1Var;
                        return w0.f(w0Var, i23, i24, new Function1() { // from class: j1.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                final z5.a aVar2 = aVar;
                                final int i26 = i17;
                                final int i27 = i18;
                                final l1.c cVar3 = cVar2;
                                final int i28 = i25;
                                final m mVar3 = mVar2;
                                final b4.f fVar4 = fVar3;
                                final b1 b1Var4 = b1Var3;
                                l1.v((l1) obj4, m1VarD, i21, i22, new Function1() { // from class: j1.d
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        SizeF sizeF;
                                        z5.m mVar4;
                                        RectF rectF;
                                        s0 s0Var = (s0) obj5;
                                        if (!((Boolean) b1Var4.getValue()).booleanValue()) {
                                            return Unit.f26487a;
                                        }
                                        z5.a aVar3 = aVar2;
                                        Size size = new Size(z5.a.i(aVar3.f47271a), z5.a.h(aVar3.f47271a));
                                        int i29 = i26;
                                        int i31 = i27;
                                        Size size2 = new Size(i29, i31);
                                        l1.c cVar4 = cVar3;
                                        RectF rectFL = z20.b.l(cVar4, size2);
                                        int i32 = cVar4.f26755a;
                                        if (i32 == 0) {
                                            sizeF = new SizeF(rectFL.width(), rectFL.height());
                                        } else {
                                            if (i32 != 90) {
                                                if (i32 != 180) {
                                                    if (i32 != 270) {
                                                        i4.a.f(s.f(i32, "Invalid rotation degrees: "));
                                                        return null;
                                                    }
                                                }
                                                sizeF = new SizeF(rectFL.width(), rectFL.height());
                                            }
                                            sizeF = new SizeF(rectFL.height(), rectFL.width());
                                        }
                                        float width = (sizeF.getWidth() + 1.0f) / (sizeF.getHeight() - 1.0f);
                                        float width2 = (sizeF.getWidth() - 1.0f) / (sizeF.getHeight() + 1.0f);
                                        float width3 = size.getWidth() / size.getHeight();
                                        if (width < width3 || width3 < width2) {
                                            Matrix matrix = new Matrix();
                                            SizeF sizeF2 = new SizeF(size.getWidth(), size.getHeight());
                                            SizeF sizeF3 = sizeF;
                                            long jA = mVar3.a(h0.i(sizeF.getWidth(), sizeF.getHeight()), h0.i(sizeF2.getWidth(), sizeF2.getHeight()));
                                            int i33 = r1.f47223a;
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
                                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
                                            RectF rectF2 = m1.h.f28704a;
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                                            int i34 = (int) (jFloatToRawIntBits >> 32);
                                            int i35 = (int) (jFloatToRawIntBits & 4294967295L);
                                            matrix.setScale(Float.intBitsToFloat(i34), Float.intBitsToFloat(i35));
                                            SizeF sizeF4 = new SizeF(Float.intBitsToFloat(i34) * sizeF3.getWidth(), Float.intBitsToFloat(i35) * sizeF3.getHeight());
                                            SizeF sizeF5 = new SizeF(size.getWidth(), size.getHeight());
                                            long jC = z.c(Math.round(sizeF4.getWidth()), Math.round(sizeF4.getHeight()));
                                            long jC2 = z.c(Math.round(sizeF5.getWidth()), Math.round(sizeF5.getHeight()));
                                            int i36 = i28;
                                            if (i36 == 0) {
                                                mVar4 = z5.m.Ltr;
                                            } else {
                                                if (i36 != 1) {
                                                    i4.a.f(s.f(i36, "Invalid layout direction: "));
                                                    return null;
                                                }
                                                mVar4 = z5.m.Rtl;
                                            }
                                            long jA2 = fVar4.a(jC, jC2, mVar4);
                                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((int) (jA2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jA2 >> 32)) << 32);
                                            matrix.postTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                                            RectF rectF3 = new RectF(0.0f, 0.0f, sizeF3.getWidth(), sizeF3.getHeight());
                                            matrix.mapRect(rectF3);
                                            rectF = rectF3;
                                        } else {
                                            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
                                        }
                                        RectF rectFL2 = z20.b.l(cVar4, size2);
                                        Matrix matrix2 = new Matrix();
                                        RectF rectF4 = m1.h.f28704a;
                                        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
                                        matrix2.setRectToRect(rectFL2, rectF4, scaleToFit);
                                        matrix2.postRotate(i32);
                                        Matrix matrix3 = new Matrix();
                                        matrix3.setRectToRect(rectF4, rectF, scaleToFit);
                                        matrix2.postConcat(matrix3);
                                        if (cVar4.f26756b) {
                                            matrix2.preScale(-1.0f, 1.0f, rectFL2.centerX(), rectFL2.centerY());
                                        }
                                        float f11 = i29;
                                        float f12 = i31;
                                        RectF rectF5 = new RectF(0.0f, 0.0f, f11, f12);
                                        matrix2.mapRect(rectF5);
                                        s0Var.w(i4.g0.h(0.0f, 0.0f));
                                        s0Var.o(rectF5.width() / f11);
                                        s0Var.p(rectF5.height() / f12);
                                        s0Var.x(rectF5.left);
                                        s0Var.y(rectF5.top);
                                        return Unit.f26487a;
                                    }
                                }, 4);
                                return Unit.f26487a;
                            }
                        });
                    }
                };
                sVar3.k0(nVar2);
                objM4 = nVar2;
            } else {
                b1Var = b1Var2;
                z11 = false;
                i13 = i15;
            }
            b4.t tVarL = c0.l(b4.q.f5711a, (i80.n) objM4);
            boolean zH = sVar3.h(dVar) | ((3670016 & i14) == 1048576 ? true : z11) | sVar3.f(b1Var);
            Object objM5 = sVar3.M();
            if (zH || objM5 == fVar2) {
                objM5 = new y0(dVar, function1, b1Var, 25);
                sVar3.k0(objM5);
            }
            sVar2 = sVar3;
            f(i13, i16, cVar, bVar, tVarL, (Function1) objM5, sVar2, i14 & 896);
            sVar2.q(z11);
            sVar2.q(z11);
            sVar2.q(true);
            sVar2.q(z11);
            sVar2.q(z11);
        }
        w1 w1VarS = sVar2.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(dVar, tVar, cVar, fVar, mVar, function1, i11, 6);
        }
    }

    public static final i0 h(a3.n1 n1Var, k0 k0Var) {
        boolean z11 = n1Var.g() == a3.k.CROSSED;
        return new i0(k(n1Var.k(), z11, true, n1Var.l(), k0Var), k(n1Var.f(), z11, false, n1Var.e(), k0Var), z11);
    }

    public static final ExecutorService i(boolean z11) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ib.c(z11));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static final a3.h0 j(final a3.n1 n1Var, final a3.f0 f0Var, a3.h0 h0Var) {
        final int i11 = n1Var.a() ? f0Var.f339c : f0Var.f340d;
        int iL = n1Var.a() ? n1Var.l() : n1Var.e();
        int i12 = f0Var.f338b;
        q0 q0Var = f0Var.f342f;
        int i13 = f0Var.f341e;
        if (iL != i12) {
            return f0Var.a(i11);
        }
        u70.m mVar = u70.m.NONE;
        final u70.j jVarA = u70.l.a(mVar, new a3.l0(f0Var, i11, 0));
        final int i14 = n1Var.a() ? f0Var.f340d : f0Var.f339c;
        u70.j jVarA2 = u70.l.a(mVar, new Function0() { // from class: a3.m0
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIntValue = ((Number) jVarA.getValue()).intValue();
                n1 n1Var2 = n1Var;
                boolean zA = n1Var2.a();
                boolean z11 = n1Var2.g() == k.CROSSED;
                f0 f0Var2 = f0Var;
                m5.q0 q0Var2 = f0Var2.f342f;
                int i15 = i11;
                long jL = q0Var2.l(i15);
                m5.q0 q0Var3 = f0Var2.f342f;
                m5.r rVar = q0Var3.f29618b;
                int i16 = m5.t0.f29649c;
                int i17 = (int) (jL >> 32);
                int iD = rVar.d(i17);
                int i18 = rVar.f29628f;
                if (iD != iIntValue) {
                    i17 = iIntValue >= i18 ? q0Var3.i(i18 - 1) : q0Var3.i(iIntValue);
                }
                int iC = (int) (jL & 4294967295L);
                if (rVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i18 ? rVar.c(i18 - 1, false) : rVar.c(iIntValue, false);
                }
                int i19 = i14;
                if (i17 == i19) {
                    return f0Var2.a(iC);
                }
                if (iC == i19) {
                    return f0Var2.a(i17);
                }
                if (!(zA ^ z11) ? i15 >= i17 : i15 > iC) {
                    i17 = iC;
                }
                return f0Var2.a(i17);
            }
        });
        if (f0Var.f337a != h0Var.f368c) {
            return (a3.h0) jVarA2.getValue();
        }
        if (i11 == i13) {
            return h0Var;
        }
        if (((Number) jVarA.getValue()).intValue() != q0Var.f29618b.d(i13)) {
            return (a3.h0) jVarA2.getValue();
        }
        int i15 = h0Var.f367b;
        long jL = q0Var.l(i15);
        boolean zA = n1Var.a();
        if (i13 != -1) {
            if (i11 != i13) {
                if (((zA ? 1 : 0) ^ (f0Var.b() == a3.k.CROSSED ? 1 : 0)) == 0) {
                }
            }
            return f0Var.a(i11);
        }
        int i16 = m5.t0.f29649c;
        return (i15 == ((int) (jL >> 32)) || i15 == ((int) (jL & 4294967295L))) ? (a3.h0) jVarA2.getValue() : f0Var.a(i11);
    }

    public static final a3.h0 k(a3.f0 f0Var, boolean z11, boolean z12, int i11, k0 k0Var) {
        long jB;
        long j9;
        int i12 = z12 ? f0Var.f339c : f0Var.f340d;
        if (i11 != f0Var.f338b) {
            return f0Var.a(i12);
        }
        switch (k0Var.f436a) {
            case 0:
                String str = f0Var.f342f.f29617a.f29603a.f29538b;
                jB = m5.k0.b(m2.g0.w(i12, str), m2.g0.v(i12, str));
                break;
            default:
                jB = f0Var.f342f.l(i12);
                break;
        }
        if (z11 ^ z12) {
            int i13 = m5.t0.f29649c;
            j9 = jB >> 32;
        } else {
            int i14 = m5.t0.f29649c;
            j9 = 4294967295L & jB;
        }
        return f0Var.a((int) j9);
    }

    public static final long l(int i11, int i12, s1 s1Var) {
        q1 q1Var;
        if (i11 == -1) {
            return (((long) i12) << 32) | (4294967295L & ((long) (-1)));
        }
        boolean z11 = i11 > i12;
        m3.i0 i0Var = s1Var.f43045c;
        j0 j0Var = (i0Var == null || (q1Var = (q1) i0Var.getValue()) == null) ? null : q1Var.f43031b;
        long jA = j0Var != null ? j0Var.a(i11, false) : m5.k0.b(i11, i11);
        long jF = s1Var.f(jA);
        int i13 = x2.a0.$EnumSwitchMapping$0[((m5.t0.d(jA) && m5.t0.d(jF)) ? w2.y.Untransformed : (m5.t0.d(jA) || m5.t0.d(jF)) ? (!m5.t0.d(jA) || m5.t0.d(jF)) ? w2.y.Deletion : w2.y.Insertion : w2.y.Replacement).ordinal()];
        if (i13 == 1) {
            return t1.y(i11, z11 ? w2.t1.Start : w2.t1.End);
        }
        if (i13 == 2) {
            return (((long) i11) << 32) | (4294967295L & ((long) (-1)));
        }
        if (i13 == 3) {
            return z11 ? t1.y((int) (jF & 4294967295L), w2.t1.Start) : t1.y((int) (jF >> 32), w2.t1.End);
        }
        if (i13 == 4) {
            return z11 ? i11 == ((int) (jF >> 32)) ? t1.y(i11, w2.t1.Start) : t1.y((int) (jF & 4294967295L), w2.t1.End) : i11 == ((int) (jF & 4294967295L)) ? t1.y(i11, w2.t1.End) : t1.y((int) (jF >> 32), w2.t1.Start);
        }
        e40.a.f();
        return 0L;
    }

    public static final a3.h0 m(a3.h0 h0Var, a3.f0 f0Var, int i11) {
        return new a3.h0(f0Var.f342f.a(i11), i11, h0Var.f368c);
    }

    public static final void n(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            org.bouncycastle.jce.provider.a.v(r8.k.k("index: ", i11, i12, ", size: "));
        }
    }

    public static final void o(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            org.bouncycastle.jce.provider.a.v(r8.k.k("index: ", i11, i12, ", size: "));
        }
    }

    public static final void p(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            org.bouncycastle.jce.provider.a.e(i13, r8.k.r(i11, i12, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i11 <= i12) {
                return;
            }
            i4.a.f(r8.k.k("fromIndex: ", i11, i12, " > toIndex: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a3.i0 q(a3.i0 r8, a3.n1 r9) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx.f.q(a3.i0, a3.n1):a3.i0");
    }

    public static final Object r(y9.r rVar, String str, z70.c cVar) {
        Object objB = rVar.b(str, new w2.g0(13), cVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public static final ViewParent s(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final boolean t(String str) {
        str.getClass();
        return Intrinsics.areEqual(str, "POST") || Intrinsics.areEqual(str, "PATCH") || Intrinsics.areEqual(str, "PUT") || Intrinsics.areEqual(str, "DELETE") || Intrinsics.areEqual(str, "MOVE");
    }

    public static Intent u(Activity activity, io.a aVar) {
        activity.getClass();
        int i11 = go.w.f20772i;
        Intent intent = new Intent(activity, (Class<?>) SurpriseBagOrderActivity.class);
        String str = aVar.f24069a;
        if (str != null) {
            intent.putExtra("ORDER_ID", OrderId.m209boximpl(OrderId.m209boximpl(str).m217unboximpl()));
            intent.putExtra("ORDER_TYPE", aVar.f24071c);
        }
        String str2 = aVar.f24070b;
        if (str2 != null) {
            intent.putExtra("INVITATION_ID", str2);
        }
        intent.putExtra("ORIGIN", aVar.f24074f);
        intent.putExtra("SHOW_RECOMMENDATIONS_BOTTOM_SHEET", aVar.f24073e);
        intent.putExtra("AUTO_SHOW_REDEEMER_VIEW", aVar.f24072d);
        return intent;
    }

    public static final void v() {
        try {
            if (f15191d == null) {
                f1 f1Var = (f1) ((c50.i) ((c50.r) p30.g.c().b(c50.r.class))).f7587o.get();
                f1Var.getClass();
                f15191d = f1Var;
            }
            f1 f1Var2 = f15191d;
            f1 f1Var3 = null;
            if (f1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedSessionRepository");
                f1Var2 = null;
            }
            if (f1Var2.f7541i) {
                f1 f1Var4 = f15191d;
                if (f1Var4 != null) {
                    f1Var3 = f1Var4;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedSessionRepository");
                }
                f1Var3.b();
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean w(String str) {
        str.getClass();
        return (Intrinsics.areEqual(str, "GET") || Intrinsics.areEqual(str, "HEAD")) ? false : true;
    }

    public static void x(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Animator animator = (Animator) arrayList.get(i11);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void y(HashMap map) {
        SharedPreferences sharedPreferences = ax.a0.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        y yVar = y.DATASETID;
        Object obj = map.get(yVar.a());
        y yVar2 = y.URL;
        Object obj2 = map.get(yVar2.a());
        y yVar3 = y.ACCESSKEY;
        Object obj3 = map.get(yVar3.a());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(yVar.a(), obj.toString());
        editorEdit.putString(yVar2.a(), obj2.toString());
        editorEdit.putString(yVar3.a(), obj3.toString());
        editorEdit.apply();
        l50.a aVar = tx.f0.f40508d;
        l50.a.A(m0.APP_EVENTS, "dx.f".toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }

    public static int z(int i11) {
        int[] iArr = {1, 2, 3};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr[i12];
            int i14 = i13 - 1;
            if (i13 == 0) {
                throw null;
            }
            if (i14 == i11) {
                return i13;
            }
        }
        return 1;
    }
}
