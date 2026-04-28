package s1;

import m3.c3;
import t1.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.b1 f38569a = t1.c.j(0.0f, 0.0f, null, 7);

    public static final c3 a(long j9, t1.x xVar, String str, m3.n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            xVar = f38569a;
        }
        t1.x xVar2 = xVar;
        if ((i12 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        m3.s sVar = (m3.s) nVar;
        boolean zF = sVar.f(i4.v.f(j9));
        Object objM = sVar.M();
        if (zF || objM == m3.m.f29332a) {
            objM = (v1) d0.f38568a.invoke(i4.v.f(j9));
            sVar.k0(objM);
        }
        int i13 = i11 << 6;
        return t1.d.d(new i4.v(j9), (v1) objM, xVar2, null, str2, null, sVar, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
    }
}
