package com.braze.requests;

import com.app.tgtg.model.local.AppConstants;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.managers.r f10443b;

    public i(com.braze.events.e eVar, com.braze.managers.r rVar) {
        eVar.getClass();
        rVar.getClass();
        this.f10442a = eVar;
        this.f10443b = rVar;
        new ArrayList();
    }

    @Override // com.braze.requests.q
    public final void a(com.braze.requests.framework.h hVar, com.braze.requests.framework.c cVar, boolean z11) {
        hVar.getClass();
        cVar.getClass();
        o oVar = hVar.f10416a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hi.d(oVar, 12), 7, (Object) null);
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        com.braze.models.response.g gVar = new com.braze.models.response.g(oVar, new com.braze.communication.d(AppConstants.PERMISSIONS_REQUEST_USE_LOCATION, o0Var, 4), this.f10443b);
        com.braze.events.e eVar = this.f10442a;
        oVar.a(eVar, eVar, gVar);
        oVar.a(this.f10442a);
        cVar.a(gVar);
        ((com.braze.events.d) this.f10442a).b(new com.braze.events.internal.g(oVar), com.braze.events.internal.g.class);
    }

    public static final String a(o oVar) {
        return r8.k.h(oVar.hashCode(), "Short circuiting execution of network request (", ") and immediately marking it as succeeded.");
    }
}
