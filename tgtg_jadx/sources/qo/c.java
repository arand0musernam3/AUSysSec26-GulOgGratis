package qo;

import com.app.tgtg.feature.postpurchase.PostPurchaseActivity;
import y80.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostPurchaseActivity f37203a;

    public c(PostPurchaseActivity postPurchaseActivity) {
        this.f37203a = postPurchaseActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    @Override // y80.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, x70.c r10) {
        /*
            r8 = this;
            qo.f r9 = (qo.f) r9
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            com.app.tgtg.feature.postpurchase.PostPurchaseActivity r1 = r8.f37203a
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED
            int r3 = r0.compareTo(r3)
            r4 = 0
            if (r3 < 0) goto L7a
            c90.f r3 = v80.p0.f42144a
            w80.c r3 = a90.p.f1044a
            w80.c r3 = r3.f43295e
            kotlin.coroutines.CoroutineContext r5 = r10.getContext()
            boolean r5 = r3.y0(r5)
            if (r5 != 0) goto L3f
            androidx.lifecycle.Lifecycle$State r6 = r2.b()
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r6 == r7) goto L39
            androidx.lifecycle.Lifecycle$State r4 = r2.b()
            int r4 = r4.compareTo(r0)
            if (r4 < 0) goto L3f
            com.app.tgtg.feature.postpurchase.PostPurchaseActivity.a0(r1, r9)
            goto L77
        L39:
            androidx.lifecycle.LifecycleDestroyedException r9 = new androidx.lifecycle.LifecycleDestroyedException
            r9.<init>(r4)
            throw r9
        L3f:
            qo.b r4 = new qo.b
            r4.<init>(r1, r9)
            v80.l r9 = new v80.l
            x70.c r10 = y70.f.b(r10)
            r1 = 1
            r9.<init>(r1, r10)
            r9.t()
            androidx.lifecycle.v1 r10 = new androidx.lifecycle.v1
            r10.<init>(r0, r2, r9, r4)
            if (r5 == 0) goto L63
            kotlin.coroutines.g r0 = kotlin.coroutines.g.f26549a
            androidx.lifecycle.t1 r1 = new androidx.lifecycle.t1
            r1.<init>(r2, r10)
            r3.u0(r0, r1)
            goto L66
        L63:
            r2.a(r10)
        L66:
            androidx.lifecycle.u1 r0 = new androidx.lifecycle.u1
            r0.<init>(r3, r2, r10)
            r9.v(r0)
            java.lang.Object r9 = r9.s()
            y70.a r10 = y70.a.COROUTINE_SUSPENDED
            if (r9 != r10) goto L77
            return r9
        L77:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L7a:
            java.lang.String r9 = "target state must be CREATED or greater, found "
            i4.a.j(r0, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.c.emit(java.lang.Object, x70.c):java.lang.Object");
    }
}
