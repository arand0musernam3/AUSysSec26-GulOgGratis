package jb;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24902a;

    public l(pd.p pVar) {
        Map map = pVar.f34706a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), CollectionsKt.t0((Collection) entry.getValue()));
        }
        this.f24902a = linkedHashMap;
    }

    public List a(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f24902a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.areEqual(((qb.h) entry.getKey()).f36799a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((qb.h) it.next());
        }
        return CollectionsKt.r0(linkedHashMap.values());
    }

    public k b(qb.h hVar) {
        hVar.getClass();
        return (k) this.f24902a.remove(hVar);
    }

    public void c(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.f24902a.put(lowerCase, kotlin.collections.d0.j(str));
    }

    public k d(qb.h hVar) {
        LinkedHashMap linkedHashMap = this.f24902a;
        Object kVar = linkedHashMap.get(hVar);
        if (kVar == null) {
            kVar = new k(hVar);
            linkedHashMap.put(hVar, kVar);
        }
        return (k) kVar;
    }

    public l(int i11) {
        switch (i11) {
            case 2:
                this.f24902a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f24902a = new LinkedHashMap();
                break;
        }
    }
}
