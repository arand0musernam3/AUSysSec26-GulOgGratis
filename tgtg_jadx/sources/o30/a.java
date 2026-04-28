package o30;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {
    @Override // o30.c
    public final Object q(Object obj, Throwable th2) {
        b0 b0Var = (b0) obj;
        ListenableFuture listenableFutureApply = b0Var.apply(th2);
        na0.a.a0(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", b0Var);
        return listenableFutureApply;
    }

    @Override // o30.c
    public final void r(Object obj) {
        o((ListenableFuture) obj);
    }
}
