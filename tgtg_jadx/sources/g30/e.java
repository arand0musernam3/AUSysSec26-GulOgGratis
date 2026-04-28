package g30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10.g f19910a;

    public e() {
        this.f19910a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e5) {
            d10.g gVar = this.f19910a;
            if (gVar != null) {
                gVar.c(e5);
            }
        }
    }

    public e(d10.g gVar) {
        this.f19910a = gVar;
    }
}
