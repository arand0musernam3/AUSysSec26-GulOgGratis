package com.braze.events.internal.dispatchmanager;

import com.braze.models.q;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public final c a(q qVar) {
        if (qVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new wt.a(25), 7, (Object) null);
        }
        return new c(b.FLUSH_PENDING_BRAZE_EVENTS, null, qVar, null, 10);
    }

    public static final String a() {
        return "There should be a session ID here";
    }
}
