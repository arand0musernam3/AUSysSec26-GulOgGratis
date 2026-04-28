package com.braze.enums;

import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final String b(String str) {
        return e0.f.k("DataStoreKey not found for key: ", str);
    }

    public final DataStoreKey a(String str) {
        str.getClass();
        DataStoreKey dataStoreKey = (DataStoreKey) ((Map) DataStoreKey.keyMap$delegate.getValue()).get(str);
        if (dataStoreKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qw.e(str, 21), 6, (Object) null);
        }
        return dataStoreKey;
    }
}
