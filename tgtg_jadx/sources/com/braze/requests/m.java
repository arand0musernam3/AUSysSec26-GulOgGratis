package com.braze.requests;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static final String b(String str) {
        return e0.f.k("No RequestEndpointDestination found for name: ", str);
    }

    public final n a(String str) {
        str.getClass();
        try {
            return n.valueOf(str);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new dw.d(str, 7), 4, (Object) null);
            return null;
        }
    }
}
