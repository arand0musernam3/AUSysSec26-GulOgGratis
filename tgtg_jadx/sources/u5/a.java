package u5;

import i4.t;
import i4.u0;
import java.util.ArrayList;
import m5.r;
import x5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(r rVar, t tVar, i4.r rVar2, float f11, u0 u0Var, l lVar, k4.e eVar) {
        ArrayList arrayList = rVar.f29630h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m5.t tVar2 = (m5.t) arrayList.get(i11);
            tVar2.f29641a.g(tVar, rVar2, f11, u0Var, lVar, eVar);
            tVar.n(0.0f, tVar2.f29641a.b());
        }
    }
}
