package sr;

import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f39117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39118k;
    public final /* synthetic */ ContactUsViewModel l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f39119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(ContactUsViewModel contactUsViewModel, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f39117j = i11;
        this.l = contactUsViewModel;
        this.f39119m = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f39117j) {
            case 0:
                return new t(this.l, this.f39119m, cVar, 0);
            default:
                return new t(this.l, this.f39119m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f39117j) {
        }
        return ((t) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r9.g(r1, r2, r8) == r0) goto L35;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f39117j
            java.lang.String r1 = r8.f39119m
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel r4 = r8.l
            r5 = 1
            switch(r0) {
                case 0: goto L72;
                default: goto Ld;
            }
        Ld:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r6 = r8.f39118k
            if (r6 == 0) goto L21
            if (r6 != r5) goto L1d
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            java.lang.Object r9 = r9.f40851a
            goto L30
        L1d:
            com.braze.h2.b(r3)
            goto L71
        L21:
            ba0.g.M(r9)
            ao.c0 r9 = r4.f9385e
            r8.f39118k = r5
            java.lang.Object r9 = r9.c(r1, r8)
            if (r9 != r0) goto L30
            r2 = r0
            goto L71
        L30:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r9 instanceof u70.p
            if (r0 != 0) goto L59
            r0 = r9
            q90.r0 r0 = (q90.r0) r0
            av.e r0 = r4.e()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.k(r1)
            cv.i r0 = cv.i.ACTION_CONTACT_COMPLETED
            r0.getClass()
            cv.b r1 = r4.f9384d
            r1.b(r0)
            u70.t r0 = r4.f9398s
            java.lang.Object r0 = r0.getValue()
            av.e r0 = (av.e) r0
            sr.f r1 = sr.f.EMAIL_CONFIRMED
            r0.k(r1)
        L59:
            java.lang.Throwable r9 = u70.q.a(r9)
            if (r9 == 0) goto L6f
            av.e r0 = r4.e()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.k(r1)
            av.e r0 = r4.c()
            r0.k(r9)
        L6f:
            kotlin.Unit r2 = kotlin.Unit.f26487a
        L71:
            return r2
        L72:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r6 = r8.f39118k
            r7 = 2
            if (r6 == 0) goto L89
            if (r6 == r5) goto L85
            if (r6 != r7) goto L81
            ba0.g.M(r9)
            goto Lac
        L81:
            com.braze.h2.b(r3)
            goto Lae
        L85:
            ba0.g.M(r9)
            goto L9e
        L89:
            ba0.g.M(r9)
            et.z r9 = r4.f9382b
            r8.f39118k = r5
            gt.w r9 = r9.f16466b
            java.lang.Object r9 = r9.l(r1, r8)
            if (r9 != r0) goto L99
            goto L9b
        L99:
            kotlin.Unit r9 = kotlin.Unit.f26487a
        L9b:
            if (r9 != r0) goto L9e
            goto Laa
        L9e:
            gt.j r9 = r4.f9383c
            com.app.tgtg.model.remote.order.OrderState r2 = com.app.tgtg.model.remote.order.OrderState.CANCELLED
            r8.f39118k = r7
            java.lang.Object r9 = r9.g(r1, r2, r8)
            if (r9 != r0) goto Lac
        Laa:
            r2 = r0
            goto Lae
        Lac:
            kotlin.Unit r2 = kotlin.Unit.f26487a
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
