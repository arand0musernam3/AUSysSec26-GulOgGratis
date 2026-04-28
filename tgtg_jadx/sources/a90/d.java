package a90;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements v80.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f1015a;

    public d(CoroutineContext coroutineContext) {
        this.f1015a = coroutineContext;
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return this.f1015a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f1015a + ')';
    }
}
