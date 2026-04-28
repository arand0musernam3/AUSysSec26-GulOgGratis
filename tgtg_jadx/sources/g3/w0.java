package g3;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f19674a = new w0();

    public final void a(a8.h hVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1565826668);
        int i12 = (sVar.f(hVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            ex.i.b((Function0) hVar.f973b, (d6.a0) hVar.f974c, u3.e.e(1163527043, sVar, new a3.f1(hVar, 28)), sVar, MLKEMEngine.KyberPolyBytes, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.u2(this, hVar, i11, 18);
        }
    }
}
