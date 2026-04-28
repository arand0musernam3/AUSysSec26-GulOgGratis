package ap;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f4550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f4551k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f4554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f4555p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f4554o = nVar;
        this.f4555p = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new m(this.f4554o, this.f4555p, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (kotlin.Unit.f26487a == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r11.f4553n
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L16
            ap.n r0 = r11.f4550j
            java.lang.String r0 = (java.lang.String) r0
            ba0.g.M(r12)
            goto Lbd
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            return r4
        L1c:
            int r1 = r11.f4552m
            boolean r3 = r11.l
            java.lang.Object r5 = r11.f4551k
            java.lang.String r5 = (java.lang.String) r5
            ap.n r6 = r11.f4550j
            ba0.g.M(r12)
            u70.q r12 = (u70.q) r12
            java.lang.Object r12 = r12.f40851a
            goto L65
        L2e:
            ba0.g.M(r12)
            ap.n r6 = r11.f4554o
            com.app.tgtg.model.remote.order.Order r12 = r6.a()
            if (r12 == 0) goto Lbd
            java.lang.String r5 = r12.m428getItemIdRWxzYZM()
            if (r5 == 0) goto Lbd
            ao.r1 r12 = r6.f4562d
            boolean r1 = r11.f4555p
            r7 = r1 ^ 1
            com.app.tgtg.model.remote.order.Order r8 = r6.a()
            if (r8 == 0) goto L50
            java.lang.String r8 = r8.m431getStoreIdQ2NXY1A()
            goto L51
        L50:
            r8 = r4
        L51:
            r11.f4550j = r6
            r11.f4551k = r5
            r11.l = r1
            r9 = 0
            r11.f4552m = r9
            r11.f4553n = r3
            java.lang.Object r12 = r12.r(r5, r7, r8, r11)
            if (r12 != r0) goto L63
            goto Lbc
        L63:
            r3 = r1
            r1 = r9
        L65:
            u70.o r7 = u70.q.f40850b
            boolean r7 = r12 instanceof u70.p
            if (r7 != 0) goto Lbd
            r7 = r12
            q90.r0 r7 = (q90.r0) r7
            rg.d r7 = r6.f4563e
            r7.c()
            if (r3 != 0) goto Lbd
            cv.b r3 = r6.f4560c
            cv.i r7 = cv.i.ACTION_ADD_TO_FAVORITES
            dv.a r8 = dv.a.SOURCE
            dv.d r9 = dv.d.AFTER_RATING_BUTTON
            if (r9 == 0) goto L84
            java.lang.String r9 = r9.a()
            goto L85
        L84:
            r9 = r4
        L85:
            dv.c r10 = new dv.c
            r10.<init>(r9)
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r8, r10)
            dv.a r8 = dv.a.ITEM_ID
            dv.c r10 = new dv.c
            r10.<init>(r5)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r8, r10)
            kotlin.Pair[] r5 = new kotlin.Pair[]{r9, r5}
            dv.b r5 = h0.g.E(r5)
            r3.c(r7, r5)
            y80.a2 r3 = r6.N
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r11.f4550j = r4
            r11.f4551k = r12
            r11.f4552m = r1
            r11.f4553n = r2
            r3.getClass()
            r3.k(r4, r5)
            kotlin.Unit r12 = kotlin.Unit.f26487a
            if (r12 != r0) goto Lbd
        Lbc:
            return r0
        Lbd:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
