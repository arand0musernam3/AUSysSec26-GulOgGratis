package hr;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f22428k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, x70.c cVar) {
        super(2, cVar);
        this.f22428k = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new h(this.f22428k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r6.s(r5) == r0) goto L15;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.f22427j
            r2 = 2
            r3 = 1
            hr.i r4 = r5.f22428k
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            ba0.g.M(r6)
            goto L36
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L19:
            ba0.g.M(r6)
            goto L2b
        L1d:
            ba0.g.M(r6)
            ao.v r6 = r4.f22431c
            r5.f22427j = r3
            java.lang.Object r6 = r6.g(r5)
            if (r6 != r0) goto L2b
            goto L35
        L2b:
            ao.g3 r6 = r4.f22429a
            r5.f22427j = r2
            java.lang.Object r6 = r6.s(r5)
            if (r6 != r0) goto L36
        L35:
            return r0
        L36:
            rg.d r6 = r4.f22432d
            r6.c()
            ao.r1 r6 = r4.f22433e
            r0 = 0
            r6.f4432q = r0
            r6.f4431p = r0
            ln.i r6 = r4.f22434f
            r6.getClass()
            r6 = 0
            ft.c.S(r6)
            r6 = 0
            ft.c.U(r6)
            com.app.tgtg.model.local.BasketManager$Companion r6 = com.app.tgtg.model.local.BasketManager.INSTANCE
            r6.deleteBasket()
            hv.b r6 = r4.f22436h
            hv.j r6 = (hv.j) r6
            hv.a r0 = r6.f22535g
            hi.d r1 = new hi.d
            r2 = 11
            r1.<init>(r6, r2)
            g3.q9 r2 = new g3.q9
            r3 = 20
            r2.<init>(r6, r3)
            hv.f r0 = (hv.f) r0
            r0.getClass()
            zendesk.android.Zendesk$Companion r6 = zendesk.android.Zendesk.INSTANCE
            zendesk.android.Zendesk r6 = r6.getInstance()
            e.b r0 = new e.b
            r3 = 16
            r0.<init>(r1, r3)
            e.b r1 = new e.b
            r3 = 17
            r1.<init>(r2, r3)
            r6.logoutUser(r0, r1)
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hr.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
