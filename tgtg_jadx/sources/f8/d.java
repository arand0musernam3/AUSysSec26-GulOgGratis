package f8;

import android.content.SharedPreferences;
import e0.f;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.collections.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f17513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f17514b;

    public d(SharedPreferences sharedPreferences, Set set) {
        sharedPreferences.getClass();
        this.f17513a = sharedPreferences;
        this.f17514b = set;
    }

    public final void a(String str) {
        Set set = this.f17514b;
        if (set == null || set.contains(str)) {
            return;
        }
        e40.a.g(f.k("Can't access key outside migration: ", str));
    }

    public final LinkedHashMap b() {
        Map<String, ?> all = this.f17513a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f17514b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.v0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final LinkedHashSet c(String str, p0 p0Var) {
        str.getClass();
        a(str);
        Set<String> stringSet = this.f17513a.getStringSet(str, p0Var);
        if (stringSet != null) {
            return CollectionsKt.u0(stringSet);
        }
        return null;
    }
}
