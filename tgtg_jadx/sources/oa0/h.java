package oa0;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends CompletableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f32290a;

    public h(w wVar) {
        this.f32290a = wVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        if (z11) {
            this.f32290a.cancel();
        }
        return super.cancel(z11);
    }
}
