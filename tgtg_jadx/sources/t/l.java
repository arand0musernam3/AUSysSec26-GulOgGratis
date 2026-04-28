package t;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f39299b;

    public l(v vVar, int i11) {
        this.f39298a = i11;
        switch (i11) {
            case 2:
                this.f39299b = new WeakReference(vVar);
                break;
            default:
                this.f39299b = new WeakReference(vVar);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39298a) {
            case 0:
                WeakReference weakReference = this.f39299b;
                if (weakReference.get() != null) {
                    ((m) weakReference.get()).x();
                }
                break;
            case 1:
                WeakReference weakReference2 = this.f39299b;
                if (weakReference2.get() != null) {
                    ((v) weakReference2.get()).f39325n = false;
                }
                break;
            default:
                WeakReference weakReference3 = this.f39299b;
                if (weakReference3.get() != null) {
                    ((v) weakReference3.get()).f39326o = false;
                }
                break;
        }
    }

    public l(m mVar) {
        this.f39298a = 0;
        this.f39299b = new WeakReference(mVar);
    }
}
