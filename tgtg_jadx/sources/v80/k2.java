package v80;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f42114b = new k2();

    @Override // v80.x
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        o2 o2Var = (o2) coroutineContext.get(o2.f42141b);
        if (o2Var != null) {
            o2Var.f42142a = true;
        } else {
            com.braze.h2.a("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // v80.x
    public final x z0(int i11) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
