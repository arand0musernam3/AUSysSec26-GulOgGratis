package ao;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4303k;
    public final /* synthetic */ g3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(g3 g3Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f4302j = i11;
        this.l = g3Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f4302j) {
            case 0:
                return new h2(this.l, cVar, 0);
            default:
                return new h2(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f4302j) {
        }
        return ((h2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r1.h(r2, r8) == r0) goto L26;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f4302j
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            ao.g3 r2 = r8.l
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L7b;
                default: goto Lb;
            }
        Lb:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r5 = r8.f4303k
            r6 = 2
            if (r5 == 0) goto L27
            if (r5 == r3) goto L23
            if (r5 != r6) goto L1f
            ba0.g.M(r9)
            u70.q r9 = (u70.q) r9
            r9.getClass()
            goto L78
        L1f:
            com.braze.h2.b(r1)
            goto L7a
        L23:
            ba0.g.M(r9)
            goto L63
        L27:
            ba0.g.M(r9)
            r8.f4303k = r3
            java.lang.String r9 = r2.f4279x
            if (r9 == 0) goto L31
            goto L60
        L31:
            v80.l r9 = new v80.l
            x70.c r1 = y70.f.b(r8)
            r9.<init>(r3, r1)
            r9.t()
            r1 = 0
            gy.d r3 = r2.f4273r     // Catch: java.lang.Exception -> L4b
            gy.c r5 = gy.c.V_6     // Catch: java.lang.Exception -> L4b
            ao.p2 r7 = new ao.p2     // Catch: java.lang.Exception -> L4b
            r7.<init>(r1, r2, r9)     // Catch: java.lang.Exception -> L4b
            r3.a(r5, r7)     // Catch: java.lang.Exception -> L4b
            goto L5a
        L4b:
            r3 = move-exception
            u70.o r5 = u70.q.f40850b
            r9.resumeWith(r4)
            mv.m0 r4 = sa0.a.f38953a
            java.lang.String r5 = "getDeviceFingerPrint"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4.e(r3, r5, r1)
        L5a:
            java.lang.Object r9 = r9.s()
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
        L60:
            if (r9 != r0) goto L63
            goto L76
        L63:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L78
            kt.o r1 = r2.f4259c
            com.app.tgtg.model.remote.user.requests.DeviceIdRequest r2 = new com.app.tgtg.model.remote.user.requests.DeviceIdRequest
            r2.<init>(r9)
            r8.f4303k = r6
            java.lang.Object r9 = r1.h(r2, r8)
            if (r9 != r0) goto L78
        L76:
            r4 = r0
            goto L7a
        L78:
            kotlin.Unit r4 = kotlin.Unit.f26487a
        L7a:
            return r4
        L7b:
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r5 = r8.f4303k
            if (r5 == 0) goto L8b
            if (r5 == r3) goto L87
            com.braze.h2.b(r1)
            goto La6
        L87:
            ba0.g.M(r9)
            goto La3
        L8b:
            ba0.g.M(r9)
            ft.o r9 = r2.f4267k
            y80.h1 r9 = r9.f17953c
            androidx.lifecycle.m r1 = new androidx.lifecycle.m
            r1.<init>(r2, r3)
            r8.f4303k = r3
            y80.y1 r9 = r9.f45488a
            java.lang.Object r9 = r9.collect(r1, r8)
            if (r9 != r0) goto La3
            r4 = r0
            goto La6
        La3:
            qc.y.m()
        La6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
