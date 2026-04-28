package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m1 {
    public static final String b() {
        return "Failed to migrate event storage to DataStore.";
    }

    public final h8.g a(f8.d dVar, h8.g gVar) {
        String strC;
        dVar.getClass();
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(14), 7, (Object) null);
        if (((h8.a) gVar).f21658a.containsKey(wd.a.G(DataStoreKey.EVENT_STORAGE_MAP.getKey()))) {
            return gVar;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : dVar.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o1.f10639b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 1), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o1.f10639b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.b(value, 4), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                m90.r1 r1Var = m90.r1.f29848a;
                strC = bVar.c(new m90.f0(r1Var, r1Var, 1), linkedHashMap);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            h8.a aVarC = gVar.c();
            aVarC.g(wd.a.G(DataStoreKey.EVENT_STORAGE_MAP.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.e(linkedHashMap, 3), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.l(15), 4, (Object) null);
            return gVar;
        }
    }

    public static final String a() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.EVENT_STORAGE_MAP.getKey());
    }

    public static final String a(String str) {
        return e0.f.k("Added event from SharedPreferences key: ", str);
    }

    public static final String a(Object obj) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Event value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.");
    }

    public static final String a(Map map) {
        return r8.k.h(map.size(), "Migration for events completed successfully. Migrated ", " events.");
    }
}
