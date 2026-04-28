package com.braze.requests.framework.queue;

import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.requests.y;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends com.braze.requests.framework.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.requests.util.b f10433k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.braze.dispatch.h hVar) {
        super(n.f10452g, hVar);
        hVar.getClass();
        int iK = hVar.f9696a.f10026o.k();
        this.f10433k = new com.braze.requests.util.b((int) TimeConstants.ONE_MINUTE_DIFFERENCE, com.braze.requests.util.b.f10472g, iK, hVar.f9696a.f10026o.l());
    }

    public static final String b(com.braze.requests.framework.h hVar, long j9) {
        return e0.f.k("Template request will not be retried. Marking as complete. ", hVar.a(j9));
    }

    public static final String c(com.braze.requests.framework.h hVar, long j9) {
        return e0.f.k("Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. ", hVar.a(j9));
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j9) {
        ArrayList arrayList = this.f10390e;
        ArrayList<com.braze.requests.framework.h> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((com.braze.requests.framework.h) obj).f10419d == com.braze.requests.framework.i.PENDING_RETRY) {
                arrayList2.add(obj);
            }
        }
        for (com.braze.requests.framework.h hVar : arrayList2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iw.b(hVar, j9, 4), 7, (Object) null);
            hVar.a(j9, com.braze.requests.framework.i.COMPLETE);
        }
        ArrayList arrayList3 = this.f10390e;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((com.braze.requests.framework.h) obj2).f10419d == com.braze.requests.framework.i.PENDING_START) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<com.braze.requests.framework.h> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            com.braze.requests.framework.h hVar2 = (com.braze.requests.framework.h) obj3;
            o oVar = hVar2.f10416a;
            y yVar = oVar instanceof y ? (y) oVar : null;
            if ((yVar != null ? ((com.braze.triggers.events.i) yVar.l).f10848b + yVar.f10501o : -1L) < hVar2.f10417b) {
                arrayList5.add(obj3);
            }
        }
        for (com.braze.requests.framework.h hVar3 : arrayList5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iw.b(hVar3, j9, 5), 7, (Object) null);
            hVar3.a(j9, com.braze.requests.framework.i.COMPLETE);
        }
    }

    @Override // com.braze.requests.framework.b
    public final com.braze.requests.util.b a() {
        return this.f10433k;
    }
}
