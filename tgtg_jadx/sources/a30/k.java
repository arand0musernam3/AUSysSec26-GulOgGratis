package a30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10.g f658a;

    public k() {
        this.f658a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e5) {
            d10.g gVar = this.f658a;
            if (gVar != null) {
                gVar.c(e5);
            }
        }
    }

    public k(d10.g gVar) {
        this.f658a = gVar;
    }
}
