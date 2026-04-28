package c90;

import kotlin.coroutines.CoroutineContext;
import v80.a1;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f7836c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f7837b;

    static {
        int i11 = k.f7844c;
        int i12 = k.f7845d;
        long j9 = k.f7846e;
        String str = k.f7842a;
        f fVar = new f();
        fVar.f7837b = new d(str, i11, i12, j9);
        f7836c = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // v80.x
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        d.p(this.f7837b, runnable, 6);
    }

    @Override // v80.x
    public final void x0(CoroutineContext coroutineContext, Runnable runnable) {
        d.p(this.f7837b, runnable, 2);
    }

    @Override // v80.x
    public final x z0(int i11) {
        a90.g.c(i11);
        return i11 >= k.f7844c ? this : super.z0(i11);
    }
}
