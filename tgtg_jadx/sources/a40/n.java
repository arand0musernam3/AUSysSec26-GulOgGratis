package a40;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f744b;

    public n(o oVar, long j9) {
        this.f744b = oVar;
        this.f743a = j9;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f743a);
        this.f744b.f757k.h(bundle);
        return null;
    }
}
