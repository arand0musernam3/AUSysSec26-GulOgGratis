package bo;

import androidx.fragment.app.FragmentManager;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static z f6548b = z.DISCOVER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f6549a;

    public d(FragmentManager fragmentManager) {
        fragmentManager.getClass();
        this.f6549a = fragmentManager;
    }

    public final km.a a() {
        return (km.a) this.f6549a.findFragmentByTag(f6548b.name());
    }
}
