package o30;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f31869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f31870b;

    public e(j jVar, ListenableFuture listenableFuture) {
        this.f31869a = jVar;
        this.f31870b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f31869a.f31920a != this) {
            return;
        }
        Object objJ = j.j(this.f31870b);
        if (s.f31919g.w(this.f31869a, this, objJ)) {
            j.g(this.f31869a, false);
        }
    }
}
