package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f33849b;

    public /* synthetic */ a(ActionBarOverlayLayout actionBarOverlayLayout, int i11) {
        this.f33848a = i11;
        this.f33849b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33848a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f33849b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f1982w = actionBarOverlayLayout.f1964d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1983x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f33849b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f1982w = actionBarOverlayLayout2.f1964d.animate().translationY(-actionBarOverlayLayout2.f1964d.getHeight()).setListener(actionBarOverlayLayout2.f1983x);
                break;
        }
    }
}
