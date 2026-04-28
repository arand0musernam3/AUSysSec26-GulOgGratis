package yo;

import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.r1;
import com.app.tgtg.model.remote.item.response.ItemType;
import cv.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import qb.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyo/d;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f46328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f46329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f46330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f46331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f46332e;

    public d(g3 g3Var, cv.b bVar, r1 r1Var, e eVar) {
        g3Var.getClass();
        bVar.getClass();
        r1Var.getClass();
        this.f46328a = g3Var;
        this.f46329b = bVar;
        this.f46330c = r1Var;
        this.f46331d = eVar;
        new av.e();
        this.f46332e = new o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(yo.d r4, java.lang.String r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof yo.c
            if (r0 == 0) goto L13
            r0 = r6
            yo.c r0 = (yo.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            yo.c r0 = new yo.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f46326j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r4 = r6.f40851a
            goto L45
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r6)
            if (r5 != 0) goto L3a
            kotlin.collections.n0 r4 = kotlin.collections.n0.f26529a
            return r4
        L3a:
            ao.r1 r4 = r4.f46330c
            r0.l = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            java.lang.Throwable r5 = u70.q.a(r4)
            if (r5 != 0) goto L52
            com.app.tgtg.model.remote.item.response.SameTimeCloseByResponse r4 = (com.app.tgtg.model.remote.item.response.SameTimeCloseByResponse) r4
            java.util.List r4 = r4.recommendedItems()
            return r4
        L52:
            kotlin.collections.n0 r4 = kotlin.collections.n0.f26529a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.d.a(yo.d, java.lang.String, z70.c):java.lang.Object");
    }

    public final void b(ItemType itemType, String str) {
        itemType.getClass();
        Pair[] pairArr = {new Pair(dv.a.ITEM_TYPE, new dv.c(itemType.name()))};
        dv.b bVar = new dv.b();
        x0.i(bVar.f15174a, pairArr);
        if (str != null) {
            bVar.a(dv.a.RECOMMENDED_ITEM_ID, str);
        }
        this.f46329b.c(i.SCREEN_CELEBRATION, bVar);
    }
}
