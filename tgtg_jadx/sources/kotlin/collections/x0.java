package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class x0 extends w0 {
    public static Object c(Object obj, Map map) {
        map.getClass();
        if (map instanceof u0) {
            return ((u0) map).c();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        qc.y.h(org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Key ", " is missing in the map."));
        return null;
    }

    public static HashMap d(Pair... pairArr) {
        HashMap map = new HashMap(w0.a(pairArr.length));
        i(map, pairArr);
        return map;
    }

    public static Map e(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(w0.a(pairArr.length));
            i(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        return o0Var;
    }

    public static LinkedHashMap f(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(w0.a(pairArr.length));
        i(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap g(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map h(Map map, Pair pair) {
        map.getClass();
        if (map.isEmpty()) {
            return w0.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f26485a, pair.f26486b);
        return linkedHashMap;
    }

    public static void i(HashMap map, Pair[] pairArr) {
        map.getClass();
        for (Pair pair : pairArr) {
            map.put(pair.f26485a, pair.f26486b);
        }
    }

    public static Map j(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                return o0Var;
            }
            if (size == 1) {
                return w0.b((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(w0.a(collection.size()));
            l(iterable, linkedHashMap);
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        l(iterable, linkedHashMap2);
        int size2 = linkedHashMap2.size();
        if (size2 == 0) {
            o0 o0Var2 = o0.f26530a;
            o0Var2.getClass();
            return o0Var2;
        }
        if (size2 != 1) {
            return linkedHashMap2;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map k(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static final void l(Iterable iterable, LinkedHashMap linkedHashMap) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f26485a, pair.f26486b);
        }
    }

    public static LinkedHashMap m(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
