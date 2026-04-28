package s0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class l1 implements u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a40.i f38381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f38382c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f38383a;

    static {
        a40.i iVar = new a40.i(13);
        f38381b = iVar;
        f38382c = new l1(new TreeMap(iVar));
    }

    public l1(TreeMap treeMap) {
        this.f38383a = treeMap;
    }

    public static l1 e(u0 u0Var) {
        if (l1.class.equals(u0Var.getClass())) {
            return (l1) u0Var;
        }
        TreeMap treeMap = new TreeMap(f38381b);
        for (g gVar : u0Var.c()) {
            Set<t0> setB = u0Var.b(gVar);
            ArrayMap arrayMap = new ArrayMap();
            for (t0 t0Var : setB) {
                arrayMap.put(t0Var, u0Var.a(gVar, t0Var));
            }
            treeMap.put(gVar, arrayMap);
        }
        return new l1(treeMap);
    }

    @Override // s0.u0
    public final Object a(g gVar, t0 t0Var) {
        Map map = (Map) this.f38383a.get(gVar);
        if (map == null) {
            j4.d.o(gVar, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(t0Var)) {
            return map.get(t0Var);
        }
        m0.i1.k("Option does not exist: ", gVar, " with priority=", t0Var);
        return null;
    }

    @Override // s0.u0
    public final Set b(g gVar) {
        Map map = (Map) this.f38383a.get(gVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // s0.u0
    public final Set c() {
        return Collections.unmodifiableSet(this.f38383a.keySet());
    }

    @Override // s0.u0
    public final Object d(g gVar) {
        Map map = (Map) this.f38383a.get(gVar);
        if (map != null) {
            return map.get((t0) Collections.min(map.keySet()));
        }
        j4.d.o(gVar, "Option does not exist: ");
        return null;
    }

    @Override // s0.u0
    public final t0 f(g gVar) {
        Map map = (Map) this.f38383a.get(gVar);
        if (map != null) {
            return (t0) Collections.min(map.keySet());
        }
        j4.d.o(gVar, "Option does not exist: ");
        return null;
    }

    @Override // s0.u0
    public final boolean g(g gVar) {
        return this.f38383a.containsKey(gVar);
    }

    @Override // s0.u0
    public final Object i(g gVar, Object obj) {
        Map map = (Map) this.f38383a.get(gVar);
        return map == null ? obj : map.get((t0) Collections.min(map.keySet()));
    }

    @Override // s0.u0
    public final void j(a50.d dVar) {
        for (Map.Entry entry : this.f38383a.tailMap(new g("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((g) entry.getKey()).f38329a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            g gVar = (g) entry.getKey();
            a50.c cVar = (a50.c) dVar.f824b;
            u0 u0Var = (u0) dVar.f825c;
            gVar.getClass();
            ((i1) cVar.f822b).x(gVar, u0Var.f(gVar), u0Var.d(gVar));
        }
    }
}
