package com.braze.storage;

import android.content.SharedPreferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 {
    public final h8.g a(f8.d dVar, h8.g gVar) {
        String str = "";
        dVar.getClass();
        gVar.getClass();
        DataStoreKey dataStoreKey = DataStoreKey.LEGACY_DEVICE_ID;
        if (((h8.a) gVar).f21658a.containsKey(wd.a.G(dataStoreKey.getKey()))) {
            return gVar;
        }
        try {
            h8.a aVarC = gVar.c();
            String key = DataStoreKey.DEVICE_ID.getKey();
            key.getClass();
            SharedPreferences sharedPreferences = dVar.f17513a;
            dVar.a(key);
            String string = sharedPreferences.getString(key, "");
            if (string != null) {
                str = string;
            }
            aVarC.g(wd.a.G(dataStoreKey.getKey()), str);
            return aVarC;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(21), 4, (Object) null);
            return gVar;
        }
    }

    public static final String a() {
        return "Failed to migrate legacy device id to DataStore.";
    }
}
