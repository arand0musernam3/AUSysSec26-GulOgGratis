package com.braze.requests.framework.queue;

import com.braze.requests.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends com.braze.requests.framework.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10432k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.braze.dispatch.h hVar) {
        super(n.f10458n, hVar);
        hVar.getClass();
        this.f10432k = true;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j9, com.braze.requests.framework.h hVar, com.braze.models.response.a aVar) {
        hVar.getClass();
        aVar.getClass();
        super.a(j9, hVar, aVar);
        hVar.a(j9, com.braze.requests.framework.i.COMPLETE);
    }

    @Override // com.braze.requests.framework.b
    public final boolean c() {
        return this.f10432k;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j9) {
    }
}
