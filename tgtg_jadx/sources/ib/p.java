package ib;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f23753b;

    public /* synthetic */ p(AtomicBoolean atomicBoolean, int i11) {
        this.f23752a = i11;
        this.f23753b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23752a) {
            case 0:
                this.f23753b.set(true);
                break;
            default:
                this.f23753b.set(true);
                break;
        }
    }
}
