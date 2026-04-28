package com.braze.requests;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.storage.i3;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.communication.e f10489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f10490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f10491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i3 f10492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.storage.p f10493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.braze.managers.r f10494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.braze.requests.util.a f10495g;

    public v(com.braze.communication.e eVar, com.braze.events.e eVar2, com.braze.events.e eVar3, i3 i3Var, com.braze.storage.p pVar, com.braze.managers.r rVar, com.braze.requests.util.a aVar) {
        eVar.getClass();
        eVar2.getClass();
        eVar3.getClass();
        i3Var.getClass();
        pVar.getClass();
        rVar.getClass();
        aVar.getClass();
        this.f10489a = eVar;
        this.f10490b = eVar2;
        this.f10491c = eVar3;
        this.f10492d = i3Var;
        this.f10493e = pVar;
        this.f10494f = rVar;
        this.f10495g = aVar;
    }

    @Override // com.braze.requests.q
    public final void a(com.braze.requests.framework.h hVar, com.braze.requests.framework.c cVar, boolean z11) {
        hVar.getClass();
        cVar.getClass();
        if (z11) {
            new e(hVar, this.f10489a, this.f10490b, this.f10491c, this.f10494f, this.f10492d, this.f10493e, this.f10495g, cVar).c();
        } else {
            f0.B(BrazeCoroutineScope.INSTANCE, null, null, new u(this, hVar, cVar, null), 3);
        }
    }
}
