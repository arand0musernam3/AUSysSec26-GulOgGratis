package com.braze.requests.framework.queue;

import com.braze.models.outgoing.k;
import com.braze.p0;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.support.BrazeLogger;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends com.braze.requests.framework.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f10430k = BrazeLogger.getBrazeLogTag((Class<?>) c.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.braze.dispatch.h hVar) {
        super(n.f10451f, hVar);
        hVar.getClass();
    }

    public final void a(long j9, com.braze.requests.framework.h hVar, List list) {
        com.braze.models.b bVar;
        com.braze.models.b bVar2;
        com.braze.requests.framework.h hVar2 = hVar;
        o oVar = hVar2 != null ? hVar2.f10416a : null;
        com.braze.requests.g gVar = oVar instanceof com.braze.requests.g ? (com.braze.requests.g) oVar : null;
        if (gVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.braze.requests.framework.h hVar3 = (com.braze.requests.framework.h) it.next();
            o oVar2 = hVar3.f10416a;
            com.braze.requests.g gVar2 = oVar2 instanceof com.braze.requests.g ? (com.braze.requests.g) oVar2 : null;
            if (gVar2 != null && ((gVar.f10435m == null || gVar2.f10435m == null) && (((bVar = gVar.f10436n) == null || bVar.f10134b) && ((bVar2 = gVar2.f10436n) == null || bVar2.f10134b)))) {
                k kVar = gVar2.f10434k;
                Boolean bool = (gVar.f10434k.c() || kVar.c()) ? Boolean.TRUE : null;
                k kVar2 = gVar.f10434k;
                com.braze.models.outgoing.i iVar = kVar2.f10208c;
                if (iVar == null) {
                    iVar = null;
                }
                com.braze.models.outgoing.i iVar2 = kVar.f10208c;
                if (iVar2 != null) {
                    iVar = iVar2;
                }
                String str = kVar2.f10206a;
                if (str == null) {
                    str = null;
                }
                String str2 = kVar.f10206a;
                if (str2 != null) {
                    str = str2;
                }
                gVar.f10434k = new k(str, bool, iVar);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10430k, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new p0(hVar3, j9, hVar2, 4), 14, (Object) null);
                hVar3.a(j9, com.braze.requests.framework.i.BATCHED);
                hVar2 = hVar;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i2.e(13, gVar2, hVar2), 7, (Object) null);
            }
        }
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j9) {
        ArrayList arrayList = this.f10390e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((com.braze.requests.framework.h) obj).f10419d.a()) {
                arrayList2.add(obj);
            }
        }
        List listL0 = CollectionsKt.l0(arrayList2, new b());
        int size = listL0.size();
        if (size < 2) {
            return;
        }
        a(j9, (com.braze.requests.framework.h) CollectionsKt.O(listL0), listL0.subList(1, size));
    }

    public static final String a(com.braze.requests.framework.h hVar, long j9, com.braze.requests.framework.h hVar2) {
        return s.k("Batched request ", hVar.a(j9), " and combined into ", hVar2.a(j9));
    }

    public static final String a(com.braze.requests.g gVar, com.braze.requests.framework.h hVar) {
        return "Could not merge other request: " + gVar + " into parent: " + hVar;
    }
}
