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
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/PushDeliveryDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/g;", "currentData", "migratePushDeliveryEventsToJson", "(Lf8/d;Lh8/g;)Lh8/g;", "", "PUSH_DELIVERY_DATA_STORE_STORAGE", "Ljava/lang/String;", "PUSH_DELIVERY_STORAGE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PushDeliveryDataStoreProvider$Companion {
    public /* synthetic */ PushDeliveryDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$0() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.PUSH_DELIVERY_EVENTS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$2$lambda$1(String str, Object obj) {
        return "Added PDE with campaign ID: " + str + " and timestamp: " + obj + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$4$lambda$3(Map map) {
        return "Migration for " + DataStoreKey.PUSH_DELIVERY_EVENTS.getKey() + " completed successfully with " + map.size() + " entries";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$5() {
        return "Failed to migrate push delivery events to DataStore.";
    }

    public final h8.g migratePushDeliveryEventsToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(29), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.PUSH_DELIVERY_EVENTS.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o2.f10641c, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.d(str, (Long) value, 0), 7, (Object) null);
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
            aVarC.g(wd.a.G(DataStoreKey.PUSH_DELIVERY_EVENTS.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.e(linkedHashMap, 0), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lw.f(0), 4, (Object) null);
            return currentData;
        }
    }

    private PushDeliveryDataStoreProvider$Companion() {
    }
}
