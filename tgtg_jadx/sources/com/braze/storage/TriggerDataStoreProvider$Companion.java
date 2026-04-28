package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/TriggerDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/g;", "currentData", "migrateTriggersStorageToJson", "(Lf8/d;Lh8/g;)Lh8/g;", "migrateTriggersReeligibilityToJson", "", "TRIGGERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "TRIGGERS_STORAGE_SHARED_PREFS", "TRIGGERS_REELIGIBILITY_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TriggerDataStoreProvider$Companion {
    public /* synthetic */ TriggerDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$11$lambda$10(String str) {
        return w.a0.p("Added timestamp for trigger:", str, " from SharedPreferences");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$13$lambda$12() {
        return w.a0.p("Migration for ", DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey(), " completed successfully");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$14() {
        return "Failed to migrate triggers reeligibility map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$8() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$9() {
        return "Migration already completed for triggered actions impression maps. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$0() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.TRIGGERED_ACTIONS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$1() {
        return "Migration already completed for triggered actions. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4$lambda$2(String str) {
        return e0.f.k("Added triggered action from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4$lambda$3(String str, Object obj) {
        return "Triggered action with key:" + str + " and value:" + obj + " from SharedPreferences has an invalid value and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$6$lambda$5(List list) {
        return r8.k.h(list.size(), "Migration for triggered actions completed successfully. Migrated ", " actions.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$7() {
        return "Failed to migrate triggered actions to DataStore.";
    }

    public final h8.g migrateTriggersReeligibilityToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(12), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(14), 7, (Object) null);
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t3.f10697d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 17), 7, (Object) null);
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
            h8.a aVarC = currentData.c();
            aVarC.g(wd.a.G(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(15), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.f(16), 4, (Object) null);
            return currentData;
        }
    }

    public final h8.g migrateTriggersStorageToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(17), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.TRIGGERED_ACTIONS.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(18), 7, (Object) null);
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof String) || StringsKt.H((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t3.f10697d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.z1(value, 3, str), 7, (Object) null);
                } else {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t3.f10697d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 18), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(m90.r1.f29848a, 0), arrayList);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = arrayList instanceof Map ? "{}" : "[]";
            }
            h8.a aVarC = currentData.c();
            aVarC.g(wd.a.G(DataStoreKey.TRIGGERED_ACTIONS.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i90.j(3, arrayList), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.f(13), 4, (Object) null);
            return currentData;
        }
    }

    private TriggerDataStoreProvider$Companion() {
    }
}
