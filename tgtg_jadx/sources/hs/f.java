package hs;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f22469k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, x70.c cVar) {
        super(2, cVar);
        this.f22469k = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f(this.f22469k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r4.collect(r11, r10) == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (kotlin.Unit.f26487a == r3) goto L26;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            hs.h r0 = r10.f22469k
            gs.a r1 = r0.f22473b
            y80.a2 r2 = r0.f22479h
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r10.f22468j
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L30
            if (r4 == r8) goto L2c
            if (r4 == r7) goto L28
            if (r4 == r6) goto L24
            if (r4 != r5) goto L1d
            ba0.g.M(r11)
            goto L86
        L1d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L24:
            ba0.g.M(r11)
            goto L78
        L28:
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L60
            goto L86
        L2c:
            ba0.g.M(r11)
            goto L42
        L30:
            ba0.g.M(r11)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.f22468j = r8
            r2.getClass()
            r2.k(r9, r11)
            kotlin.Unit r11 = kotlin.Unit.f26487a
            if (r11 != r3) goto L42
            goto L85
        L42:
            r1.getClass()     // Catch: java.lang.Throwable -> L60
            a3.x1 r11 = new a3.x1     // Catch: java.lang.Throwable -> L60
            r4 = 29
            r11.<init>(r1, r9, r4)     // Catch: java.lang.Throwable -> L60
            at.o r4 = new at.o     // Catch: java.lang.Throwable -> L60
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L60
            hs.e r11 = new hs.e     // Catch: java.lang.Throwable -> L60
            r8 = 0
            r11.<init>(r0, r8)     // Catch: java.lang.Throwable -> L60
            r10.f22468j = r7     // Catch: java.lang.Throwable -> L60
            java.lang.Object r11 = r4.collect(r11, r10)     // Catch: java.lang.Throwable -> L60
            if (r11 != r3) goto L86
            goto L85
        L60:
            com.app.tgtg.model.remote.PushNotificationsSettings r11 = r1.b()
            r11.getClass()
            r0.f22482k = r11
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.f22468j = r6
            r2.getClass()
            r2.k(r9, r11)
            kotlin.Unit r11 = kotlin.Unit.f26487a
            if (r11 != r3) goto L78
            goto L85
        L78:
            y80.a2 r11 = r0.f22483m
            com.app.tgtg.model.local.GenericErrors$Generic r0 = com.app.tgtg.model.local.GenericErrors.Generic.INSTANCE
            r10.f22468j = r5
            r11.j(r0)
            kotlin.Unit r11 = kotlin.Unit.f26487a
            if (r11 != r3) goto L86
        L85:
            return r3
        L86:
            kotlin.Unit r11 = kotlin.Unit.f26487a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
