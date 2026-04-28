package g3;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends b4.s implements b5.k, b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f18309o;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        float f11 = ((z5.f) b5.o.e(this, o2.f19200c)).f47277a;
        float f12 = 0;
        if (f11 < f12) {
            f11 = f12;
        }
        z4.m1 m1VarD = t0Var.D(j9);
        boolean z11 = isAttached() && !Float.isNaN(f11) && z5.f.a(f11, f12) > 0;
        int iQ0 = !Float.isNaN(f11) ? w0Var.q0(f11) : 0;
        int iMax = m1VarD.f47183a;
        if (z11) {
            iMax = Math.max(iMax, iQ0);
        }
        int iMax2 = m1VarD.f47184b;
        if (z11) {
            iMax2 = Math.max(iMax2, iQ0);
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f18309o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f18309o = linkedHashMap;
            }
            z4.b2 b2Var = o2.f19199b;
            int iRound = Math.round((iQ0 - m1VarD.f47183a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(b2Var, Integer.valueOf(iRound));
            z4.o oVar = o2.f19198a;
            int iRound2 = Math.round((iQ0 - m1VarD.f47184b) / 2.0f);
            linkedHashMap.put(oVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.f18309o;
        if (map == null) {
            map = kotlin.collections.o0.f26530a;
            map.getClass();
        }
        return w0Var.r(iMax, iMax2, map, new d2.c1(iMax, iMax2, m1VarD));
    }
}
