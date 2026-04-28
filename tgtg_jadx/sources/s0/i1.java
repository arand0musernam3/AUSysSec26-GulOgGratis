package s0;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f38343d = t0.OPTIONAL;

    public static i1 h() {
        return new i1(new TreeMap(l1.f38381b));
    }

    public static i1 s(u0 u0Var) {
        TreeMap treeMap = new TreeMap(l1.f38381b);
        for (g gVar : u0Var.c()) {
            Set<t0> setB = u0Var.b(gVar);
            ArrayMap arrayMap = new ArrayMap();
            for (t0 t0Var : setB) {
                arrayMap.put(t0Var, u0Var.a(gVar, t0Var));
            }
            treeMap.put(gVar, arrayMap);
        }
        return new i1(treeMap);
    }

    public final void v(g gVar, Object obj) {
        x(gVar, f38343d, obj);
    }

    public final void x(g gVar, t0 t0Var, Object obj) {
        t0 t0Var2;
        TreeMap treeMap = this.f38383a;
        Map map = (Map) treeMap.get(gVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(gVar, arrayMap);
            arrayMap.put(t0Var, obj);
            return;
        }
        t0 t0Var3 = (t0) Collections.min(map.keySet());
        if (Objects.equals(map.get(t0Var3), obj) || t0Var3 != (t0Var2 = t0.REQUIRED) || t0Var != t0Var2) {
            map.put(t0Var, obj);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Option values conflicts: ");
        sb2.append(gVar.f38329a);
        sb2.append(", existing value (");
        sb2.append(t0Var3);
        Object obj2 = map.get(t0Var3);
        sb2.append(")=");
        sb2.append(obj2);
        sb2.append(", conflicting (");
        sb2.append(t0Var);
        sb2.append(")=");
        sb2.append(obj);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void y(g gVar) {
        this.f38383a.remove(gVar);
    }
}
