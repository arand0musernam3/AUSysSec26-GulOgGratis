package n20;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends a0 {
    public e0(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new d0(this));
    }

    @Override // n20.a0
    public final void a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.f30291a);
        if (this.f30291a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // n20.a0
    public final boolean b() {
        return this.f30291a;
    }
}
