package c90;

import kotlin.coroutines.CoroutineContext;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f7848b = new l();

    @Override // v80.x
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        f.f7836c.f7837b.g(runnable, true, false);
    }

    @Override // v80.x
    public final void x0(CoroutineContext coroutineContext, Runnable runnable) {
        f.f7836c.f7837b.g(runnable, true, true);
    }

    @Override // v80.x
    public final x z0(int i11) {
        a90.g.c(i11);
        return i11 >= k.f7845d ? this : super.z0(i11);
    }
}
