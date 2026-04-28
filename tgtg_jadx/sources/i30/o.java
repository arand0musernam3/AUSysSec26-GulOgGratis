package i30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10.g f23226a;

    public o() {
        this.f23226a = null;
    }

    public void a(Exception exc) {
        d10.g gVar = this.f23226a;
        if (gVar != null) {
            gVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e5) {
            a(e5);
        }
    }

    public o(d10.g gVar) {
        this.f23226a = gVar;
    }
}
