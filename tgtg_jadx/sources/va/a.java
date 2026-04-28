package va;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends FragmentManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f42198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f42199b;

    public a(d dVar, Fragment fragment, FrameLayout frameLayout) {
        this.f42198a = fragment;
        this.f42199b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void c(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.f42198a) {
            fragmentManager.k0(this);
            d.a(view, this.f42199b);
        }
    }
}
