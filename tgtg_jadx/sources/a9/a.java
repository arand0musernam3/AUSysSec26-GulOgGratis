package a9;

import kotlin.coroutines.CoroutineContext;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f999a;

    public a(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.f999a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        f0.i(this.f999a, null);
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return this.f999a;
    }
}
