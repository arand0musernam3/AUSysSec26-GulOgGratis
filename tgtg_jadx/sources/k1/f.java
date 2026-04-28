package k1;

import android.view.SurfaceView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f25725a;

    public final g getAttachedState() {
        return this.f25725a;
    }

    public final void setAttachedState(g gVar) {
        if (gVar == null) {
            g gVar2 = this.f25725a;
            if (gVar2 != null) {
                getHolder().removeCallback(gVar2);
            }
        } else {
            getHolder().addCallback(gVar);
        }
        this.f25725a = gVar;
    }
}
