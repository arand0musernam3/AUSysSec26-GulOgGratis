package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"com/braze/storage/FeatureFlagsDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/g;", "currentData", "migrateFeatureFlagStorageToJson", "(Lf8/d;Lh8/g;)Lh8/g;", "migrateFeatureFlagImpressionMapToJson", "", "FEATURE_FLAGS_DATA_STORE_STORAGE", "Ljava/lang/String;", "FEATURE_FLAGS_ELIGIBILITY_SHARED_PREFS", "FEATURE_FLAGS_STORAGE_SHARED_PREFS", "FEATURE_FLAGS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeatureFlagsDataStoreProvider$Companion {
    public /* synthetic */ FeatureFlagsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$10() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$12$lambda$11(Object obj, String str) {
        return "Added impression:" + obj + " for feature flag:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$14$lambda$13() {
        return "Migration for Feature Flags impression map completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$15() {
        return "Failed to migrate Feature Flags impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$0() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.FEATURE_FLAGS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$lambda$1(String str) {
        return e0.f.k("Added feature flag from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$6$lambda$4(FeatureFlag featureFlag) {
        return String.valueOf(featureFlag != null ? e0.f.k("Successfully decoded feature flag: ", featureFlag.getId()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$6$lambda$5(String str) {
        return e0.f.k("Failed to parse FeatureFlag from JSON: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$8$lambda$7() {
        return "Migration for feature flags completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$9() {
        return "Failed to migrate feature flags storage to DataStore.";
    }

    public final h8.g migrateFeatureFlagImpressionMapToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(26), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a2.f10526d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.a((Boolean) value, str, 1), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.g.f29797a, 1), linkedHashMap);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            h8.a aVarC = currentData.c();
            aVarC.g(wd.a.G(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(27), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lu.a(28), 4, (Object) null);
            return currentData;
        }
    }

    public final h8.g migrateFeatureFlagStorageToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        FeatureFlag featureFlagA;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(23), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.FEATURE_FLAGS.getKey()))) {
            return currentData;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a2.f10526d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 14), 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                try {
                    featureFlagA = com.braze.support.n.f10766a.a(new JSONObject(str2));
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a2.f10526d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.models.r(featureFlagA, 5), 7, (Object) null);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a2.f10526d, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new dw.d(str2, 15), 4, (Object) null);
                    featureFlagA = null;
                }
                if (featureFlagA != null) {
                    arrayList2.add(featureFlagA);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(FeatureFlag.Companion.serializer(), 0), arrayList2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = arrayList2 instanceof Map ? "{}" : "[]";
            }
            h8.a aVarC = currentData.c();
            aVarC.g(wd.a.G(DataStoreKey.FEATURE_FLAGS.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(24), 7, (Object) null);
            return aVarC;
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new lu.a(25), 4, (Object) null);
            return currentData;
        }
    }

    private FeatureFlagsDataStoreProvider$Companion() {
    }
}
