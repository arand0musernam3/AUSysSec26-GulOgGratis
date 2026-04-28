package um;

import a3.f3;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.r1;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import ui.m3;
import v80.f0;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/t;", "Lmk/a;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nParcelBasketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParcelBasketViewModel.kt\ncom/app/tgtg/feature/main/fragments/delivery/basket/ui/ParcelBasketViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,471:1\n1807#2,3:472\n1586#2:475\n1661#2,3:476\n1807#2,3:479\n1586#2:482\n1661#2,3:483\n832#2:494\n862#2,2:495\n1586#2:499\n1661#2,3:500\n1807#2,3:503\n230#3,5:486\n230#3,3:491\n233#3,2:497\n*S KotlinDebug\n*F\n+ 1 ParcelBasketViewModel.kt\ncom/app/tgtg/feature/main/fragments/delivery/basket/ui/ParcelBasketViewModel\n*L\n121#1:472,3\n155#1:475\n155#1:476,3\n190#1:479,3\n202#1:482\n202#1:483,3\n331#1:494\n331#1:495,2\n349#1:499\n349#1:500,3\n346#1:503,3\n267#1:486,5\n329#1:491,3\n329#1:497,2\n*E\n"})
public final class t extends mk.a {
    public final h1 A;
    public boolean B;
    public final o0 C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3 f41427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3 f41428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r1 f41429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xm.a f41430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cv.b f41431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mv.u f41432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f41433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BasketManager f41434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41435k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1 f41436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f41437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1 f41438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f41439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f41440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f41441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f41442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2 f41443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1 f41444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a2 f41445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f41446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a2 f41447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h1 f41448y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a2 f41449z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(mk.b bVar, m3 m3Var, g3 g3Var, r1 r1Var, xm.a aVar, cv.b bVar2, mv.u uVar) {
        super(bVar);
        g3Var.getClass();
        r1Var.getClass();
        aVar.getClass();
        bVar2.getClass();
        uVar.getClass();
        this.f41427c = m3Var;
        this.f41428d = g3Var;
        this.f41429e = r1Var;
        this.f41430f = aVar;
        this.f41431g = bVar2;
        this.f41432h = uVar;
        String strValueOf = String.valueOf(g3Var.h());
        this.f41433i = strValueOf;
        this.f41434j = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(strValueOf, g3Var.n().getManufacturerBasketItemsLimit());
        Boolean bool = Boolean.FALSE;
        a2 a2VarC = y80.r.c(bool);
        this.l = a2VarC;
        this.f41436m = new h1(a2VarC);
        a2 a2VarC2 = y80.r.c(null);
        this.f41437n = a2VarC2;
        this.f41438o = new h1(a2VarC2);
        a2 a2VarC3 = y80.r.c(null);
        this.f41439p = a2VarC3;
        this.f41440q = new h1(a2VarC3);
        a2 a2VarC4 = y80.r.c(null);
        this.f41441r = a2VarC4;
        this.f41442s = new h1(a2VarC4);
        a2 a2VarC5 = y80.r.c(null);
        this.f41443t = a2VarC5;
        this.f41444u = new h1(a2VarC5);
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        a2 a2VarC6 = y80.r.c(o0Var);
        this.f41445v = a2VarC6;
        this.f41446w = a2VarC6;
        a2 a2VarC7 = y80.r.c(Boolean.TRUE);
        this.f41447x = a2VarC7;
        this.f41448y = new h1(a2VarC7);
        a2 a2VarC8 = y80.r.c(null);
        this.f41449z = a2VarC8;
        this.A = new h1(a2VarC8);
        this.B = true;
        this.C = new o0(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(um.t r11, com.app.tgtg.model.remote.manufacturer.response.BasketResponse r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um.t.f(um.t, com.app.tgtg.model.remote.manufacturer.response.BasketResponse, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(um.t r4, com.app.tgtg.model.remote.manufacturer.response.MnuRecommendationsResponse r5, com.app.tgtg.model.local.BasketManager r6, z70.c r7) {
        /*
            boolean r0 = r7 instanceof um.r
            if (r0 == 0) goto L13
            r0 = r7
            um.r r0 = (um.r) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            um.r r0 = new um.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f41423j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r7)
            goto L87
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L2e:
            ba0.g.M(r7)
            java.util.List r5 = r5.getRecommendedItems()
            if (r5 == 0) goto L87
            r7 = 0
            java.lang.Object r5 = kotlin.collections.CollectionsKt.Q(r7, r5)
            com.app.tgtg.model.remote.item.response.BaseItemMnuV2 r5 = (com.app.tgtg.model.remote.item.response.BaseItemMnuV2) r5
            if (r5 == 0) goto L87
            java.util.List r6 = r6.getBasketItems()
            if (r6 == 0) goto L4d
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L4d
            goto L6c
        L4d:
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6c
            java.lang.Object r7 = r6.next()
            com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem r7 = (com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem) r7
            java.lang.String r7 = r7.getItemId()
            java.lang.String r2 = r5.m393getItemIdFvU5WIY()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            if (r7 == 0) goto L51
            goto L87
        L6c:
            java.lang.String r6 = r5.m393getItemIdFvU5WIY()
            java.util.List r6 = kotlin.collections.c0.c(r6)
            r4.m(r6)
            y80.a2 r4 = r4.f41441r
            r0.l = r3
            r4.getClass()
            r6 = 0
            r4.k(r6, r5)
            kotlin.Unit r4 = kotlin.Unit.f26487a
            if (r4 != r1) goto L87
            return r1
        L87:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: um.t.g(um.t, com.app.tgtg.model.remote.manufacturer.response.MnuRecommendationsResponse, com.app.tgtg.model.local.BasketManager, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(um.t r6, java.util.List r7, com.app.tgtg.model.local.BasketManager r8, z70.c r9) {
        /*
            boolean r0 = r9 instanceof um.s
            if (r0 == 0) goto L13
            r0 = r9
            um.s r0 = (um.s) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            um.s r0 = new um.s
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f41425j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 == r5) goto L2f
            if (r2 != r3) goto L28
            goto L2f
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r9)
            goto Lbb
        L34:
            ba0.g.M(r9)
            java.util.ArrayList r7 = kotlin.collections.CollectionsKt.t0(r7)
            java.util.List r8 = r8.getBasketItems()
            b0.f3 r9 = new b0.f3
            r2 = 4
            r9.<init>(r8, r2)
            fn.h r8 = new fn.h
            r2 = 12
            r8.<init>(r9, r2)
            r7.removeIf(r8)
            int r8 = r7.size()
            if (r8 <= r5) goto L94
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.e0.o(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r7.iterator()
        L64:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r9.next()
            com.app.tgtg.model.remote.item.response.BaseItemMnuV2 r2 = (com.app.tgtg.model.remote.item.response.BaseItemMnuV2) r2
            java.lang.String r2 = r2.m393getItemIdFvU5WIY()
            r8.add(r2)
            goto L64
        L78:
            r6.m(r8)
            y80.a2 r8 = r6.f41443t
            com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse r9 = new com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse
            java.util.List r7 = kotlin.collections.CollectionsKt.r0(r7)
            r9.<init>(r7)
            r0.l = r5
            r8.getClass()
            r7 = 0
            r8.k(r7, r9)
            kotlin.Unit r7 = kotlin.Unit.f26487a
            if (r7 != r1) goto Lbb
            goto Lba
        L94:
            int r8 = r7.size()
            if (r8 != r5) goto Lbb
            java.lang.Object r8 = r7.get(r4)
            com.app.tgtg.model.remote.item.response.BaseItemMnuV2 r8 = (com.app.tgtg.model.remote.item.response.BaseItemMnuV2) r8
            java.lang.String r8 = r8.m393getItemIdFvU5WIY()
            java.util.List r8 = kotlin.collections.c0.c(r8)
            r6.m(r8)
            y80.a2 r8 = r6.f41441r
            java.lang.Object r7 = r7.get(r4)
            r0.l = r3
            r8.j(r7)
            kotlin.Unit r7 = kotlin.Unit.f26487a
            if (r7 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            r6.B = r4
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: um.t.h(um.t, java.util.List, com.app.tgtg.model.local.BasketManager, z70.c):java.lang.Object");
    }

    public final void i(boolean z11) {
        f0.B(m1.d(this), null, null, new f3(this, z11, null, 6), 3);
    }

    public final void j() {
        this.C.i(Boolean.FALSE);
        BasketManager basketManager = this.f41434j;
        if (basketManager != null) {
            f0.B(m1.d(this), null, null, new m(this, basketManager, null), 3);
        } else {
            f0.B(m1.d(this), null, null, new n(this, null), 3);
        }
    }

    public final void k(dv.d dVar) {
        dVar.getClass();
        BasketManager basketManager = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null);
        g3 g3Var = this.f41428d;
        BasketManager basketManagerRestoreBasketManager = basketManager.restoreBasketManager(this.f41433i, g3Var.n().getManufacturerBasketItemsLimit());
        if (basketManagerRestoreBasketManager != null) {
            String strM184getBasketIdM00Rnn0 = basketManagerRestoreBasketManager.m184getBasketIdM00Rnn0(g3Var.m().m285getUserId8nKqa5U());
            cv.i iVar = cv.i.SCREEN_BASKET_INFO;
            Pair pair = new Pair(dv.a.TYPE, new dv.c(dVar.a()));
            Pair pair2 = new Pair(dv.a.BASKET_ID, new dv.c(strM184getBasketIdM00Rnn0));
            dv.a aVar = dv.a.SCREEN;
            dv.d dVar2 = dv.d.SCREEN_BASKET;
            d(iVar, h0.g.E(pair, pair2, new Pair(aVar, new dv.c(dVar2 != null ? dVar2.a() : null))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.app.tgtg.model.remote.manufacturer.response.BasketResponse r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um.t.l(com.app.tgtg.model.remote.manufacturer.response.BasketResponse, boolean):void");
    }

    public final void m(List list) {
        cv.i iVar = cv.i.SCREEN_RECOMMENDATION;
        Pair pair = new Pair(dv.a.SCREEN, new dv.c(LatestInteractionOrigin.SCREEN_BASKET.getTrackingValue()));
        Pair pair2 = new Pair(dv.a.ITEM_ID, new dv.c(list));
        dv.a aVar = dv.a.BASKET_ID;
        BasketManager basketManager = this.f41434j;
        this.f41431g.c(iVar, h0.g.E(pair, pair2, new Pair(aVar, new dv.c(basketManager != null ? basketManager.m184getBasketIdM00Rnn0(this.f41428d.m().m285getUserId8nKqa5U()) : null))));
    }
}
