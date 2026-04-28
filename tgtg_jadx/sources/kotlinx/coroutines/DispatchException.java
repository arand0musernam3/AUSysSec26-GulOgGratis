package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DispatchException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f26625a;

    public DispatchException(Throwable th2, x xVar, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + xVar + " threw an exception, context = " + coroutineContext, th2);
        this.f26625a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f26625a;
    }
}
