package o10;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f31790d;

    public c(BottomAppBar bottomAppBar, int i11) {
        this.f31790d = bottomAppBar;
        this.f31789c = i11;
    }

    @Override // w.b
    public final void V(FloatingActionButton floatingActionButton) {
        int i11 = BottomAppBar.B1;
        floatingActionButton.setTranslationX(this.f31790d.E(this.f31789c));
        floatingActionButton.l(new b(), true);
    }
}
