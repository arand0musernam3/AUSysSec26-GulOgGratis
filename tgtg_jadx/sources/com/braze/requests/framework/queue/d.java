package com.braze.requests.framework.queue;

import com.braze.requests.n;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends com.braze.requests.framework.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, com.braze.dispatch.h hVar) {
        super(nVar, hVar);
        nVar.getClass();
        hVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new jt.g(nVar, 1), 7, (Object) null);
    }

    public static final String a(n nVar) {
        return "Default queue created for dest " + nVar;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j9) {
    }
}
