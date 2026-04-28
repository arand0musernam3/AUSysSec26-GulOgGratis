package f0;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a90.d f16605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lz.i f16606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f16608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f16609e;

    public d0(h0.n nVar, j0.h hVar, v80.i1 i1Var) {
        nVar.getClass();
        hVar.getClass();
        i1Var.getClass();
        this.f16605a = v80.f0.b(kotlin.coroutines.e.c(new v80.d2(i1Var), nVar.f20988h.plus(new v80.a0("CXCP-AudioRestrictionControllerImpl"))));
        this.f16606b = new lz.i(16);
        this.f16607c = new Object();
        this.f16608d = new LinkedHashMap();
        this.f16609e = new CopyOnWriteArrayList();
        hVar.a(j0.e.SCOPE, new d1.e(this, 10));
    }

    public final e0.c a() {
        LinkedHashMap linkedHashMap = this.f16608d;
        if (linkedHashMap.containsValue(new e0.c(3))) {
            return new e0.c(3);
        }
        synchronized (this.f16607c) {
        }
        if (linkedHashMap.containsValue(new e0.c(1))) {
            return new e0.c(1);
        }
        synchronized (this.f16607c) {
        }
        if (linkedHashMap.containsValue(new e0.c(0))) {
            return new e0.c(0);
        }
        synchronized (this.f16607c) {
        }
        return null;
    }
}
