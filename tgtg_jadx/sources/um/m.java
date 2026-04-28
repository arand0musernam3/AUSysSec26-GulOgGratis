package um;

import com.app.tgtg.model.local.BasketManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f41401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f41402k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f41404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BasketManager f41405o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, BasketManager basketManager, x70.c cVar) {
        super(2, cVar);
        this.f41404n = tVar;
        this.f41405o = basketManager;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new m(this.f41404n, this.f41405o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r11.f41403m
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            um.t r9 = r11.f41404n
            if (r1 == 0) goto L46
            if (r1 == r7) goto L42
            if (r1 == r6) goto L39
            if (r1 == r5) goto L2f
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1e
            ba0.g.M(r12)
            goto Lbf
        L1e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            return r2
        L24:
            int r8 = r11.l
            um.t r9 = r11.f41402k
            java.lang.Object r1 = r11.f41401j
            ba0.g.M(r12)
            goto La8
        L2f:
            um.t r1 = r11.f41402k
            com.app.tgtg.model.remote.manufacturer.response.BasketResponse r1 = (com.app.tgtg.model.remote.manufacturer.response.BasketResponse) r1
            java.lang.Object r1 = r11.f41401j
            ba0.g.M(r12)
            goto L8c
        L39:
            ba0.g.M(r12)
            u70.q r12 = (u70.q) r12
            java.lang.Object r12 = r12.f40851a
        L40:
            r1 = r12
            goto L74
        L42:
            ba0.g.M(r12)
            goto L5a
        L46:
            ba0.g.M(r12)
            y80.a2 r12 = r9.l
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r11.f41403m = r7
            r12.getClass()
            r12.k(r2, r1)
            kotlin.Unit r12 = kotlin.Unit.f26487a
            if (r12 != r0) goto L5a
            goto Lbe
        L5a:
            ao.r1 r12 = r9.f41429e
            com.app.tgtg.model.remote.manufacturer.request.BasketRequest r1 = new com.app.tgtg.model.remote.manufacturer.request.BasketRequest
            com.app.tgtg.model.local.BasketManager r7 = r11.f41405o
            java.lang.String r10 = r7.getCountryId()
            java.util.List r7 = r7.getBasketItems()
            r1.<init>(r10, r7)
            r11.f41403m = r6
            java.lang.Object r12 = r12.i(r1, r11)
            if (r12 != r0) goto L40
            goto Lbe
        L74:
            u70.o r12 = u70.q.f40850b
            boolean r12 = r1 instanceof u70.p
            if (r12 != 0) goto L8c
            r12 = r1
            com.app.tgtg.model.remote.manufacturer.response.BasketResponse r12 = (com.app.tgtg.model.remote.manufacturer.response.BasketResponse) r12
            r11.f41401j = r1
            r11.f41402k = r2
            r11.l = r8
            r11.f41403m = r5
            java.lang.Object r12 = um.t.f(r9, r12, r11)
            if (r12 != r0) goto L8c
            goto Lbe
        L8c:
            java.lang.Throwable r12 = u70.q.a(r1)
            if (r12 == 0) goto Lbf
            r9.f41435k = r8
            y80.a2 r12 = r9.f41437n
            com.app.tgtg.model.local.GenericErrors$Generic r5 = com.app.tgtg.model.local.GenericErrors.Generic.INSTANCE
            r11.f41401j = r1
            r11.f41402k = r9
            r11.l = r8
            r11.f41403m = r4
            r12.j(r5)
            kotlin.Unit r12 = kotlin.Unit.f26487a
            if (r12 != r0) goto La8
            goto Lbe
        La8:
            y80.a2 r12 = r9.l
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r11.f41401j = r1
            r11.f41402k = r2
            r11.l = r8
            r11.f41403m = r3
            r12.getClass()
            r12.k(r2, r4)
            kotlin.Unit r12 = kotlin.Unit.f26487a
            if (r12 != r0) goto Lbf
        Lbe:
            return r0
        Lbf:
            kotlin.Unit r12 = kotlin.Unit.f26487a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: um.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
