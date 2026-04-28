package b0;

import android.hardware.display.DisplayManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f5118a;

    public d1(e1 e1Var) {
        this.f5118a = e1Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i11) {
        e1 e1Var = this.f5118a;
        synchronized (e1Var.f5141c) {
            e1Var.f5142d = null;
            e1Var.f5144f = null;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i11) {
        e1 e1Var = this.f5118a;
        synchronized (e1Var.f5141c) {
            e1Var.f5142d = null;
            e1Var.f5144f = null;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i11) {
        e1 e1Var = this.f5118a;
        synchronized (e1Var.f5141c) {
            e1Var.f5142d = null;
            e1Var.f5144f = null;
        }
    }
}
