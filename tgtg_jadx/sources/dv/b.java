package dv;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.collections.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f15174a;

    public b() {
        this.f15174a = new LinkedHashMap();
    }

    public final void a(a aVar, Object obj) {
        aVar.getClass();
        this.f15174a.put(aVar, new c(obj));
    }

    public final void b(a aVar, Object obj) {
        aVar.getClass();
        this.f15174a.put(aVar, new c(obj));
    }

    public final LinkedHashMap c() {
        Set<Map.Entry> setEntrySet = this.f15174a.entrySet();
        int iA = w0.a(e0.o(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(((a) entry.getKey()).c(), ((c) entry.getValue()).f15175a);
        }
        return linkedHashMap;
    }

    public b(Pair... pairArr) {
        this();
        x0.i(this.f15174a, pairArr);
    }
}
