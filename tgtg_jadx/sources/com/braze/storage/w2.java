package com.braze.storage;

import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w2 {
    public static final String b(String str) {
        return e0.f.k("Migrated Int key: ", str);
    }

    public static final String c(String str) {
        return e0.f.k("Migrated Boolean key: ", str);
    }

    public final h8.g a(f8.d dVar, h8.g gVar) {
        String strC;
        dVar.getClass();
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.p(15), 7, (Object) null);
        try {
            h8.a aVarC = gVar.c();
            for (Map.Entry entry : dVar.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    aVarC.g(wd.a.G(str), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 21), 7, (Object) null);
                } else if (value instanceof Integer) {
                    aVarC.g(wd.a.z(str), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 22), 7, (Object) null);
                } else if (value instanceof Boolean) {
                    aVarC.g(wd.a.k(str), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 23), 7, (Object) null);
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List listR0 = CollectionsKt.r0(set);
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
                    }
                    aVarC.g(wd.a.G(str), strC);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.r(str, set), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.z1(value, 9, str), 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.p(16), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.p(17), 4, (Object) null);
            return gVar;
        }
    }

    public static final String b() {
        return "Failed to migrate runtime configuration to DataStore.";
    }

    public static final String c() {
        return "Migration for RuntimeAppConfiguration completed successfully.";
    }

    public static final String a() {
        return "Starting migration for RuntimeAppConfiguration";
    }

    public static final String a(String str) {
        return e0.f.k("Migrated String key: ", str);
    }

    public static final String a(String str, Set set) {
        return "Migrated StringSet key: " + str + " with " + set.size() + " items";
    }

    public static final String a(Object obj) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "StringSet value from SharedPreferences: ", " could not be cast to Set<String> and will not be migrated.");
    }

    public static final String a(String str, Object obj) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
        StringBuilder sb2 = new StringBuilder("Unknown type for key: ");
        sb2.append(str);
        sb2.append(", value: ");
        sb2.append(obj);
        sb2.append(" (type: ");
        return r8.k.p(sb2, simpleName, ") - skipping migration");
    }
}
