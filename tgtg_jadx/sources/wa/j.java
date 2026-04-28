package wa;

import android.R;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t10.c f43367d = new t10.c(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1.a f43368e = new m1.a(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f43369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f43370g;

    public j(ViewPager2 viewPager2) {
        this.f43370g = viewPager2;
    }

    public final void R() {
        int itemCount;
        ViewPager2 viewPager2 = this.f43370g;
        int i11 = R.id.accessibilityActionPageLeft;
        ViewCompat.W(viewPager2, R.id.accessibilityActionPageLeft);
        ViewCompat.W(viewPager2, R.id.accessibilityActionPageRight);
        ViewCompat.W(viewPager2, R.id.accessibilityActionPageUp);
        ViewCompat.W(viewPager2, R.id.accessibilityActionPageDown);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f4130r) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        m1.a aVar = this.f43368e;
        t10.c cVar = this.f43367d;
        if (orientation != 0) {
            if (viewPager2.f4117d < itemCount - 1) {
                ViewCompat.Y(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, (CharSequence) null), null, cVar);
            }
            if (viewPager2.f4117d > 0) {
                ViewCompat.Y(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, (CharSequence) null), null, aVar);
                return;
            }
            return;
        }
        boolean z11 = viewPager2.f4120g.getLayoutDirection() == 1;
        int i12 = z11 ? 16908360 : 16908361;
        if (z11) {
            i11 = 16908361;
        }
        if (viewPager2.f4117d < itemCount - 1) {
            ViewCompat.Y(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i12, (CharSequence) null), null, cVar);
        }
        if (viewPager2.f4117d > 0) {
            ViewCompat.Y(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, (CharSequence) null), null, aVar);
        }
    }
}
