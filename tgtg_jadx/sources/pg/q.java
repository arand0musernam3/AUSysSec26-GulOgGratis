package pg;

import android.view.View;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentContainerView f35077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f35078b;

    public q(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.f35077a = fragmentContainerView;
        this.f35078b = fragmentContainerView2;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f35077a;
    }
}
