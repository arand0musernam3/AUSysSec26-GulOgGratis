package androidx.fragment.app;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3278a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f3279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.f3279b = pVar;
        this.f3281d = viewGroup;
        this.f3280c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.f3278a
            switch(r0) {
                case 0: goto L73;
                default: goto L5;
            }
        L5:
            androidx.fragment.app.p r0 = r7.f3279b
            java.util.ArrayList r1 = r0.f3295c
            androidx.fragment.app.h2 r2 = r0.f3298f
            boolean r3 = r1.isEmpty()
            java.lang.String r4 = "FragmentManager"
            r5 = 2
            if (r3 == 0) goto L15
            goto L55
        L15:
            java.util.Iterator r3 = r1.iterator()
        L19:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r3.next()
            androidx.fragment.app.q r6 = (androidx.fragment.app.q) r6
            androidx.fragment.app.m2 r6 = r6.f3254a
            boolean r6 = r6.f3273g
            if (r6 != 0) goto L19
            boolean r3 = androidx.fragment.app.FragmentManager.L(r5)
            if (r3 == 0) goto L36
            java.lang.String r3 = "Completing animating immediately"
            android.util.Log.v(r4, r3)
        L36:
            d7.c r3 = new d7.c
            r3.<init>()
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            androidx.fragment.app.q r1 = (androidx.fragment.app.q) r1
            androidx.fragment.app.m2 r1 = r1.f3254a
            androidx.fragment.app.Fragment r1 = r1.f3269c
            androidx.fragment.app.z r4 = new androidx.fragment.app.z
            r5 = 3
            r4.<init>(r0, r5)
            java.lang.Object r0 = r7.f3280c
            r2.u(r1, r0, r3, r4)
            r3.a()
            goto L70
        L55:
            boolean r1 = androidx.fragment.app.FragmentManager.L(r5)
            if (r1 == 0) goto L60
            java.lang.String r1 = "Animating to start"
            android.util.Log.v(r4, r1)
        L60:
            java.lang.Object r1 = r0.f3308q
            r1.getClass()
            androidx.fragment.app.d r3 = new androidx.fragment.app.d
            r4 = 2
            android.view.ViewGroup r5 = r7.f3281d
            r3.<init>(r4, r0, r5)
            r2.d(r1, r3)
        L70:
            kotlin.Unit r0 = kotlin.Unit.f26487a
            return r0
        L73:
            androidx.fragment.app.p r0 = r7.f3279b
            androidx.fragment.app.h2 r0 = r0.f3298f
            android.view.ViewGroup r1 = r7.f3281d
            java.lang.Object r2 = r7.f3280c
            r0.e(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.f26487a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.f3279b = pVar;
        this.f3280c = obj;
        this.f3281d = viewGroup;
    }
}
