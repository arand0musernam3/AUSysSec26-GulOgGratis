package hv;

import ao.g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f22519a;

    public f(g3 g3Var) {
        g3Var.getClass();
        this.f22519a = g3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hv.d
            if (r0 == 0) goto L13
            r0 = r6
            hv.d r0 = (hv.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            hv.d r0 = new hv.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22515j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L40
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            return r3
        L32:
            ba0.g.M(r6)
            r0.l = r4
            ao.g3 r6 = r5.f22519a
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r6 instanceof u70.p
            if (r0 != 0) goto L4c
            com.app.tgtg.model.remote.JwtTokenResponse r6 = (com.app.tgtg.model.remote.JwtTokenResponse) r6
            java.lang.String r6 = r6.getJwtToken()
        L4c:
            boolean r0 = r6 instanceof u70.p
            if (r0 == 0) goto L51
            return r3
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.f.a(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof hv.e
            if (r0 == 0) goto L13
            r0 = r5
            hv.e r0 = (hv.e) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            hv.e r0 = new hv.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f22517j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L40
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            zendesk.android.Zendesk$Companion r5 = zendesk.android.Zendesk.INSTANCE
            zendesk.android.Zendesk r5 = r5.getInstance()
            r0.l = r3
            java.lang.Object r5 = r5.getCurrentUser(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            zendesk.android.ZendeskUser r5 = (zendesk.android.ZendeskUser) r5
            if (r5 == 0) goto L49
            zendesk.android.ZendeskAuthenticationType r5 = r5.getAuthenticationType()
            goto L4a
        L49:
            r5 = 0
        L4a:
            zendesk.android.ZendeskAuthenticationType r0 = zendesk.android.ZendeskAuthenticationType.Jwt
            if (r5 != r0) goto L4f
            goto L50
        L4f:
            r3 = 0
        L50:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.f.b(z70.c):java.lang.Object");
    }
}
