package i3;

import a3.y0;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.R;
import d2.q2;
import d2.z2;
import g3.ea;
import g3.q9;
import g3.r9;
import g3.v0;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.v1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import z1.h2;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f23177a = new StackTraceElement[0];

    public static final void a(boolean z11, Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1339183247);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            jf.e.a(z11, function0, sVar, i13 & 126, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.f(z11, function0, i11, 1);
        }
    }

    public static final void b(d6.i0 i0Var, u3.d dVar, ea eaVar, b4.t tVar, u3.d dVar2, m3.n nVar, int i11) {
        d6.i0 i0Var2;
        int i12;
        b1 b1Var;
        boolean z11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1221877520);
        if ((i11 & 6) == 0) {
            i0Var2 = i0Var;
            i12 = (sVar.f(i0Var2) ? 4 : 2) | i11;
        } else {
            i0Var2 = i0Var;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(eaVar) : sVar.h(eaVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(tVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((i11 & 196608) == 0) {
            i12 |= sVar.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar.h(dVar2) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (38347923 & i13) != 38347922)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            sVar.a0(-1104742522);
            sVar.q(false);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (eaVar.b()) {
                sVar.a0(-1891243071);
                e(i0Var2, eaVar, b0Var, false, b1Var2, dVar, sVar, ((i13 << 15) & 3670016) | (i13 & 14) | 196608 | ((i13 >> 3) & 112) | ((i13 >> 6) & 896));
                b1Var = b1Var2;
                sVar = sVar;
                z11 = false;
            } else {
                b1Var = b1Var2;
                z11 = false;
                sVar.a0(-1896607156);
            }
            sVar.q(z11);
            f(eaVar, b1Var, tVar, dVar2, sVar, ((i13 >> 18) & 14) | MLKEMEngine.KyberPolyBytes | ((i13 >> 3) & 112) | ((i13 >> 12) & 7168) | (57344 & (i13 << 3)) | ((i13 >> 9) & 458752));
            sVar.q(true);
            boolean z12 = ((i13 & 896) == 256 || ((i13 & 512) != 0 && sVar.h(eaVar))) ? true : z11;
            Object objM3 = sVar.M();
            if (z12 || objM3 == fVar) {
                objM3 = new q9(eaVar, 24);
                sVar.k0(objM3);
            }
            m3.i.d(eaVar, (Function1) objM3, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(i0Var, dVar, eaVar, tVar, dVar2, i11);
        }
    }

    public static final void c(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1868327245);
        int i12 = (sVar.h(lifecycleOwner) ? 4 : 2) | i11 | (sVar.h(function1) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = ((i12 & 112) == 32) | sVar.h(lifecycleOwner) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new y0(lifecycleOwner, function1, function0, 20);
                sVar.k0(objM);
            }
            m3.i.d(lifecycleOwner, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(lifecycleOwner, function1, function0, i11, 18);
        }
    }

    public static final void d(long j9, m5.u0 u0Var, Function2 function2, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-684938728);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j9) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(u0Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function2) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            m3.e0 e0Var = r9.f19436a;
            m3.i.b(new v1[]{b3.i.u(j9, v0.f19606a), e0Var.a(((m5.u0) sVar.j(e0Var)).d(u0Var))}, function2, sVar, ((i12 >> 3) & 112) | 8);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h0(j9, u0Var, function2, i11, 0);
        }
    }

    public static final void e(d6.i0 i0Var, ea eaVar, v80.b0 b0Var, boolean z11, b1 b1Var, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1413720282);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(eaVar) : sVar.h(eaVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(null) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(b0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.g(z11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(b1Var) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(dVar) ? 1048576 : 524288;
        }
        byte b8 = 0;
        int i13 = 1;
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            String strU = o30.f0.U(sVar, R.string.tooltip_description);
            boolean zH = ((i12 & 112) == 32 || ((i12 & 64) != 0 && sVar.h(eaVar))) | ((i12 & 896) == 256) | sVar.h(b0Var) | ((458752 & i12) == 131072);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new a0.g(eaVar, b0Var, b1Var, 23);
                sVar.k0(objM);
            }
            d6.r.a(i0Var, (Function0) objM, new d6.j0(z11, 6), u3.e.e(-1287705660, sVar, new com.tgtg.componentlibrary.component.p000switch.b(strU, dVar, i13, b8)), sVar, (i12 & 14) | 3072, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g3.e0(i11, 3, i0Var, eaVar, b0Var, b1Var, dVar, z11);
        }
    }

    public static final void f(ea eaVar, b1 b1Var, b4.t tVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1873232064);
        int i13 = 1;
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(true) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(eaVar) : sVar.h(eaVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(b1Var) ? 256 : 128;
        }
        int i14 = 0;
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(false) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(tVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(dVar) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            String strU = o30.f0.U(sVar, R.string.tooltip_label);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            b4.t tVarE = u4.c.e(g4.d.i(w4.h0.a(w4.h0.a(tVar, eaVar, new l(eaVar, i14)), eaVar, new l(eaVar, i13)).then(new f0(new y0(strU, b0Var, eaVar, 22))), new y0(b0Var, b1Var2, eaVar, 21)), new ad.j(eaVar, b1Var, b1Var2, i13));
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarE, sVar);
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
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r8.k.w((i12 >> 15) & 14, dVar, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.t0(eaVar, b1Var, tVar, dVar, i11, 11);
        }
    }

    public static b4.t g(b4.t tVar) {
        return tVar.then(new o(new hb0.q(12)));
    }

    public static final b4.t h(b4.t tVar, z1.r rVar, h2 h2Var, Function2 function2) {
        return tVar.then(new q(rVar, function2, h2Var));
    }

    public static final Object i(z4.t tVar) {
        Object objG = tVar.G();
        z4.e0 e0Var = objG instanceof z4.e0 ? (z4.e0) objG : null;
        if (e0Var != null) {
            return e0Var.o();
        }
        return null;
    }

    public static final String j(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.j(c5.v0.f7389a);
        return ((Context) sVar.j(c5.v0.f7390b)).getResources().getString(i11);
    }

    public static final q2 k(m3.n nVar) {
        WeakHashMap weakHashMap = z2.f13983w;
        d2.a aVar = d2.b.e(nVar).f13990g;
        WeakHashMap weakHashMap2 = z2.f13983w;
        return new q2(aVar, d2.b.e(nVar).f13985b);
    }

    public static final int l(int i11, int i12) {
        if (i11 == Integer.MAX_VALUE) {
            return i11;
        }
        int i13 = i11 - i12;
        if (i13 < 0) {
            return 0;
        }
        return i13;
    }
}
