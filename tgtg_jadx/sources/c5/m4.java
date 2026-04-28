package c5;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f7293a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final c5.k4 a(c5.a r6, m3.x r7, u3.d r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = c5.e2.f7182a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L40
            r0 = 6
            x80.i r0 = com.google.android.gms.internal.measurement.cg.a(r2, r3, r3, r0)
            u70.t r2 = c5.c1.l
            java.lang.Object r2 = r2.getValue()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            a90.d r2 = v80.f0.b(r2)
            a3.x1 r4 = new a3.x1
            r5 = 11
            r4.<init>(r0, r3, r5)
            r5 = 3
            v80.f0.B(r2, r3, r3, r4, r5)
            androidx.fragment.app.r r2 = new androidx.fragment.app.r
            r4 = 7
            r2.<init>(r0, r4)
            java.lang.Object r0 = z3.l.f47038c
            monitor-enter(r0)
            java.lang.Object r4 = z3.l.f47044i     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r2 = kotlin.collections.CollectionsKt.e0(r4, r2)     // Catch: java.lang.Throwable -> L3d
            z3.l.f47044i = r2     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            z3.l.a()
            goto L40
        L3d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L40:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L53
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof c5.y
            if (r1 == 0) goto L51
            c5.y r0 = (c5.y) r0
            goto L57
        L51:
            r0 = r3
            goto L57
        L53:
            r6.removeAllViews()
            goto L51
        L57:
            if (r0 != 0) goto L6f
            c5.y r0 = new c5.y
            android.content.Context r1 = r6.getContext()
            kotlin.coroutines.CoroutineContext r2 = r7.k()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = c5.m4.f7293a
            r6.addView(r1, r2)
        L6f:
            c5.s r6 = c5.m2.f7291a
            android.view.View r6 = r0.getView()
            r1 = 2131363646(0x7f0a073e, float:1.8347107E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof c5.k4
            if (r2 == 0) goto L83
            r3 = r6
            c5.k4 r3 = (c5.k4) r3
        L83:
            if (r3 != 0) goto L9f
            c5.k4 r3 = new c5.k4
            b5.r2 r6 = new b5.r2
            b5.m0 r2 = r0.getRoot()
            r6.<init>(r2)
            m3.a0 r2 = new m3.a0
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9f:
            r3.b(r8)
            kotlin.coroutines.CoroutineContext r6 = r0.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r8 = r7.k()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            if (r6 != 0) goto Lb7
            kotlin.coroutines.CoroutineContext r6 = r7.k()
            r0.setCoroutineContext(r6)
        Lb7:
            c5.l4 r6 = new c5.l4
            r6.<init>(r7)
            r0.setFrameEndScheduler$ui(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.m4.a(c5.a, m3.x, u3.d):c5.k4");
    }
}
