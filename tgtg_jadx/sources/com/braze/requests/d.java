package com.braze.requests;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static void a(Object obj, Function0 function0) {
        try {
            function0.invoke();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new hw.b(obj, 0), 4, (Object) null);
        }
    }

    public static final String a(Object obj) {
        return j4.s.j(obj, "Encountered exception while parsing server response for ");
    }
}
