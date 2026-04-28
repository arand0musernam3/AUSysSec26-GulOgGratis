package w8;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.m;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final a a(Lifecycle.State state, n nVar) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) ((s) nVar).j(g.f43289a);
        s sVar = (s) nVar;
        boolean zF = sVar.f(lifecycleOwner);
        Object objM = sVar.M();
        m3.f fVar = m.f29332a;
        if (zF || objM == fVar) {
            objM = new a();
            sVar.k0(objM);
        }
        a aVar = (a) objM;
        boolean zH = sVar.h(aVar) | sVar.h(lifecycleOwner);
        Object objM2 = sVar.M();
        if (zH || objM2 == fVar) {
            objM2 = new ry.b(24, lifecycleOwner, aVar);
            sVar.k0(objM2);
        }
        m3.i.c(aVar, lifecycleOwner, (Function1) objM2, sVar);
        boolean zH2 = sVar.h(aVar) | sVar.d(state.ordinal());
        Object objM3 = sVar.M();
        if (zH2 || objM3 == fVar) {
            objM3 = new h(aVar, state, null);
            sVar.k0(objM3);
        }
        m3.i.g(aVar, state, (Function2) objM3, sVar);
        return aVar;
    }
}
