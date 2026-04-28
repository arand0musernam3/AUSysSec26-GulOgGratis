package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h2 {
    public static final String b() {
        return "Failed to migrate permission request counts to DataStore.";
    }

    public final h8.g a(f8.d dVar, h8.g gVar) {
        String strC;
        dVar.getClass();
        gVar.getClass();
        h8.e eVarG = wd.a.G(DataStoreKey.PERMISSION_REQUEST_COUNTS.getKey());
        if (!((h8.a) gVar).f21658a.containsKey(eVarG)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMapB = dVar.b();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapB.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    value.getClass();
                    linkedHashMap.put(str, (Integer) value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m2.f10628b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.z1(value, 4, str), 7, (Object) null);
                }
                if (!linkedHashMap.isEmpty()) {
                    h8.a aVarC = gVar.c();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.l0.f29821a, 1), linkedHashMap);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = "{}";
                    }
                    aVarC.g(eVarG, strC);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(28), 7, (Object) null);
                    return aVarC;
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.f(29), 4, (Object) null);
                return gVar;
            }
        }
        return gVar;
    }

    public static final String a(String str, Object obj) {
        return "Migrated permission count: " + str + " = " + obj;
    }

    public static final String a() {
        return "Permission request counts migration completed";
    }
}
