package com.braze.coroutine;

import com.braze.support.BrazeLogger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import v80.y;
import v80.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends kotlin.coroutines.a implements z {
    public e(y yVar) {
        super(yVar);
    }

    @Override // v80.z
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f.f9657a, BrazeLogger.Priority.E, th2, false, (Function0) new d(th2), 4, (Object) null);
            com.braze.events.d dVar = f.f9658b;
            if (dVar != null) {
                dVar.b(th2, Throwable.class);
            }
        } catch (Exception unused) {
        }
    }
}
