package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"com/braze/storage/PushMaxDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/g;", "currentData", "migratePushMaxStorageToJson", "(Lf8/d;Lh8/g;)Lh8/g;", "", "PUSH_MAX_DATA_STORE_STORAGE", "Ljava/lang/String;", "PUSH_MAX_STORAGE_SHARED_PREFS", "PUSH_MAX_METADATA_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushMaxDataStoreProvider$Companion {
    public /* synthetic */ PushMaxDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$0() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$3$lambda$1(String str, Object obj) {
        return "Added push max campaign from SharedPreferences key: " + str + " with timestamp: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$3$lambda$2(Object obj) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Push max campaign value from SharedPreferences: ", " is not a Long and will not be migrated to DataStore.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$5$lambda$4(Map map) {
        return r8.k.h(map.size(), "Migration for push max campaigns completed successfully. Migrated ", " campaigns.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$6() {
        return "Failed to migrate push max storage to DataStore.";
    }

    public final h8.g migratePushMaxStorageToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(1), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) v2.f10718d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.d(str, (Long) value, 1), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) v2.f10718d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.b(value, 3), 7, (Object) null);
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
            aVarC.g(wd.a.G(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.e(linkedHashMap, 1), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.f(2), 4, (Object) null);
            return currentData;
        }
    }

    private PushMaxDataStoreProvider$Companion() {
    }
}
