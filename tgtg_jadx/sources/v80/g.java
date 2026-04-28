package v80;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f42095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f42096e;

    public g(CoroutineContext coroutineContext, Thread thread, u0 u0Var) {
        super(coroutineContext, true);
        this.f42095d = thread;
        this.f42096e = u0Var;
    }

    @Override // v80.s1
    public final void i(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f42095d;
        if (Intrinsics.areEqual(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
