package f2;

import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f17114a = new s(null, 0, false, 0.0f, new d0(0), 0.0f, false, v80.f0.b(kotlin.coroutines.g.f26549a), z20.b.d(), z5.b.b(0, 0, 15), n0.f26529a, 0, 0, 0, false, h2.Vertical, 0, 0);

    public static final c0 a(int i11, int i12, int i13, int i14, m3.n nVar) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        Object[] objArr = new Object[0];
        ub.a aVar = c0.f17087x;
        boolean zD = ((((i13 & 14) ^ 6) > 4 && ((m3.s) nVar).d(i11)) || (i13 & 6) == 4) | ((m3.s) nVar).d(i12);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        if (zD || objM == m3.m.f29332a) {
            objM = new com.braze.ui.contentcards.adapters.b(i11, i12, 2);
            sVar.k0(objM);
        }
        return (c0) y3.j.d(objArr, aVar, (Function0) objM, sVar, 0);
    }
}
