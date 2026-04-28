package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p2 {
    public static final String b() {
        return "Push ID storage already migrated to DataStore";
    }

    public static final String c() {
        return "Migration for push ID map completed successfully";
    }

    public static final String d() {
        return "Failed to migrate push ID storage to DataStore.";
    }

    public final h8.g a(f8.d dVar, h8.g gVar) {
        String strC;
        dVar.getClass();
        gVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(22), 7, (Object) null);
        if (((h8.a) gVar).f21658a.containsKey(wd.a.G(DataStoreKey.PUSH_ID_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.l(23), 6, (Object) null);
            return gVar;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : dVar.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) r2.f10678d, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.d(str, (Long) value, 2), 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.e(linkedHashMap, 4), 7, (Object) null);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.q0.f29842a, 1), linkedHashMap);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            h8.a aVarC = gVar.c();
            aVarC.g(wd.a.G(DataStoreKey.PUSH_ID_MAP.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(24), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.l(25), 4, (Object) null);
            return gVar;
        }
    }

    public static final String a() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.PUSH_ID_MAP.getKey());
    }

    public static final String a(String str, Object obj) {
        return "Migrating push id: " + str + " with timestamp: " + obj;
    }

    public static final String a(Map map) {
        return r8.k.h(map.size(), "Migrated ", " push identifiers to DataStore");
    }
}
