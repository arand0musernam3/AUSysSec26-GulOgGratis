package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 {
    public static h8.a a(h8.g gVar, h8.e eVar, h8.e eVar2, Map map, Map map2) {
        String strC;
        h8.a aVarC = gVar.c();
        eVar.getClass();
        LinkedHashMap linkedHashMap = ((h8.a) gVar).f21658a;
        String strC2 = "[]";
        if (!linkedHashMap.containsKey(eVar)) {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.q0.f29842a, 1), map);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = (!(map instanceof Map) && (map instanceof List)) ? "[]" : "{}";
            }
            aVarC.g(eVar, strC);
        }
        eVar2.getClass();
        if (!linkedHashMap.containsKey(eVar2)) {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar2 = n90.c.f30748d;
                bVar2.getClass();
                strC2 = bVar2.c(new m90.f0(m90.r1.f29848a, m90.q0.f29842a, 1), map2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                if ((map2 instanceof Map) || !(map2 instanceof List)) {
                    strC2 = "{}";
                }
            }
            aVarC.g(eVar2, strC2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(25), 7, (Object) null);
        return aVarC;
    }

    public static final String b(String str) {
        return e0.f.k("Migrated last request timestamp key: ", str);
    }

    public static final String c() {
        return "Failed to migrate endpoint metadata to DataStore.";
    }

    public static final String b() {
        return "Starting migration for endpoint metadata";
    }

    public static Pair a(f8.d dVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMapB = dVar.b();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapB.entrySet()) {
            if (entry.getValue() instanceof Long) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            c1 c1Var = k1.f10604b;
            value.getClass();
            c1Var.a(str, ((Long) value).longValue(), linkedHashMap, linkedHashMap2);
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    public static final String a(String str) {
        return e0.f.k("Migrated attempt count key: ", str);
    }

    public final h8.g a(f8.d dVar, h8.g gVar) {
        dVar.getClass();
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(23), 7, (Object) null);
        h8.e eVarG = wd.a.G(DataStoreKey.ENDPOINT_LAST_REQUEST_MAP.getKey());
        h8.e eVarG2 = wd.a.G(DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP.getKey());
        LinkedHashMap linkedHashMap = ((h8.a) gVar).f21658a;
        if (linkedHashMap.containsKey(eVarG) && linkedHashMap.containsKey(eVarG2)) {
            return gVar;
        }
        try {
            Pair pairA = a(dVar);
            return a(gVar, eVarG, eVarG2, (Map) pairA.f26485a, (Map) pairA.f26486b);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.f(24), 4, (Object) null);
            return gVar;
        }
    }

    public static final String a() {
        return "Endpoint metadata migration completed successfully";
    }

    public final void a(String str, long j9, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (kotlin.text.y.p(str, "uri-at-", false)) {
            linkedHashMap2.put(str, Long.valueOf(j9));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 26), 7, (Object) null);
        } else if (kotlin.text.y.p(str, "uri-", false)) {
            linkedHashMap.put(str, Long.valueOf(j9));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 27), 7, (Object) null);
        }
    }
}
