package f0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.n f16873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.n f16874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.g0 f16875c;

    public s(h0.n nVar, e0.n nVar2, i0.g0 g0Var) {
        nVar.getClass();
        nVar2.getClass();
        this.f16873a = nVar;
        this.f16874b = nVar2;
        this.f16875c = g0Var;
    }

    @Override // f0.k2
    public final j2 a(r1 r1Var, Map map, s2 s2Var) {
        int i11;
        ArrayList arrayList;
        r1Var.getClass();
        map.getClass();
        s2Var.getClass();
        e0.n nVar = this.f16874b;
        int i12 = nVar.f15376h;
        if (i12 == 0) {
            i11 = 0;
        } else if (i12 == 1) {
            i11 = 1;
        } else {
            if (i12 == 2) {
                j4.d.t(o00.h0.G(nVar.f15376h), "Unsupported session mode: ");
                return null;
            }
            i11 = i12;
        }
        b3 b3VarB = y3.b(nVar, this.f16875c, map);
        ArrayList arrayList2 = b3VarB.f16576a;
        boolean zIsEmpty = arrayList2.isEmpty();
        h2 h2Var = h2.f16710a;
        if (zIsEmpty) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + nVar);
            s2Var.a();
            return h2Var;
        }
        ArrayList arrayList3 = nVar.f15372d;
        if (arrayList3 != null) {
            arrayList = new ArrayList(kotlin.collections.e0.o(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                e0.b1 b1Var = (e0.b1) CollectionsKt.h0(((e0.s0) it.next()).f15404a.f15327a);
                arrayList.add(new z2(b1Var.f15314a.getWidth(), b1Var.f15314a.getHeight(), b1Var.f15315b));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                if (((z2) it2.next()).f17019c != ((z2) arrayList4.get(0)).f17019c) {
                    com.braze.h2.b("All InputStream.Config objects must have the same format for multi resolution");
                    return null;
                }
            }
        }
        if (r1Var.Q(new z3(i11, arrayList4, arrayList2, (Executor) this.f16873a.f20990j.getValue(), s2Var, nVar.f15374f, nVar.f15375g))) {
            return new i2(b3VarB.f16577b, b3VarB.f16579d);
        }
        Log.w("CXCP", "Failed to create capture session from " + r1Var + " for " + s2Var + '!');
        s2Var.a();
        return h2Var;
    }
}
