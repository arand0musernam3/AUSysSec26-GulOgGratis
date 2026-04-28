package w8;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.x2;
import y80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final b1 a(y1 y1Var, n nVar) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) ((s) nVar).j(g.f43289a);
        Lifecycle.State state = Lifecycle.State.STARTED;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        Object value = y1Var.getValue();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Object[] objArr = {y1Var, lifecycle, state, gVar};
        s sVar = (s) nVar;
        boolean zH = sVar.h(lifecycle) | sVar.d(state.ordinal()) | sVar.h(gVar) | sVar.h(y1Var);
        Object objM = sVar.M();
        m3.f fVar = m.f29332a;
        if (zH || objM == fVar) {
            b bVar = new b(lifecycle, state, gVar, y1Var, null);
            sVar.k0(bVar);
            objM = bVar;
        }
        Function2 function2 = (Function2) objM;
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = m3.i.w(value);
            sVar.k0(objM2);
        }
        b1 b1Var = (b1) objM2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH2 = sVar.h(function2);
        Object objM3 = sVar.M();
        if (zH2 || objM3 == fVar) {
            objM3 = new x2(function2, b1Var, null, 3);
            sVar.k0(objM3);
        }
        m3.i.i(objArrCopyOf, (Function2) objM3, sVar);
        return b1Var;
    }
}
