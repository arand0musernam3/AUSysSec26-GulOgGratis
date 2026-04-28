package v1;

import android.content.res.Configuration;
import android.os.Build;
import android.widget.EdgeEffect;
import c5.m2;
import com.app.tgtg.R;
import g3.f8;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import z1.h2;
import z1.h3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(d6.i0 i0Var, u3.d dVar, u uVar, b4.t tVar, boolean z11, boolean z12, m3.n nVar, int i11) {
        b4.t tVar2;
        boolean z13;
        boolean z14;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(196062260);
        int i12 = i11 | (sVar.f(i0Var) ? 4 : 2) | (sVar.f(uVar) ? 256 : 128) | 224256;
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            tVar2 = b4.q.f5711a;
            b4.t tVarC = b4.a.c(tVar2, sVar);
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
            if (((Boolean) uVar.f41847b.getValue()).booleanValue()) {
                sVar.a0(1833353604);
                e(i0Var, uVar, b0Var, dVar, sVar, (i12 & 14) | ((i12 >> 3) & 112) | 27648);
            } else {
                sVar.a0(1829588468);
            }
            sVar.q(false);
            f(uVar, sVar, ((i12 >> 3) & 112) | 3462);
            sVar.q(true);
            boolean z15 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z15 || objM2 == fVar) {
                objM2 = new sg.c(uVar, 14);
                sVar.k0(objM2);
            }
            m3.i.d(uVar, (Function1) objM2, sVar);
            z13 = true;
            z14 = true;
        } else {
            sVar.U();
            tVar2 = tVar;
            z13 = z11;
            z14 = z12;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f8(i0Var, dVar, uVar, tVar2, z13, z14, i11);
        }
    }

    public static final a0 b(float f11, long j9) {
        return new a0(f11, new i4.x0(j9));
    }

    public static final void c(b4.t tVar, Function1 function1, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-932836462);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            d2.c.f(f4.g.d(tVar, function1), sVar);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(tVar, function1, i11, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final n4.b r18, final java.lang.String r19, b4.t r20, b4.f r21, z4.m r22, float r23, i4.w r24, m3.n r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.n.d(n4.b, java.lang.String, b4.t, b4.f, z4.m, float, i4.w, m3.n, int, int):void");
    }

    public static final void e(d6.i0 i0Var, u uVar, v80.b0 b0Var, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1882542163);
        int i13 = 2;
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(uVar) ? 32 : 16;
        }
        int i14 = i12 | (sVar.h(b0Var) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            i14 |= sVar.g(true) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= sVar.h(dVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        byte b8 = 0;
        if (sVar.R(i14 & 1, (i14 & 9363) != 9362)) {
            String strU = o30.f0.U(sVar, R.string.tooltip_description);
            boolean zH = ((i14 & 112) == 32) | sVar.h(b0Var);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new q(uVar, b0Var);
                sVar.k0(objM);
            }
            d6.r.a(i0Var, (Function0) objM, new d6.j0(true, 14), u3.e.e(916917707, sVar, new com.tgtg.componentlibrary.component.p000switch.b(strU, dVar, i13, b8)), sVar, (i14 & 14) | 3072, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.t0(i0Var, uVar, i11, b0Var, dVar, 22);
        }
    }

    public static final void f(u uVar, m3.n nVar, int i11) {
        int i12;
        u3.d dVar = ii.l.f23950a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1381511093);
        int i13 = 1;
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(true) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = 16;
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(uVar) ? 32 : 16;
        }
        int i15 = i11 & MLKEMEngine.KyberPolyBytes;
        b4.q qVar = b4.q.f5711a;
        if (i15 == 0) {
            i12 |= sVar.f(qVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(dVar) ? NewHope.SENDB_BYTES : 1024;
        }
        int i16 = 0;
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            b4.t tVarC = j5.r.c(w4.h0.a(w4.h0.a(qVar, uVar, new t(uVar, i16)), uVar, new t(uVar, i13)), true, new m2.h0(o30.f0.U(sVar, R.string.tooltip_label), (v80.b0) objM, uVar, i14));
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
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
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            r8.k.w((i12 >> 9) & 14, dVar, sVar, true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(uVar, i11);
        }
    }

    public static float g(EdgeEffect edgeEffect, float f11, float f12, z5.c cVar) {
        float f13 = m0.f41786a;
        double dA = cVar.a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f11) * 0.35f;
        double d3 = ((double) m0.f41786a) * dA;
        float fExp = (float) (Math.exp((m0.f41787b / m0.f41788c) * Math.log(dAbs / d3)) * d3);
        int i11 = Build.VERSION.SDK_INT;
        if (fExp > (i11 >= 31 ? l.b(edgeEffect) : 0.0f) * f12) {
            return 0.0f;
        }
        int iB = j80.c.b(f11);
        if (i11 >= 31) {
            edgeEffect.onAbsorb(iB);
            return f11;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iB);
        }
        return f11;
    }

    public static final b4.t h(b4.t tVar, i4.r rVar, i4.v0 v0Var, float f11) {
        return tVar.then(new m(0L, rVar, f11, v0Var, m2.f7291a, 1));
    }

    public static /* synthetic */ b4.t i(b4.t tVar, i4.r rVar, float f11, int i11) {
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        }
        return h(tVar, rVar, i4.g0.f23254b, f11);
    }

    public static final b4.t j(b4.t tVar, long j9, i4.v0 v0Var) {
        return tVar.then(new m(j9, null, 1.0f, v0Var, m2.f7291a, 2));
    }

    public static final b4.t k(b4.t tVar, float f11, long j9, i4.v0 v0Var) {
        return l(tVar, f11, new i4.x0(j9), v0Var);
    }

    public static final b4.t l(b4.t tVar, float f11, i4.x0 x0Var, i4.v0 v0Var) {
        return tVar.then(new z(f11, x0Var, v0Var));
    }

    public static final void m(long j9, h2 h2Var) {
        if (h2Var == h2.Vertical) {
            if (z5.a.h(j9) != Integer.MAX_VALUE) {
                return;
            }
            c2.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (z5.a.i(j9) != Integer.MAX_VALUE) {
                return;
            }
            c2.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final b4.t n(b4.t tVar, boolean z11, b2.l lVar) {
        return tVar.then(z11 ? new o0(lVar) : b4.q.f5711a);
    }

    public static b4.t o(b4.t tVar, b2.l lVar) {
        return tVar.then(new u0(lVar));
    }

    public static final boolean p(m3.s sVar) {
        return (((Configuration) sVar.j(c5.v0.f7389a)).uiMode & 48) == 32;
    }

    public static final y1 q(m3.n nVar) {
        Object[] objArr = new Object[0];
        boolean zD = ((m3.s) nVar).d(0);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        if (zD || objM == m3.m.f29332a) {
            objM = new uu.a(4);
            sVar.k0(objM);
        }
        return (y1) y3.j.d(objArr, y1.f41887j, (Function0) objM, sVar, 0);
    }

    public static b4.t r(b4.t tVar, y1 y1Var, boolean z11) {
        h2 h2Var = z11 ? h2.Vertical : h2.Horizontal;
        b2.l lVar = y1Var.f41891d;
        float f11 = d0.f41709a;
        h2 h2Var2 = h2.Vertical;
        b4.q qVar = b4.q.f5711a;
        return tVar.then(h2Var == h2Var2 ? f4.g.b(qVar, t0.f41844c) : f4.g.b(qVar, t0.f41843b)).then(new z1(lVar, null, null, null, h2Var, y1Var, true, false, true)).then(new b2(y1Var, z11));
    }

    public static final b4.t s(b4.t tVar, h3 h3Var, h2 h2Var, o1 o1Var, boolean z11, boolean z12, z1.l1 l1Var, b2.l lVar, i2.k kVar) {
        float f11 = d0.f41709a;
        h2 h2Var2 = h2.Vertical;
        b4.q qVar = b4.q.f5711a;
        return tVar.then(h2Var == h2Var2 ? f4.g.b(qVar, t0.f41844c) : f4.g.b(qVar, t0.f41843b)).then(new z1(lVar, o1Var, kVar, l1Var, h2Var, h3Var, z11, z12, false));
    }

    public static final long t(float f11, long j9) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j9 >> 32)) - f11);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j9 & 4294967295L)) - f11);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
