package f0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.g0 f16848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.n f16849c;

    public q(h0.n nVar, i0.g0 g0Var, e0.n nVar2, int i11) {
        this.f16847a = i11;
        nVar.getClass();
        nVar2.getClass();
        switch (i11) {
            case 1:
                this.f16848b = g0Var;
                this.f16849c = nVar2;
                break;
            default:
                this.f16848b = g0Var;
                this.f16849c = nVar2;
                break;
        }
    }

    @Override // f0.k2
    public final j2 a(r1 r1Var, Map map, s2 s2Var) {
        boolean zG;
        int i11 = this.f16847a;
        r1Var.getClass();
        map.getClass();
        s2Var.getClass();
        switch (i11) {
            case 0:
                ArrayList arrayList = this.f16849c.f15372d;
                h2 h2Var = h2.f16710a;
                if (arrayList != null) {
                    e0.b1 b1Var = (e0.b1) CollectionsKt.h0(((e0.s0) CollectionsKt.h0(arrayList)).f15404a.f15327a);
                    InputConfiguration inputConfiguration = new InputConfiguration(b1Var.f15314a.getWidth(), b1Var.f15314a.getHeight(), b1Var.f15315b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!r1Var.u0(inputConfiguration, arrayList2, s2Var)) {
                        Log.w("CXCP", "Failed to create reprocessable captures session from " + r1Var + " for " + s2Var + '!');
                        s2Var.a();
                        return h2Var;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!r1Var.Z(arrayList3, s2Var)) {
                        Log.w("CXCP", "Failed to create captures session from " + r1Var + " for " + s2Var + '!');
                        s2Var.a();
                        return h2Var;
                    }
                }
                v70.i iVarA = y3.a(map, this.f16848b);
                kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                o0Var.getClass();
                return new i2(o0Var, iVarA);
            default:
                i0.g0 g0Var = this.f16848b;
                e0.n nVar = this.f16849c;
                b3 b3VarB = y3.b(nVar, g0Var, map);
                ArrayList arrayList4 = b3VarB.f16576a;
                boolean zIsEmpty = arrayList4.isEmpty();
                h2 h2Var2 = h2.f16710a;
                if (zIsEmpty) {
                    Log.w("CXCP", "Failed to create OutputConfigurations for " + nVar);
                    s2Var.a();
                    return h2Var2;
                }
                ArrayList arrayList5 = nVar.f15372d;
                if (arrayList5 == null) {
                    zG = r1Var.a0(arrayList4, s2Var);
                } else {
                    e0.b1 b1Var2 = (e0.b1) CollectionsKt.h0(((e0.s0) CollectionsKt.h0(arrayList5)).f15404a.f15327a);
                    zG = r1Var.g(new z2(b1Var2.f15314a.getWidth(), b1Var2.f15314a.getHeight(), b1Var2.f15315b), arrayList4, s2Var);
                }
                if (zG) {
                    kotlin.collections.o0 o0Var2 = kotlin.collections.o0.f26530a;
                    o0Var2.getClass();
                    return new i2(o0Var2, b3VarB.f16579d);
                }
                Log.w("CXCP", "Failed to create capture session from " + r1Var + " for " + s2Var + '!');
                s2Var.a();
                return h2Var2;
        }
    }
}
