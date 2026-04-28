package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends j0 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f31928k = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListenableFuture f31929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f31930j;

    public v(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f31929i = listenableFuture;
        obj.getClass();
        this.f31930j = obj;
    }

    @Override // o30.j
    public final void e() {
        ListenableFuture listenableFuture = this.f31929i;
        if ((listenableFuture != null) & (this.f31920a instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.f31929i = null;
        this.f31930j = null;
    }

    @Override // o30.j
    public final String l() {
        String str;
        ListenableFuture listenableFuture = this.f31929i;
        Object obj = this.f31930j;
        String strL = super.l();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strL != null) {
                return str.concat(strL);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f31929i;
        Object obj = this.f31930j;
        if (((this.f31920a instanceof d) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f31929i = null;
        if (listenableFuture.isCancelled()) {
            o(listenableFuture);
            return;
        }
        try {
            try {
                Object objQ = q(obj, o0.b(listenableFuture));
                this.f31930j = null;
                r(objQ);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th2);
                } finally {
                    this.f31930j = null;
                }
            }
        } catch (Error e5) {
            n(e5);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            n(e11.getCause());
        } catch (Exception e12) {
            n(e12);
        }
    }
}
