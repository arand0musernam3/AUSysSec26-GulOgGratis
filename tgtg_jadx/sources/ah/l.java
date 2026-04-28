package ah;

import a3.d0;
import g9.f0;
import lv.w;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import xg.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f1471a = new u3.d(new d0(1), false, 332188837);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1472b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1473c = 0;

    public static final void a(f0 f0Var, b0 b0Var, se.b bVar, m3.n nVar, int i11) {
        b0Var.getClass();
        bVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(9913608);
        int i12 = (sVar.h(f0Var) ? 4 : 2) | i11 | (sVar.f(b0Var) ? 32 : 16) | (sVar.f(bVar) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            w.a(false, u3.e.e(-482571906, sVar, new c(f0Var, b0Var, bVar)), sVar, MLKEMEngine.KyberPolyBytes);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(f0Var, b0Var, bVar, i11);
        }
    }
}
