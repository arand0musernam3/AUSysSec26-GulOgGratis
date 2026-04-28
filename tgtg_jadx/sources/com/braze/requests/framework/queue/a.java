package com.braze.requests.framework.queue;

import com.braze.requests.n;
import com.braze.requests.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.braze.requests.framework.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.braze.dispatch.h hVar) {
        super(n.f10449d, hVar);
        hVar.getClass();
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j9, com.braze.requests.framework.h hVar, com.braze.models.response.g gVar) {
        hVar.getClass();
        gVar.getClass();
        super.a(j9, hVar, gVar);
        Long l = gVar.f10220b;
        if (l != null) {
            hVar.f10417b = l.longValue() + j9;
            hVar.a(j9, com.braze.requests.framework.i.PENDING_RETRY);
            o oVar = hVar.f10416a;
            com.braze.requests.f fVar = oVar instanceof com.braze.requests.f ? (com.braze.requests.f) oVar : null;
            if (fVar != null) {
                fVar.f10383m = hVar.f10423h;
            }
        }
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j9) {
        c(j9);
    }
}
