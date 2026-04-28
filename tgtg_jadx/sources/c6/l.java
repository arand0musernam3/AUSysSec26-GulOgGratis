package c6;

import a3.t0;
import a3.y0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import b5.m0;
import c5.v0;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import kotlin.jvm.functions.Function1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f7724a = new k();

    public static final void a(i80.n nVar, b4.t tVar, Function1 function1, Function1 function12, m3.n nVar2, int i11) {
        int i12;
        Function1 function13;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(509101952);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(nVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(null) ? 256 : 128;
        }
        int i13 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(function12) ? 16384 : 8192;
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new defpackage.g(17);
                sVar.k0(objM);
            }
            function13 = (Function1) objM;
            View view = (View) sVar.j(v0.f7394f);
            boolean zF = sVar.f(view);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar) {
                try {
                    objM2 = cg.o(view);
                } catch (IllegalStateException unused) {
                    objM2 = null;
                }
                sVar.k0(objM2);
            }
            Fragment fragment = (Fragment) objM2;
            Context context = (Context) sVar.j(v0.f7390b);
            boolean zH = ((i13 & 14) == 4) | sVar.h(fragment);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new a3.p(15, fragment, nVar);
                sVar.k0(objM3);
            }
            Function1 function14 = (Function1) objM3;
            sVar.a0(1128074792);
            sVar.q(false);
            boolean zH2 = ((i13 & 7168) == 2048) | sVar.h(fragment) | sVar.h(context);
            Object objM4 = sVar.M();
            if (zH2 || objM4 == fVar) {
                objM4 = new y0(function13, fragment, context, 4);
                sVar.k0(objM4);
            }
            Function1 function15 = (Function1) objM4;
            boolean z11 = (57344 & i13) == 16384;
            Object objM5 = sVar.M();
            if (z11 || objM5 == fVar) {
                objM5 = new defpackage.d(function12, 3);
                sVar.k0(objM5);
            }
            r.a(function14, tVar, null, function15, (Function1) objM5, sVar, i13 & 112, 0);
        } else {
            sVar.U();
            function13 = function1;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(nVar, tVar, function13, function12, i11);
        }
    }

    public static final void b(i80.n nVar, b4.t tVar, Function1 function1, m3.n nVar2, int i11, int i12) {
        int i13;
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-1985291610);
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 = i11 | 48;
        } else if ((i11 & 48) == 0) {
            i13 = (sVar.f(tVar) ? 32 : 16) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.h(function1) ? 256 : 128;
        }
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            b4.t tVar3 = i14 != 0 ? b4.q.f5711a : tVar;
            a(nVar, tVar3, null, function1, sVar, (i13 & 112) | 390 | (57344 & (i13 << 6)));
            tVar2 = tVar3;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.y0((Object) nVar, tVar2, function1, i11, i12, 2);
        }
    }

    public static final View c(b4.s sVar) {
        d0 d0Var = b5.m.g(sVar.getNode()).f5879p;
        View interopView = d0Var != null ? d0Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        h2.b("Could not fetch interop view");
        return null;
    }

    public static final void d(d0 d0Var, m0 m0Var) {
        long jS = m0Var.G.f5857c.S(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jS >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jS & 4294967295L)));
        d0Var.layout(iRound, iRound2, d0Var.getMeasuredWidth() + iRound, d0Var.getMeasuredHeight() + iRound2);
    }

    public static final void e(ViewGroup viewGroup, c50.p pVar) {
        if (viewGroup instanceof FragmentContainerView) {
            pVar.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.getClass();
            if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt, pVar);
            }
        }
    }
}
