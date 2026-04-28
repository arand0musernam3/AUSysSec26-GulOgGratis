package aa;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements y9.e0, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FunctionReferenceImpl f1163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha.a f1164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f1165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y9.d0 f1166d;

    /* JADX WARN: Multi-variable type inference failed */
    public u(Function2 function2, ha.a aVar) {
        aVar.getClass();
        this.f1163a = (FunctionReferenceImpl) function2;
        this.f1164b = aVar;
        this.f1165c = new AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // y9.e0
    public final Object a(y9.d0 d0Var, Function2 function2, z70.i iVar) {
        Object objInvoke = this.f1163a.invoke(new t(this, d0Var, function2, null), iVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // y9.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, kotlin.jvm.functions.Function1 r7, z70.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof aa.r
            if (r0 == 0) goto L13
            r0 = r8
            aa.r r0 = (aa.r) r0
            int r1 = r0.f1156n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1156n = r1
            goto L18
        L13:
            aa.r r0 = new aa.r
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f1156n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r8)
            return r8
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            kotlin.jvm.functions.Function1 r7 = r0.f1154k
            java.lang.String r6 = r0.f1153j
            ba0.g.M(r8)
            goto L49
        L39:
            ba0.g.M(r8)
            r0.f1153j = r6
            r0.f1154k = r7
            r0.f1156n = r4
            java.lang.Boolean r8 = r5.d(r0)
            if (r8 != r1) goto L49
            goto L65
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L67
            aa.s r8 = new aa.s
            r8.<init>(r5, r6, r7, r2)
            r0.f1153j = r2
            r0.f1154k = r2
            r0.f1156n = r3
            kotlin.jvm.internal.FunctionReferenceImpl r6 = r5.f1163a
            java.lang.Object r6 = r6.invoke(r8, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        L67:
            ha.a r8 = r5.f1164b
            ha.c r6 = r8.v0(r6)
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L75
            w.b.y(r6, r2)
            return r7
        L75:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
            w.b.y(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.u.b(java.lang.String, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    @Override // aa.j0
    public final ha.a c() {
        return this.f1164b;
    }

    @Override // y9.e0
    public final Boolean d(x70.c cVar) {
        return Boolean.valueOf(this.f1166d != null || this.f1164b.e0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(y9.d0 r9, kotlin.jvm.functions.Function2 r10, z70.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof aa.q
            if (r0 == 0) goto L13
            r0 = r11
            aa.q r0 = (aa.q) r0
            int r1 = r0.f1152m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1152m = r1
            goto L18
        L13:
            aa.q r0 = new aa.q
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f1151k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f1152m
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            java.util.concurrent.atomic.AtomicInteger r5 = r8.f1165c
            r6 = 1
            ha.a r7 = r8.f1164b
            if (r2 == 0) goto L39
            if (r2 != r6) goto L32
            int r6 = r0.f1150j
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L30
            goto L7a
        L30:
            r9 = move-exception
            goto L8e
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
        L37:
            r9 = 0
            return r9
        L39:
            ba0.g.M(r11)
            int[] r11 = aa.p.$EnumSwitchMapping$0
            int r2 = r9.ordinal()
            r11 = r11[r2]
            if (r11 == r6) goto L5c
            r2 = 2
            if (r11 == r2) goto L56
            r2 = 3
            if (r11 != r2) goto L52
            java.lang.String r11 = "BEGIN EXCLUSIVE TRANSACTION"
            z20.b.m(r7, r11)
            goto L61
        L52:
            e40.a.f()
            goto L37
        L56:
            java.lang.String r11 = "BEGIN IMMEDIATE TRANSACTION"
            z20.b.m(r7, r11)
            goto L61
        L5c:
            java.lang.String r11 = "BEGIN DEFERRED TRANSACTION"
            z20.b.m(r7, r11)
        L61:
            int r11 = r5.incrementAndGet()
            if (r11 <= 0) goto L69
            r8.f1166d = r9
        L69:
            aa.o r9 = new aa.o     // Catch: java.lang.Throwable -> L30
            r11 = 0
            r9.<init>(r8, r11)     // Catch: java.lang.Throwable -> L30
            r0.f1150j = r6     // Catch: java.lang.Throwable -> L30
            r0.f1152m = r6     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r11 != r1) goto L7a
            return r1
        L7a:
            int r9 = r5.decrementAndGet()
            if (r9 != 0) goto L82
            r8.f1166d = r4
        L82:
            if (r6 == 0) goto L8a
            java.lang.String r9 = "END TRANSACTION"
            z20.b.m(r7, r9)
            return r11
        L8a:
            z20.b.m(r7, r3)
            return r11
        L8e:
            throw r9     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            int r11 = r5.decrementAndGet()     // Catch: android.database.SQLException -> L99
            if (r11 != 0) goto L9b
            r8.f1166d = r4     // Catch: android.database.SQLException -> L99
            goto L9b
        L99:
            r11 = move-exception
            goto L9f
        L9b:
            z20.b.m(r7, r3)     // Catch: android.database.SQLException -> L99
            goto La2
        L9f:
            u70.e.a(r9, r11)
        La2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.u.e(y9.d0, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }
}
