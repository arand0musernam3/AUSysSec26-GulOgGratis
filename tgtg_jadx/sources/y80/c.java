package y80;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z70.i f45449f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, CoroutineContext coroutineContext, int i11, x80.a aVar) {
        super(function2, coroutineContext, i11, aVar);
        this.f45449f = (z70.i) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // y80.e, z80.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(x80.u r5, x70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y80.b
            if (r0 == 0) goto L13
            r0 = r6
            y80.b r0 = (y80.b) r0
            int r1 = r0.f45441m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45441m = r1
            goto L1a
        L13:
            y80.b r0 = new y80.b
            z70.c r6 = (z70.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f45440k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f45441m
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            x80.u r5 = r0.f45439j
            ba0.g.M(r6)
            goto L40
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
        L30:
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            r0.f45439j = r5
            r0.f45441m = r3
            java.lang.Object r6 = super.c(r5, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            x80.t r5 = (x80.t) r5
            x80.i r5 = r5.f44084d
            boolean r5 = r5.A()
            if (r5 == 0) goto L4d
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L4d:
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            com.braze.h2.b(r5)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.c.c(x80.u, x70.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // y80.e, z80.d
    public final z80.d d(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return new c(this.f45449f, coroutineContext, i11, aVar);
    }
}
