package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f13955a = new y(i.f13803c, b4.d.f5694m);

    public static final y a(h hVar, b4.e eVar, m3.n nVar, int i11) {
        if (Intrinsics.areEqual(hVar, i.f13803c) && Intrinsics.areEqual(eVar, b4.d.f5694m)) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(-1446604504);
            sVar.q(false);
            return f13955a;
        }
        m3.s sVar2 = (m3.s) nVar;
        sVar2.a0(-1446550657);
        boolean z11 = true;
        boolean z12 = (((i11 & 14) ^ 6) > 4 && sVar2.f(hVar)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !sVar2.f(eVar)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objM = sVar2.M();
        if (z13 || objM == m3.m.f29332a) {
            objM = new y(hVar, eVar);
            sVar2.k0(objM);
        }
        y yVar = (y) objM;
        sVar2.q(false);
        return yVar;
    }
}
