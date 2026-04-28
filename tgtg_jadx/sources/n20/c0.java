package n20;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30301f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30302g = 0.0f;

    public c0(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new b0(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    @Override // n20.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.material.navigation.NavigationView r10) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n20.c0.a(com.google.android.material.navigation.NavigationView):void");
    }

    @Override // n20.a0
    public final boolean b() {
        return !this.f30301f || this.f30291a;
    }
}
