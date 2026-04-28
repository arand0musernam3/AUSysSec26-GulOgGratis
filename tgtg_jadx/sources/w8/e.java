package w8;

import a3.t0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m2.h0;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final void a(w wVar, LifecycleOwner lifecycleOwner, Function0 function0, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-709389590);
        int i12 = i11 | 16 | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                lifecycleOwner = (LifecycleOwner) sVar.j(g.f43289a);
            } else {
                sVar.U();
            }
            sVar.r();
            if (wVar == w.ON_DESTROY) {
                i4.a.f("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            b1 b1VarB = m3.i.B(function0, sVar);
            boolean zF = sVar.f(b1VarB) | sVar.h(lifecycleOwner);
            Object objM = sVar.M();
            if (zF || objM == m.f29332a) {
                objM = new h0(lifecycleOwner, wVar, b1VarB, 23);
                sVar.k0(objM);
            }
            m3.i.d(lifecycleOwner, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(wVar, lifecycleOwner2, function0, i11, 11);
        }
    }

    public static final void b(Boolean bool, Object obj, LifecycleOwner lifecycleOwner, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(696924721);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(bool) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(obj) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function1) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                lifecycleOwner = (LifecycleOwner) sVar.j(g.f43289a);
            } else {
                sVar.U();
            }
            int i13 = i12 & (-897);
            sVar.r();
            boolean zF = sVar.f(bool) | sVar.f(obj) | sVar.f(lifecycleOwner);
            Object objM = sVar.M();
            if (zF || objM == m.f29332a) {
                objM = new f(lifecycleOwner.getLifecycle());
                sVar.k0(objM);
            }
            c(lifecycleOwner, (f) objM, function1, sVar, (i13 >> 3) & 896);
        } else {
            sVar.U();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(bool, obj, lifecycleOwner2, function1, i11, 25);
        }
    }

    public static final void c(LifecycleOwner lifecycleOwner, f fVar, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(228371534);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(lifecycleOwner) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(fVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function1) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = sVar.h(fVar) | ((i12 & 896) == 256) | sVar.h(lifecycleOwner);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new h0(lifecycleOwner, fVar, function1, 22);
                sVar.k0(objM);
            }
            m3.i.c(lifecycleOwner, fVar, (Function1) objM, sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(lifecycleOwner, fVar, function1, i11, 21);
        }
    }
}
