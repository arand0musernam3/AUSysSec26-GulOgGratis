package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b2 {
    public static final String b() {
        return w.a0.p("Migration for ", DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey(), " completed successfully");
    }

    public static final String c(String str) {
        return w.a0.p("Failed to migrate ", str, " list to DataStore.");
    }

    public static final String d(String str) {
        return e0.f.k("Starting migration for key: ", str);
    }

    public static final String e(String str) {
        return e0.f.k("Added geofence from SharedPreferences key: ", str);
    }

    public static final String f(String str) {
        return w.a0.p("Added timestamp for geofence:", str, " from SharedPreferences");
    }

    public final h8.g a(f8.d dVar, h8.g gVar, String str) {
        String strC;
        BrazeGeofence brazeGeofence;
        dVar.getClass();
        gVar.getClass();
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 21), 7, (Object) null);
        if (((h8.a) gVar).f21658a.containsKey(new h8.e(str))) {
            return gVar;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            for (Map.Entry entry : dVar.b().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str2, 22), 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : arrayList) {
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    brazeGeofence = (BrazeGeofence) bVar.b(BrazeGeofence.Companion.serializer(), str3);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.k(brazeGeofence, 0), 7, (Object) null);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new dw.d(str3, 23), 4, (Object) null);
                    brazeGeofence = null;
                }
                if (brazeGeofence != null) {
                    arrayList2.add(brazeGeofence);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar2 = n90.c.f30748d;
                bVar2.getClass();
                strC = bVar2.c(new m90.d(BrazeGeofence.Companion.serializer(), 0), arrayList2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = arrayList2 instanceof Map ? "{}" : "[]";
            }
            h8.a aVarC = gVar.c();
            aVarC.g(new h8.e(str), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 24), 7, (Object) null);
            return aVarC;
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new dw.d(str, 25), 4, (Object) null);
            return gVar;
        }
    }

    public static final String c() {
        return "Failed to migrate individual reeligibility map to DataStore.";
    }

    public static final String b(String str) {
        return w.a0.p("Migration for ", str, " completed successfully");
    }

    public static final String a() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey());
    }

    public final h8.g a(f8.d dVar, h8.g gVar) {
        String strC;
        dVar.getClass();
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(20), 7, (Object) null);
        if (((h8.a) gVar).f21658a.containsKey(wd.a.G(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()))) {
            return gVar;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : dVar.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 20), 7, (Object) null);
                }
            }
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
            aVarC.g(wd.a.G(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(21), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.f(22), 4, (Object) null);
            return gVar;
        }
    }

    public static final String a(BrazeGeofence brazeGeofence) {
        return e0.f.k("Successfully decoded geofence: ", brazeGeofence.getId());
    }

    public static final String a(String str) {
        return e0.f.k("Failed to decode BrazeGeofence from JSON: ", str);
    }
}
