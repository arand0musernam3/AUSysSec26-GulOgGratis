package f0;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.g0 f16813a;

    public p(i0.g0 g0Var, h0.n nVar) {
        nVar.getClass();
        this.f16813a = g0Var;
    }

    @Override // f0.k2
    public final j2 a(r1 r1Var, Map map, s2 s2Var) {
        r1Var.getClass();
        map.getClass();
        s2Var.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (r1Var.J(arrayList, s2Var)) {
            v70.i iVarA = y3.a(map, this.f16813a);
            kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
            o0Var.getClass();
            return new i2(o0Var, iVarA);
        }
        Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + r1Var + " for " + s2Var + '!');
        s2Var.a();
        return h2.f16710a;
    }
}
