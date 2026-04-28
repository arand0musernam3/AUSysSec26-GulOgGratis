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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"com/braze/storage/BannersDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/g;", "currentData", "migrateBannerStorageToJson", "(Lf8/d;Lh8/g;)Lh8/g;", "migrateBannerImpressionMapToJson", "", "BANNERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "BANNERS_STORAGE_SHARED_PREFS", "BANNERS_ELIGIBILITY_SHARED_PREFS", "BANNERS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannersDataStoreProvider$Companion {
    public /* synthetic */ BannersDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$11$lambda$10() {
        return "Migration for Banners impression map completed successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$12() {
        return "Failed to migrate banner impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$7() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.BANNERS_IMPRESSION_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$9$lambda$8(Object obj, String str) {
        return "Added impression:" + obj + " for banner:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$0() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.BANNERS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3$lambda$1(String str) {
        return e0.f.k("Added banner from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3$lambda$2(Object obj) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Banner value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$5$lambda$4(List list) {
        return r8.k.h(list.size(), "Migration for banners completed successfully. Migrated ", " banners.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$6() {
        return "Failed to migrate banner storage to DataStore.";
    }

    public final h8.g migrateBannerImpressionMapToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(11), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.f10548d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.a((Boolean) value, str, 0), 7, (Object) null);
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
            aVarC.g(wd.a.G(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(12), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lu.a(13), 4, (Object) null);
            return currentData;
        }
    }

    public final h8.g migrateBannerStorageToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(9), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.BANNERS.getKey()))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.f10548d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 9), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.f10548d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.b(value, 1), 7, (Object) null);
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
            aVarC.g(wd.a.G(DataStoreKey.BANNERS.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i90.j(1, arrayList), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lu.a(10), 4, (Object) null);
            return currentData;
        }
    }

    private BannersDataStoreProvider$Companion() {
    }
}
