package ir;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import ap.j;
import c5.v0;
import com.braze.h2;
import d40.t1;
import g9.f0;
import g9.t0;
import i9.q;
import kotlin.jvm.internal.Reflection;
import lv.w;
import m3.n;
import m3.s;
import m3.w1;
import mv.r0;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f24147a = new u3.d(new q(11), false, 169004819);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24148b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24149c = 0;

    public static final void a(f0 f0Var, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1928650948);
        int i12 = i11 | 2;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                f0Var = a.a.I(new t0[0], sVar);
            } else {
                sVar.U();
            }
            f0 f0Var2 = f0Var;
            sVar.r();
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            h hVar = (h) t1.K(Reflection.getOrCreateKotlinClass(h.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            s1 s1VarA2 = z8.a.a(sVar);
            if (s1VarA2 == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            cj.e0 e0Var = (cj.e0) t1.K(Reflection.getOrCreateKotlinClass(cj.e0.class), s1VarA2, e0.r(s1VarA2, sVar), s1VarA2 instanceof p ? ((p) s1VarA2).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            Activity activityE = r0.e((Context) sVar.j(v0.f7390b));
            cv.i iVar = cv.i.TEMP_SCREEN_ACCT_DETAILS;
            iVar.getClass();
            cv.b bVar = hVar.f24126c;
            bVar.getClass();
            bVar.c(iVar, null);
            w.a(false, u3.e.e(-1996021710, sVar, new bn.p(17, f0Var2, hVar, activityE, e0Var)), sVar, MLKEMEngine.KyberPolyBytes);
            f0Var = f0Var2;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(f0Var, i11, 1);
        }
    }
}
