package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f13800a = new i2(i.f13801a, b4.d.f5692j);

    public static final i2 a(f fVar, b4.j jVar, m3.n nVar, int i11) {
        if (Intrinsics.areEqual(fVar, i.f13801a) && Intrinsics.areEqual(jVar, b4.d.f5692j)) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(-1073830487);
            sVar.q(false);
            return f13800a;
        }
        m3.s sVar2 = (m3.s) nVar;
        sVar2.a0(-1073779616);
        boolean z11 = true;
        boolean z12 = (((i11 & 14) ^ 6) > 4 && sVar2.f(fVar)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !sVar2.f(jVar)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objM = sVar2.M();
        if (z13 || objM == m3.m.f29332a) {
            objM = new i2(fVar, jVar);
            sVar2.k0(objM);
        }
        i2 i2Var = (i2) objM;
        sVar2.q(false);
        return i2Var;
    }
}
