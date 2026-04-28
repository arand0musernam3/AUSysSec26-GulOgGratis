package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends j0 implements Runnable {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListenableFuture f31850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f31851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f31852k;

    public c(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f31850i = listenableFuture;
        this.f31851j = cls;
        this.f31852k = obj;
    }

    @Override // o30.j
    public final void e() {
        ListenableFuture listenableFuture = this.f31850i;
        if ((listenableFuture != null) & (this.f31920a instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.f31850i = null;
        this.f31851j = null;
        this.f31852k = null;
    }

    @Override // o30.j
    public final String l() {
        String str;
        ListenableFuture listenableFuture = this.f31850i;
        Class cls = this.f31851j;
        Object obj = this.f31852k;
        String strL = super.l();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strL != null) {
                return str.concat(strL);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public abstract Object q(Object obj, Throwable th2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f31850i;
        Class cls = this.f31851j;
        Object obj = this.f31852k;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.f31920a instanceof d)) {
            return;
        }
        this.f31850i = null;
        try {
            th = listenableFuture instanceof s ? ((s) listenableFuture).c() : null;
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e5.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objB = th == null ? o0.b(listenableFuture) : null;
        if (th == null) {
            m(objB);
            return;
        }
        if (!cls.isInstance(th)) {
            o(listenableFuture);
            return;
        }
        try {
            Object objQ = q(obj, th);
            this.f31851j = null;
            this.f31852k = null;
            r(objQ);
        } catch (Throwable th3) {
            try {
                if (th3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                n(th3);
            } finally {
                this.f31851j = null;
                this.f31852k = null;
            }
        }
    }
}
