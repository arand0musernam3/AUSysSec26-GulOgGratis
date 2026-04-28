package s20;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends wa.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f38813a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38815c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38814b = 0;

    public m(TabLayout tabLayout) {
        this.f38813a = new WeakReference(tabLayout);
    }

    @Override // wa.i
    public final void a(int i11) {
        this.f38814b = this.f38815c;
        this.f38815c = i11;
        TabLayout tabLayout = (TabLayout) this.f38813a.get();
        if (tabLayout != null) {
            tabLayout.W = this.f38815c;
        }
    }

    @Override // wa.i
    public final void b(int i11, float f11, int i12) {
        boolean z11;
        TabLayout tabLayout = (TabLayout) this.f38813a.get();
        if (tabLayout != null) {
            int i13 = this.f38815c;
            boolean z12 = true;
            if (i13 != 2 || this.f38814b == 1) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            if (i13 == 2 && this.f38814b == 0) {
                z11 = false;
            }
            tabLayout.l(i11, f11, z12, z11, false);
        }
    }

    @Override // wa.i
    public final void c(int i11) {
        TabLayout tabLayout = (TabLayout) this.f38813a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i11 || i11 >= tabLayout.getTabCount()) {
            return;
        }
        int i12 = this.f38815c;
        tabLayout.k(tabLayout.h(i11), i12 == 0 || (i12 == 2 && this.f38814b == 0));
    }
}
