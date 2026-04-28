package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/SessionStorageDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/g;", "currentData", "migrateSealedSessionsMapToJson", "(Lf8/d;Lh8/g;)Lh8/g;", "", "SESSION_STORAGE", "Ljava/lang/String;", "SESSION_STORAGE_SHAREDPREFS_NAME", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionStorageDataStoreProvider$Companion {
    public /* synthetic */ SessionStorageDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$0() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.SESSION_STORAGE_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$2$lambda$1(String str) {
        return e0.f.k("Migrated sealed session with key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$4$lambda$3(Map map) {
        return r8.k.h(map.size(), "Migration for sealed sessions completed. Migrated ", " sessions.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$5() {
        return "Failed to migrate sealed sessions map to DataStore.";
    }

    public final h8.g migrateSealedSessionsMapToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(10), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.SESSION_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!Intrinsics.areEqual(str, DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey()) && (value instanceof String)) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k3.f10607d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 16), 7, (Object) null);
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
            h8.a aVarC = currentData.c();
            aVarC.g(wd.a.G(DataStoreKey.SESSION_STORAGE_MAP.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.e(linkedHashMap, 2), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.f(11), 4, (Object) null);
            return currentData;
        }
    }

    private SessionStorageDataStoreProvider$Companion() {
    }
}
