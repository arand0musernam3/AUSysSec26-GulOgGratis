package xh;

import androidx.lifecycle.s1;
import com.braze.h2;
import d40.t1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import m3.b1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f44306a = new u3.d(new u60.a(20), false, 17855545);

    public static final void a(g9.f0 f0Var, boolean z11, Function0 function0, m3.n nVar, int i11) {
        f0Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-962529723);
        int i12 = i11 | (sVar.h(f0Var) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ii.j0 j0Var = (ii.j0) t1.K(Reflection.getOrCreateKotlinClass(ii.j0.class), s1VarA, o30.e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            s1 s1VarA2 = z8.a.a(sVar);
            if (s1VarA2 == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            pi.m mVar = (pi.m) t1.K(Reflection.getOrCreateKotlinClass(pi.m.class), s1VarA2, o30.e0.r(s1VarA2, sVar), s1VarA2 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA2).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            x70.c cVar = null;
            if (objM == fVar) {
                objM = m3.i.w(null);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = e0.f.w(true ^ ((Boolean) v80.f0.E(kotlin.coroutines.g.f26549a, new pi.j(mVar, cVar, 3))).booleanValue(), sVar);
            }
            lv.w.a(false, u3.e.e(1755927055, sVar, new k3.k(f0Var, z11, j0Var, mVar, function0, b1Var, (b1) objM2)), sVar, MLKEMEngine.KyberPolyBytes);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(f0Var, z11, function0, i11, 17);
        }
    }
}
