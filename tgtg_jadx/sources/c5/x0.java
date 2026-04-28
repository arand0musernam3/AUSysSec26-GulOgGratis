package c5;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements v80.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r5.z f7406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v80.b0 f7407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f7408d = new AtomicReference(null);

    public x0(View view, r5.z zVar, v80.b0 b0Var) {
        this.f7405a = view;
        this.f7406b = zVar;
        this.f7407c = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y70.a a(c5.x2 r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c5.w0
            if (r0 == 0) goto L13
            r0 = r7
            c5.w0 r0 = (c5.w0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            c5.w0 r0 = new c5.w0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7399j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L28:
            r6 = 0
            return r6
        L2a:
            ba0.g.M(r7)
            goto L4f
        L2e:
            ba0.g.M(r7)
            b4.x r7 = new b4.x
            r2 = 3
            r7.<init>(r2, r6, r5)
            a3.x r6 = new a3.x
            r2 = 20
            r4 = 0
            r6.<init>(r5, r4, r2)
            r0.l = r3
            al.n r2 = new al.n
            java.util.concurrent.atomic.AtomicReference r3 = r5.f7408d
            r2.<init>(r7, r3, r6, r4)
            java.lang.Object r6 = v80.f0.n(r2, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.x0.a(c5.x2, z70.c):y70.a");
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return this.f7407c.getCoroutineContext();
    }
}
