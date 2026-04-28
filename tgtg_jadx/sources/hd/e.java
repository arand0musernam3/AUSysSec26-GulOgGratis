package hd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import v80.p0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21859d = AtomicIntegerFieldUpdater.newUpdater(e.class, "c");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f21860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile /* synthetic */ int f21861c = 1;

    public e(x xVar) {
        this.f21860b = xVar;
    }

    public final x A0() {
        return f21859d.get(this) == 1 ? p0.f42145b : this.f21860b;
    }

    @Override // v80.x
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f21860b + ")";
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        A0().u0(coroutineContext, runnable);
    }

    @Override // v80.x
    public final void x0(CoroutineContext coroutineContext, Runnable runnable) {
        A0().x0(coroutineContext, runnable);
    }

    @Override // v80.x
    public final boolean y0(CoroutineContext coroutineContext) {
        return A0().y0(coroutineContext);
    }

    @Override // v80.x
    public final x z0(int i11) {
        return A0().z0(i11);
    }
}
