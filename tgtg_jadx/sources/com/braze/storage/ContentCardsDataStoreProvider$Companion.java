package com.braze.storage;

import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/ContentCardsDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/g;", "currentData", "migrateContentCardsStorageToJson", "(Lf8/d;Lh8/g;)Lh8/g;", "migrateContentCardsMetadataToJson", "", "CONTENT_CARDS_DATA_STORE_STORAGE", "Ljava/lang/String;", "CARD_CACHE_SHARED_PREFS", "METADATA_CACHE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContentCardsDataStoreProvider$Companion {
    public /* synthetic */ ContentCardsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$7() {
        return "Starting migration for Content Cards metadata keys.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$8() {
        return "Metadata migration completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$9() {
        return "Failed to migrate content cards metadata to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$0() {
        return e0.f.k("Starting migration for key: ", DataStoreKey.CONTENT_CARDS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3$lambda$1(String str) {
        return e0.f.k("Added content card from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3$lambda$2(Object obj) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Content card value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$5$lambda$4(List list) {
        return r8.k.h(list.size(), "Migration for content cards completed successfully. Migrated ", " cards.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$6() {
        return "Failed to migrate content cards storage to DataStore.";
    }

    public final h8.g migrateContentCardsMetadataToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        String strC2;
        String str = Constants.BRAZE_SDK_VERSION;
        String strC3 = "[]";
        sharedPrefs.getClass();
        SharedPreferences sharedPreferences = sharedPrefs.f17513a;
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(16), 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            h8.a aVarC = currentData.c();
            String key = dataStoreKey.getKey();
            kotlin.collections.p0 p0Var = kotlin.collections.p0.f26531a;
            LinkedHashSet linkedHashSetC = sharedPrefs.c(key, p0Var);
            if (linkedHashSetC != null) {
                p0Var = linkedHashSetC;
            }
            List listR0 = CollectionsKt.r0(p0Var);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.d(m90.r1.f29848a, 0), listR0);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
            }
            aVarC.g(wd.a.G(DataStoreKey.DISMISSED_CARDS.getKey()), strC);
            String key2 = DataStoreKey.EXPIRED_CARDS.getKey();
            kotlin.collections.p0 p0Var2 = kotlin.collections.p0.f26531a;
            LinkedHashSet linkedHashSetC2 = sharedPrefs.c(key2, p0Var2);
            if (linkedHashSetC2 != null) {
                p0Var2 = linkedHashSetC2;
            }
            List listR02 = CollectionsKt.r0(p0Var2);
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar2 = n90.c.f30748d;
                bVar2.getClass();
                strC2 = bVar2.c(new m90.d(m90.r1.f29848a, 0), listR02);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC2 = ((listR02 instanceof Map) || listR02 == null) ? "{}" : "[]";
            }
            aVarC.g(wd.a.G(DataStoreKey.EXPIRED_CARDS.getKey()), strC2);
            String key3 = DataStoreKey.TEST_CARDS.getKey();
            kotlin.collections.p0 p0Var3 = kotlin.collections.p0.f26531a;
            LinkedHashSet linkedHashSetC3 = sharedPrefs.c(key3, p0Var3);
            if (linkedHashSetC3 != null) {
                p0Var3 = linkedHashSetC3;
            }
            List listR03 = CollectionsKt.r0(p0Var3);
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar3 = n90.c.f30748d;
                bVar3.getClass();
                strC3 = bVar3.c(new m90.d(m90.r1.f29848a, 0), listR03);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                if ((listR03 instanceof Map) || listR03 == null) {
                    strC3 = "{}";
                }
            }
            aVarC.g(wd.a.G(DataStoreKey.TEST_CARDS.getKey()), strC3);
            DataStoreKey dataStoreKey2 = DataStoreKey.LAST_CARD_UPDATED_AT;
            String key4 = dataStoreKey2.getKey();
            key4.getClass();
            sharedPrefs.a(key4);
            aVarC.g(wd.a.C(dataStoreKey2.getKey()), Long.valueOf(sharedPreferences.getLong(key4, 0L)));
            DataStoreKey dataStoreKey3 = DataStoreKey.LAST_FULL_CARD_SYNC_AT;
            String key5 = dataStoreKey3.getKey();
            key5.getClass();
            sharedPrefs.a(key5);
            aVarC.g(wd.a.C(dataStoreKey3.getKey()), Long.valueOf(sharedPreferences.getLong(key5, 0L)));
            DataStoreKey dataStoreKey4 = DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
            String key6 = dataStoreKey4.getKey();
            key6.getClass();
            sharedPrefs.a(key6);
            aVarC.g(wd.a.C(dataStoreKey4.getKey()), Long.valueOf(sharedPreferences.getLong(key6, 0L)));
            DataStoreKey dataStoreKey5 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
            String key7 = dataStoreKey5.getKey();
            key7.getClass();
            sharedPrefs.a(key7);
            String string = sharedPreferences.getString(key7, Constants.BRAZE_SDK_VERSION);
            if (string != null) {
                str = string;
            }
            aVarC.g(wd.a.G(dataStoreKey5.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(17), 7, (Object) null);
            return aVarC;
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new lu.a(18), 4, (Object) null);
            return currentData;
        }
    }

    public final h8.g migrateContentCardsStorageToJson(f8.d sharedPrefs, h8.g currentData) {
        String strC;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lu.a(14), 7, (Object) null);
        if (((h8.a) currentData).f21658a.containsKey(wd.a.G(DataStoreKey.CONTENT_CARDS.getKey()))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m.f10621d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.d(str, 10), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m.f10621d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.b(value, 2), 7, (Object) null);
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
            aVarC.g(wd.a.G(DataStoreKey.CONTENT_CARDS.getKey()), strC);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVarC, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i90.j(2, arrayList), 7, (Object) null);
            return aVarC;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new lu.a(15), 4, (Object) null);
            return currentData;
        }
    }

    private ContentCardsDataStoreProvider$Companion() {
    }
}
