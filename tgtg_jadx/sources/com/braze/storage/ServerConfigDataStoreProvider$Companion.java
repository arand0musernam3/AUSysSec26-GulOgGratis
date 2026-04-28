package com.braze.storage;

import android.content.SharedPreferences;
import com.braze.enums.DataStoreKey;
import com.braze.storage.ServerConfigDataStoreProvider$Companion;
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
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"com/braze/storage/ServerConfigDataStoreProvider$Companion", "", "<init>", "()V", "Lf8/d;", "sharedPrefs", "Lh8/a;", "mutablePrefs", "Lcom/braze/enums/DataStoreKey;", "key", "", "migrateBlocklistedList", "(Lf8/d;Lh8/a;Lcom/braze/enums/DataStoreKey;)V", "Lh8/g;", "currentData", "migrateBlocklistedLists", "(Lf8/d;Lh8/g;)Lh8/g;", "", "SERVER_CONFIG_DATA_STORE_STORAGE", "Ljava/lang/String;", "SERVER_CONFIG_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServerConfigDataStoreProvider$Companion {
    public /* synthetic */ ServerConfigDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void migrateBlocklistedList(f8.d sharedPrefs, h8.a mutablePrefs, final DataStoreKey key) {
        String strC;
        try {
            String key2 = key.getKey();
            sharedPrefs.getClass();
            key2.getClass();
            SharedPreferences sharedPreferences = sharedPrefs.f17513a;
            sharedPrefs.a(key2);
            String string = sharedPreferences.getString(key2, null);
            if (string != null && !StringsKt.H(string)) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String string2 = jSONArray.getString(i11);
                    string2.getClass();
                    arrayList.add(string2);
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
                h8.e eVarG = wd.a.G(key.getKey());
                mutablePrefs.getClass();
                mutablePrefs.g(eVarG, strC);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.b(5, key, arrayList), 7, (Object) null);
                return;
            }
            final int i12 = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: lw.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$5(key);
                        default:
                            return ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$6(key);
                    }
                }
            }, 7, (Object) null);
        } catch (Exception e11) {
            final int i13 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e11, false, new Function0() { // from class: lw.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$5(key);
                        default:
                            return ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$6(key);
                    }
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$4(DataStoreKey dataStoreKey, List list) {
        return "Migrated " + dataStoreKey.getKey() + " with " + list.size() + " items.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$5(DataStoreKey dataStoreKey) {
        return w.a0.p("No data found for ", dataStoreKey.getKey(), ", skipping");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$6(DataStoreKey dataStoreKey) {
        return e0.f.k("Failed to migrate ", dataStoreKey.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$0() {
        return "Starting migration for blocklisted lists";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$1() {
        return "Blocklisted lists already migrated, skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$2() {
        return "Migration for blocklisted lists completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$3() {
        return "Failed to migrate blocklisted lists to DataStore";
    }

    public final h8.g migrateBlocklistedLists(f8.d sharedPrefs, h8.g currentData) {
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(6), 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.BLOCKLISTED_EVENTS;
        h8.e eVarG = wd.a.G(dataStoreKey.getKey());
        LinkedHashMap linkedHashMap = ((h8.a) currentData).f21658a;
        if (!linkedHashMap.containsKey(eVarG)) {
            DataStoreKey dataStoreKey2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES;
            if (!linkedHashMap.containsKey(wd.a.G(dataStoreKey2.getKey()))) {
                DataStoreKey dataStoreKey3 = DataStoreKey.BLOCKLISTED_PURCHASES;
                if (!linkedHashMap.containsKey(wd.a.G(dataStoreKey3.getKey()))) {
                    try {
                        h8.a aVarC = currentData.c();
                        migrateBlocklistedList(sharedPrefs, aVarC, dataStoreKey);
                        migrateBlocklistedList(sharedPrefs, aVarC, dataStoreKey2);
                        migrateBlocklistedList(sharedPrefs, aVarC, dataStoreKey3);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(7), 7, (Object) null);
                        return aVarC;
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.f(8), 4, (Object) null);
                        return currentData;
                    }
                }
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.f(9), 7, (Object) null);
        return currentData;
    }

    private ServerConfigDataStoreProvider$Companion() {
    }
}
