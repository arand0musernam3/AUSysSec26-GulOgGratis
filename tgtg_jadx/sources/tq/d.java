package tq;

import com.app.tgtg.model.local.GenericErrors;
import d2.m2;
import g3.ga;
import g3.x5;
import jd.f;
import m3.n;
import m3.s;
import m3.w1;
import rk.a0;
import u3.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final void a(GenericErrors genericErrors, f fVar, n nVar, int i11) {
        genericErrors.getClass();
        fVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1021609106);
        int i12 = (sVar.f(genericErrors) ? 4 : 2) | i11 | (sVar.f(fVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x5.a(v4.f.a(m2.f13850c, ga.c(sVar).f18456c, null), e.e(165531434, sVar, new a(fVar, 2, (byte) 0)), null, null, null, 0, 0L, 0L, null, e.e(1121400255, sVar, new c(genericErrors, 0)), sVar, 805306416, 508);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a0(genericErrors, fVar, i11, 10);
        }
    }
}
