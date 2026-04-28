package s20;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements ta.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f38795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38797c;

    public h(TabLayout tabLayout) {
        this.f38795a = new WeakReference(tabLayout);
    }

    public final void a(float f11, int i11) {
        boolean z11;
        TabLayout tabLayout = (TabLayout) this.f38795a.get();
        if (tabLayout != null) {
            int i12 = this.f38797c;
            boolean z12 = true;
            if (i12 != 2 || this.f38796b == 1) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            if (i12 == 2 && this.f38796b == 0) {
                z11 = false;
            }
            tabLayout.l(i11, f11, z12, z11, false);
        }
    }
}
