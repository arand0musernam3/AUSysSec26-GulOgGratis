package o30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends i implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f31933h;

    public w0(Runnable runnable) {
        runnable.getClass();
        this.f31933h = runnable;
    }

    @Override // o30.j
    public final String l() {
        return "task=[" + this.f31933h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31933h.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
