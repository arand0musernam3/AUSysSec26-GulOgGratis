package pk;

import ao.r1;
import ft.j;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f35465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f35466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gs.a f35467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg.d f35468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wj.d f35469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d8.f f35470f;

    public i(j jVar, r1 r1Var, gs.a aVar, rg.d dVar, wj.d dVar2, d8.f fVar) {
        this.f35465a = jVar;
        this.f35466b = r1Var;
        this.f35467c = aVar;
        this.f35468d = dVar;
        this.f35469e = dVar2;
        this.f35470f = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.util.List r6, z70.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof pk.a
            if (r0 == 0) goto L13
            r0 = r7
            pk.a r0 = (pk.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            pk.a r0 = new pk.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f35437j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            ba0.g.M(r7)
            u70.q r7 = (u70.q) r7
            r7.getClass()
            goto L41
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L33:
            ba0.g.M(r7)
            r0.l = r3
            wj.d r7 = r4.f35469e
            java.lang.Object r5 = r7.a(r5, r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.i.a(java.lang.String, java.util.List, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        if (r1 == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r23, com.app.tgtg.model.remote.item.LatLngInfo r24, z70.c r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof pk.b
            if (r2 == 0) goto L17
            r2 = r1
            pk.b r2 = (pk.b) r2
            int r3 = r2.f35444p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f35444p = r3
            goto L1c
        L17:
            pk.b r2 = new pk.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f35442n
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.f35444p
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L4a
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L33
            ba0.g.M(r1)
            u70.q r1 = (u70.q) r1
            java.lang.Object r1 = r1.f40851a
            goto La7
        L33:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L3a:
            java.lang.String r4 = r2.f35441m
            ao.r1 r6 = r2.l
            com.app.tgtg.model.remote.item.LatLngInfo r7 = r2.f35440k
            java.lang.String r8 = r2.f35439j
            ba0.g.M(r1)
            r14 = r8
        L46:
            r10 = r4
            r17 = r7
            goto L70
        L4a:
            ba0.g.M(r1)
            com.app.tgtg.model.remote.item.requests.RecommendationType r1 = com.app.tgtg.model.remote.item.requests.RecommendationType.ITEM_SOLD_OUT
            java.lang.String r4 = r1.toString()
            r1 = r23
            r2.f35439j = r1
            r7 = r24
            r2.f35440k = r7
            ao.r1 r8 = r0.f35466b
            r2.l = r8
            r2.f35441m = r4
            r2.f35444p = r6
            ft.j r6 = r0.f35465a
            java.lang.Object r6 = r6.g(r2)
            if (r6 != r3) goto L6c
            goto La6
        L6c:
            r14 = r1
            r1 = r6
            r6 = r8
            goto L46
        L70:
            r11 = r1
            com.app.tgtg.model.remote.item.LatLngInfo r11 = (com.app.tgtg.model.remote.item.LatLngInfo) r11
            com.app.tgtg.model.remote.item.requests.SortingType r1 = com.app.tgtg.model.remote.item.requests.SortingType.RELEVANCE
            java.lang.String r15 = r1.toString()
            com.app.tgtg.model.remote.item.requests.ItemStockOptionType r1 = com.app.tgtg.model.remote.item.requests.ItemStockOptionType.STOCK_ONLY
            java.lang.String r16 = r1.toString()
            java.lang.Integer r1 = new java.lang.Integer
            r4 = 10
            r1.<init>(r4)
            com.app.tgtg.model.remote.item.requests.RecommendationsListRequest r9 = new com.app.tgtg.model.remote.item.requests.RecommendationsListRequest
            r12 = 4629137466983448576(0x403e000000000000, double:30.0)
            r18 = 0
            r20 = 128(0x80, float:1.8E-43)
            r21 = 0
            r19 = r1
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = 0
            r2.f35439j = r1
            r2.f35440k = r1
            r2.l = r1
            r2.f35441m = r1
            r2.f35444p = r5
            java.lang.Object r1 = r6.k(r9, r2)
            if (r1 != r3) goto La7
        La6:
            return r3
        La7:
            java.lang.Throwable r2 = u70.q.a(r1)
            if (r2 != 0) goto Lb4
            com.app.tgtg.model.remote.item.response.ListItemResponse r1 = (com.app.tgtg.model.remote.item.response.ListItemResponse) r1
            java.util.List r1 = r1.getItems()
            return r1
        Lb4:
            kotlin.collections.n0 r1 = kotlin.collections.n0.f26529a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.i.b(java.lang.String, com.app.tgtg.model.remote.item.LatLngInfo, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, z70.c r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pk.c
            if (r0 == 0) goto L13
            r0 = r6
            pk.c r0 = (pk.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            pk.c r0 = new pk.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f35445j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            wj.d r6 = r4.f35469e
            java.lang.Object r5 = r6.b(r5, r0, r7)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.i.c(java.lang.String, z70.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pk.d
            if (r0 == 0) goto L13
            r0 = r6
            pk.d r0 = (pk.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            pk.d r0 = new pk.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f35447j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.l = r3
            ao.r1 r6 = r4.f35466b
            java.lang.Object r5 = r6.g(r5, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.i.d(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (r0 != r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r22, z70.c r23) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.i.e(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.app.tgtg.model.remote.item.response.BasicItem r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pk.h
            if (r0 == 0) goto L13
            r0 = r6
            pk.h r0 = (pk.h) r0
            int r1 = r0.f35464m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35464m = r1
            goto L18
        L13:
            pk.h r0 = new pk.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f35463k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f35464m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            com.app.tgtg.model.remote.item.response.BasicItem r5 = r0.f35462j
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L44
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r6)
            r0.f35462j = r5
            r0.f35464m = r3
            ao.r1 r6 = r4.f35466b
            java.lang.Object r6 = r6.s(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r6 instanceof u70.p
            if (r0 != 0) goto L59
            q90.r0 r6 = (q90.r0) r6
            boolean r6 = r5.getFavorite()
            r6 = r6 ^ r3
            mv.d.f(r5, r6)
            rg.d r5 = r4.f35468d
            r5.c()
        L59:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.i.f(com.app.tgtg.model.remote.item.response.BasicItem, z70.c):java.lang.Object");
    }

    public final Object g(String str, boolean z11, z70.i iVar) {
        Object objF;
        kt.d dVar = this.f35469e.f43506b;
        if (z11) {
            objF = dVar.a(str, iVar);
            if (objF != y70.a.COROUTINE_SUSPENDED) {
                objF = Unit.f26487a;
            }
        } else {
            objF = dVar.f(str, iVar);
            if (objF != y70.a.COROUTINE_SUSPENDED) {
                objF = Unit.f26487a;
            }
        }
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : Unit.f26487a;
    }
}
