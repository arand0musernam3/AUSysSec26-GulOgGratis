package v80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f42170c;

    public w0(Runnable runnable, long j9) {
        super(j9);
        this.f42170c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42170c.run();
    }

    @Override // v80.x0
    public final String toString() {
        return super.toString() + this.f42170c;
    }
}
