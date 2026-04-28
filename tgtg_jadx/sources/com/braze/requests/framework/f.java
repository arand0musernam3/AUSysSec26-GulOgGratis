package com.braze.requests.framework;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements c {
    public static final String b(com.braze.models.response.g gVar) {
        return "Shutdown sync got success response: " + gVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.a aVar) {
        aVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hi.d(aVar, 20), 7, (Object) null);
    }

    public static final String b(com.braze.models.response.a aVar) {
        return "Shutdown sync got error response: " + aVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.g gVar) {
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new fw.a(gVar, 2), 7, (Object) null);
    }
}
