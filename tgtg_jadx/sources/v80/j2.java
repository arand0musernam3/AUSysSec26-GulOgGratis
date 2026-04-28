package v80;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j2 {
    public static final Object a(h2 h2Var, Function2 function2) {
        f0.w(h2Var, new s0(f0.r(h2Var.f1046d.getContext()).L(h2Var.f42107e, h2Var, h2Var.f42066c), 0));
        return d40.t1.J(h2Var, false, h2Var, function2);
    }

    public static final Object b(long j9, Function2 function2, z70.c cVar) {
        if (j9 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objA = a(new h2(j9, cVar), function2);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, v80.h2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r6, kotlin.jvm.functions.Function2 r8, z70.c r9) {
        /*
            boolean r0 = r9 instanceof v80.i2
            if (r0 == 0) goto L13
            r0 = r9
            v80.i2 r0 = (v80.i2) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            v80.i2 r0 = new v80.i2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f42111k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f42110j
            ba0.g.M(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L29
            return r9
        L29:
            r7 = move-exception
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L32:
            ba0.g.M(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3c
            goto L5c
        L3c:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r0.f42110j = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            r0.l = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            v80.h2 r2 = new v80.h2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            r2.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            r9.element = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            java.lang.Object r6 = a(r2, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            if (r6 != r1) goto L53
            return r1
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            v80.i1 r8 = r7.f26627a
            T r6 = r6.element
            if (r8 != r6) goto L5e
        L5c:
            r6 = 0
            return r6
        L5e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v80.j2.c(long, kotlin.jvm.functions.Function2, z70.c):java.lang.Object");
    }
}
