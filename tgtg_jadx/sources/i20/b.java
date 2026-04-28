package i20;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f22936b;

    public /* synthetic */ b(d dVar, int i11) {
        this.f22935a = i11;
        this.f22936b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22935a) {
            case 0:
                d dVar = this.f22936b;
                if (dVar.f22944f > 0) {
                    dVar.f22945g = SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                break;
            default:
                d dVar2 = this.f22936b;
                ((n) dVar2.getCurrentDrawable()).d(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.f22945g = -1L;
                break;
        }
    }
}
