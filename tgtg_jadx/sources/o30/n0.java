package o30;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends i implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListenableFuture f31902h;

    @Override // o30.j
    public final void e() {
        this.f31902h = null;
    }

    @Override // o30.j
    public final String l() {
        ListenableFuture listenableFuture = this.f31902h;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f31902h;
        if (listenableFuture != null) {
            o(listenableFuture);
        }
    }
}
